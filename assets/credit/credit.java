package assets.credit;

import java.util.Scanner;

public class credit {
                    public int credit;

                    public int showCredit() {
                                        Scanner s = new Scanner(System.in);
                                        System.out.println("Enter how much you want to withdrow from your account ");
                                        credit = s.nextInt();
                                        return credit;
                    }
}
