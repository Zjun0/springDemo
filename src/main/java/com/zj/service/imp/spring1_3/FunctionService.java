package com.zj.service.imp.spring1_3;

import org.springframework.stereotype.Service;

/**
 * @author: zj
 * @date: ${date}
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello"+ word+ "!";
    }
}
