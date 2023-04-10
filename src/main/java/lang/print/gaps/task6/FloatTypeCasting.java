package lang.print.gaps.task6;

public class FloatTypeCasting {
    public static void main(String[] args) {
        float number = 19.4F;
        roundNumber(number);
        float top = 19.5F;
        roundNumber(top);
    }
    public static void roundNumber(float numberToBeRounded) {
        int result;
        if (numberToBeRounded < 19.49) {
            result = (int) numberToBeRounded;}
            else {
            result = (int) numberToBeRounded;
            result = ++ result;
        }
        System.out.println(result);
    }
}
