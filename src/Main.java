import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[]circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.8);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(-1,"red", true);

        System.out.println("Pre-sorted");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

        Arrays.toString(circles);

        System.out.println("After - sorted: ");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
