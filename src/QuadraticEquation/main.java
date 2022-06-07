package QuadraticEquation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập vào giá trị a: ");
        double a = input.nextDouble();
        System.out.printf("Nhập vào giá trị b: ");
        double b = input.nextDouble();
        System.out.printf("Nhập vào giá trị c: ");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        double delta = quadraticEquation.getDiscriminant();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();

        if (delta>=0){
            System.out.printf("Nghiệm của phương trình bậc nhất là: " + "X1: " + root1 + ", " + "X2: " + root2);
        } else if (delta<0) {
            System.out.printf("Phương trình có nghiệm duy nhất bằng = 0");
        }else {
            System.out.printf("Phương trình vô nghiệm");
        }

    }

}
