package com.louay.projects.problem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("please input number of birds: ");
        int length = input.nextInt();

        Integer [] arr = fillArray(length, input);

        int [] numberOfDuplicate = fillDuplicateArray(arr);

        int mostCommonBird = calculateDuplicate(numberOfDuplicate);

        System.out.println("most common bird: "+mostCommonBird);
    }

    public static int calculateDuplicate(int [] numberOfDuplicate){
        Integer max = Integer.MIN_VALUE;
        Integer temp = 0;
        int index = 0;
        for (int i = 0; i <numberOfDuplicate.length ; i++) {
            temp = numberOfDuplicate[i];
            if (temp > max){
                max = temp;
                index = (i+1);
            }else if (temp == max){
                max = temp;
            }
        }
        return index;
    }

    public static int [] fillDuplicateArray(Integer [] arr){
        int [] numberOfDuplicate = new int[5];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                numberOfDuplicate[0]++;
            }else if (arr[i] == 2){
                numberOfDuplicate[1]++;
            }else if (arr[i] == 3){
                numberOfDuplicate[2]++;
            }else if (arr[i] == 4){
                numberOfDuplicate[3]++;
            }else if (arr[i] == 5){
                numberOfDuplicate[4]++;
            }
        }
        return numberOfDuplicate;
    }

    public static Integer[] fillArray(int length, Scanner input){
        Integer [] arr = new Integer[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("input %d number of bird: ",(i+1));
            arr[i] = inputElement(input);
        }
        return arr;
    }

    public static int inputElement(Scanner input){
        int n = input.nextInt();
        int allowN = 0;
        if (n == 1 || n == 2 || n == 3 || n == 4 || n == 5){
            allowN = n;
        }else {
            System.out.println("you must input  1 or 2 or 3 or 4 or 5 :");
            allowN = inputElement(input);
        }
        return allowN;
    }

}
