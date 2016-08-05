import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = PumpModule.class)
class DripCoffeeModule {
	@Provides
	@Singleton
	Heater provideHeader() {
		return new ElectricHeater();
	}
}
