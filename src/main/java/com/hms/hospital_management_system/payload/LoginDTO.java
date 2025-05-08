package com.hms.hospital_management_system.payload;

import lombok.Data;

@Data
public class LoginDTO {
    private String usernameOrEmail;
    String password;
}
