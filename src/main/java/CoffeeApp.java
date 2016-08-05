import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

public class CoffeeApp{

	@Singleton
	@Component(modules={})
	
	public interface Coffee{
		CoffeeMaker maker();
	}
	@Override
	public void run() {
		coffeeMaker.brew();
	}

	public static void main(String[] args) {
		Coffee coffee = 
	}
}
