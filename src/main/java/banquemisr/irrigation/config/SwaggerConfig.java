package banquemisr.irrigation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("banquemisr.irrigation.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Automatic Irrigation System",
                "Banque Misr Automated Irrigation API",
                "1.0.0",
                "Terms of service",
                new Contact(
                        "Mostafa ElDahshan",
                        "https://github.com/MostafaAbdelkarim",
                        "mostafaabdelkarim22@gmail.com"),
                "License of API",
                "https://linkedin.com/in/mostafa-el-dahshan", Collections.emptyList());
    }

}
