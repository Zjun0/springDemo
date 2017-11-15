package com.zj.service.imp.spring1_3;

import com.zj.aop.Action;
import org.springframework.stereotype.Service;

/**
 * @author: zj
 * @date: ${date}
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解是拦截的aopcaozuo")
    public void add(){}
}
