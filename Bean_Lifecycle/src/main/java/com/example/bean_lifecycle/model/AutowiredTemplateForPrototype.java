package com.example.bean_lifecycle.model;

import org.springframework.stereotype.Component;

//@Component
public class AutowiredTemplateForPrototype {
    ControllerExmpl controllerExmpl;

    public AutowiredTemplateForPrototype(ControllerExmpl controllerExmpl) {
        this.controllerExmpl = controllerExmpl;
    }
}
