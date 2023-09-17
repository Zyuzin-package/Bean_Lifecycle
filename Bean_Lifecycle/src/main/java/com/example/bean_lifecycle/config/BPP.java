package com.example.bean_lifecycle.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class BPP implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("controllerExmpl")) {
            System.out.println("Post process before initialization for bean: " +beanName);
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("controllerExmpl")) {
            System.out.println("Post process after initialization for bean: " + beanName );
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
