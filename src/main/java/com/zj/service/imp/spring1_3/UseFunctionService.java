package com.zj.service.imp.spring1_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zj
 * @date: ${date}
 */
@Service
public class UseFunctionService {

    @Autowired//
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
