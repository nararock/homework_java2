import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(task3.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double num1 = Double.parseDouble(iScanner.nextLine());
        System.out.printf("Введите второе число: ");
        double num2 = Double.parseDouble(iScanner.nextLine());
        System.out.printf("Введите операцию: ");
        String sign = iScanner.nextLine();
        switch (sign) {
            case "+":
                System.out.printf("Ответ: %f", num1 + num2);
                System.out.println(" ");
                logger.info("Выполнено сложение.");
                break;
            case "-":
                System.out.printf("Ответ: %f", num1 - num2);
                System.out.println(" ");
                logger.info("Выполнено вычитание.");
                break;
            case "/":
                System.out.printf("Ответ: %f", num1 / num2);
                System.out.println(" ");
                logger.info("Выполнено деление.");
                break;
            case "*":
                System.out.printf("Ответ: %f", num1 * num2);
                System.out.println(" ");
                logger.info("Выполнено умножение.");
                break;
            default:
                System.out.println("Такой операции нет");
                System.out.println(" ");
                logger.warning("Введен неправильный символ.");
                break;
        }
    }
}
