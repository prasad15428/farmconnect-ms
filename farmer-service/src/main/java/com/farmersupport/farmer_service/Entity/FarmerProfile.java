package com.farmersupport.farmer_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FarmerProfile {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name="farmer_account_id",nullable = false)
    private FarmerAccount farmerAccount;
    private String firstName;
    private String secondName;
    @Column(unique = true)
    private Long phoneNumber;
    private String city;
    private String state;
    private Double farmSize;   // in acres/hectares
    private String farmType;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
