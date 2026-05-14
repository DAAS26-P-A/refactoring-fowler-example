package ubu.gii.dass.refactoring;

public class ChildrenPrice extends PriceMovie{

	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	double getCharge(int _daysRented) {
		double result = 1.5;
		if (_daysRented > 3)
			result += (_daysRented - 3) * 1.5;
		return result;
	}

}
