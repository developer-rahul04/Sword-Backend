package autowire.resourcesannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BikeBeanConfig {

	@Bean(name = "RoyalEnfield")
	public RoyalEnfield getBullet_500() {
		return new Bullet_500();
	}

}
