package offer;

/**
 * Created by Joe
 * 替换空格
 */
public class Num2 {
    public String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) {
            return str.toString();
        }
        int len = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                stringBuilder.append("%20");
                continue;
            }
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();

    }
}
