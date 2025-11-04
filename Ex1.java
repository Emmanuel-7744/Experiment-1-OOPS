import java.util.Scanner; public class exercise {
public static void main(String[] args) { int ticket = 200;
Scanner s = new Scanner(System.in); System.out.print("Enter the age:"); int age = s.nextInt();
System.out.print("Enter the Day of Booking:"); int day = s.nextInt();
if (age<5) {
System.out.print("The Ticket is Free");
}
else if (5<=age && age<=18) {
System.out.println("You are eligible for 40% discount"); double discount = ticket - (0.4 * ticket); System.out.println("The Ticket Price:"+discount);
}
else if (19<=age && age<=60) {
System.out.print("The Ticket Price:" +ticket);
}
else if (age>60) {
System.out.println("You are eligible for 30% discount"); double discount = ticket - (0.3 * ticket); System.out.println("The Ticket Price:"+discount);
}
if (day == 6|| day == 7){
}
else {
System.out.println("The People who book ticket from Monday to Friday have 10% discount");
double discount = ticket - (0.1 * ticket); System.out.print("The Ticket Price:"+discount);
}
}
}

