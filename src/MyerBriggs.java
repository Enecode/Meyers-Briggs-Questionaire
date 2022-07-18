import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MyerBriggs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer;
        int aCount = 0;
        int bCount = 0;
        int aCount1 = 0;
        int bCount1 = 0;
        int aCount2 = 0;
        int bCount2 = 0;
        int aCount3 = 0;
        int bCount3 = 0;

        String[][] listOfAnswers = new String[7][8];

        System.out.printf("%s%n", "Select A or B: \n 1. A. Expend energy \t B. Explore energy");
        answer = input.nextLine();
        if (!(answer.equalsIgnoreCase("A") && answer.equalsIgnoreCase("A"))){
            System.out.println("Wrong input. Enter A or B");
        }

        switch (answer) {
            case "A", "a":
                listOfAnswers[0][0] = "A";
                aCount++;
                break;
            case "B", "b":
                listOfAnswers[0][1] = "B";
                bCount++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Interpret literally \t B. Look for meaning and possibility");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[0][2] = "A";
                aCount1++;
                break;
            case "B", "b":
                listOfAnswers[0][3] = "B";
                bCount1++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Logical, thinking \t B. Empathetic, feeling");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[0][4] = "A";
                aCount2++;
                break;
            case "B", "b":
                listOfAnswers[0][5] = "B";
                bCount2++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Organized, orderly \t B. Flexible, adaptable");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[0][6] = "A";
                aCount3++;
                break;
            case "B", "b":
                listOfAnswers[0][7] = "B";
                bCount3++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. More out going, Think out loud \t B. More reserved, think to yourself");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[1][0] = "A";
                aCount++;
                break;
            case "B", "b":
                listOfAnswers[1][1] = "B";
                bCount++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Practical, realistic \t B. Imaginative, innovative");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[1][2] = "A";
                aCount1++;
                break;
            case "B", "b":
                listOfAnswers[1][3] = "B";
                bCount1++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Candid, Straight forward \t B. Tactful, encourage");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[1][4] = "A";
                aCount2++;
                break;
            case "B", "b":
                listOfAnswers[1][5] = "B";
                bCount2++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Plan, schedule \t B. unplanned, spontaneous");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[1][6] = "A";
                aCount3++;
                break;
            case "B", "b":
                listOfAnswers[1][7] = "B";
                bCount3++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Seek many task  \t B. Seek private, solitary activities");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[2][0] = "A";
                aCount++;
                break;
            case "B", "b":
                listOfAnswers[2][1] = "B";
                bCount++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Standard \t B. Different");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[2][2] = "A";
                aCount1++;
                break;
            case "B", "b":
                listOfAnswers[2][3] = "B";
                bCount1++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Firm \t B. Gentle");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[2][3] = "A";
                aCount1++;
                break;
            case "B", "b":
                listOfAnswers[2][4] = "B";
                aCount2++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Regulated \t B. Easygoing");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[2][5] = "A";
                bCount2++;
                break;
            case "B", "b":
                listOfAnswers[2][6] = "B";
                aCount3++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. External \t B. Internal");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[2][7] = "A";
                bCount3++;
                break;
            case "B", "b":
                listOfAnswers[3][0] = "B";
                aCount++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Focus on here-and-now \t B. Look to the future");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[3][1] = "A";
                bCount++;
                break;
            case "B", "b":
                listOfAnswers[3][2] = "B";
                aCount1++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Tough minded \t B. Tender Hearted");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[3][3] = "A";
                bCount1++;
                break;
            case "B", "b":
                listOfAnswers[3][4] = "B";
                aCount2++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Preparation \t B. Go with the flow");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[3][5] = "A";
                bCount2++;
                break;
            case "B", "b":
                listOfAnswers[3][6] = "B";
                bCount++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Active, Initiate \t B. Reflective, Deliberate");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[3][7] = "A";
                bCount3++;
                break;
            case "B", "b":
                listOfAnswers[3][7] = "B";
                aCount3++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Facts \t B. Ideas");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[4][1] = "A";
                aCount1++;
                break;
            case "B", "b":
                listOfAnswers[4][2] = "B";
                bCount2++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. \"What is\" \t B. \"What could be,\"");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[4][3] = "A";
                bCount1++;
                break;
            case "B", "b":
                listOfAnswers[4][4] = "B";
                aCount2++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Matters of facts \t B. Sensitive");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[4][5] = "A";
                bCount2++;
                break;
            case "B", "b":
                listOfAnswers[4][6] = "B";
                aCount3++;
                break;
        }
        System.out.printf("%s%n", "Select A or B: \n 1. A. Control, govern \t B. Latitude, freedom");
        answer = input.nextLine();
        switch (answer) {
            case "A", "a":
                listOfAnswers[4][7] = "A";
                bCount3++;
                break;
        }



        if (aCount > bCount) {
            System.out.println("E");
        } else if (bCount > aCount) {
            System.out.println("I");
        }

        if (aCount1 > bCount1) {
            System.out.println("S");
        } else if (bCount1 > aCount1) {
            System.out.println("N");
        }

        if (aCount2 > bCount2) {
            System.out.println("T");
        } else if (bCount2 > aCount2) {
            System.out.println("F");
        }
        if (aCount3 > bCount3) {
            System.out.println("J");
        } else if (bCount3 > aCount3) {
            System.out.println("P");
        }
    }
}
