import java.util.List;
import java.util.ArrayList;

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

        String word1 = "beach";
        String word2 = "applesauce ALLIGATOR";

        printUpperVowelsReverseOrder(word1);
        printUpperVowelsReverseOrder(word2);

        // Question 7:

        int[] multiples = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        printValuesAtMultipleIndices(multiples, 3);

        // Question 8:

        printDataEveryOther(str);

        // Question 9:

        FileItem aFile = new FileItem("AAA", 11);
        FileItem bFile = new FileItem("BBB", 12);
        FileItem cFile = new FileItem("CCC", 13);
        FileItem dFile = new FileItem("DDD", 14);
        FileItem eFile = new FileItem("EEE", 15);
        FileItem fFile = new FileItem("FFF", 16);
        FileItem gFile = new FileItem("GGG", 17);
        FileItem hFile = new FileItem("HHH", 18);
        FileItem iFile = new FileItem("III", 19);
        FileItem jFile = new FileItem("JJJ", 20);
        FileItem kFile = new FileItem("KKK", 21);
        FileItem lFile = new FileItem("LLL", 22);
        FileItem mFile = new FileItem("MMM", 23);
        FileItem nFile = new FileItem("NNN", 24);
        FileItem oFile = new FileItem("OOO", 25);
        FileItem pFile = new FileItem("PPP", 26);

        Folder folder1 = new Folder("Folder1",100);
        Folder folder2 = new Folder("Folder2",150);
        Folder folder3 = new Folder("Folder3",175);
        Folder folder4 = new Folder("Folder4",200);
        Folder folder5 = new Folder("Folder5",50);
        Folder folder6 = new Folder("Folder6",300);
        Folder folder7 = new Folder("Folder7",200);
        Folder folder8 = new Folder("Folder8",100);
        Folder folder9 = new Folder("Folder9",75);

        folder1.addFolder(folder2);
        folder1.addFolder(folder3);
        folder1.addFolder(folder4);
        folder2.addFolder(folder5);
        folder2.addFolder(folder6);
        folder3.addFolder(folder7);
        folder3.addFolder(folder8);
        folder7.addFolder(folder9);

        folder1.addFile(aFile);
        folder1.addFile(bFile);
        folder2.addFile(cFile);
        folder2.addFile(dFile);
        folder3.addFile(eFile);
        folder4.addFile(fFile);
        folder5.addFile(gFile);
        folder5.addFile(hFile);
        folder6.addFile(iFile);
        folder6.addFile(jFile);
        folder7.addFile(kFile);
        folder7.addFile(lFile);
        folder7.addFile(mFile);
        folder9.addFile(nFile);
        folder9.addFile(oFile);
        folder9.addFile(pFile);

        printFolderContents(folder1);
        System.out.println(getFolderSize(folder1));

        Folder[] folders = {folder1,folder2,folder3,folder4,folder5,folder6,folder7,folder8,folder9};
        for(Folder folder : folders) {
            System.out.println(folder.getName() + " maxSize " + folder.getMaxSize() + " currentSize " + folder.getSizeOfFiles());
        }

        FileItem newFile = new FileItem("newbie",77);
        System.out.println("Result: " + folder1.isSpaceInFolderOrSubfolders(newFile));
        newFile = new FileItem("newbie",78);
        System.out.println("Result: " + folder1.isSpaceInFolderOrSubfolders(newFile));
        newFile = new FileItem("newbie",200);
        System.out.println("Result: " + folder1.isSpaceInFolderOrSubfolders(newFile));
        newFile = new FileItem("newbie",400);
        System.out.println("Result: " + folder1.isSpaceInFolderOrSubfolders(newFile));

        // Question 10

        System.out.println(countStepWays(1));
        System.out.println(countStepWays(2));
        System.out.println(countStepWays(3));
        System.out.println(countStepWays(5));
        System.out.println(countStepWays(10));

        // Question 11

        String text = "ABCD";
        List<String> permutationList = generatePermutationList(text);
