package com.yupi.usercenter.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * 自定义 Swagger 接口文档的配置
 *
 * @author ZiPeng
 */
@Configuration
@EnableSwagger2WebMvc
@Profile({"dev","test"})
public class SwaggerConfig {

    @Bean(value = "dockerBean")
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //这里一定要标注你控制器的位置
                .apis(RequestHandlerSelectors.basePackage("com.yupi.usercenter.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * api 信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("梓鹏用户中心")
                .description("梓鹏用户中心_接口文档")
                .termsOfServiceUrl("https://github.com/961163289")
                .contact(new Contact("梓鹏","https://github.com/961163289","961163289@qq.com"))
                .version("1.0")
                .build();
    }
}