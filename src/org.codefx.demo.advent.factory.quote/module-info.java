module org.codefx.demo.advent.factory.quote {
	// list the required modules
	requires transitive org.codefx.demo.advent.surprise;
	requires guava;
	// specify which class provides which service
	provides org.codefx.demo.advent.surprise.SurpriseFactory
		with org.codefx.demo.advent.factory.quote.QuoteFactory;
}
