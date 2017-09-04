import java.util.Arrays;

public class Barsik {

    private static int[] numberofMause = {1, 10, 2, 8, 6, 7, 4, 6, 3, 6, 2, 3};

    public static void main(String[] args) {

        int maxValue = 0;
        int value=0;
        maxValue = numberofMause[0];

        for (int i=1; i<numberofMause.length; i++){
            value = numberofMause[i];
            if (value>maxValue){
                maxValue = value;
            }
        }
        System.out.println(maxValue);

    }

    public static int[] getNumberofMause() {
        return numberofMause;
    }

    public static void setNumberofMause(int[] numberofMause) {
        Barsik.numberofMause = numberofMause;
    }
}