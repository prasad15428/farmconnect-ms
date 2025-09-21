Purpose

The Farmer Service is a core microservice of the Farmer Support System.
Its main goal is to manage farmers’ accounts and profiles, providing secure registration, authentication, and personal/farm information management.

This service acts as the entry point for farmer-related operations and interacts with other microservices (like Crop Service, Market Service, Notification Service) via REST APIs.


Key Responsibilities

Farmer Registration & Authentication

    Register new farmers
    Login/Logout
    Password management
    Role assignment (e.g., FARMER)

Farmer Profile Management

    Store and update personal information (name, contact, address)
    Manage farm-related details (farm size, location)

Optional / Future Features

    Store farmer preferences (crops grown, notifications)
    Manage verification documents (ID, certificates)

Contained Modules / Components

Entities

    FarmerAccount → authentication & login info
    FarmerProfile → personal and farm details

DTOs

    FarmerAccountDTO → for signup/login
    FarmerProfileDTO → for profile updates

Repositories

    JPA repositories for FarmerAccount and FarmerProfile

Services

    Business logic for account creation, profile updates, validation

Controllers

    REST APIs for frontend / API Gateway consumption

Notes

    Database: MySQL (H2 for testing)
    Framework: Spring Boot, Spring Data JPA, Spring Validation
    Microservice ready: registers with Eureka and can communicate with other services