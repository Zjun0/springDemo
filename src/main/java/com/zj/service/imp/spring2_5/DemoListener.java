package com.zj.service.imp.spring2_5;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author: zj
 * @date: ${date}
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent event){
        String msg = event.getMsg();

        System.out.println("我接受到了信息："+ msg);
    }
}
