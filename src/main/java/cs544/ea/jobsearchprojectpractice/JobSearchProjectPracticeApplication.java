package cs544.ea.jobsearchprojectpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
public class JobSearchProjectPracticeApplication {

    public static void main(String[] args) {
        System.out.println("APP Start");

        SpringApplication.run(JobSearchProjectPracticeApplication.class, args);

        System.out.println("App end");
        
        boolean shoudcontain = true;
        while(shoudcontain) {
        	try {
    			Thread.sleep(1000);
    		} catch (Exception e) {
    			// TODO: handle exception
    			e.printStackTrace();
    		}
        }
    }
 
}
