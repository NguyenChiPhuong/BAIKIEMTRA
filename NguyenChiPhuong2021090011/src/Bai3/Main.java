package Bai3;

import java.util.Scanner;

import Bai1.Product;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            Product sp = new Product();
            System.out.println("Mời bạn nhập sản phẩm thứ " + (i+1));
            System.out.println("-----------------------------");
            System.out.println("Mời bạn nhập tên sản phẩm");
            sp.setName(sc.nextLine());
            System.out.println("Mời bạn nhập giá sản phẩm");
            sp.setPrice(Double.parseDouble(sc.nextLine()));
            System.out.println("");
            System.out.println("Tên sản phẩm là: " + sp.getName());
            System.out.println("Giá của sản phẩm là: " + sp.getPrice());
            System.out.println("Thuế của sản phẩm là: " + sp.getImportTax(sp.getPrice()));
            System.out.println("-----------------------------");
            System.out.println("Bạn có muốn nhập tiếp sản phẩm hay không(Y or N) ?");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("N")) {
                break;
            }
        }

    }
}
