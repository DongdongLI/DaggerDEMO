import dagger.Module;
import dagger.Provides;

@Module
abstract class PumpModule {
	@Binds
	abstract Pump providePump(Thermosiphon pump);
}