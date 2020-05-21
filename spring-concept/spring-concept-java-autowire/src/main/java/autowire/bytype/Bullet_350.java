package autowire.bytype;

import org.springframework.stereotype.Component;

@Component
public class Bullet_350 implements RoyalEnfield{
	
	public Bullet_350(){
		
	}

	@Override
	public int getOilCapacity() {
		return 50;
	}

}
