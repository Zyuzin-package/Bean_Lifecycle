package com.example.bean_lifecycle.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("singleton")
//@Scope("prototype")
public class ControllerExmpl implements BeanNameAware, DisposableBean, InitializingBean {

    ServiceExmpl serviceExmpl;


    {
        System.out.println("None static block worked at" + this.getClass().getSimpleName());
    }

    static {
        System.out.println("Static block worked at " + ControllerExmpl.class.getSimpleName());
    }



    public ControllerExmpl() {
        System.out.println("Constructor worked at " + this.getClass().getSimpleName());
    }

    @Autowired
    public void setService(ServiceExmpl serviceExmpl) {
        System.out.println("Setter worked (AUTOWIRED) at " +this.getClass().getSimpleName());
        this.serviceExmpl = serviceExmpl;
    }
    @Override
    public void afterPropertiesSet(){
        System.out.println("After property set at " + this.getClass().getSimpleName() );
    }
    @PostConstruct
    public void pCInit() {
        System.out.println("Post construct (init) worked at " +this.getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre destroy (destroy) worked"+this.getClass().getSimpleName());
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set bean name: " + name + " at "+this.getClass().getSimpleName());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean call destroy() at "+ this.getClass().getSimpleName());
    }
}
