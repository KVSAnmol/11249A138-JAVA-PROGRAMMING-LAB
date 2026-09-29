public class ArrayExample{
    public static void main(String args[]){
        int[] numbers = {10,20,30,40,50};
        System.out.println("Array Elements:");
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Element at index " + i + " = " + numbers[i]);
        }
        int sum =0;
        for (int num : numbers){
            sum += num;
        }
        System.out.println("sum of arrays elements = " + sum);

        int largest = numbers[0];
        for (int num : numbers){
            if(num > largest){
                largest = num;
            }
        }
        System.out.println("Largest element = " + largest);
    }
}
