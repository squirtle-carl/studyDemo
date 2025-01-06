package advanced.concurrent;

/**
 * @author caihuaxin
 * @version 1.0.0
 * @doc 锁消除
 * @date 2023-10-25 18:05:34
 */
public class LockEliminate {
    public static synchronized String test03(String s1, String s2, String s3) {
        StringBuilder s = new StringBuilder();
        s.append(s1);
        s.append(s2);
        s.append(s3);
        return s.toString();
    }

    public static String test04(String s1, String s2, String s3) {
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(s2);
        sb.append(s3);
        return sb.toString();
    }
}
