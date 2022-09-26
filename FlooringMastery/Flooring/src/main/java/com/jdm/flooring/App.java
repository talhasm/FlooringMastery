package com.jdm.flooring;

import com.jdm.flooring.controller.FlooringController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// author Talha 
public class App {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        FlooringController controller = ctx.getBean("controller", FlooringController.class);
        controller.run();
    }
}
