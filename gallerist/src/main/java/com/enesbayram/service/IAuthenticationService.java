package com.enesbayram.service;

import com.enesbayram.dto.AuthRequest;
import com.enesbayram.dto.AuthResponse;
import com.enesbayram.dto.DtoUser;
import com.enesbayram.dto.RefreshTokenRequest;

public interface IAuthenticationService {

	public DtoUser register(AuthRequest input);
	
	public AuthResponse authenticate(AuthRequest input);
	
	public AuthResponse refreshToken(RefreshTokenRequest input);
}
