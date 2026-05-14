package ubu.gii.dass.refactoring;

public class NewReleasePrice extends PriceMovie{

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	double getCharge(int _daysRented) {
		return _daysRented * 3;
	}
	
	@Override
	int getFrequentRenterPoints (int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}

}
