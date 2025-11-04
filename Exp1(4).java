import java.util.Scanner;
import java.util.Random;
public class numberguessing {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rand = new Random();
int secret = rand.nextInt(100) + 1;
int guess;
System.out.println("Guess the number (1-100):");
while (true) {
System.out.print("Enter your guess: ");
guess = sc.nextInt();
if (guess == secret) {
System.out.println("Correct Guess!");
break;
} else if (guess < secret) {
System.out.println("Too Low");
} else {
System.out.println("Too High");
}
}
}
}
