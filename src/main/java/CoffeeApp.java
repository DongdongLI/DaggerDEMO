import javax.inject.Singleton;

import dagger.Component;
public class CoffeeApp{

	@Singleton
	@Component(modules={ DripCoffeeModule.class })

	public interface Coffee{
		CoffeeMaker maker();
	}

	public static void main(final String[] args) {
		final Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
		coffee.maker().brew();
	}
}
