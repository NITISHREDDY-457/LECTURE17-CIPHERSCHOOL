import java.util.Scanner;
public class scanner_class {
    public static void main(String[] args)
	 {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name: ");

        String first_name=sc.next();		// will take input untill the next whitespace
        String last_name=sc.next();

        System.out.println("Enter your profession: ");

        String prof=sc.next();
        sc.nextLine();
        System.out.println("Enter your Address: ");
        String addr=sc.nextLine();

        System.out.println("Name : "+first_name+""+ last_name);
        System.out.println("Profession : "+prof);
        System.out.println("Address : "+addr);
    }
}