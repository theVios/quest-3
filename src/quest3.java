public class quest3 {
    public static void main(String[]args) {
        int[] arr = new int[10];
        System.out.println("massiv- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() *10);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("koll raznix chisel- " + diffCounter(arr));}

    static int diffCounter(int[] arr) {
        int count = 0;
        int diffCount = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            for (int j =i+1 ; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    diffCount++;
                    break;
                }
            }
        }
        return res=(diffCount-count);
    }
}
