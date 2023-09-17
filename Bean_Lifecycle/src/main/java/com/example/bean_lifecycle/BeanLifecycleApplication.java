package com.example.bean_lifecycle;

import com.example.bean_lifecycle.model.ControllerExmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanLifecycleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanLifecycleApplication.class, args);
    }

}
