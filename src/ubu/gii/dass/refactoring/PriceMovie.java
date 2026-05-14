package ubu.gii.dass.refactoring;

abstract class PriceMovie {

	abstract int getPriceCode();
	
	abstract double getCharge(int _daysRented);
	
	int getFrequentRenterPoints(int _daysRented) {
		return 1;
	}
}
