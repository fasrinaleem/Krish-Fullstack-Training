import java.math.BigDecimal;

public class BigDecimalApplication {

	public static void main(String[] args) {
		
		//Calculating total bill value using Double
		double product1PriceD = 4500.95;
		double product2PriceD = 7300.40;
		double discountD = 10.50;
		
		double subTotalD = product1PriceD + product2PriceD;
		double totalDiscountD = subTotalD*discountD/100;
		double totalD = subTotalD - totalDiscountD;
		
		System.out.println("Total bill value(Double): "+totalD);
		
		
		//Calculating total bill value using BigDecimal
		BigDecimal product1PriceBD = new BigDecimal("4500.95");
		BigDecimal product2PriceBD = new BigDecimal("7300.40");
		BigDecimal discountBD = new BigDecimal("10.50");
		
		BigDecimal subTotalBD = product1PriceBD.add(product2PriceBD);
		BigDecimal totalDiscoundBD = subTotalBD.multiply(discountBD).divide(new BigDecimal("100.00"));
		BigDecimal totalBD = subTotalBD.subtract(totalDiscoundBD);
		
		System.out.println("Total bill value(Big Decimal): "+totalBD);
		
	}

}
