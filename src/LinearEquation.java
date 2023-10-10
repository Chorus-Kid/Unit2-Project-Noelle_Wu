import java.lang.Math;
public class LinearEquation {
    private int firstX;
    private int firstY;
    private int secondX;
    private int secondY;
    private double x3;


    public LinearEquation(int x1, int y1, int x2, int y2){
        firstX = x1;
        firstY = y1;
        secondX = x2;
        secondY = y2;
    }

    public LinearEquation(int x1, int y1, int x2, int y2, double thirdX){
        firstX = x1;
        firstY = y1;
        secondX = x2;
        secondY = y2;
        x3 = thirdX;
    }
    public double slope(){
        double slope =  (double) (secondY - firstY) / (secondX - firstX);
        return slope;
    }

    public double yIntercept(){
        double slopeySlope = slope();
        int yInEquation = firstY;
        int xInEquation = firstX;
        double almostThere = slopeySlope * xInEquation;
        double yIntercept = yInEquation - almostThere;
        return yIntercept;
    }

    public String equation()
    {
        String slopeInFormula = (secondY - firstY) + "/" + (secondX - firstX);
        double yInterceptInFormula = yIntercept();
        String equation = ("y = " + slopeInFormula + "x + " + yInterceptInFormula);
        return equation;
    }

    public double distance()
    {
        double distance = Math.sqrt(Math.pow((secondX - firstX), 2) + Math.pow((secondY - firstY), 2));
        distance = Math.round(distance * 100.0) / 100.0;
        return distance;
    }

    public String toString()
    {
        String firstPair = "First coordinate pair: (" + firstX + ", " + firstY + ")";
        String secondPair = "Second coordinate pair: (" + secondX + ", " + secondY + ")";
        String slope = "Slope: " + slope();
        String yIntercept = "Y-intercept: " + yIntercept();
        String equation = "Slope intercept form: " + equation();
        String distance = "Distance between the points: " + distance();
        String everything = firstPair + "\n" + secondPair + "\n" + slope + "\n" + yIntercept + "\n" + equation + "\n" + distance + "\n";
        return everything;
    }

    public String secretCoordinate()
    {
        double slope = slope();
        double yIntercept = yIntercept();
        double y3 = (slope * x3) + yIntercept;
        String secretCoordinate = "(" + x3 + ", " + y3 + ")";
        return secretCoordinate;
    }

}
