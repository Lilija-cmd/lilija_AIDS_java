1)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Sentence:");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
                i++;
            }
        }

        System.out.println(sb);
    }
}
2)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Word:");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        if(sb.length() >= 3) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        } else {
            System.out.println("Enter at least 3 characters");
        }
    }
}

3)
import java.util.Scanner;

class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) == -1) {
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
4)
import java.util.Scanner;

class SerialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter student name:");
            String name = sc.nextLine();

            sb.append(i).append(". ").append(name).append("\n");
        }

        System.out.println(sb);
    }
}
5)
import java.util.Scanner;

class RemoveSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
6)
import java.util.Scanner;

class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.setCharAt(i, '-');
            }
        }

        System.out.println(sb);
    }
}
7)
import java.util.Scanner;

class FirstLastUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        if (sb.length() > 0) {
            sb.setCharAt(0,
                Character.toUpperCase(sb.charAt(0)));

            sb.setCharAt(sb.length() - 1,
                Character.toUpperCase(sb.charAt(sb.length() - 1)));
        }

        System.out.println(sb);
    }
}
8)
import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
9)
import java.util.Scanner;

class MoveDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                letters.append(ch);
            }
        }

        letters.append(digits);

        System.out.println(letters);
    }
}
10)
import java.util.Scanner;

class InsertStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));

            if (i < str.length() - 1) {
                sb.append("*");
            }
        }

        System.out.println(sb);
    }
}
11)
import java.util.Scanner;

class RemoveEvenPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
12)
import java.util.Scanner;

class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);

            if (i > 0) {
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}
13)
import java.util.Scanner;

class RemoveWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        System.out.println("Enter word to remove:");
        String word = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        int index = sb.indexOf(word);

        while (index != -1) {
            sb.delete(index, index + word.length());
            index = sb.indexOf(word);
        }

        System.out.println(sb);
    }
}
14)
import java.util.Scanner;

class Abbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full name:");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            sb.append(Character.toUpperCase(words[i].charAt(0)));
        }

        System.out.println(sb);
    }
}
15)
import java.util.Scanner;

class PrefixSuffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word:");
        String word = sc.nextLine();

        System.out.println("Enter prefix:");
        String prefix = sc.nextLine();

        System.out.println("Enter suffix:");
        String suffix = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        sb.append(prefix);
        sb.append(word);
        sb.append(suffix);

        System.out.println(sb);
    }
}
16)
import java.util.Scanner;

class AlternateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        StringBuffer sb = new StringBuffer();

        int max = Math.max(str1.length(), str2.length());

        for (int i = 0; i < max; i++) {
            if (i < str1.length()) {
                sb.append(str1.charAt(i));
            }

            if (i < str2.length()) {
                sb.append(str2.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
17)
import java.util.Scanner;

class MaskPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter phone number:");
        String phone = sc.nextLine();

        StringBuffer sb = new StringBuffer(phone);

        for (int i = 0; i < sb.length() - 4; i++) {
            if (Character.isDigit(sb.charAt(i))) {
                sb.setCharAt(i, 'X');
            }
        }

        System.out.println(sb);
    }
}