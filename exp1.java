public class exp1 {
public static void main(String[] args) {
try {
int a = 10, b = 0;
int result = a / b;   // error
System.out.println(result);
} catch (ArithmeticException e) {
System.out.println("Cannot divide by zero");
}
}
}