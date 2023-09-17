//package com.example.bean_lifecycle.config;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
//import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class BFPP implements BeanFactoryPostProcessor {
//    @Override
//    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        System.out.println("Bean Factory PostProcessor get bean: " + beanFactory.getBean("controllerExmpl").getClass());
//    }
//}
