public class ArrayBasics {
    public static void main(String[] args) {
        
        int[] array = {10, 25, 7, 42, 18, 5, 30};

        System.out.println("Printing all the elements:");
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("First Element : " + array[0]);
        System.out.println("Last Element : " + array[array.length-1]);

        //Sum
        int sum = 0;
        for(int num : array) {
            sum+=num;
        }

        System.out.println("Sum -> " + sum);

        //Greatest Element
        System.out.println("Max Element:");

        int max = array[0];
        for(int j=0; j<array.length; j++) {
            if(array[j] > max) {
                max = array[j];
            }
        }

        System.out.println(max);

        // Smallest Element
        System.out.println("Min Element:");

        int min = array[0];
        for(int k=0; k<array.length; k++) {
            if(array[k] < min) {
                min = array[k];
            }
        }

        System.out.println(min);

        //Average
        System.out.println("Average:");

        int average = sum/array.length;

        System.out.println(average);

        //Second Largest

        System.out.println("Second Largest element:");

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int z=0; z<array.length; z++) {
            if(array[z] > largest) {
                secondLargest = largest;
                largest = array[z];
            }else if(array[z] > secondLargest && array[z] != largest) {
                secondLargest = array[z];
            }
        }

        System.out.println("Largest Element : " + largest);
        System.out.println("Second Largest Element : " + secondLargest);
    }
}