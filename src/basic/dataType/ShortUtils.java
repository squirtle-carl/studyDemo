package basic.dataType;

public class ShortUtils {
    public static short add(short data, short ... a){
        for (short arg : a){
            data += arg;
        }
        return data;
    }
    public static short subtract(short data,  short ... a){
        for (short arg : a){
            data -= arg;
        }
        return data;
    }

    public static short multiply(short ... a){
        short result = 1;
        for (short arg : a){
            result *= arg;
        }
        return result;
    }

    public static short divide(short data,short ... a){
        for (short arg : a){
            if(arg == 0){
                throw new ArithmeticException("除数不能为0");
            }
            data /= arg;
        }
        return data;
    }

    public static void main(String[] args) {
        short a= -2;
        short b= 2;
        System.out.println(add(a,b));
        System.out.println(subtract(a,b));
        System.out.println(multiply(a,b));
        System.out.println(divide(a,b));
    }
}
