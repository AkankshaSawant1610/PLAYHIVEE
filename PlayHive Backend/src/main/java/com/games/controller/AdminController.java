package com.games.controller;

import com.games.model.Admin;
import com.games.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(
	    origins = { "http://localhost:5500", "http://127.0.0.1:5500" },
	    allowCredentials = "true"
	)
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    // Request DTO for Admin Login
    public static class AdminLoginRequest {
        private String email;
        private String password;

        // Getters and Setters
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
    }

    // 🟢 ADMIN LOGIN - JSON Request Body
    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<?> adminLogin(@RequestBody AdminLoginRequest loginRequest) {
        try {
            System.out.println("🔐 Admin login attempt for: " + loginRequest.getEmail());
            
            if (loginRequest.getEmail() == null || loginRequest.getPassword() == null) {
                Map<String, String> errorResponse = new HashMap<>();
                errorResponse.put("message", "error");
                errorResponse.put("error", "Email and password are required");
                return ResponseEntity.badRequest().body(errorResponse);
            }
            
            Optional<Admin> admin = adminRepository.findByEmailAndPassword(
                loginRequest.getEmail().trim(), 
                loginRequest.getPassword()
            );

            if (admin.isPresent()) {
                Admin loggedInAdmin = admin.get();
                System.out.println("✅ Admin login successful: " + loggedInAdmin.getUsername());

                Map<String, Object> response = new HashMap<>();
                response.put("message", "Login successful");
                response.put("admin", createAdminResponse(loggedInAdmin));
                
                return ResponseEntity.ok(response);
                
            } else {
                System.out.println("❌ Admin login failed for: " + loginRequest.getEmail());
                Map<String, String> errorResponse = new HashMap<>();
                errorResponse.put("message", "error");
                errorResponse.put("error", "Invalid admin credentials");
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorResponse);
            }
        } catch (Exception e) {
            System.err.println("❌ Admin login error: " + e.getMessage());
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("message", "error");
            errorResponse.put("error", "Server error during login: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    // Helper method to create admin response
    private Map<String, Object> createAdminResponse(Admin admin) {
        Map<String, Object> adminResponse = new HashMap<>();
        adminResponse.put("id", admin.getId());
        adminResponse.put("username", admin.getUsername());
        adminResponse.put("email", admin.getEmail());
        return adminResponse;
    }

    // Add other admin endpoints here (users, leaderboard, messages, etc.)
    // ... existing methods for users, leaderboard, messages ...
}