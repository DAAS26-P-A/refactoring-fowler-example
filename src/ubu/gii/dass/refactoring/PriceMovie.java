package ubu.gii.dass.refactoring;

abstract class PriceMovie {

	abstract int getPriceCode();
	
	abstract double getCharge(int _daysRented);
	
	abstract int getFrequentRenterPoints(int _daysRented);
}
