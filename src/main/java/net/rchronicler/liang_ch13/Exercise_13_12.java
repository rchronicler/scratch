package net.rchronicler.liang_ch13;

/*
    *13.12 (Sum the areas of geometric objects) Write a method that sums the areas of all the geometric objects in
    an array. The method signature is:

    public static double sumArea(GeometricObject[] a)
*/
public class Exercise_13_12 {
    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject obj : a) {
            sum += obj.getArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        GeometricObject[] a = new GeometricObject[4];
        a[0] = new Circle(2);
        a[1] = new Circle(7);
        a[2] = new Rectangle(2, 5);
        a[3] = new Rectangle(2, 1);

        System.out.printf("Total area: %.2f\n", sumArea(a));
    }
}
