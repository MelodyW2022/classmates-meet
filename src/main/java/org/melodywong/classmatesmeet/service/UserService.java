package org.melodywong.classmatesmeet.service;

import org.melodywong.classmatesmeet.dto.UserRegistrationDto;
import org.melodywong.classmatesmeet.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;




public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}