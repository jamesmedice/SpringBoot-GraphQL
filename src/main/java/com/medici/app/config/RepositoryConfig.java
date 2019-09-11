package com.medici.app.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author a73s
 *
 */
@Configuration
@EnableJpaRepositories("com.medici.app.repository")
@EntityScan("com.medici.app.model")
public class RepositoryConfig {

}
