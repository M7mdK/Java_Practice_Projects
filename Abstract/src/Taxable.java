
public interface Taxable {
	final double INCOME_TAX = 0.7;
	double monthlyTaxAmount();
	double totalTaxAmount(int nbMonths);
}
