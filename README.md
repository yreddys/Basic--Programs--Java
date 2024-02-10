## Reverse a Number

```java
package com.numberss;

public class Reverse {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}

package com.numberss;

public class reverseNumString {
    public static void main(String[] args) {
        int s=12345;
        String str=String.valueOf(s);
        String reverse=new StringBuilder(str).reverse().toString();
        int reverseNum=Integer.parseInt(reverse);
        System.out.println(reverseNum);
    }
}



Find the 2nd Largest Number in an Array



