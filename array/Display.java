// import java.util.*;
import java.util.Arrays;

public class Display {
    public static void main(String[] args) {
        int a[] = new int[5];

        a[0] = 300;
        a[1] = 400;
        a[2] = 500;
        a[3] = 600;
        a[4] = 700;

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        
        System.out.println(Arrays.toString(a));
    }
}
