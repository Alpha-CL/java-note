package build_in_class.StringCase;

import java.util.Objects;

public class MyString {

    /**
     * 字符串反转
     **/
    public String reverse(String str) {

        char[] strArr = str.toCharArray();

        for (int i = 0; i < strArr.length - 1; i++) {
            char temp = strArr[i];
            strArr[i] = strArr[(strArr.length - 1) - i];
            strArr[(strArr.length - 1) - i] = temp;
        }

        return new String(strArr);
        // return new String(new StringBuilder(str).reverse());
    }

    /**
     * 字符串反转拼接
     **/
    public String reverseConcat(String str) {
        // String reverseStr = this.reverse(str);
        // return str.concat(reverseStr);
        return str.concat(this.reverse(str));
    }

    /**
     * 判断字符串是回文( abccba √ , abceba x )
     **/
    public boolean isReverse(String str) {
        return str.equals(this.reverse(str));
    }

    /**
     * 将指定字符串向左向右移动指定距离
     **/
    public String offsetDistance(String str, String direction, int distance) {
        return Objects.equals(direction, "left") ? str.substring(distance) + str.substring(0, distance) : str.substring(str.length() - distance) + str.substring(0, distance) + str.substring(distance, str.length() - distance);
    }

    /**
     * 统计指定字符在字符串中出现的次数
     **/
    public int letterExistCount(String str, char tar) {
//        int count = 0;
//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == tar) {
//                count++;
//            }
//        }
//        return count;
        return str.length() - str.replace(String.valueOf(tar), "").length();
    }

    /**
     * 小驼峰命名
     **/
    public String toCamelCase(String str) {

        return "";
    }

    /**
     * 大驼峰命名
     **/
    public String CamelCase(String str) {

        return "";
    }
}
