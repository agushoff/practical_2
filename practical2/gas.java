import java.util.Scanner;
import java.lang.Math;
public class gas{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("kilometerday");
        double milesday = scanner.nextInt();
        System.out.println("litercost");
        double galloncost = scanner.nextInt();
        System.out.println("kilometerperliter");
        double milespergallon = scanner.nextInt();
        System.out.println("tolls");
        double tolls = scanner.nextInt();
        System.out.println("parking");
        double parking = scanner.nextInt();

        double result = 0;
        double gallonpermile =  Math.pow(milespergallon, -1);

        result = tolls + parking + gallonpermile * milesday * galloncost;
        
        
        System.out.println(result);

    }


}