package com.aspect;

import com.controller.IndexController;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    private static final Logger logger= LoggerFactory.getLogger(IndexController.class);

    @Before("execution(* com.controller.IndexController.*(..))")
    public void before(){
        logger.info("before");
    }
}