//		Collections.sort(permutationList); // for display purposes only
        System.out.println(permutationList);
        System.out.println("Number of Permutations = " + permutationList.size());

        // Question 12

        /*
        Trace the execution of the following method (written in pseudocode) by listing what is printed when the
        method is invoked with the specified parameters. (Note that pseudocode is provided because the idea is that
        you will trace this by hand!)

        array = [4, 9, 0, 3, 1, 2, 7, 6]

        a=2

        b=7

        public void recMethodA(int[] array, int a, int b) {
           if(a <= b) {
              print the array
              recMethodA(array, a+1, b)
              if the value in the array at a is even
                  make it negative
              print the array
           }
        }

        a = 2; b = 7        4, 9, 0, 3, 1, 2, 7, 6
        a = 3; b = 7        4, 9, 0, 3, 1, 2, 7, 6
        a = 4; b = 7        4, 9, 0, 3, 1, 2, 7, 6
        a = 5; b = 7        4, 9, 0, 3, 1, 2, 7, 6
        a = 6; b = 7        4, 9, 0, 3, 1, 2, 7, 6
        a = 7; b = 7        4, 9, 0, 3, 1, 2, 7, 6
        a = 7; b = 7        4, 9, 0, 3, 1, 2, 7, -6
        a = 6; b = 7        4, 9, 0, 3, 1, 2, 7, -6
        a = 5; b = 7        4, 9, 0, 3, 1, -2, 7, -6
        a = 4; b = 7        4, 9, 0, 3, 1, -2, 7, -6
        a = 3; b = 7        4, 9, 0, 3, 1, -2, 7, -6
        a = 2; b = 7        4, 9, 0, 3, 1, -2, 7, -6
         */

        // Question 13:

        /*
        What is printed when the method is invoked with the specified parameters?

        Explain in your own words what the method does. Do not describe the code- instead, write a one-line
        explanation as if someone asked you, "hey, what does this method do?" To answer, describe the result
        that the method generates.

        array = [4, 9, 0, 3, 6, 2, 12, 6]

        a=3

        public int recMethodB(int[] array, int a) {
           return recMethodHelper(array, a, 0);
        }

        public int recMethodHelper(int[] array, int a, int b) {
           if(b < array.length) {
              if(array[b] % a ==0) {
                 return 1 + recMethodHelper(array, a, b+1);
              } else {
                 return 0 + recMethodHelper(array, a, b+1);
              }
           }
           return 0;
        }

        6 => number of values in array that are divisible by a
         */

        // Question 14

        /*
        a = 2, b = 5

        then a = 3, b = 7

        then a = 5, b = 4

        public int recMethodC(int a, int b) {
           if(b > a) {
              return b + recMethodC(a, b-1);
           } else {
              return a;
           }
        }

        14
        25
        5 => sums all the numbers from a to b if in increasing order
         */

        // Question 15

        /*
        What is the result of invoking the method below with x=3, y=6?

        public int recMethod3(int x, int y) {
           if(x>0) {
              return y + recMethod3(x-1, y);
           } else {
              return 1;
           }
        }

        19 => calculates (y * x) + 1
         */

        // Question 16

        /*
        6 -> 2 -> 3 -> 1 -> 7 -> 12

        public void recMethod(Node node) {
           print the chain of nodes
           if(node!=null) {
              recMethod(node.next);
              if the value of node is even
                  make it negative
              print the chain of nodes
           }
        }

        6 -> 2 -> 3 -> 1 -> 7 -> 12
        2 -> 3 -> 1 -> 7 -> 12
        3 -> 1 -> 7 -> 12
        1 -> 7 -> 12
        7 -> 12
        12
        null
        -12
        7 -> -12
        1 -> 7 -> -12
        3 -> 1 -> 7 -> -12
        -2 -> 3 -> 1 -> 7 -> -12
        -6 -> -2 -> 3 -> 1 -> 7 -> -12
         */

        // Question 17

        /*
        Tail recursion is similar to the method where the vowels are printed backwards to its index in an array,
        where the recursive case is the last thing in the method. It seems as if recursion is not often the most
        optimal in terms of efficiencies, although tail recursion seems to avoid stack overflow. In Java, this seems
        to be bypassed by concepts such as annotation processing.
         */
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
        if ((index == 0) || (index % indexMultiple == 0)) {
            System.out.print(nums[index] + " ");
        }

        if (index < nums.length - 1) {
            printValuesAtMultipleIndices(nums, index + 1, indexMultiple);
        }
    }


    public static void printDataEveryOther(Node<Integer> firstNode) {
        if (firstNode != null) {
            System.out.println(firstNode.getData());
            printDataEveryOther(firstNode.getNextNode().getNextNode());
        }
    }


    // Helper methods to get total size of folders and subfolders
    public static int getFolderSize(Folder topFolder) {
        int size = topFolder.getSizeOfFiles(); // small part we can solve now
        List<Folder> subfolderList = topFolder.getFolders();
        for(Folder subfolder : subfolderList) {
            size = size + getFolderSize(subfolder); // recursive call
            // combining the small part of the solution with the recursive "rest of the solution"
            // AND putting it in a local variable
        }
        // implicit base case- when a folder has no more subfolders the recursion will stop
        return size;
    }

    // Helper methods to display folders
    public static void printFolderContents(Folder topFolder) {
        printFolderContentsHelper(topFolder, 0);
    }

    private static void printFolderContentsHelper(Folder topFolder, int indentationIndex) {
        for(int i = 0; i < indentationIndex; i++) {
            System.out.print("   ");
        }

        System.out.print(topFolder);
        System.out.println("  Files: " + topFolder.getFiles()); // small part solving now- print the files in the current folder
        List<Folder> subfolderList = topFolder.getFolders();
        for(Folder subfolder : subfolderList) {
            printFolderContentsHelper(subfolder, indentationIndex+1); // recursive call
        }
        // implicit base case- happens when a folder has no more subfolders- the recursion will end
    }


    public static int countStepWays(int steps) {
        if (steps <= 1) {
            return 1;
        } else if (steps == 2) {
            return 2;
        } else if (steps == 3) {
            return 4;       // 3-hop; 1-hop + 2-hop; 2-hop + 1-hop; 1-hop + 1-hop + 1-hop
        } else {
            // for climbing n steps, you can either start with a 1-hop, a 2-hop, or a 3-hop,
            // so there are three possible cases (which corresponds to our three base cases)
            //
            // if you start with a 1-hop, there are n-1 steps left to go and you know that
            // the answer to how many steps that takes is countStepWays(n-1)
            //
            // similarly, if you start with a 2-hop, there are n-2 steps left to go and you
            // know that the answer to how many steps that takes is countStepWays(n-2)
            //
            // same for if you start with a 3-hop
            //
            // so these are the three possibilities- add them up and that makes all choices!
            return countStepWays(steps - 1) + countStepWays(steps - 2) + countStepWays(steps - 3);
        }
    }


    public static List<String> generatePermutationList(String text) {
        List<String> permutationList = new ArrayList<String>();
        generatePermutationList("", text, permutationList);
        return permutationList;
    }

    // Helper method
    private static void generatePermutationList(String startingPermutation, String restOfString, List<String> list) {
        if(restOfString.length()==1) { // base case
            list.add(startingPermutation + restOfString);
        } else { // recursive case
            // rare RARE instance when we have recursion inside of a loop
            for(int i = 0; i < restOfString.length(); i++) {
                String startingCharacter = restOfString.charAt(i) + "";
                String newStartingPermutation = startingPermutation + startingCharacter;
                String newRestOfString = restOfString.substring(0, i) + restOfString.substring(i + 1);
                generatePermutationList(newStartingPermutation, newRestOfString, list);
            }

        }
    }
}
