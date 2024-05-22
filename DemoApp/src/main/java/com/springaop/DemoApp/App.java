package com.springaop.DemoApp;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.DemoApp.bean.Product;
public class App {
	
    public static void main( String[] args )
   
    {
      System.out.println("Welcome to AOP Demo");
      ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
      Product product = (Product) context.getBean("productProxy");
      System.out.println(product);
      System.out.println();
      
      product.productPurchase("Home", "6:00", "john@gmail.com");
      
      //ProxyFactoryBean: Configure this class for our bean object with Advices
      // We need to configure below attributes
      //1. target
      //2. interceptorNames
    
      
} 

}