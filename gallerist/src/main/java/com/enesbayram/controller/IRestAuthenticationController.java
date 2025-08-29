package com.enesbayram.controller;

import com.enesbayram.dto.AuthRequest;
import com.enesbayram.dto.AuthResponse;
import com.enesbayram.dto.DtoUser;
import com.enesbayram.dto.RefreshTokenRequest;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);
	
	public RootEntity<AuthResponse> authenticate(AuthRequest input);
	
	public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);
}
