class Stats<T extends Number>{

    T[] nums;

     public Stats(T[] nums){
        this.nums = nums;
     }

     double average(){
        double sum = 0;
        for(T num : nums){
            sum += num.doubleValue();
        }

        return sum / nums.length;
    }
}

class BoundedGeneric{
    public static void main(String[] args) {
        Integer[] intNums = {10, 20, 30, 40, 50};
        Stats<Integer> intStats = new Stats<>(intNums);

        Double[] doubleNums = {10.0, 20.0, 30.0, 40.0, 50.0};
        Stats<Double> doubleStats = new Stats<>(doubleNums);

        System.out.println("Integer Stats average : " + intStats.average());
        System.out.println("Double Stats average : " + doubleStats.average());


    }
}