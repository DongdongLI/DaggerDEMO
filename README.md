# DaggerDEMO

@Inject basically marks the constructor to be used (invoked) when a new instance is requested.

The final one 'CoffeeMaker' has only two components, and annotating the constructor of CoffeeMaker will make it work

@Provides The method’s return type defines which dependency it satisfies.
	: they are called when an instance is required
	
@Component: this annotates an Interface to generate the full implementation.

Naming convention: 
class Foo {
  static class Bar {
    @Component
    interface BazComponent {}
  }
}

will generate DaggerFoo_Bar_BazComponent