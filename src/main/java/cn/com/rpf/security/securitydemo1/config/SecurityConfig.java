package cn.com.rpf.security.securitydemo1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author rpf
 * @version 1.0
 * @date 2021/10/10 21:32
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        auth.inMemoryAuthentication().withUser("myl").password(passwordEncoder.encode("123")).roles("admin");

        // 方式二
        auth.userDetailsService(userDetailsService).passwordEncoder(instance());
    }

    @Bean
    PasswordEncoder instance() {
        return new BCryptPasswordEncoder();
    }
}
