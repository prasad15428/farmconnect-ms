package com.farmersupport.farmer_service.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class FarmerAccountRequest {


    @Email(message="Enter a valid email")
    @NotBlank(message="Email is required")
    private String email;

    @NotBlank(message="Password is required")
    @Size(min=6,message="Password must be at least 6 characters")
    private String password;

    @NotBlank(message="Role is required")
    private String role;
}
