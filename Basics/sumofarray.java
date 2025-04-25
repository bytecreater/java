public class sumofarray {

    public static void printsum(){
        int sum = 0;
        int[] array = {10,20,30,40};
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }

    public static void printaverage() {
        int sum = 0;
        int[] array = {10,20,30,40};
        for (int i = 0; i < array.length; i ++){
            sum =sum + array[i];
        }
        int avg = 0;
        int frequency = array.length;
        avg = sum / frequency;
        System.out.println("Average of arry : " + avg);
    }
    public static void main(String[] args) {
        printsum();
        printaverage();

    }    
}
