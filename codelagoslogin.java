//push to github project_003
								//SIMPLE COMPETITON LOGIN PROGRAMMED  BY [08039160301]

import java.util.Calendar;
import java.util.Scanner;

public class codelagoslogin{


	public static void main(String [] args)
	{
		int serial;
		int hour;
		int min;
		
		String code1,code2,code3,code4,code5,code6,code7,code8,code9,code10;
		Boolean enter;

//select a 5ppl to qualify .. toss random num among 10 ppl
	


			Calendar cal = Calendar.getInstance();

			Scanner input = new Scanner (System.in);


			System.out.println("\t " +  "\t" + "\t" + "  Today is " +(cal.getTime()));
			System.out.println();
			System.out.println("\t " + "\t" + "\t " +  "\t" + "CODELAGOS HACKATHON 2018");
			System.out.println("Enter your serial no :");

			serial = input.nextInt();

			

			



			switch(serial)
		{
				case 3:
			System.out.println("Dear ANTHONY EMMMANUEL! welcome to CODELAGOS HACKATHON 2018 COMPETITION");
			System.out.println( +cal.get(Calendar .HOUR_OF_DAY)+":" +cal.get(Calendar .MINUTE)+":"+cal.get(Calendar .SECOND));
			System.out.println("\t"+"\t"+"\t"+"\t"+"Time sign in ");
			
			Scanner time6 = new Scanner (System.in);
			System.out.print("hour(--) :");
			hour = time6.nextInt();
			System.out.print("min(--) :");
			min = time6.nextInt();
			System.out.println("ANTHONY EMMMANUEL signed in "+hour+":"+min);

			Scanner input6 = new Scanner (System.in);
			System.out.println("Kindly input the code sent to you :");
			code2 = input6.nextLine(); 

			if (code2.equals ("dww2"))
				System.out.println("You have succesfully joined the hackathon competition");
			

			else
				System.out.println("invalid code");
				break;


			case 2:
			System.out.println("Dear OMONIYI OMOTOLA! welcome to CODELAGOS HACKATHON 2018 COMPETITION");
			System.out.println( +cal.get(Calendar .HOUR_OF_DAY)+":" +cal.get(Calendar .MINUTE)+":"+cal.get(Calendar .SECOND));
			System.out.println("\t"+"\t"+"\t"+"\t"+"Time sign in ");
			
			Scanner time2 = new Scanner (System.in);
			System.out.print("hour(--) :");
			hour = time2.nextInt();
			System.out.print("min(--) :");
			min = time2.nextInt();
			System.out.println("OMONIYI OMOTOLA signed in "+hour+":"+min);

			Scanner input2 = new Scanner (System.in);
			System.out.println("Kindly input the code sent to you :");
			code2 = input2.nextLine(); 

			if (code2.equals ("dk32"))
				System.out.println("You have succesfully joined the hackathon competition");
			

			else
				System.out.println("invalid code");
				break;

			case 8:
			System.out.println("Dear KASUMU KEHINDE! welcome to CODELAGOS HACKATHON 2018 COMPETITION");
			System.out.println( +cal.get(Calendar .HOUR_OF_DAY)+":" +cal.get(Calendar .MINUTE)+":"+cal.get(Calendar .SECOND));
			System.out.println("\t"+"\t"+"\t"+"\t"+"Time sign in ");

			Scanner time3 = new Scanner (System.in);
			System.out.print("hour(--) :");
			hour = time3.nextInt();
			System.out.print("min(--) :");
			min = time3.nextInt();
			System.out.println("KEHINDE KASUMU signed in "+hour+":"+min);

			Scanner input3 = new Scanner (System.in);
			System.out.println("Kindly input code :");
			code3 = input3.nextLine();

			if (code3.equals ("md56"))
			
			System.out.println("You have succesfully joined the hackathon competition");
			

			else
				System.out.println("invalid code"); 
			break;

			case 4:
			System.out.println("Dear ADEGUNLE AHMED welcome to CODELAGOS HACKATHON 2018 COMPETITION");
			System.out.println( +cal.get(Calendar .HOUR_OF_DAY)+":" +cal.get(Calendar .MINUTE)+":"+cal.get(Calendar .SECOND));
			System.out.println("\t"+"\t"+"\t"+"\t"+"Time sign in ");

			Scanner time4 = new Scanner (System.in);
			System.out.print("hour(--) :");
			hour = time4.nextInt();
			System.out.print("min(--) :");
			min = time4.nextInt();
			System.out.println("ADEGUNLE AHMED signed in "+hour+":"+min+ " AM");

			Scanner input4 = new Scanner (System.in);
			System.out.println("Kindly input code :");
			code4 = input4.nextLine(); 

			if (code4.equals ("m9UE"))
				System.out.println("You have succesfully joined the hackathon competition");
			
			else
				System.out.println("invalid code");
			break;

			case 9:
			System.out.println("Dear CHIDINMA OKONSO! welcome to CODELAGOS HACKATHON 2018 COMPETITION");
			System.out.println( +cal.get(Calendar .HOUR_OF_DAY)+":" +cal.get(Calendar .MINUTE)+":"+cal.get(Calendar .SECOND));
			System.out.println("\t"+"\t"+"\t"+"\t"+"Time sign in ");

			Scanner time5 = new Scanner (System.in);
			System.out.print("hour(--) :");
			hour = time5.nextInt();
			System.out.print("min(--) :");
			min = time5.nextInt();
			System.out.println("CHIDINMA signed in "+hour+":"+min);


			Scanner input5 = new Scanner (System.in);
			System.out.println("Kindly input code :");
			code5 = input5.nextLine(); 
			break;


			default:
			System.out.println("Your number was not selected for this competition");
			break;


		}

			input.close();
		}
	}

