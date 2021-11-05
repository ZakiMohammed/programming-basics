public class Operator {
    public static void main(String[] args) {
        
        // arithmetic: operand1 (numeric) + operand2 (numeric) -> numeric
        int a = 10 + 10;
        int b = 10 - 5;
        int c = 10 * 2;
        int d = 10 / 2; // quotient
        int e = 10 % 2; // reminder

        System.out.println("Arithmetic");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // relation: operand1 (numeric) > operand2 (numeric) -> boolean
        boolean rel1 = 4 > 3;       // true
        boolean rel2 = 4 < 4;       // false
        boolean rel3 = 4 >= 3;      // true
        boolean rel4 = 4 <= 4;      // true
        boolean rel5 = 4 == 3;      // false
        boolean rel6 = 4 != 3;      // true

        System.out.println("\nRelational");
        System.out.println(rel1);
        System.out.println(rel2);
        System.out.println(rel3);
        System.out.println(rel4);
        System.out.println(rel5);       
        System.out.println(rel6);

        // logical: operand1 (boolean) && operand2 (boolean) -> boolean
        boolean logAnd1 = true && true;
        boolean logAnd2 = true && false;
        boolean logAnd3 = false && true;
        boolean logAnd4 = false && false;
        
        System.out.println("\nLogical: AND");
        System.out.println(logAnd1);
        System.out.println(logAnd2);
        System.out.println(logAnd3);
        System.out.println(logAnd4);

        boolean logOr1 = true || true;
        boolean logOr2 = true || false;
        boolean logOr3 = false || true;
        boolean logOr4 = false || false;
        
        System.out.println("\nLogical: OR");
        System.out.println(logOr1);
        System.out.println(logOr2);
        System.out.println(logOr3);
        System.out.println(logOr4);

        boolean logNot1 = !false;
        boolean logNot2 = !true;

        System.out.println("\nLogical: NOT");
        System.out.println(logNot1);
        System.out.println(logNot2);

        // ternary
        int age = 57;
        // result = condition ? expression1 : expression2;
        String result = age > 58 ? "Elder" : "Not Elder";

        System.out.println("\nTernary");
        System.out.println(result);
    }
}