import java.util.*;
public class ProcessAName5026211168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please,Type your Full name; ");
	String input = sc.nextLine();
	int index = input.indexOf(' ');
	String nama1 = input.substring(index + 1);
	String nama2 = input.substring(0,1);
	
	System.out.println("Your name is: "+nama1+", "+nama2+".");
    }
                
}
