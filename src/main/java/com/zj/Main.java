package com.zj;

import com.zj.config.DiConfig;
import com.zj.service.imp.spring1_3.DemoAnnotationService;
import com.zj.service.imp.spring1_3.DemoMethodService;
import com.zj.service.imp.spring1_3.UseFunctionService;
import com.zj.service.imp.spring2_5.DemoPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zj
 * @date: ${date}
 */
public class Main {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("手动阀");

        context.close();

        /*
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);

        DemoAnnotationService demoAnnotationService =
                context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService =
                context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();

        context.close();*/

        /*依赖注入
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService =
                context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("sb"));
        context.close();*/
    }
}
