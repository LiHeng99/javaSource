package com.lh.test.longPage;

/**
 * 1.String
 * String对象是不可变的。
 *
 * 2.StringBuilder
 * StringBuilder是可变的，它不是线程安全的。
 *
 * 3.StringBuffer
 * StringBuffer也是可变的，它是线程安全的，所以它的开销比StringBuilder大。
 *
 */
public class StringTest {
    public static void main(String[] args) {
        String s = new String();
        s = "sting";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("stringBuilder");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("stringBuffer");

        System.out.println(s);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
    }
}
