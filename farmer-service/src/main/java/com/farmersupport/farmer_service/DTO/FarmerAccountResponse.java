package com.farmersupport.farmer_service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FarmerAccountResponse {
        private Long id;
        private String email;
        private String role;
        private String status;          // ACTIVE, INACTIVE, SUSPENDED
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private LocalDateTime lastLoginAt;
        private Boolean isVerified;
    }

