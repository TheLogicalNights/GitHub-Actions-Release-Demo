package com.example.GitHubActionsReleaseDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GitHubActionsReleaseDemoApplication {
    private static final Logger logger = LoggerFactory.getLogger(GitHubActionsReleaseDemoApplication.class);
    public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(GitHubActionsReleaseDemoApplication.class, args);

        String username = System.getenv("Username");
        String password = System.getenv("Password");


        logger.info("[Username: " + username + "]");
        logger.info("[Password: " + password + "]");

		ctx.getBean(GitHubActionsReleaseDemoApplication.class);
		ctx.close();
    }
}
