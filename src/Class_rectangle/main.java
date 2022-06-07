package Class_rectangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inpput = new Scanner(System.in);
        System.out.printf("Nhập vào giá trị chiều dài: ");
        double width = inpput.nextDouble();
        System.out.printf("Nhập vào giá trị chiều rộng: ");
        double heigth = inpput.nextDouble();
        Rectangle rectangle = new Rectangle(width,heigth);
        System.out.println(rectangle.display());
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter() + "M");
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea() + "M2");
    }
}
