package build_in_class.StringCase;

public class Test {

    public static void main(String[] args) {

        MyString myString = new MyString();

        String str = "abc";
        String str1 = "hello world";
        String str2 = "123456";

        String reverseString = myString.reverse(str);
        System.out.println(reverseString);

        String reverseConcatString = myString.reverseConcat(str);
        System.out.println(reverseConcatString);

        System.out.println(myString.isReverse("'abccba'"));

        System.out.println(myString.offsetDistance(str2, "right", 1));

        System.out.println(myString.letterExistCount(str1, 'l'));
    }
}





