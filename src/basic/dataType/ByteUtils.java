package basic.dataType;

public class ByteUtils {
    public static byte add(byte... args) {
        byte sum = 0;
        for (byte arg : args) {
            sum += arg;
        }
        return sum;
    }

    public static byte subtract(byte data, byte... args) {
        for (byte arg : args) {
            data -= arg;
        }
        return data;
    }
    public static byte divide(byte data, byte... args) {
        byte sum = data;
        for (byte arg : args) {
            sum /= arg;
        }
        return sum;
    }

    public static byte multiply(byte... args) {
        byte sum = 1;
        for (byte arg : args) {
            sum *= arg;
        }
        return sum;
    }

    public static void main(String[] args) {
        byte a= -1;
        byte b= -127;
        System.out.println("add:"+ ByteUtils.add(a,b));
        System.out.println("subtract:"+ByteUtils.subtract(a,b));
        System.out.println("multiply:"+ByteUtils.multiply(a,b));
        System.out.println("divide:"+ByteUtils.divide(b,a));
    }
}
