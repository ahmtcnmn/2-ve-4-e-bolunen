import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int a, toplm = 0;
        while (true) {
            out.print("Lüften toplamak istediğiniz çift sayıyı giriniz. :");
            a = input.nextInt();
            if (((a % 2) == 0) && (((a % 4) % 4) == 0)) {
                    toplm += a;
                    out.println("2 ve 4'e tam bölünen sayıların toplamı. : "+toplm);
            }
            if (a % 2 == 1) break;
        }
    }
}