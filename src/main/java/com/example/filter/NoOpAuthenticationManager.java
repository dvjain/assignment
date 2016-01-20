package com.example.filter;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * Spring security No Operation Authentication Manager. No authentication should be done with this AuthenticationManager.
 * AbstractAuthenticationProcessingFilter requires that you set the <tt>authenticationManager</tt> property. This AuthenticationManager can be set for the filter.
 * All authentication happens in attempAuthentication() in the Filter implementation.  
 * 
 * @author djain
 *
 */
public class NoOpAuthenticationManager implements AuthenticationManager {
	 
    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {
        return authentication;
    }
}