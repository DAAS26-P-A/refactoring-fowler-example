package ubu.gii.dass.refactoring;

public class RegularPrice extends PriceMovie{

	@Override
	int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	double getCharge(int _daysRented) {
		double result = 2;
		if (_daysRented > 2) 
			result += (_daysRented - 2) * 1.5; 
		return result;
	}

}
