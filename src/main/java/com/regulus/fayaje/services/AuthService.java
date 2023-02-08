package com.regulus.fayaje.services;

import com.regulus.fayaje.models.AuthRequest;
import com.regulus.fayaje.models.AuthResponse;
import com.regulus.fayaje.models.RegisterRequest;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse authenticate(AuthRequest request);
}
