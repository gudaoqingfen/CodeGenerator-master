package com.lshq.codegenerator.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="https://www.zhanghan.com">zhh</a>
 * @since 2021-12-20
 */
@Data
@Configuration
@ConfigurationProperties("erwin")
public class ErwinProperties {

    private App app;

    @Data
    public static class App {
        private String name;
        private String version;
    }

}
