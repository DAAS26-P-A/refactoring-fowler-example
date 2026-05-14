package ubu.gii.dass.refactoring;

public class NewReleasePrice extends PriceMovie{

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

}
