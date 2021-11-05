public class Question3 {
    public static void main(String[] args) {
        
        float amount;
        float gst;
        float gstAmount;
        float total;

        System.out.print("Enter amount: ");
        amount = Float.parseFloat(System.console().readLine());

        System.out.print("Enter GST%: ");   // 18/28
        gst = Float.parseFloat(System.console().readLine());

        gstAmount = amount * (gst / 100);
        total = amount + gstAmount;

        System.out.println("\nAmount: " + amount);
        System.out.println("GST %: " + gst);
        System.out.println("GST Amount: " + gstAmount);
        System.out.println("Grand Total: " + total);
    }
}

/**
 * 1200
 * 18% = 216
 * 1416
 */