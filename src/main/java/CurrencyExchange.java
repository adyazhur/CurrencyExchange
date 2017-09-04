import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

public class CurrencyExchange {
    public static void main(String[] args) {
        String usd;
        String args0 = args [0];
        double result;
        String scannerLine;

        while (true) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Entered please how much USD you would like to convert: ");
            usd = scanner.nextLine();
            usd = usd.replace(',','.');
            Scanner check = new Scanner(usd).useLocale(Locale.US);


            if (usd.equalsIgnoreCase("quit")) {
                System.out.println("Program was closed");
                System.exit(0);
            }
            else if (check.hasNextDouble()) {
                try {
                double USD = Double.parseDouble(usd);
                double course = Double.parseDouble(args0);
                result = USD * course;
                USD = new BigDecimal(result).setScale(2, RoundingMode.DOWN).doubleValue();
                System.out.println("You have " + USD + "UAH");
                break;
                    } catch (Exception e) {
                    System.out.println("Entered value is not valid");
                }
            }
            else {
                System.out.println("Entered value is not valid");
            }
        }

    }
}