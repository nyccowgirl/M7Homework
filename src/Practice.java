import java.util.regex.Matcher;

public class Practice {

    public static void main(String[] args) {
        // Question 1:

        System.out.println(calculateExponent(2, 4));

        // Question 2:
        int[] nums = {5, 3, 4, 1, 6, -2};

        System.out.println(findMin(nums));

        // Question 3:
        Node str = new Node("Hello",
                new Node("World!",
                        new Node("You",
                                new Node("Are",
                                        new Node("A",
                                                new Node("Doll!"))))));

        System.out.println(concatenateStrings(str, "ll"));

        // Question 4:

        System.out.println(calculateGCD(49, 28));

        // Question 5:

        System.out.println(populationSize(10, 0.5, 5));
        System.out.println(populationSize(2, 1.0, 4));

        // Question 6:

        String word = "beach";

        printUpperVowelsReverseOrder(word);

        // Question 7:
        int[] multiples = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        printValuesAtMultipleIndices(multiples, 3);

    }


    public static int calculateExponent(int base, int power) {
        if (power == 0) {
            return 1;
        } else {
            return base * calculateExponent(base, power - 1);
        }
    }


    public static int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }

    // Helper method
    public static int findMin(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        } else if ((start + 1) == end) {
            return Math.min(nums[start], nums[end]);
        } else {
            int mid = start + ((end - start) / 2);
            return Math.min(findMin(nums, start, mid),
                    findMin(nums, mid + 1, end));
        }
    }


    public static String concatenateStrings(Node<String> firstNode, String target) {
        if (firstNode == null) {
            return "";
        } else {
            if (firstNode.getData().contains(target)) {
                return firstNode.getData() + concatenateStrings(firstNode.getNextNode(), target);
            } else {
                return concatenateStrings(firstNode.getNextNode(), target);
            }
        }
    }


    public static int calculateGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        } else {
            return calculateGCD(num2, num1 - num2);
        }
    }


    public static int populationSize(int startingPopulation, double increaseRate, int numberOfDays) {
        if (numberOfDays == 0) {
            return startingPopulation;
        } else {
            return populationSize((int) (startingPopulation * (1 + increaseRate)), increaseRate, numberOfDays - 1);
        }
    }


    public static void printUpperVowelsReverseOrder(String text) {
        printUpperVowelsReverseOrder(text, 0);
        System.out.println();
    }

    // Helper method
    public static void printUpperVowelsReverseOrder(String text, int index) {
        if (index < text.length() - 1) {
            printUpperVowelsReverseOrder(text, index + 1);
        }

        char letter = Character.toUpperCase(text.charAt(index));

        if (Character.toString(letter).matches("[AEIOU]")) {
            System.out.print(index);
            System.out.print(letter + " ");
        }
    }


    public static void printValuesAtMultipleIndices(int[] nums, int indexMultiple) {
        printValuesAtMultipleIndices(nums, 0, indexMultiple);
        System.out.println();
    }

    // Helper method
    public static void printValuesAtMultipleIndices(int[] nums, int index, int indexMultiple) {
        if (index == 0) {
            System.out.print(nums[index] + " ");
        } else if (index % indexMultiple == 0) {
            System.out.print(nums[index] + " ");
        }

        if (index < nums.length - 1) {
            printValuesAtMultipleIndices(nums, index + 1, indexMultiple);
        }
    }
}
