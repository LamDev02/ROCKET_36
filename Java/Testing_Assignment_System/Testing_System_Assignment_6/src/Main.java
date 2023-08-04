public class Main {
    public static void main(String[] args) {
        System.out.println("--------------Exercise 1 and 2--------------");
        try{
            float result = divide(7, 0);
            System.out.println(result);
        } catch (ArithmeticException ae){
            System.out.println("cannot divide by 0"+ae);
        } finally {
            System.out.println("divided complete");
        }
        System.out.println("--------------Exercise 3--------------");
        int[] numbers = {1,2,3};
        try{
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException abe){
            System.out.println("Error cannot execute Array Index Out Of Bounds");
        }
    }

    public static float divide(int a, int b){
        return a/b;
    }

}