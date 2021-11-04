import java.util.Arrays;
public class Main {
    //create method to remove last element of array list
    private static String[] removeMonth(String[] months) {
        System.out.print("\n");
        //make new array length shorter
        String [] shortArray = new String[months.length-1];
        //insert old elements of array into new length array
        for (int i = 0; i < months.length-1; i++){
            shortArray[i] = months[i];
        }
        return shortArray;
    }
    //create method to insert element into array list
    private static String[] insertMonth(String [] months, String x, int pos) {
        //new array size
        String [] newArray = new String[months.length+1];
        for (int i = 0; i < months.length+1; i++) {
            //insert elements from array "below" the insert position
            if (i < pos - 1)
                newArray[i] = months[i];
            //insert "Hello" into chosen position
            else if (i == pos - 1)
                newArray[i] = x;
            //fill in rest of array from original array list
            else
                newArray[i] = months[i-1];
        }
        return newArray;
    }
    //create method to add element to end of array list
    private static String[] addMonth(String[] months, String push){
        //make new array length longer
        String[] longer = new String[months.length + 1];
        for (int i = 0; i < months.length; i++) {
            //insert old elements of array into longer array
            longer[i] = months[i];
            longer[months.length] = push;
        }
        return longer;
    }

    public static void main(String[] args) {
        //original array list
        String[] months = {"January ", "February ", "March ", "April ", "May "};
            for (int i = 0; i < months.length; i++) {
                System.out.print(months[i]);
            }
            System.out.print("\n");

        //calling addMonth method and adding 'June' to end of list
        String push = "June";
        months = addMonth(months,push);
            System.out.print(Arrays.toString(months));

        //calling removeMonth method and removing 'June' from list
        months = removeMonth(months);
        System.out.println(Arrays.toString(months));

        //calling insertMonth method and adding 'Hello' into index 3
        int pos = 3;
        String x = "Hello ";
        months = insertMonth(months, x, pos);
        System.out.println(Arrays.toString(months));
    }
}



