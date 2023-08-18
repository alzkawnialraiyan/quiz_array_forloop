import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Quiz questions using arrays and loops
        Scanner read = new Scanner(System.in);

        System.out.println("please enter your name:");
        String name = read.next();

        System.out.println("Please enter number of question:");
        int numofQ = read.nextInt();

        int Score = 0; //to start the count of score from 0.
        String[] questions = {
                "Question 1, 2+2 = \n a)4 \n b)6 \n c)8",
                "Question 2, 5*5 = \n a)50 \n b)25 \n c)30",
                "Question 3, 10+9 = \n a)14 \n b)20 \n c)19",
                "Question 4, 20-10 = \n a)9 \n b)10 \n c)8",
                "Question 5, 30+1 = \n a)31 \n b)21 \n c)18",
        };

        String[] userAns1 = {"a","b","c","b","a"};
        for (int i =0; i<questions.length; i++){
            System.out.println(questions[i]);
            System.out.println("Please enter your choice:");
            String userAns = read.next();

            if(userAns.equals(userAns1[i])){
                System.out.println("Correct answer");
                Score++;
            }
            else{
                System.out.println("Wrong answer");
            }
        } System.out.println("Your score is "+Score+" from 5");

    }
}