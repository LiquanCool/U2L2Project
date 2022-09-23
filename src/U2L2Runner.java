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
    }
}
