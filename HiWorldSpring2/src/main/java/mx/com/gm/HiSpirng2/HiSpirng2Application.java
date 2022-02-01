package mx.com.gm.HiSpirng2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
    --spring boot make easy the development with its annotations
    --springframework is a container of classes java (beans)

    --to recognize the classes that we will add to our application, the classes must be in the same package where is our annotation @SpringBootApplication, where @ComponentScan annotation will search the classes that is between the same package

    --if a class is out of mx.com.gm package, it not will recognize the class as part of springboot
*/


/*
    --other important folder with spring framework is Other sources where is " application.properties" that is the config file of spring
    
*/



@SpringBootApplication
public class HiSpirng2Application {

	public static void main(String[] args) {
		SpringApplication.run(HiSpirng2Application.class, args);
	}

}
