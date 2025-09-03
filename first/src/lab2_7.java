class Number{
    private double value;
    public Number(double value) {
        this.value = value;
    }
    public boolean isZero() {
        return value == 0;
    }
    public boolean isPositive() {
        return value > 0;
    }
    public boolean isNegative() {
        return value < 0;
    }
    public boolean isOdd() {
        if (value % 2 != 0 && value == (int) value) {
            return true;
        }
        return false;
    }
    public boolean isEven() {
        if (value % 2 == 0 && value == (int) value) {
            return true;
        }
        return false;
    }
    public boolean isPrime() {
        if (value <= 1 || value != (int) value) return false;
        int n = (int) value;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public boolean isArmstrong() {
        if (value != (int) value) return false;
        int n = (int) value;
        int temp = n, sum = 0, digits = String.valueOf(n).length();

        while (temp > 0) {
            int r = temp % 10;
            sum += Math.pow(r, digits);
            temp /= 10;
        }
        return sum == n;
    }
}
public class lab2_7 {
    public static void main(String[] args) {
        Number num = new Number(153);
        System.out.println("Zero = "+num.isZero());
        System.out.println("Positive = "+num.isPositive());
        System.out.println("Negative = "+num.isNegative());
        System.out.println("Odd = "+num.isOdd());
        System.out.println("Even = "+num.isEven());
        System.out.println("Prime = "+num.isPrime());
        System.out.println("Armstrong = "+num.isArmstrong());
    }

}
