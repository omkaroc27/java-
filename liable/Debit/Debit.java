package liable.Debit;

import java.util.Scanner;

public class Debit {
                    public int Debit;

                    public int showDebit()

                    {
                                        Scanner s = new Scanner(System.in);
                                        System.out.println("Enter how much amount you deposit in your account ");
                                        Debit = s.nextInt();
                                        return Debit;
                    }
}
