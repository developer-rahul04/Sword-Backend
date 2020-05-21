package autowire.byname;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="Bullet_350")
public class Bullet_350 implements RoyalEnfield{
	
	public Bullet_350(){
		
	}

	@Override
	public int getOilCapacity() {
		return 50;
	}

}
