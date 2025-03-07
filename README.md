Remove OuterMost Parethesis
----------------------------

Pattern1



public class Parenthesis {
    
    // Method to check if the string is balanced and remove outermost parentheses
    public static String removeOutermostParentheses(String str) {
        // Stack to help with the parentheses matching
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                // If it's the first parenthesis, skip adding it to the result
                if (!stack.isEmpty()) {
                    result.append(ch);
                }
                stack.push(ch);
            } else if (ch == ')') {
                stack.pop();
                // If it's the last parenthesis, skip adding it to the result
                if (!stack.isEmpty()) {
                    result.append(ch);
                }
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOutermostParentheses("(()())"));  // Should return "()"
        System.out.println(removeOutermostParentheses("(((())))"));  // Should return "(()())"
        System.out.println(removeOutermostParentheses("()"));  // Should return an empty string ""
        System.out.println(removeOutermostParentheses("((()()))"));  // Should return "(()())"
    }
}



Generating Possible subarrays
--------------------------

Pattern 1 
----------

public class subArrays {

	public static void sub(String str) {
		int i, j;
		int n = str.length();
		for (i = 0; i < n; i++) {
			for (j = i + 1; j <= n; j++) {

				System.out.println(str.substring(i, j));
			}
		}
	}

	public static void main(String[] args) {
		String s = "abc";
		sub(s);
	}
}


pattern 2
------------


public class subAr {

