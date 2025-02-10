package basic.dataType;

/**
 * @author 爱编程的杰尼龟
 * @version 1.0.0
 * @doc 整型工具类
 * @date 2024/12/29
 */
public class IntegerUtils {
    /**
     * @param args args
     * @return @return int
     * @doc +
     */
    public static int add(int... args){
        int sum = 0;
        for (int arg : args){
            sum += arg;
        }
        return sum;
    }

    /**
     * @param args args
     * @return @return int
     * @doc -
     */
    public static int subtract(int data, int... args){
        for (int arg : args){
            data -= arg;
        }
        return data;
    }

    /**
     * @param args args
     * @return @return int
     * @doc *
     */
    public static int multiply(int... args){
        int result = 1;
        for (int arg : args){
            result *= arg;
        }
        return result;
    }

    /**
     * @param data 数据
     * @param args args
     * @return @return int
     * @doc /
     */
    public static int divide(int data, int... args){
        for (int arg : args){
            if(arg == 0){
                throw new ArithmeticException("除数不能为0");
            }
            data /= arg;
        }
        return data;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(IntegerUtils.add(a,b,c,d));
        System.out.println(IntegerUtils.subtract(a,b,c,d));
        System.out.println(IntegerUtils.multiply(a,b,c,d));
        System.out.println(IntegerUtils.divide(a,b,c,d));
    }
}
