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



// Java program to find the 2nd largest number in an array

public class ThirdLargestNumberInAnArray {
   public static void main(String args[]){
      int temp, size;
      int array[] = {10, 20, 25, 63, 96, 57};
      size = array.length;

      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){

            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println("Third second largest number is:: "+array[size-2]);
   }
}




import java.util.Arrays;
public class LargestNumberSample {
   public static void main(String args[]){
      int array[] = {10, 20, 25, 63, 96, 57};
      int size = array.length;
      Arrays.sort(array);
      System.out.println("sorted Array ::"+Arrays.toString(array));
      int res = array[size-2];
      System.out.println("2nd largest element is ::"+res);
   }


// Find First non repeating character in a String


package com.arrays;

public class Hello {
	public static void main(String[] args) {
		
	
String str="AABCDBE";
for (int i=0;i<str.length();i++) {
	boolean unique=true;
	for (int j=0;j<str.length();j++) {
		if(i!=j&&str.charAt(i)==str.charAt(j)) {
			unique=false;
			
		}
		
	}
	if(unique) {
		System.out.println(str.charAt(i));
		break;
		
	}
}
}
}


// input str="abcabc"
// output a=2;
 //     b=2;
//      c=2;


package com.arrays;

public class MaxConsecutiveRepetition {
    public static void main(String[] args) {
        String input = "aaabbbbcccccddd";

      
        printMaxConsecutiveRepetition(input);
    }

    public static void printMaxConsecutiveRepetition(String str) {
        // Iterate through the characters in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 1;

            // Check consecutive repetitions
            while (i + 1 < str.length() && str.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            // Print the result for each character
            System.out.println(currentChar + "=" + count);
        }
    }
}


   //  Reverse a String 

             String str = "Hello";
		// Approach -1
		char[] chars = str.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}
		// Approach -2
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
		// Approach -3
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		 // Approach -4
		
		StringBuilder sb1= new StringBuilder();
		System.out.println(sb1.reverse());


// Removing Duplicates from String



public static void main(String[] args) {
		String str = "HelloHello";
		// Approach -1

		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c -> sb.append((char) c));
		System.out.println(sb);

		// Approach -2
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int indx = str.indexOf(ch, i + 1);
			if (indx == -1) {
				sb2.append(ch);
			}

		}
		System.out.println(sb2);

		// Approach -3

		char[] arr = str.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeated = true;
					break;
				}

			}
			if (!repeated) {
				sb3.append(arr[i]);
			}
		}
		System.out.println(sb3);

		// approach -4

		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));

		}
		for (Character c : set) {
			sb4.append(c);

		}
		
		System.out.println(sb4);
	}


// approach -5



Set<Character> seen = new HashSet<>();
     Set<Character> duplicates = new HashSet<>();

     for (char c : str.toCharArray()) {
         if (!seen.add(c)) { 
             duplicates.add(c);
         }
     }

     System.out.println("Duplicate characters: " + duplicates);
 }


// Reverse each Word In Given String

public class reverseWord {
	public static void main(String[] args) {
		String str = "Reddy sekhar";
		String output="";
		String[] words = str.split(" ");
		
		for(String word:words) {
			String revWord="";
			for(int i=word.length()-1;i>=0;i--) {
				revWord=revWord+word.charAt(i);
				
				
			}
			output=output+revWord+"";
		}
		System.out.println(output);
	}
}

