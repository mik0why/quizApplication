package quizApplication;

import java.util.Scanner;

public class Qa {

	public static void main(String [] args){
		Quiz q = new Quiz();
		q.begin();
		
	}
	
}

//TODO next step: make a GUI
class Quiz{
	void begin(){
		Question q1 = new Question("1+2 = ?", "1", "2", "3", "4", new Answer("3"));
		Question q2 = new Question("2+3 = ?", "4", "5", "6", "7", new Answer("5"));
		
		System.out.println("first let's print...");
		System.out.println(q1.getOption1() + " and " + q1.getAnswer().answer);
		Question qArr[] = {q1, q2};
		int countTotal = 0;
		int countCorr = 0;
		int countWrong = 0;
	
		for (Question d : qArr){
			System.out.println(d.getQuestion());
			System.out.println("A: " + d.getOption1());
			System.out.println("B: " + d.getOption2());
			System.out.println("C: " + d.getOption3());
			System.out.println("D: " + d.getOption4());
			System.out.println("Enter a character ...\n");

			
			Scanner scanner = new Scanner(System.in);
			char option = scanner.next().charAt(0); 
			System.out.println(option);
			String answer = "";
			
			switch(Character.toLowerCase(option)){
			case 'a': 
				answer = d.getOption1();
				break;
			case 'b': 
				answer = d.getOption2();
				break;
			case 'c': 
				answer = d.getOption3();
				break;
			case 'd': 
				answer = d.getOption4();
				break;
			default:break;
			//	System.out.println("Enter A, B, C or D");
			//	break;
					
			}
		
			// case when answer is "" ?
			//	System.out.println("The answer is...\n");
			//	System.out.println(d.answer.getAnswer());
			
			if(answer.equals(d.answer.getAnswer())){
				System.out.println("correct\n");
				countCorr++;
			}else{
				System.out.println("incorrect\n");
				countWrong++;
			}
				countTotal++;
		}
		
		System.out.println("questionsAnswered : " + countTotal + " correct: " + countCorr + " incorrect : " + countWrong);
		IResult r = new Result(countTotal, countCorr, countWrong);
		r.showResult();
		// interface reference can point to an object implementing that interface
	
	
	
	}
}

class Question{
	
	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	Answer answer; //OOP : breaking objects into smaller objects?
	
	public Question(String question, String option1, String option2, String option3, String option4, Answer answer){
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
	}
	
	public String getQuestion(){
		return question;
	}
	
	public String getOption1(){
		return option1; 
	}

	public String getOption2(){
		return option2; 
	}
	
	public String getOption3(){
		return option3; 
	}
	
	public String getOption4(){
		return option4; 
	}
	
	public Answer getAnswer(){
		return answer; 
	}
	
	
	
}

class Answer{
	String answer; 
	
	public Answer(String s){
		super(); // which parent is being called?
		this.answer = s;
	}
	
	public String getAnswer(){ // TODO read about getters and setters
		return answer;
	}
	
}

interface IResult{
	void showResult();
//	double showPercentage(int correctAnswers, int totalQuestions);
//	String showPerformance(double percentage);
}


class Result implements IResult{
	int totalQuestions;
	int correctAnswers;
	int wrongAnswers;
	
	public Result(int totalQuestions, int correctAnswers, int wrongAnswers){
		super(); /// calls the constructor w/o params - but why?
		this.totalQuestions = totalQuestions;
		this.correctAnswers = correctAnswers;
		this.wrongAnswers = wrongAnswers;
	}
	
	public void showResult(){
		System.out.println("Your Result: ");
		System.out.println("Total Questions: " + totalQuestions);
		System.out.println("Correct Answers: " + correctAnswers);
		System.out.println("Wrong Answers: " + wrongAnswers);
		// omitted showPercentage and showPerformances
	}
	
}