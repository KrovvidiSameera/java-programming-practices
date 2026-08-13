import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter a number to check primepalindrome or not: ");
        int n = ac.nextInt();
        int rev = 0, temp = n, count = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (rev == n && count == 2)
            System.out.println(n + " is a Prime Palindrome");
        else
            System.out.println(n + " is not a Prime Palindrome");
    }
}
