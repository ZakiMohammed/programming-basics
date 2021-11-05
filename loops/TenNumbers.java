public class TenNumbers {
    public static void main(String[] args) {
        int i = 1;                          // declaration of control variable

        while (i <= 10) {                   // condition: true/false
            System.out.println(i);
            i = i + 1;                      // increment/decrement of control variable
        }
    }
}

// DRY - Dont repeat yourself
// Iteration - every time loops executed it calls iteration