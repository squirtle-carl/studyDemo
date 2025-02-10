package basic.dataType;

public class LongUtils {
    public static long add(long ... b) {
        long sum = 0;
        for (long arg : b) {
            sum += arg;
        }
        return sum;
    }

    public static long subtract(long data, long... a){
        for (long arg : a) {
            data -= arg;
        }
        return data;
    }

    public static long multiply(long ... b) {
        long sum = 1;
        for (long arg : b) {
            sum *= arg;
        }
        return sum;
    }

    public static long divide(long data, long... a){
        for (long arg : a){
            if(arg == 0){
                throw new ArithmeticException("除数不能为0");
            }
            data /= arg;
        }
        return data;
    }

    public static void main(String[] args) {
        long a= -1;
        long b= 2;
        long c= 3;
        System.out.println(add(a,b,c));
        System.out.println(subtract(a,b,c));
        System.out.println(multiply(a,b,c));
        System.out.println(divide(a,b,c));
    }
}
