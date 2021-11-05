public class Invoice {
    public static void main(String[] args) {
        float amount, gst;

        System.out.print("Enter amount: ");
        amount = Float.parseFloat(System.console().readLine());

        System.out.print("Enter GST%: ");
        gst = Float.parseFloat(System.console().readLine());

        System.out.println("\nAmount: " + amount);
        System.out.println("GST %: " + gst);
        System.out.println("Grand Total: " + getTotal(amount, gst));
    }

    static float getTotal(float amount, float gstPercentage) {
        float gstAmount = amount * (gstPercentage / 100);
        float total = amount + gstAmount;

        return total;
    }
}

// input    -> amount, gst%
// output   -> total