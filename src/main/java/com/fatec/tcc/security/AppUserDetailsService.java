package com.fatec.tcc.security;

import com.fatec.tcc.model.Torre;
import com.fatec.tcc.repository.TorreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserDetailsService implements UserDetailsService {

    @Autowired
    private TorreRepository torreRepository;

    @Override
    public UserDetails loadUserByUsername(String s) {
        Torre torre = torreRepository.findByName(s);

        return null;
    }
}
