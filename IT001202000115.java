import java.util.Scanner;

public class IT001202000115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;

        System.out.print(
                "\nChoose the shape you want to calculate: \n[1] Equilateral Triangle \n[2] Isosceles Triangle \n[3] Right-angled Triangle \n[4] Pyramid \n[5] Tetrahedron \n[6] Triangular Prism - (right-angled triangle base) \n>> ");

        choice = input.nextInt();

        if (choice == 1) {
            EquilateralTriangle equilateral = new EquilateralTriangle();

            System.out.print("\n[EQUILATERAL TRIANGLE]");

            System.out.print("\nInput the SIDE length: ");
            equilateral.setTriangleBase(input.nextDouble());

            System.out.println();
            equilateral.ShowResult();

        } else if (choice == 2) {
            IsoscelesTriangle isosceles = new IsoscelesTriangle();

            System.out.print("\n[ISOSCELES TRIANGLE]");

            System.out.print("\nInput triangle BASE length: ");
            isosceles.setTriangleBase(input.nextDouble());
            System.out.print("Input triangle HEIGHT: ");
            isosceles.setTriangleHeight(input.nextDouble());

            System.out.println();
            isosceles.ShowResult();

        } else if (choice == 3) {
            RightAngledTriangle rightAngled = new RightAngledTriangle();

            System.out.print("\n[RIGHT-ANGLED TRIANGLE]");

            System.out.print("\nInput triangle BASE length: ");
            rightAngled.setTriangleBase(input.nextDouble());
            System.out.print("Input triangle HEIGHT: ");
            rightAngled.setTriangleHeight(input.nextDouble());

            System.out.println();
            rightAngled.ShowResult();

        } else if (choice == 4) {
            Pyramid pyramid = new Pyramid();

            System.out.print("\n[PYRAMID]");

            System.out.print("\nInput pyramid BASE length: ");
            pyramid.setTriangleBase(input.nextDouble());
            System.out.print("Input pyramid HEIGHT: ");
            pyramid.setHeight(input.nextDouble());

            System.out.println();
            pyramid.ShowResult();

        } else if (choice == 5) {
            Tetrahedron tetrahedron = new Tetrahedron();

            System.out.print("\n[TETRAHEDRON]");

            System.out.print("\nInput the SIDE length: ");
            tetrahedron.setTriangleBase(input.nextDouble());

            System.out.println();
            tetrahedron.ShowResult();

        } else if (choice == 6) {
            TriangularPrism triangularPrism = new TriangularPrism();

            System.out.print("\n[TRIANGULAR PRISM] - (right-angled triangle base)");

            System.out.print("\nInput the triangle BASE: ");
            triangularPrism.setTriangleBase(input.nextDouble());
            System.out.print("Input the triangle HEIGHT: ");
            triangularPrism.setTriangleHeight(input.nextDouble());
            System.out.print("Input PRISM HEIGHT: ");
            triangularPrism.setHeight(input.nextDouble());

            System.out.println();
            triangularPrism.ShowResult();

        }

        input.close();
    }
}