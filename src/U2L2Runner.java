import java.util.Scanner;
public class U2L2Runner {
    public static void main(String[] args) {
        Rectangle customRec = new Rectangle(150, 200);
        Rectangle squareRec = new Rectangle(100);
        Rectangle defRec = new Rectangle();
        customRec.setWidth(125);
        squareRec.setLength(125);
        squareRec.setWidth(125);
        defRec.setWidth(125);
        int customRecPerimeter = customRec.calculatePerimeter();
        int squareRecPerimeter = squareRec.calculatePerimeter();
        int defRecPerimeter = defRec.calculatePerimeter();
        int recPerimeterSum = customRecPerimeter + squareRecPerimeter + defRecPerimeter;
        int customRecArea = customRec.calculateArea();
        int squareRecArea = squareRec.calculateArea();
        int defRecArea = defRec.calculateArea();
        int recAreaSum = customRecArea + squareRecArea + defRecArea;
        System.out.println("The total length of fencing needed is " + recPerimeterSum + " feet");
        System.out.println("The total area of seeding needed is " + recAreaSum + " square feet");

        Scanner s = new Scanner(System.in);
        System.out.println("How many pieces of lumber do you need for the home you are building?");
        int lumberPieces = s.nextInt();
        System.out.println("How many windows do you need?");
        int windows = s.nextInt();
        System.out.println("What is the tax rate for your area?");
        double tax = s.nextDouble();
        ConstructionPricer price1 = new ConstructionPricer(11.50, 25.75, tax);
        Double totalNoTax = price1.materialsCost(lumberPieces, windows);
        Double grandTotal = price1.totalWithTax(totalNoTax);
        System.out.println("Total Materials Cost: " + totalNoTax);
        System.out.println("Grand Total after Tax: " + grandTotal);
    }
}