    public static void sub(String str) {
        int n = str.length();
        
        // Loop through each possible starting index
        for (int i = 0; i < n; i++) {
            // Loop through each possible ending index after i
            for (int j = i + 1; j <= n; j++) {
                // Manually print the substring from index i to j-1
                // Create a temporary substring by appending characters one by one
                for (int k = i; k < j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println(); // Print the substring
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc"; // Example string to test
        sub(input);
    }
}




```java

Largest odd number in a string ?

public class LargestOddNumberInString {

    public static String largestOddNumber(String num) {
        // Iterate from the end of the string to the beginning
        for (int i = num.length() - 1; i >= 0; i--) {
            // Check if the current character is an odd digit
            if ((num.charAt(i) - '0') % 2 != 0) {
                // Return the substring from the start to the current index + 1
                return num.substring(0, i + 1);
            }
        }
        // If no odd number is found, return an empty string
        return "";
    }

    public static void main(String[] args) {
        String num = "12345678";
        String result = largestOddNumber(num);
        System.out.println("The largest odd number in the string is: " + result);
    }
}


451. Sort Characters By Frequency 

// SubArraysWithTarget

public class SubArraysWithTarget {
    public static void subArrays(int a[], int target) {
        // Iterate through all possible starting points of subarrays
        for (int i = 0; i < a.length; i++) {
            int currentSum = 0;

            // Iterate through all possible ending points for subarrays
            for (int j = i; j < a.length; j++) {
                currentSum += a[j];

                // If the current sum equals the target, print the subarray
                if (currentSum == target) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(a[k] + " ");
                    }
                    System.out.println(); // Newline for the next subarray
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 8};
        int target = 3;

        System.out.println("Subarrays with target sum " + target + ":");
        subArrays(a, target);
    }
}

// Generating SubArrays

Brute 
------

public class SubArray {
	public static void subArrays(int a[], int n) {
		int i, j, k;
		for (i = 0; i < n; i++) {
			for (j = i; j < n; j++) {
				for (k = i; k <= j; k++) {
					System.out.print(a[k] + " ");
				}
				System.out.println();
			}

		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		subArrays(a, 3);
	}
}


205. Isomorphic Strings

public class Ismo {
    public static boolean ismorphics(String s, String t) {
        // Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Arrays to store mappings
        int[] s1 = new int[256];
        int[] t1 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if mappings are consistent
            // characters have not yet been mapped.
            if (s1[charS] == 0 && t1[charT] == 0) {
                // Create new mappings
                s1[charS] = charT;
                t1[charT] = charS;
            } else if (s1[charS] != charT || t1[charT] != charS) {
                return false; // Mapping conflict
            }
        }

        return true; // Strings are isomorphic
    }

    public static void main(String[] args) {
        String s = "ABC";
        String t = "DEF";

        boolean result = ismorphics(s, t);
        System.out.println( result);

       
    }
}


1021. Remove Outermost Parentheses

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            // Check the balance before appending characters
            if (c == '(') {
                if (balance > 0) {
                    result.append(c);
                }
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance > 0) {
                    result.append(c);
                }
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        RemoveOutermostParentheses solution = new RemoveOutermostParentheses();
        String s = "(()())(())";
        String result = solution.removeOuterParentheses(s);
        System.out.println("Output: " + result);  // Output: "()()()"
    }
}


678. Valid Parenthesis String

import java.util.Stack;

public class ValidParenthesesBetter {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push opening brackets onto the stack
            } else {
                if (stack.isEmpty()) return false; // No matching opening bracket

                char top = stack.pop(); // Pop the last unmatched opening bracket

                // Check if it matches the closing bracket
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // All brackets should be matched
    }

    public static void main(String[] args) {
        String input = "({[]})";
        System.out.println("Is valid: " + isValid(input)); // Expected output: true
    }
}


Leetcode 189.
// Right Rotation 
// a[i+1]=a[i]
public class rightRotate {
	public static int[] rotate(int a[]) {
		int n = a.length;
		int i, j;
		int temp[] = new int[n];
		for (i = 0; i < n-1; i++) {
			temp[i+1] = a[i];
		}
		
		temp[0] = a[n-1];
		return temp;

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		// 5,1,2,3,4
		int[] result = rotate(a);
		System.out.println(Arrays.toString(result));
	}
}


// Second Largest Element

public class SecondLargest {
	public static int findSecondLargest(int a[]) {
		int n = a.length;

		int max = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				secondLargest = max; 
				max = a[i];
			} else if (a[i] > secondLargest && a[i] != max) {
				secondLargest = a[i]; 
										
			}
		}

		return secondLargest;
	}

	public static void main(String[] args) {
		int a[] = { 1, 20, 30, 4, 25, 100, 200 };
		int second = findSecondLargest(a);
		System.out.println("Second Largest: " + second);
	}
}


Leetcode 75. Sort Colors

public class BasicSortArray {
    public static void sortArray(int[] arr) {
        // Count the occurrences of 0, 1, and 2
        int count0 = 0, count1 = 0, count2 = 0;

        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }

        // Overwrite the array with 0s, then 1s, then 2s
        int index = 0;

        // Add all 0s
        for (int i = 0; i < count0; i++) {
            arr[index++] = 0;
        }

        // Add all 1s
        for (int i = 0; i < count1; i++) {
            arr[index++] = 1;
        }

        // Add all 2s
        for (int i = 0; i < count2; i++) {
            arr[index++] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 0, 1, 0};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        sortArray(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}



LeetCode Problem -1299
(https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/)


public class ReplaceGreatestElement {
	public static void main(String[] args) {
		int s[] = { 17, 18, 5, 4, 6, 1 };
		int n = s.length;
		int result[] = new int[n];
		int max = -1;
		for (int i = n - 1; i >= 0; i--) {
			result[i] = max;
			max = Math.max(max, s[i]);
		}
		for (int i = 0; i < result.length ; i++) {
			System.out.print(result[i]+" ");
		}
	}
}










// 1. Reverse a number / Palindrome

package com.numberss;

public class Reverse {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = 0;
         while (num != 0) {
            // Extract the last digit of the original number
            int digit = num % 10;
            // Add the last digit to the reversed number,
            // shifting the existing digits of the reversed number one place to the left
            reverse = reverse * 10 + digit;
            // Remove the last digit from the original number
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


// NumberPalindrome  

public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 121;
        int originalNum = num;
        int reverse = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        
        if (originalNum == reverse) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}

  //  Palindrome for String  

public class StringPalindrome {
	public static void main(String[] args) {
		String st = "RRR";
		String Reverse = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			Reverse = Reverse + st.charAt(i);

		}
		if (st.equals(Reverse)) {
			System.out.println("Palindrome");

		} else {
			System.out.println("Not a palindrome");
		}
	}
}


// 2. Java program to find the 2nd largest number in an array

public class ThirdLargestNumberInAnArray {
    public static void main(String args[]) {
        int temp, size;
        int array[] = {10, 20, 25, 63, 96, 57};
        size = array.length;

        for(int i = 0; i<size; i++ ) {
            for(int j = i+1; j<size; j++) {
                if(array[i]>array[j]) {
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
    public static void main(String args[]) {
        int array[] = {10, 20, 25, 63, 96, 57};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("sorted Array ::"+Arrays.toString(array));
        int res = array[size-2];
        System.out.println("2nd largest element is ::"+res);
    }
}

// 3. Find First non repeating character in a String

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

// 4. program to find Occurances in String?

String input = "aaabbbbcccccddd";
o/p:  a=3
b=4
c=5
d=3

package com.arrays;

public class MaxConsecutiveRepetition {
    public static void main(String[] args) {
        String input = "aaabbbbcccccddd";
        printMaxConsecutiveRepetition(input);
    }

    public static void printMaxConsecutiveRepetition(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }
            System.out.println(currentChar + "=" + count);
        }
    }
}

O/P:

1 occurs 3 times.
2 occurs 3 times.
3 occurs 1 times.


package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Occurrences {
    public static void main(String[] args) {
        int[] a = { 1, 2, 1, 2, 3, 1, 2 };
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}

// 5. Reverse a String 

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

// 6. Removing Duplicates from String

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
    // Approach -4
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

// Approach -5
Set<Character> seen = new HashSet<>();
Set<Character> duplicates = new HashSet<>();
for (char c : str.toCharArray()) {
    if (!seen.add(c)) { 
        duplicates.add(c);
    }
}
System.out.println("Duplicate characters: " + duplicates);

// 7. Reverse each Word In Given String

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

// 8. To Find Longest SubString without Repeating Characters

package com.problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class longestSubstringWithoutRepeating {
    static void longestSubstring(String s) {
        String LongestSubstring = null;
        int LongestSubstringLength = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                i = map.get(ch);
                map.clear();
            }
            if (map.size() > LongestSubstringLength) {
                LongestSubstringLength = map.size();
                LongestSubstring = map.keySet().toString();
            }
        }
        System.out.println(LongestSubstring);
        System.out.println(LongestSubstringLength);
    }

    public static void main(String[] args) {
        longestSubstring("abcabc");
   

 }
}

// 9. Find the Length of Last Word in String

public class findTheLengthOfLastWord {
    static int lastWordLength(String str) {
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int countLastWodrds = lastWordLength("Hello buddy i am here");
        System.out.println(countLastWodrds);
    }
}

// 10. Find the Longest Word in String

package com.problems;

public class longestWord {
    static String LongestWord(String str) {
        String longWord;
        String arr[] = str.split(" ");
        longWord = arr[0];
        for (String a : arr) {
            if (longWord.length() < a.length()) {
                longWord = a;
            }
        }
        return longWord;
    }

    public static void main(String[] args) {
        String s = LongestWord("Hello Reddysekhar How are you");
        System.out.println(s);
    }
}

// 11. Find the Length of Each Word in String

package longestWord;

class lengthOfeachWord {
    public static void lengthofeachword(String str) {
        StringBuilder word = new StringBuilder();
        str=str+" ";
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if(c!=' ') {
                word.append(c);
            } else {
                if(word.length()>0) {
                    System.out.println(word+" "+word.length());
                    word.setLength(0);
                }
            }
        }
    }
    public static void main(String[] args) {
        lengthofeachword("i am an aiExpert");
    }
}

// 12. Find the Longest Word in String and Count

class maxLengthInString {
    public static void maxLengthInString(String str) {
        StringBuilder word = new StringBuilder();
        str = str + " ";
        int maxLength = 0;
        String maxWord = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    System.out.println(word + " " + word.length());
                    if (word.length() > maxLength) {
                        maxLength = word.length();
                        maxWord = word.toString();
                    }
                    word.setLength(0);
                }
            }
        }
        System.out.println("Maximum length word: " + maxWord + ", Length: " + maxLength);
    }

    public static void main(String[] args) {
        maxLengthInString("i am an aiExpert");
    }
}


// 13 . program to find all permutations of a string 

package com.march15;

public class permutations {
	static void StringPermutations(String s) {

		System.out.println("Permutations of string :" + s);
		Stringpermutations("", s);

	}

	private static void Stringpermutations(String str, String input) {

		if (input.length() == 0) {
			System.out.println(str);

		} else {

			for (int i = 0; i < input.length(); i++) {

				Stringpermutations(str + input.charAt(i),
						input.substring(0, i) + input.substring(i + 1, input.length()));

			}
		}
	}

	public static void main(String[] args) {
		StringPermutations("How");
	}
}

using swapping
-------------------
package may13;

public class permutations {
    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0);
    }

    public static void permute(String str, int currentIndex) {
        if (currentIndex == str.length() - 1) {
            System.out.println(str);
        } else {
            for (int i = currentIndex; i < str.length(); i++) {
                str = swap(str, currentIndex, i);
                permute(str, currentIndex + 1);
                str = swap(str, currentIndex, i); // backtrack
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

==========================

package com.practice;

public class HelloWorld {
	  public static void permutations(String s,String ans){
	    
	    if(s.length() == 0){
	      System.out.println(ans);
	    }
	    for(int i=0;i<s.length();i++){
	      char ch = s.charAt(i);
	      //System.out.println("ch "+ch+" ");
	      String left_sub = s.substring(0,i);
	     // System.out.println("left "+left_sub+" ");
	      String right_sub = s.substring(i+1);
	      //System.out.println("right "+right_sub+" ");
	      String rest = left_sub+right_sub;
	      //System.out.println("rest "+rest+" ");
	      //System.out.println("ans+ch "+(ans+ch)+" ");
	      permutations(rest,ans+ch);
	    }
	  }
	    public static void main(String[] args) {
	        String s = "123";
	        String ans ="";
	        permutations(s,ans);
	    }
	}





// 15. java program to reverse an array
package com.java8;

import java.util.Arrays;

public class reverseArray {
	public static void main(String[] args) {
		// Input char array
		char[] input = { 'a', 'b', 'c', 'd' };

		// Reverse the input char array
		char[] reversed = reverseCharArray(input);

		// Print the reversed char array
		System.out.println("Reversed char array:");
		System.out.println(Arrays.toString(reversed));
	}

// Method to reverse a char array and return the reversed array
	public static char[] reverseCharArray(char[] arr) {
		char[] reversed = new char[arr.length];

		for (int i = 0; i < arr.length; i++) {
			reversed[i] = arr[arr.length - 1 - i];
		}

		return reversed;

	}
}

16. to find pairs of integers in an array that sum up to a given target sum.?

I/P: {0, 4, 5, 6, 1, 2, 3};
O/P:
0,5
1,4
2,3


public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 9;

        findPairs(arr, target);
    }

    public static void findPairs(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
}


 to find pairs of integers in an array that multiply  to a given target sum.?

package com.practice;

import java.util.HashSet;

public class PairProduct {

    public static void findPairsWithProduct(int[] arr, int targetProduct) {
        // HashSet to store the elements we have seen so far
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            // Avoid division by zero and check if targetProduct is divisible by the current element
            if (num != 0 && targetProduct % num == 0) {
                int complement = targetProduct / num;

                // If the complement is already in the set, print the pair
                if (seen.contains(complement)) {
                    System.out.println(num + ", " + complement);
                }
            }

            // Add the current element to the set
            seen.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 4, 5, 6, 1, 2, 3};
        int targetProduct = 6;  // Example target product

        findPairsWithProduct(arr, targetProduct);
    }
}



17 . Write a program that utilizes a HashMap to count the occurrences of each word

 

import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String text = "String is i am reddy sekhar";

        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCounts = new HashMap<>();

        // Iterate through each word and update its count in the HashMap
        for (String word : words) {
            // Update word count
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        // Print the word counts
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}


18 .Factorial
public class factorial {

	public static void main(String[] args) {
		
		int fact=1;
		int n=5;
		for (int i=1;i<=n;i++) {
			
		
			
			fact=fact*i;
			
				
				
			}
	System.out.println(fact);
	
		}
		
	
}

19. factors 



public class factors {

	public static void main(String[] args) {
		
		int n=10;
		for (int i=1;i<=n;i++)
	if (n%i==0)	{
		System.out.print(i+" ");
			
		}
	}
}



20 Fibonacci


public class fibonacci {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n3;
		int n4=10;
		System.out.println(n1+" "+n2);
		
		for (int i=2;i<n4;i++) {
			n3=n1+n2;
			
			System.out.print(n3+" ");
			
			n1=n2;
			n2=n3;
			
			
		}
	}
}




// String Reverse



import java.util.Arrays;

public class Example {
public static void main(String[] args) {
String s1="hello reddy sekhar";

String s2[] = s1.split(" ");
String reversedString = "";
for (int i = 0; i < s2.length; i++) 
{
  String s3 = s2[i];
  String reverseWord = "";
  for (int j = s3.length() - 1; j >= 0; j--) {
    reverseWord = reverseWord + s3.charAt(j);
  }
  reversedString = reversedString + reverseWord + " ";
}
System.out.print("Reversed string : " + reversedString);
}}

Original string : hello reddy sekhar
Reversed string :lleh ydder rahkes 

public class stringReverseCharactorsWordsConstant {
public static void main(String[] args) {
	
	String str="Hello reddy sekhar";
	String []str3=str.split(" ");
	String str2="";
	for(int i=str3.length-1;i>=0;i--) {
		String str4=str3[i];
		String str5="";
		for (int j=str4.length()-1;j>=0;j--) {
			str5=str5+str4.charAt(j);
		}
		
		str2=str2+str5+" ";
	}
	System.out.println(str2);
	
}
}

public class Reverse {

	
		  public static void main(String[] args) {
		    String str = "Hello reddy sekhar";
		    for (int i = str.length() - 1; i >= 0; i--) {
		      System.out.print(str.charAt(i));
		    }
		  }
		}
input : hello reddy sekhar
o/p: rahkes ydder olleH




// stringReverseWordByWord 

public class stringReverseWordByWord {

	public static void main(String[] args) {
		
		String s1="hello reddy sekhar";
	
		String [] s3=s1.split(" ");
		for (int i=s3.length-1;i>=0;i--){
			
			
			System.out.print(s3[i]+" ");
		}
		
		
	}
}



 21 swapping


package com.nov29;

public class swapping {

	public static void main(String[] args) {
		
		int a=10;
		int b=30;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
}

  // swappingWithThirdVaraible


public class swappingWithThirdVaraible {

	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		int temp;
	temp=a;
	a=b;
	b=temp;
	
	System.out.println(a+" "+b);
	}
}

 // 22 .Reverse an Array

package java8;

public class arrayReverse {
	public static void reverseArray(int[] arr) {
		int a = 0;
		int b = arr.length - 1;

		while (a < b) {
			// Swap elements at start and end indices
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;

			// Move pointers towards the center
			a++;
			b--;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		

		// Reverse the array
		reverseArray(arr);

		

	}
}
// Reverse an Array

package com.MultiDime;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}

// Second Highest Element from an Array

package com.MultiDime;

import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Arrays.sort(arr); // Sort the array

        // After sorting, the second highest element will be at index length - 2
        int secondHighest = arr[arr.length - 2];

        System.out.println("The second highest element is: " + secondHighest);
    }
}

// java program to move zero to first
input:0,1,0,1,1,0
Output:0,0,0,1,1,1

package com.array;

public class movingZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 0, 0, 4, 5 };
        moveZerosToStart(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    private static void moveZerosToStart(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Find the first non-zero element from the beginning
            while (start < end && arr[start] == 0) {
                start++;
            }
            // Find the first zero element from the end
            while (start < end && arr[end] != 0) {
                end--;
            }
            // Swap elements to move zero to the front
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}

// Moving Zeros to Last

package com.array;

public class movingZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 0, 0, 4, 5 };
        moveZerosToEnd(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    private static void moveZerosToEnd(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Find the first zero element from the beginning
            while (start < end && arr[start] != 0) {
                start++;
            }
            // Find the first non-zero element from the end
            while (start < end && arr[end] == 0) {
                end--;
            }
            // Swap elements to move zero to the end
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}

// Array Rotation to left In java




package com.array;

public class arrayRotationToLeft {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < 2; i++) {
			int start = a[0];
			int j;

			for (j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[j] = start;

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}

// Array Rotation to right In java


package com.practice;



public class ArrayRotationToRight {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int rotations = 2; // Number of positions to rotate to the right

        // Perform rotations
        for (int i = 0; i < rotations; i++) {
            int end = a[a.length - 1]; // Store the last element

            // Shift elements to the right
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }

            a[0] = end; // Place the last element at the beginning
        }

        // Print the rotated array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}



 // Remove All Adjacent Duplicates In String

by iterating through the string and removing adjacent duplicates directly
---------------------------------------------------


public class RemoveAdjacentDuplicates {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If the current character is equal to the next one, skip both characters
            if (i < s.length() - 1 && s.charAt(i + 1) == c) {
                i++;
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveAdjacentDuplicates solution = new RemoveAdjacentDuplicates();
        
        // Test cases
        String s1 = "aabbaacca";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.removeDuplicates(s1)); // Output should be "ca"
        
        
    }
}

using stack
---------------
package com.java8;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        RemoveAdjacentDuplicates solution = new RemoveAdjacentDuplicates();
        
        // Test cases
        String s1 = "aabbaacca";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.removeDuplicates(s1)); // Output should be "ca"
        
       
    }
}

//  Write a Java program that counts and displays the occurrences of duplicate characters in a given string. 
//  A character is considered a duplicate if it appears more than once in the string. ?

package com.duplicates;
import java.util.HashMap;
import java.util.Map;

public class duplicatesCount {
    public static void main(String[] args) {
        String str = "aabaabcd";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print duplicate characters and their counts
        System.out.println("Duplicates:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }
    }
}

// To swap words in an array based on their length in Java

public class SwappingBasedOnLength {
    public static void main(String[] args) {
        String[] str = { "Reddy", "i", "am", "sekhar" };
        String temp;

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].length() > str[j].length()) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

       
        for (String s : str) {
            System.out.println(s);
        }
    }
}


242. Valid Anagram 

public class Anagram {
	public static boolean areAnagrams(String s, String s2) {
		if (s.length() != s2.length()) {
			return false;
		}
		char[] c = s.toCharArray();
		char[] c1 = s2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		return Arrays.equals(c1, c);
	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		if (areAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}
}

//  To find triplets in the array that sum up to a given target
// Print all triplets with given sum

import java.util.Arrays;

public class TripletSum {
	public static void findTriplets(int[] arr, int targetSum) {
		Arrays.sort(arr);
		int n = arr.length;

		for (int i = 0; i < n - 2; i++) {
			int left = i + 1;
			int right = n - 1;

			while (left < right) {
				int currentSum = arr[i] + arr[left] + arr[right];

				if (currentSum == targetSum) {
					System.out.println("Triplet: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
					left++;
					right--;
				} else if (currentSum < targetSum) {
					left++;
				} else {
					right--;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 6, 7, 8, 9, 4, 5 };
		int targetSum = 9;
		findTriplets(arr, targetSum);
	}
}

// Write a Java program to count consecutive occurrences of each character in a given string
// and print each character along with its count.


package com.practice;
public class ContinuousCharacterCounter {
    public static void main(String[] args) {
        String input = "aabbbccabbdc";
        countContinuousCharacters(input);
    }

    public static void countContinuousCharacters(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty");
            return;
        }

        char[] chars = input.toCharArray();
        char currentChar = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                count++;
            } else {
                System.out.println(currentChar + "="+ count );
                currentChar = chars[i];
                count = 1;
            }
        }
        
        // Print the last character and its count
        System.out.println(currentChar + " = " + count );
    }
}

// To  Write java program to find highest number in array with single loop
========================================================================

package com.practice;


public class FindHighestNumber {
    public static void main(String[] args) {
        int[] array = { 3, 8, 1, 6, 2, 9, 4, 5 };

        // Initialize max with the first element of the array
        int max = array[0];

        // Iterate through the array to find the maximum number
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Print the highest number found
        System.out.println("Highest number in the array: " + max);
    }
}

// program to print the following ?
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********

package com.practice;

public class PyramidDemo {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

// program to print the following ?

         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * *


package com.practice;

public class PyramidDemo {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


 // program to print the following ?

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

package com.practice;

public class PatternDemo1 {
	public static void main(String[] args) {
		int n = 5, num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num + 1;
			}
			System.out.println();
		}

	}
}
//  Valid Parenthesis problem in java

package com.practice;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Push opening parentheses onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Match and pop corresponding closing parentheses
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } 
            // Return false if there's a mismatch or stack is empty when a closing parenthesis is encountered
            else {
                return false;
            }
        }

        // Ensure no unmatched opening parentheses remain in the stack
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(isValid(test1)); // true
        System.out.println(isValid(test2)); // true
        System.out.println(isValid(test3)); // false
        System.out.println(isValid(test4)); // false
        System.out.println(isValid(test5)); // true
    }
}

// finding the Longest common prefix from list of Strings
import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		String str1 = strs[0];
		String str2 = strs[strs.length - 1];
		int index = 0;
		while (index < str1.length()) {
			if (str1.charAt(index) == str2.charAt(index)) {
				index++;

			} else {
				break;
			}

		}
		return index == 0 ? "" : str1.substring(0, index);
	}
}



//  Java program to find the first and last index of a given integer in an array?

package com.july8.v10;

import java.util.Arrays;

public class FirstAndLastIndex {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 4, 5, 6 };
		int target = 4;
		System.out.println(Arrays.toString(searchRange(a, target)));
	}

	static int[] searchRange(int num[], int target) {
		int[] arr = new int[2];
		arr[0] = arr[1] = -1;
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] == target) {
				arr[0] = i;
				while (i < num.length && num[i + 1] == target) {
					i++;
					arr[1] = i;
					break;
				}

			}
		}
		return arr;
	}
}
// Missing Number from Array


package com.july8.v10;

public class MissingNumber{
	public static int missingNumber(int a[], int n) {
		int sum1 = n * (n + 1) / 2;
		int sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			sum2 = sum2 + a[i];
		}
		int missingNumber = sum1-sum2;
		return missingNumber;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 5, 2 };
		int N = 5;
		int ans = missingNumber(arr, N);
		System.out.println(ans);

	}
}
// a Java program that reverses a portion of an array based on given start and end indices ?

package com.july8.j8.v2;

public class ArrayReverseBasedIndexPosition {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 10, 5 };
		int start = 1;
		int end = a.length - 2;
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}

		for (int i = 0; i < a.length ; i++) {
			System.out.println(a[i]);
		}
	}
}

//  print a matrix in a snake pattern in Java

package com.july18;

public class SnakePattern {
	public static void printMatrixInSnakePattern(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (i % 2 == 0) {
				// Even index row: left to right
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
			} else {
				// Odd index row: right to left
				for (int j = matrix[i].length - 1; j >= 0; j--) {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println(); // Move to the next line after each row
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		printMatrixInSnakePattern(matrix);
	}
}


// Swapping the Array

public class SwapElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(array));

        // Perform swapping with two pointers
        swapArrayElements(array);

        System.out.println("Array after swapping: " + Arrays.toString(array));
    }

    public static void swapArrayElements(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap the elements at the left and right pointers
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}


// Longest Palindrome
// Common Characters 
//  Program to  find the common values between two lists using Java 8 streams ?
// Can you  write a program that counts the number of zeros in an array?
Input : {0, 2, 0, 4, 0, 6, 0}
Output: 4
```

