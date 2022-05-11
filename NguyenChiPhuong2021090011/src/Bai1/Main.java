package Bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            System.out.println("Mời bạn nhập sản phẩm thứ " + i++);
            System.out.println("-----------------------------");
            System.out.println("Mời bạn nhập tên sản phẩm");
            String name = sc.nextLine();
            System.out.println("Mời bạn nhập giá sản phẩm");
            double price = sc.nextDouble();
        }
    }
}
