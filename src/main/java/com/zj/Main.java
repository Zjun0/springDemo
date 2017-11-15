package com.zj;

import com.zj.config.DiConfig;
import com.zj.service.imp.spring1_3.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zj
 * @date: ${date}
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService =
                context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("sb"));
        context.close();
    }
}
