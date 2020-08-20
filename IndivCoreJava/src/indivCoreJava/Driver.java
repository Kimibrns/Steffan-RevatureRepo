package indivCoreJava;

public class Driver {
    public static void main(String args[]) {
    	System.out.println("Question: One");
    	QuestionOne.primarySort();
    	System.out.println("\n");
    	
    	System.out.println("Question Two");
    	QuestionTwo.fibEquation();
    	System.out.println("\n");
    	
    	System.out.println("Question Three");
    	QuestionThree.reversal();
    	System.out.println("\n");

    	System.out.println("Question Four");
    	QuestionFour.factorialCalc(6);
    	System.out.println("\n");
    	
    	System.out.println("Question Five");
    	QuestionFive.substringMethod("Antidisestablishmentarianism.", 10);
    	System.out.println("\n");
    	
    	System.out.println("Question Six");
    	QuestionSix.remainderTest(13);
    	System.out.println("\n");
    	
    	System.out.println("Question Seven");
    	QuestionSeven.comparatorSort();
    	System.out.println("\n");
    }
}
