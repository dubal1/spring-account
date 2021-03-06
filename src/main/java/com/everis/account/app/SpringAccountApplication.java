package com.everis.account.app;

import com.everis.account.app.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;

@Import(SwaggerConfiguration.class)
@SpringBootApplication
public class SpringAccountApplication {
    /**
     *
     * @param args .
     */
    public static void main(final String[] args) {
        SpringApplication.run(SpringAccountApplication.class, args);
    }
    /**
     * @param registry
     */
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
    }
}
