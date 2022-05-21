import java.util.Scanner;

public class U10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyOnHand = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());
        int counter = 0;

        lightsabersPrice *= Math.ceil(studentsCount + 0.1 * studentsCount);
        if (studentsCount > 5){
            counter = studentsCount / 6;
        }
        beltsPrice *= (studentsCount - counter);
        robesPrice *= studentsCount;
        double totalPrice = lightsabersPrice + beltsPrice + robesPrice;

        if (totalPrice <= moneyOnHand){
            System.out.printf("The money is enough - it would cost %.2flv.",
                    totalPrice);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.",
                    totalPrice - moneyOnHand);
        }
    }
}