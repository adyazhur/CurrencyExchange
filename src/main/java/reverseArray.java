import java.util.Arrays;

public class reverseArray extends Barsik{
    public static void main (String args[]){
        int [] array = getNumberofMause();
        int [] newArray = new int [array.length];
        int arrayLength = array.length;

        for (int i=0; i<arrayLength; i++){
            int numberofArray = array[i];
            newArray[arrayLength-i-1] = numberofArray;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
