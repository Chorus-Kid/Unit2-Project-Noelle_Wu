import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("So!!! We just got a new update and we can now do all sorts of stuff with coordinates!");
        System.out.print("To start, first type in a coordinate point (don't type any spaces or decimals): ");
        String comma = ",";
        String firstCoordinate = s.nextLine();
        String X = firstCoordinate.substring(1, (firstCoordinate.indexOf(comma)));
        int firstX = Integer.parseInt(X);
        String Y = firstCoordinate.substring((firstCoordinate.indexOf(comma)) + 1, (firstCoordinate.length() - 1));
        int firstY = Integer.parseInt(Y);
        System.out.print("Ok, now give me another coordinate point (again, no spaces or decimals): ");
        String secondCoordinate = s.nextLine();
        String X2 = secondCoordinate.substring(1, (secondCoordinate.indexOf(comma)));
        int secondX = Integer.parseInt(X2);
        String Y2 = secondCoordinate.substring((secondCoordinate.indexOf(comma)) + 1, (secondCoordinate.length() - 1));
        int secondY = Integer.parseInt(Y2);
        LinearEquation quation = new LinearEquation(firstX, firstY, secondX, secondY);
        quation.toString();
        System.out.println("Ohoho? What is this?");
        System.out.println("A secret function????");
        System.out.println("(Type in a third x-value, could be a decimal this time): ");
        String thirdXValue = s.nextLine();
        int x3 = Integer.parseInt(thirdXValue);
        quation.secretCoordinate();
    }
}
