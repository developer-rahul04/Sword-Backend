package autowire.byname;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "Bullet_500")
public class Bullet_500 implements RoyalEnfield {

	public Bullet_500() {

	}

	public int getOilCapacity() {
		return 100;
	}
}
