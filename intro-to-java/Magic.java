/*
 In this project, you will become a mathemagician and write a small program that performs a mathematical 
 magic trick! It will involve performing arithmetic operations on an integer that you choose.
 */

 public class Magic {
	public static void main(String[] args) {
        int myNumber = 546; // The original number chosen
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
            
        System.out.println(stepSix);
	}
}