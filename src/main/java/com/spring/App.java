package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring context from spring.xml
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

           Add obj = (Add) context.getBean("Add");
//           obj.setAge(45);
           System.out.println(obj.getAge());
           obj.add(99, 12);
           obj.mul(5, 3);    // Example usage
           
//           obj.sub(3,343);
    }
}
