package autowire.bytype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ResourceAnnotationTestDriver {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ResourceAnnotationTestDriver.class, args);
		
		RoyalEnfield re = (RoyalEnfield) context.getBean(Bullet_350.class);
		System.out.println("350 " + re.getOilCapacity());
		
		RoyalEnfield re1 = (Bullet_500) context.getBean(Bullet_500.class);
		System.out.println("500 " + re1.getOilCapacity());
		
		HarleyDavidson re2 = (HarleyDavidson) context.getBean(HarleyDavidson.class);
		System.out.println("HarleyDavidson Intf " + re2.oilCapacity());
	}
	//https://www.baeldung.com/spring-annotations-resource-inject-autowire
}
