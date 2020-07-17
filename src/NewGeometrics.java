public class NewGeometrics {


    // Area Fläche
    private static int area(int x) {
        return x * x;
    }

    // perimeter
    private static int perimeter(int x) {
        return 4 * x;
    }

    // Rectangle area
    private static int rectangleArea(int x, int y){
        return x * y;
    }

    // Rectangle Perimeter
    public static int rectanglePerimeter(int x, int y) {
        return x + y;
    }

    // Zone of a Sphere
    public static double zoneOfASphere(int z, int y, int x) {
        return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    }

    // Spere with cylinder
    public static double sphereWithCylinder(int z) {
        return Math.PI * Math.pow(z, 3) / 6;
    }

    // Ungula
    public static double ungula(int x, int z) {
        return (double) (2 * x * z) / 3;
    }

    public static void main(String[] args) {
        System.out.println("Spuare area: " + area(10));
        System.out.println("Square perimeter: " + perimeter(10));
        System.out.println("Rectangle Area: " + rectangleArea(3, 5));
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter(4, 5));
        System.out.println("We can also calculate some volumes");
        System.out.println("Zone of a Sphere: " + zoneOfASphere(3, 5, 8));
        System.out.println("Ungula: " + ungula(3, 5));
    }
}

