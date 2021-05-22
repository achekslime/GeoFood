package com.stabbers.geofood.controller.dto.auth;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AuthRequest {
    @NotEmpty
    private String login;

    @NotEmpty
    private String password;
}
