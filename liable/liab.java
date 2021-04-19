package liable;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class liab {
                    public static String Account_no;
                    public static String Name;

                    public void input() {
                                        System.out.println("person who enter the below info for the balence variation in the acccount ");
                                        Scanner s = new Scanner(System.in);
                                        System.out.println("Enter your Name & Account no");
                                        Name = s.nextLine();
                                        Account_no = s.nextLine();
                    }

                    public void show() {
                                        System.out.println("Welcome" + Name + "Your account Number is " + Account_no);
                    }
}
