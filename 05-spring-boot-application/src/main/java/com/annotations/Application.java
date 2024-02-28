package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {
@Autowired
private CustomerService customerService;
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
     customerService.addCustomer();
    }
}

//option 1:Create an ApplicationContext based on the current configuration class
//    public static void main(String[] args) { ApplicationContext context = new
//            AnnotationConfigApplicationContext(Application.class);
//    CustomerService customerService = context.getBean("customerServiceImpl",CustomerService.class);
//    customerService.addCustomer();
//    } }


//Option2: Implement Command line runner, Implement the run() method

//-------option3:Create an ApplicationContext based on an external configuration class-------
//public static void main(String[] args) {
//    ApplicationContext context = new
//AnnotationConfigApplicationContext(AppConfig.class);
//    CustomerService customerService = context.getBean("customerServiceImpl",CustomerService.class);
//customerService.addCustomer();
//} }
//@Configuration
//@ComponentScan("customers")
//public class AppConfig {
//}
//----------------------------------------------------------