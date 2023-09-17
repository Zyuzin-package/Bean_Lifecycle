package com.example.bean_lifecycle.config;

import com.example.bean_lifecycle.model.ControllerExmpl;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FB implements FactoryBean<ControllerExmpl> {
    static int count = 0;

    @Override
    public ControllerExmpl getObject() throws Exception { // don't calling
        System.out.println("Factory Bean getObject");
        return new ControllerExmpl();
    }

    @Override
    public Class<?> getObjectType() {// calls many times
        if (count == 0) {
            System.out.println("Factory Bean getObjectType");
            count++;
        }
        return ControllerExmpl.class;
    }

    @Override
    public boolean isSingleton() {// calls one time
        System.out.println("Factory Bean is Singleton: " + FactoryBean.super.isSingleton());
        return FactoryBean.super.isSingleton();
    }
}
