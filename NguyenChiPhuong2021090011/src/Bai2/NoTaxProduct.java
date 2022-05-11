package Bai2;

import Bai1.Product;

public class NoTaxProduct extends Product{
	@Override
    public double getImportTax(double price) {
        return 0;
    }
}
