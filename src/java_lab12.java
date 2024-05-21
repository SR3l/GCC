public class java_lab12 {
    public static void main(String[] args) {
        
        int age[] = {26, 64, 31, 64, 69, 48, 65, 70, 35, 42, 48,
                38, 20, 56, 38, 66, 25, 29, 69, 51, 46, 43, 40, 46,
                55};
        int weight[] = {177, 145, 135, 104, 132, 138, 205,
                166, 135, 158, 136, 128, 120, 217, 133, 110, 173,
                144, 214, 192, 126, 196, 145, 215, 176};


        int averageAge = averageAge(age);
        int averageForties = averageWeightInForties(age, weight);
        double highestWeight = highestWeight(weight);

        System.out.println("The Average age: " + averageAge);
        System.out.println("The average weight of those people in their forties: " + averageForties);
        System.out.println("The highest weight: " + highestWeight);
    }
    public static int averageAge(int[] age) {
        int sumAge = 0;
        for (int i = 0; i < age.length; i++) {
            sumAge += age[i];
        }
        return sumAge / age.length;
    }

    public static int averageWeightInForties(int[] age, int[] weight) {
        int sumWeights = 0;
        int count = 0;
        for (int i = 0; i < age.length; i++) {
            if (age[i] >= 40 && age[i] < 50) {
                sumWeights += weight[i];
                count++;
            }
        }
        return count > 0 ?  sumWeights / count : 0;
    }

    public static int highestWeight(int[] weight) {
        int maxWeight = weight[0];

        for (int i = 1; i < weight.length; i++) {
            if (weight[i] > maxWeight) {
                maxWeight = weight[i];
            }
        }
        return maxWeight;
    }
}