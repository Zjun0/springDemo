package com.zj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zj
 * @date: ${date}
 */
@Configuration//声明当前类是一个配置类
@ComponentScan("com.zj")//自动扫描包名下所有使用@Service @Component@Repository@Controller
public class DiConfig {

}
