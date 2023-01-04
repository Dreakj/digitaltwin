package com.naic.digitaltwin.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ScalarType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ParameterType;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

import static java.util.Collections.singletonList;

/**
 * <p>
 *  swagger接口文档
 * </p>
 *
 * @author Mengjingyu
 * @since 2022/12/31
 */

@Configuration
@EnableKnife4j
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(Environment environment) {
        //设置要显示的swagger环境
        Profiles profiles = Profiles.of("dev","test");
        //通过environment.acceptsProfiles判断是否处在自己设定的环境当中
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.OAS_30)
                .enable(flag)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build().globalRequestParameters(
                        singletonList(new springfox.documentation.builders.RequestParameterBuilder()
                                // 不能叫Authorization
                                .name("Naic-Tenant")
                                .description("naic tenant id")
                                .in(ParameterType.HEADER)
                                .required(true)
                                .query(q -> q.model(m -> m.scalarModel(ScalarType.STRING)))
                                .build()));
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "用户管理文档",
                "更多请咨询服务开发者",
                "1.0",
                "http://www.baidu.com",
                //作者信息
                new Contact("", "http://www.baidu.com", ""),
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );
    }
}
