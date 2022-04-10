import java.util.Scanner;
import java.io.*;
class Main
{
    public static void clrscr()
    {
		ProcessBuilder p=new ProcessBuilder();
		try
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(IOException ioe){}
		catch(InterruptedException ie){}
	}
    public static void main (String[] args)
    {
        int ch=0,i=1,num=0,rev=0,rem=0,back=0,n1=0,n2=0;
        String ch2=" ";
        float no1=0f,no2=0f;
        int fno=0,sno=0,tno=0;
        char cho='1';
		DataInputStream d1 = new DataInputStream(System.in);
        Scanner sc=new Scanner(System.in);
        MainMenu:
        do
        {
            Main.clrscr();
            System.out.println("\n===========================================================================");
            System.out.println("\n\t\t\t\tMAIN MENU");
            System.out.println("===========================================================================");
            System.out.println("\n\t\t1.Printing Different Messages ");
            System.out.println("\n\t\t2.Arithmetic Programs ");
            System.out.println("\n\t\t3.IF-Else Program ");
            System.out.println("\n\t\t4.Loops Programs ");
            System.out.println("\n\t\t5.Exit");
            System.out.println("\n===========================================================================");
            System.out.print("\n\tEnter Your Choice : ");
            ch=sc.nextInt();
            switch(ch)
            {

                case 1:do
                        {
                            Main.clrscr();
                            System.out.println("\n\n***************************************************************************");
                            System.out.println("\n\t\t\tPRINTING DIFFERENT MESSAGES MENU\t\t");
                            System.out.println("***************************************************************************");
                            System.out.println("\n\t\t\t1.\tTimetable");
                            System.out.println("\n\t\t\t2.\tStudent Information");
                            System.out.println("\n\t\t\t3.\tMarksheet");
                            System.out.println("\n\t\t\t4.\tBack to Main Menu");
                            System.out.println("\n\t\t\t5.\tExit");
                            System.out.println("\n============================================================================");
                            System.out.println("\t\tM : Main Menu\tP : Previous Menu    X : Exit");
                            System.out.println("============================================================================");
                            System.out.print("\nEnter Your Choice : ");
                            ch=sc.nextInt();
                            switch(ch)
                            {
                                case 1:Main.clrscr();
                                		 System.out.println("\n\t======================TIME TABLE=============================================");
		                                 System.out.println("\nName    :- Yogini Patil");
		                                 System.out.println("Class   :- TY B.Tech");
		                                 System.out.println("Roll No :- 019");
		                                 System.out.println("\n-----------------------------------------------------------------------------");
		                                 System.out.println("Time\t\tSr.no\tMon\tTue\tWed\tThur\tFri\tSat");
		                                 System.out.println("------------------------------------------------------------------------------");
		                                 System.out.println("9:30to10:30\t1.\tHJS\tM3\tM3\tBHR\tM3\tDM");
		                                 System.out.println("10:30to11:30\t2.\tDEM\tDEM\tDS\tCAO\tBHR\tDS");
		                                 System.out.println("\n*****************************LUNCH BREAK*************************************");
		                                 System.out.println("12:30to1:30\t3.\tDS\tDS\tDEM\tDM\tBHR\tCAO");
		                                 System.out.println("1:30to2:45\t4.\tPython\tDS\tDEM\tCAO\tDM\tM3");
		                                 System.out.println("\n*******************************SHORT BREAK************************************");
		                                 System.out.println("3:00to4:00\t5.\tHJS\tDEM\tPython\tDS\tCAO\tDM");
		                                 System.out.println("------------------------------------------------------------------------------");
		                                 System.out.println("\n=============================================================================");
                                         break;
                                case 2:Main.clrscr();
                                		 System.out.println("\t***************************STUDENT INFORMATION********************************");
		                                 System.out.println("\n==============================================================================");
		                                 System.out.println("\n\t\tName\t\t:- Yogini Ishwar Patil");
		                                 System.out.println("\t\tAddress\t\t:- shirpur");
		                                 System.out.println("\t\tDate of birth   :- 28/08/2001");
		                                 System.out.println("\t\tQualification   :- B.Tech(CS-Third Year)");
		                                 System.out.println("\t\tEmail Id\t:- xyz@gmail.com");
		                                 System.out.println("\t\tMobile No\t:- 123456789");
		                                 System.out.println("\t\tHobbies\t\t:- Singing, Playing, Reading");
		                                 System.out.println("\t\tFilm Star\t:- Shradda Kapoor");
		                                 System.out.println("\t\tFriends\t\t:- Neha, Dnyaneshwary");
		                                 System.out.println("\n==============================================================================");
		                                 System.out.println("\n\n********************************Thank You*************************************");
                                         break;
                                case 3:Main.clrscr();
                                		System.out.println("\n\t     Dr.Babasaheb Ambedkar Technological University");
                                    	System.out.println("\t---------------------------------------------------------");
                                    	System.out.println("\t     Yogini Ishwar Patil(195174535049)(B.Tech-sem4-2020)");
                                    	System.out.println("*******************************************************************************");
                                    	System.out.println("Subject Name\tCA1\tCA2\tMTE\tETE\tOut of 100 Marks  Grade  Result");
                                    	System.out.println("-------------------------------------------------------------------------------");
                                    	System.out.println("DAA\t\t10\t10\t19\t56\t       95\t   EX     PASS");
                                    	System.out.println("OS Lab\t\t14\t14\t-\t45\t       90\t   AA     PASS");
                                    	System.out.println("PS\t\t9\t7\t19\t60\t       95\t   EX     PASS");
                                    	System.out.println("OS\t\t9\t9\t19\t60\t       97\t   EX     PASS");
                                    	System.out.println("OOPJ\t\t10\t10\t19\t60\t       97\t   EX     PASS");
                                    	System.out.println("PDE\t\t15\t13\t- \t \t       96\t   EX     PASS");
                                    	System.out.println("NM\t\t10\t10\t20\t60\t       100\t   EX     PASS");
                                    	System.out.println("DAA Lab\t\t14\t14\t-\t41\t       82\t   AB     PASS");
                                    	System.out.println("IDSR\t\t10\t15\t-\t39\t       78\t   BB     PASS");
                                    	System.out.println("OOPJ Lab\t11\t11\t- \t40\t       80\t   BB     PASS");
                                    	System.out.println("*******************************************************************************");
                                    	System.out.println("Current Semester Performance  |  Commulative Performance");
                                    	System.out.println("--------------------------------------------------------------");
                                    	System.out.println("Credits  Gradepoints  SGPA    |  Credits   Gradepoints   CGPA");
                                    	System.out.println("21       204          9.71    |  81        725           8.95");
                                    	System.out.println("\n=============================================================================");
                                        break;
                                case 4:continue MainMenu;
                                default:System.out.println("Please Enter Valid Choice");
                            }
                            sc.nextLine();
                            System.out.print("\n\tTo Continue With Different Messages Menu Press (Y/N) : ");
                            ch2=sc.nextLine();
                        }while(ch2.equals("y") || ch2.equals("Y"));break;
                case 2:AriMenu:
                		do
                        {
                            Main.clrscr();
                            System.out.println("\n*******************************************************************************");
                        	System.out.println("\n\t\t\t\tARITHMETIC MENU\t\t\t\t      ");
                        	System.out.println("\n*******************************************************************************");
                        	System.out.println("\n\t1.\tAddition And Substraction\t6.\tSimple Interest");
                        	System.out.println("\n\t2.\tMultiplication And Division\t7.\tSwapping Of Two Numbers");
                        	System.out.println("\n\t3.\tSquare And Cube\t\t\t8.\tBack To Main Menu");
                        	System.out.println("\n\t4.\tArea And Perimeter\t\t9.\tExit");
                        	System.out.println("\n\t5.\tConversion Of Parameters");
                        	System.out.println("\n==============================================================================");
                        	System.out.println("\n\t\tM : Main Menu\tP : Previous Menu   X : Exit");
                        	System.out.println("\n==============================================================================");
                        	System.out.print("\n\t\tEnter Your Choice : ");
                            ch=sc.nextInt();
	                        switch(ch)
	                        {
	                            case 1:AddSubMenu:
		                                do
                                		{
											Main.clrscr();
                                		    System.out.println("\n******************************************************************************");
                                		    System.out.println("\n\t\t\tADDITION AND SUBSTRACTION MENU\t\t\t  ");
                                		    System.out.println("\n******************************************************************************");
                                		    System.out.println("\n\t\t1.Addition Of Two Numbers");
                                		    System.out.println("\n\t\t2.Substraction Of Two Numbers");
                                		    System.out.println("\n\t\t3.Back To Arithmetic Menu");
                                		    System.out.println("\n\t\t4.Back To Main Menu");
                                		    System.out.println("\n\t\t5.Exit");
                                		    System.out.println("\n==============================================================================");
                                		    System.out.println("\n\t\tM : Main Menu\tP : Previous Menu   X : Exit");
                                		    System.out.println("\n==============================================================================");
                                		    System.out.print("\n\t\tEnter Your Choice : ");
                                		    ch=sc.nextInt();
                                		    switch(ch)
                                		    {
                                		        case 1:
                                		        		do
                                            			 {
                                                			 Main.clrscr();
                                                			 System.out.println("\n******************************************************************************");
                                                			 System.out.println("\n\t\t\t\tADDITION MENU\t\t\t\t     ");
                                                			 System.out.println("\n******************************************************************************");
                                                			 System.out.println("\n\t\t1.\tAddition Of Two Integers");
                                                			 System.out.println("\n\t\t2.\tAddition Of Two Floats");
                                                			 System.out.println("\n\t\t3.\tBack To Addition And Substraction Menu");
                                                			 System.out.println("\n\t\t4.\tBack To Arithmetic Menu");
                                                			 System.out.println("\n\t\t5.\tBack To Main Menu");
                                                			 System.out.println("\n\t\t6.\tExit");
                                                			 System.out.println("\n==============================================================================");
                                                			 System.out.println("\n\t\tM : Main Menu\tP : Previous Menu   X : Exit");
                                                			 System.out.println("\n==============================================================================");
                                                			 System.out.print("\n\t\tEnter Your Choice : ");
                                                			 ch=sc.nextInt();
                                                    	     switch(ch)
                                                    		 {
                                                    		    case 1:Main.clrscr();
                                                                		System.out.println("\n\n\tProgram For Addition Of Two Integers Using Three Variable");
                                                                		System.out.println("\n====================================================================");
                                                                		System.out.print("\n\tEnter First Number\t= ");
                                                                	    fno=sc.nextInt();
                                                                		System.out.print("\n\tEnter Second Number\t= ");
                                                            			sno=sc.nextInt();
                                                                		System.out.println("\n--------------------------------------------------------------------");
                                                                		System.out.println("\n\tAddition of "+fno+" and "+sno+" is = "+(fno+sno));
                                                                		System.out.println("\n====================================================================");
                                                                		break;
                                                    		    case 2:Main.clrscr();
                                                                		System.out.println("\n\n\tProgram For Addition Of Two FLoats Using Three Variable");
                                                                		System.out.println("\n====================================================================");
                                                                		System.out.print("\n\tEnter First Number\t= ");
                                                                	    no1=sc.nextFloat();
                                                                		System.out.print("\n\tEnter Second Number\t= ");
                                                            			no2=sc.nextFloat();
                                                            			System.out.println("\n--------------------------------------------------------------------");
                                                                		System.out.println("\n\tAddition of "+fno+" and "+sno+" is = "+(no1+no2));
                                                                		System.out.println("\n====================================================================");
                                                                		break;
                                                    		    case 3:continue AddSubMenu;
                                                    		    case 4:continue AriMenu;
                                                    		    case 5:continue MainMenu;
                                                    		    case 6:System.exit(0);
                                		                        default:System.out.println("Please Enter Valid Choice ");
                                                    		 }
                                                    		 sc.nextLine();
                                                    		 System.out.print("\n\tTo Continue With Addition Menu Press (Y/N) : ");
                                                    		 ch2=sc.nextLine();
                                                    	}while(ch2.equals("Y") || ch2.equals("y"));break;

                                		        case 2:
                                		        		do
                                		                {
															Main.clrscr();
                                                			System.out.println("\n******************************************************************************");
                                                			System.out.println("\n\t\t\t\tSUBSTRACTION MENU\t\t\t     ");
                                                			System.out.println("\n******************************************************************************");
                                                			System.out.println("\n\t\t1.\tSubstraction Of Two Integers");
                                                			System.out.println("\n\t\t2.\tSubstraction Of Two Floats");
                                                			System.out.println("\n\t\t3.\tBack To Addition And Substraction Menu");
                                                			System.out.println("\n\t\t4.\tBack To Arithmetic Menu");
                                                			System.out.println("\n\t\t5.\tBack To Main Menu");
                                                			System.out.println("\n\t\t6.\tExit");
                                                			System.out.println("\n==============================================================================");
                                                			System.out.println("\n\t\tM : Main Menu\tP : Previous Menu   X : Exit");
                                                			System.out.println("\n==============================================================================");
                                                			System.out.print("\n\t\tEnter Your Choice : ");
                                                			ch=sc.nextInt();
                                                			switch(ch)
                                                			{
                                                			    case 1:Main.clrscr();
                                                			    		System.out.println("\n\tSubstraction Of Two Integers Without Using Third Variable");
                                                            			System.out.println("\n=======================================================================");

                                                            			System.out.print("\n\tEnter First Number\t\t= ");
                                                            			fno=sc.nextInt();
                                                            			System.out.print("\n\tEnter Second Number\t\t= ");
                                                            			sno=sc.nextInt();

                                                            			System.out.println("\n-----------------------------------------------------------------------");
                                                            			System.out.println("\tSubstraction of "+fno+" and "+sno+" is\t= "+(fno-sno));
                                                            			System.out.println("\n=======================================================================");
                                                                        break;
                                                			    case 2:Main.clrscr();
                                                			    		System.out.println("\n\tSubstraction Of Two Floats Without Using Third Variable");
                                                                		System.out.println("\n===================================================================");
                                                                		System.out.print("\n\tEnter First Number\t\t= ");
                                                                		no1=sc.nextFloat();
                                                                		System.out.print("\n\tEnter Second Number\t\t= ");
                                                                		no2=sc.nextFloat();
                                                                		System.out.println("\n-------------------------------------------------------------------");
                                                                		System.out.println("\tSubstraction Of "+no1+" and "+no2+" is\t= "+(no1-no2));
                                                                		System.out.println("\n===================================================================");
                                                                        break;
                                                			    case 3:continue AddSubMenu;
                                                			    case 4:continue AriMenu;
                                                			    case 5:continue MainMenu;
                                                			    case 6:System.exit(0);
                                		                        default:System.out.println("Please Enter Valid Choice ");
                                                			}
                                                			sc.nextLine();
                                                			System.out.print("\n\tTo Continue With Substraction Menu Press(Y/N) : ");
                                		                    ch2=sc.nextLine();
                                		                }while(ch2.equals("y") || ch2.equals("Y"));break;
                                		        case 3:continue AriMenu;
                                		        case 4:continue MainMenu;
                                		        case 5:System.exit(0);
                                		        default:System.out.println("Please Enter Valid Choice ");
                                		    }
                                		    System.out.print("\n\tTo Continue With Addition And Substraction Menu Press(Y/N) : ");
                                		    ch2=sc.nextLine();
                                		}while(ch2.equals("Y") || ch2.equals("y"));break;
	                            case 2:MulDivMenu:
										 do
										 {
											 Main.clrscr();
											 System.out.println("\n*******************************************************************************");
											 System.out.println("\n\t\t\tMULTIPLICATION AND DIVISION MENU\t\t      ");
											 System.out.println("\n*******************************************************************************");
											 System.out.println("\n\t\t1.Multiplication Of Two Numbers");
											 System.out.println("\n\t\t2.Division Of Two Numbers");
											 System.out.println("\n\t\t3.Back To Arithmetic Menu");
											 System.out.println("\n\t\t4.Back To Main Menu");
											 System.out.println("\n\t\t5.Exit");
											 System.out.println("\n==============================================================================");
											 System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
											 System.out.println("\n==============================================================================");
											 System.out.print("\n\t\tEnter Your Choice : ");
											 ch=sc.nextInt();
											 switch(ch)
											 {
												case 1:do
														{
															Main.clrscr();
															System.out.println("\n*******************************************************************************");
															System.out.println("\n\t\t\t\tMULTIPLICATION MENU\t\t\t     ");
															System.out.println("\n*******************************************************************************");
															System.out.println("\n\t\t1.\tMultiplication Of Two Integers");
															System.out.println("\n\t\t2.\tMultiplication Of Two Floats");
															System.out.println("\n\t\t3.\tBack To Multiplication And Division Menu");
															System.out.println("\n\t\t4.\tBack To Arithmetic Menu");
															System.out.println("\n\t\t5.\tBack To Main Menu");
															System.out.println("\n\t\t6.\tExit");
															System.out.println("\n==============================================================================");
															System.out.println("\n\t\tM : Main Menu\tP : Previous Menu   X : Exit");
															System.out.println("\n==============================================================================");
			  												System.out.print("\n\t\tEnter Your Choice : ");
			  												ch=sc.nextInt();
			  												switch(ch)
			  												{
																case 1:Main.clrscr();
																		System.out.println("\n\tMultiplication Of Two Integers Without Using Third Variable");
																		System.out.println("\n=======================================================================");
																		System.out.print("\n\tEnter First Number\t\t= ");
																		fno=sc.nextInt();
																		System.out.print("\n\tEnter Second Number\t\t= ");
																		sno=sc.nextInt();
																		System.out.println("\n-----------------------------------------------------------------------");
																		System.out.println("\tMultiplication of "+fno+" and "+sno+" is\t= "+(fno*sno));
																		System.out.println("\n=======================================================================");
																		break;
																case 2:Main.clrscr();
																		System.out.println("\n\tMultiplication Of Two Floats Without Using Third Variable");
																		System.out.println("\n==================================================================");
																		System.out.print("\n\tEnter First Number\t\t= ");
																		no1=sc.nextFloat();
																		System.out.print("\n\tEnter Second Number\t\t= ");
																		no2=sc.nextFloat();
																		System.out.println("\n-------------------------------------------------------------------");
																		System.out.println("\tMultiplication Of "+no1+" and "+no2+" is = "+(no1*no2));
																		System.out.println("\n===================================================================");
																		break;
																case 3:continue MulDivMenu;
																case 4:continue AriMenu;
																case 5:continue MainMenu;
																case 6:System.exit(0);
                                								default:System.out.println("Please Enter Valid Choice");
															}
															sc.nextLine();
															System.out.print("\n\tTo Continue With Multiplication Menu Press(Y/N) : ");
                                		    				ch2=sc.nextLine();
														}
														while(ch2.equals("y") || ch2.equals("Y"));
												 		break;
												case 2:do
														{
															Main.clrscr();
															System.out.println("\n*******************************************************************************");
															System.out.println("\n\t\t\t\tDivision MENU\t\t\t     ");
															System.out.println("\n*******************************************************************************");
															System.out.println("\n\t\t1.\tDivision Of Two Integers");
															System.out.println("\n\t\t2.\tDivision Of Two Floats");
															System.out.println("\n\t\t3.\tBack To Multiplication And Division Menu");
															System.out.println("\n\t\t4.\tBack To Arithmetic Menu");
															System.out.println("\n\t\t5.\tBack To Main Menu");
															System.out.println("\n\t\t6.\tExit");
															System.out.println("\n==============================================================================");
															System.out.println("\n\t\tM : Main Menu\tP : Previous Menu   X : Exit");
															System.out.println("\n==============================================================================");
			  												System.out.print("\n\t\tEnter Your Choice : ");
			  												ch=sc.nextInt();
			  												switch(ch)
			  												{
																case 1:Main.clrscr();
																		System.out.println("\n\tDivision Of Two Integers Without Using Third Variable");
																		System.out.println("\n=======================================================================");
																		System.out.print("\n\tEnter First Number\t\t= ");
																		fno=sc.nextInt();
																		System.out.print("\n\tEnter Second Number\t\t= ");
																		sno=sc.nextInt();
																		System.out.println("\n-----------------------------------------------------------------------");
																		System.out.println("\tDivision of "+fno+" and "+sno+" is\t= "+(fno/sno));
																		System.out.println("\n=======================================================================");
																		break;
																case 2:Main.clrscr();
																		System.out.println("\n\tDivision Of Two Floats Without Using Third Variable");
																		System.out.println("\n==================================================================");
																		System.out.print("\n\tEnter First Number\t\t= ");
																		no1=sc.nextFloat();
																		System.out.print("\n\tEnter Second Number\t\t= ");
																		no2=sc.nextFloat();
																		System.out.println("\n-------------------------------------------------------------------");
																		System.out.println("\tDivision Of "+no1+" and "+no2+" is = "+(no1/no2));
																		System.out.println("\n===================================================================");
																		break;
																case 3:continue MulDivMenu;
																case 4:continue AriMenu;
																case 5:continue MainMenu;
																case 6:System.exit(0);
                                								default:System.out.println("Please Enter Valid Choice");
															}
															sc.nextLine();
															System.out.print("\n\tTo Continue With Division Menu Press(Y/N) : ");
                                		    				ch2=sc.nextLine();
														}
														while(ch2.equals("y") || ch2.equals("Y"));break;
												case 3:continue AriMenu;
												case 4:continue MainMenu;
												case 5:System.exit(0);
                                				default:System.out.println("Please Enter Valid Choice");
											 }
											 System.out.print("\n\tTo Continue With Multiplication And Division Menu Press(Y/N) : ");
                                		     ch2=sc.nextLine();
										}while(ch2.equals("y") || ch2.equals("Y"));
	                            		break;
	                            case 3:do
	                            		{
											 Main.clrscr();
											 System.out.println("\n******************************************************************************");
											 System.out.println("\n<\t\t\tSQUARE AND CUBE MENU\t\t\t\t     >");
											 System.out.println("\n******************************************************************************");
											 System.out.println("\n\t\t1.\tCalculate Square");
											 System.out.println("\n\t\t2.\tCalculate Cube");
											 System.out.println("\n\t\t3.\tBack To Arithmetic Menu");
											 System.out.println("\n\t\t4.\tBack To Main Menu");
											 System.out.println("\n\t\t5.\tExit");
											 System.out.println("\n==============================================================================");
											 System.out.println("\n\t\tM : Main Menu\tP : Previous Menu   X : Exit");
											 System.out.println("\n==============================================================================");
											 System.out.print("\n\t\tEnter Your Choice : ");
											 ch=sc.nextInt();
			  								 switch(ch)
			  								 {
												 case 1:Main.clrscr();
												 		System.out.println("\n\t   Program For Calculating Square Of Given Number");
														System.out.println("\n\t=================================================================");
														System.out.print("\n\t\tEnter Any Number\t= ");
														num=sc.nextInt();
														System.out.println("\n\t-----------------------------------------------------------------");
														System.out.println("\n\t\tSquare Of "+num+" is\t\t= "+(num*num));
														System.out.println("\n\t==================================================================");
												 		break;
												 case 2:Main.clrscr();
												 		System.out.println("\n\t   Program For Calculating Cube Of Given Number");
														System.out.println("\n\t=================================================================");
														System.out.print("\n\t\tEnter Any Number\t= ");
														num=sc.nextInt();
														System.out.println("\n\t-----------------------------------------------------------------");
														System.out.println("\n\t\tCube Of "+num+" is\t\t= "+(num*num*num));
														System.out.println("\n\t==================================================================");
												 		break;
												 case 3:continue AriMenu;
												 case 4:continue MainMenu;
												 case 5:System.exit(0);
												 default:System.out.println("Please Enter Valid Choice");
											 }
											 sc.nextLine();
											 System.out.print("\n\tTo Continue With Square And Cube Menu Press(Y/N) : ");
											 ch2=sc.nextLine();
										}while(ch2.equals("y") || ch2.equals("Y"));
	                                   break;
	                            case 4:do{
											 int rad=0;
											 float area=0.0f,perimtr=0.0f,len=0.0f,bdth=0.0f;
											 Main.clrscr();
											 System.out.println("\n*****************************************************************************");
											 System.out.println("\n<\t\t\tAREA AND PERIMETER MENU\t\t\t\t     >");
											 System.out.println("\n******************************************************************************");
											 System.out.println("\n\t\t1.\tCalulate Area And Perimeter Of Circle");
											 System.out.println("\n\t\t2.\tCalculate Area And Perimeter Of Rectangle");
											 System.out.println("\n\t\t3.\tBack To Arithmetic Menu");
											 System.out.println("\n\t\t4.\tBack To Main Menu");
											 System.out.println("\n\t\t5.\tEXit");
											 System.out.println("\n==============================================================================");
											 System.out.println("\n\t\tM : Main Menu\tP : Previous Menu   X : Exit");
											 System.out.println("\n==============================================================================");
											 System.out.print("\n\t\tEnter Your Choice : ");
											 ch=sc.nextInt();
											 switch(ch)
			  								 {
												 case 1:Main.clrscr();
												 		System.out.println("\n\t  Program For Calculationg Area And Perimeter Of Circle");
														System.out.println("\n\t===========================================================");
														System.out.print("\n\t\tEnter Radius Of Circle\t= ");
														rad=sc.nextInt();
														System.out.println("\n\t----------------------------------------------------------");
														area=3.14f*rad*rad;
														perimtr=2*3.13f*rad;
														System.out.println("\n\t\tArea Of Circle\t\t= "+area);
														System.out.println("\t\tPerimeter Of Circle\t= "+perimtr);
    													System.out.println("\n\t===========================================================");break;
												 case 2:Main.clrscr();
												 		System.out.println("\n\t  Program For Calculationg Area And Perimeter Of Rectangle");
														System.out.println("\n\t===========================================================");
														System.out.print("\n\t\tEnter length of rectangle\t= ");
														len=sc.nextFloat();
														System.out.print("\n\t\tEnter breadth of rectangle\t= ");
														bdth=sc.nextFloat();
														System.out.println("\n\t-------------------------------------------------------------");
														area=len*bdth;
														perimtr=2*(len+bdth);
														System.out.println("\n\t\tArea Of Rectangle\t\t= "+area);
														System.out.println("\t\tPerimeter Of Rectangle\t\t= "+perimtr);
														System.out.println("\n\t============================================================");break;
												 case 3:continue AriMenu;
												 case 4:continue MainMenu;
												 case 5:System.exit(0);
												 default:System.out.println("Please Enter Valid Choice");
											 }
											 sc.nextLine();
											 System.out.print("\n\tTo Continue With Area And Perimeter Menu Press(Y/N) : ");
											ch2=sc.nextLine();
										}while(ch2.equals("y") || ch2.equals("Y"));break;
	                            case 5:ConMenu:
										do
										{
											 Main.clrscr();
											 System.out.println("\n******************************************************************************");
											 System.out.println("\n<\t\t\t\tCONVERSION MENU\t\t\t\t    >");
											 System.out.println("\n******************************************************************************");
											 System.out.println("\n\t\t1.\tDistance Conversion");
											 System.out.println("\n\t\t2.\tTemperature Conversion");
											 System.out.println("\n\t\t3.\tTime Conversion");
											 System.out.println("\n\t\t4.\tBack To Arithmetic Menu");
											 System.out.println("\n\t\t5.\tBack To Main Menu");
											 System.out.println("\n\t\t6.\tExit");
											 System.out.println("\n==============================================================================");
											 System.out.println("\n\t\tM : Main Menu\tP : Previous Menu   X : Exit");
											 System.out.println("\n==============================================================================");
											 System.out.print("\n\t\tEnter Your Choice : ");
											 ch=sc.nextInt();
											 switch(ch)
											 {
												 case 1:do
														{
															Main.clrscr();
														    System.out.println("\n******************************************************************************");
														    System.out.println("\n<\t\t\t  DISTANCE CONVERSION MENU\t\t\t     >");
														    System.out.println("\n******************************************************************************");
														    System.out.println("\n\t\t1.\tConvert KM To M");
														    System.out.println("\n\t\t2.\tConvert M To KM");
														    System.out.println("\n\t\t3.\tBack To Conversion Menu");
														    System.out.println("\n\t\t4.\tBack To Arithmetic Menu");
														    System.out.println("\n\t\t5.\tBack To Main Menu");
														    System.out.println("\n\t\t6.\tExit");
														    System.out.println("\n==============================================================================");
														    System.out.println("\n\t\tM : Main Menu\tP : Previous Menu   X : Exit");
														    System.out.println("\n==============================================================================");
														    System.out.print("\n\t\tEnter Your Choice : ");
															ch=sc.nextInt();
															switch(ch)
															{
																case 1:Main.clrscr();
																	   float km=0.0f;
																	   System.out.println("\n\tProgram For Coverting Distance Kilometers Into Meters");
																	   System.out.println("\n\t=====================================================");
																	   System.out.print("\n\t\tEnter Distance In Kilometer\t= ");
																	   km=sc.nextFloat();
																	   System.out.println("\n\t\tDistance In Meter\t\t= "+(1000*km)+" M");
																	   System.out.println("\n\t=====================================================");break;
																case 2:Main.clrscr();
																	   float m=0.0f;
																	   System.out.println("\n\t  Program For Coverting Distance Meter Into Kilometers");
																	   System.out.println("\n\t=====================================================");
																	   System.out.print("\n\t\tEnter Distance In Meter\t= ");
																	   m=sc.nextFloat();
																	   System.out.println("\n\t-----------------------------------------------------");
																	   System.out.println("\n\t\tDistance In Kilometer =  "+(m/1000)+" KM");
																	   System.out.println("\n\t=====================================================");break;
																case 3:continue ConMenu;
																case 4:continue AriMenu;
																case 5:continue MainMenu;
																case 6:System.exit(0);
																default:System.out.println("Please Enter Valid Choice");
															}
															System.out.print("\n\tTo Continue With Distance Conversion Menu Press(Y/N) : ");
															ch2=sc.nextLine();
														}while(ch2.equals("y") || ch2.equals("Y"));break;
												 case 2:float d=0.0f,f=0.0f;
												 		do
														{
															Main.clrscr();
														    System.out.println("\n*******************************************************************************");
														    System.out.println("\n<\t\t\t\tTemperature Conversion\t\t\t      >");
														    System.out.println("\n*******************************************************************************");
														    System.out.println("\n\t\t1.\tConvert Farenhite To Degree Centigrate");
														    System.out.println("\n\t\t2.\tConvert Degree Centigrate To farenhite");
														    System.out.println("\n\t\t3.\tBack To Conversion Menu");
														    System.out.println("\n\t\t4.\tBack To Arithmetic Menu");
														    System.out.println("\n\t\t5.\tBack To Main Menu");
														    System.out.println("\n\t\t6.\tEXit");
														    System.out.println("\n==============================================================================");
														    System.out.println("\n\t\tM : Main Menu\tP : Previous Menu   X : Exit");
														    System.out.println("\n==============================================================================");
														    System.out.print("\n\t\tEnter Your Choice : ");
														    ch=sc.nextInt();
														    switch(ch)
														    {
															 	case 1:Main.clrscr();
																	  System.out.println("\n\t  Program For Converting Farenheite To Degree");
																	  System.out.println("\n\t=====================================================");
																	  System.out.print("\t\tEnter Temperature In Farenheite\t= ");
																	  f=sc.nextFloat();
																	  d=(f-32)/1.8f;
																	  System.out.println("\n\t\tTemperature in Degree\t\t= "+d+" D");
																	  System.out.println("\n\t=====================================================");break;
																case 2:Main.clrscr();
																	  System.out.println("\n\t Program For Converting Degree To Farenheite");
																	  System.out.println("\n\t=====================================================");
																	  System.out.print("\t\tEnter Temperature In Degrees\t= ");
																	  d=sc.nextFloat();
																	  f=d*1.8f+32;
																	  System.out.println("\n\t\tTemperature in farenheit\t= "+f+" F" );
																	  System.out.println("\n\t=====================================================");break;
																case 3:continue ConMenu;
															    case 4:continue AriMenu;
															    case 5:continue MainMenu;
															    case 6:System.exit(0);
															    default:System.out.println("Please Enter Valid Choice");
														 	}
														    sc.nextLine();
														    System.out.print("\n\tTo Continue With Temperature Conversion Menu Press(Y/N) : ");
														    ch2=sc.nextLine();
														}while(ch2.equals("y") || ch2.equals("Y"));break;
												 case 3:Main.clrscr();
												 		int sec=0,nsec=0,min=0;
														System.out.println("\n\t  Program For Display seconds Into Minutes And Seconds");
														System.out.println("\n\t=======================================================");
														System.out.print("\n\t\tEnter no of seconds = ");
														sec=sc.nextInt();
														min=sec/60;
														nsec=sec%60;
														System.out.println("\n\t\t"+sec+" sec =   "+min+" min "+nsec+" secs ");
														System.out.println("\n\t=======================================================");break;
												 case 4:continue AriMenu;
												 case 5:continue MainMenu;
												 case 6:System.exit(0);
												 default:System.out.println("Please Enter Valid Choice");
											 }
											 sc.nextLine();
											 System.out.print("\n\tTo Continue With Conversion Menu Press(Y/N) : ");
											 ch2=sc.nextLine();
										}while(ch2.equals("y") || ch2.equals("Y"));break;
	                            case 6:Main.clrscr();
	                            	   int n=0;
	                            	   long p=0;
									   float r=0.0f,si=0.0f;
									   System.out.println("\n  \tProgram For Calculating Simple Interest");
									   System.out.println("\n\t=====================================================");
									   System.out.print("\n\t\tEnter Principal Amount\t= ");
									   p=sc.nextLong();
									   System.out.print("\n\t\tEnter No Of Years\t= ");
									   n=sc.nextInt();
									   System.out.print("\n\t\tEnter Rate Of Interest\t= ");
									   r=sc.nextFloat();
									   System.out.println("\n\t----------------------------------------------------");
									   si=(p*n*r)/100;
									   System.out.println("\n\t\tSimple Interest\t\t= "+si);
									   System.out.println("\n\t=====================================================");break;
	                            case 7:Main.clrscr();System.out.println("\n\t   Program For Swapping Of Two Numbers Using Two Variable");
	                            		System.out.println("\n\t=====================================================");
										System.out.print("\n\t\tEnter First Number\t= ");
										fno=sc.nextInt();
										System.out.print("\n\t\tEnter Second Number\t= ");
										sno=sc.nextInt();
										System.out.println("\n\t--------------------------------------------------------");
										System.out.println("\n\tBefore Swapping First Number = "+fno+" Second Number = "+sno);
										fno=fno+sno;
										sno=fno-sno;
										fno=fno-sno;
										System.out.println("\n\tAfter Swapping First Number  = "+fno+" Second Number  = "+sno);
										System.out.println("\n\t=======================================================");break;
	                            case 8:continue MainMenu;
	                            case 9:System.exit(0);
                                default:System.out.println("Please Enter Valid Choice");
	                        }
	                        System.out.print("\n\tTo Continue With Arithmetic Menu Press (Y/N) : ");
                            ch2=sc.nextLine();
                        }while(ch2.equals("Y") || ch2.equals("y"));
                        break;
                case 3:IfMenu:
					   do
					   {
							Main.clrscr();
						    System.out.println("\n******************************************************************************");
						    System.out.println("\n<\t\t\t\tIF-ELSE MENU\t\t\t\t     >");
						    System.out.println("\n******************************************************************************");
						    System.out.println("\n1.\tCheck For Number\t\t6.\tCheck Leap Year Or Not");
						    System.out.println("\n2.\tStudents Percentage And Class\t7.\tCalculating Electricity Bill");
						    System.out.println("\n3.\tTriangle Validity Programs\t8.\tBack To Main Menu");
						    System.out.println("\n4.\tCheck Profit Or loss\t\t9.\tExit");
						    System.out.println("\n5.\tCharacter Programs");
						    System.out.println("\n==============================================================================");
						    System.out.println("\n\t\tM : Main Menu\tP : Previous Menu   X : Exit");
       						System.out.println("\n==============================================================================");
       						System.out.print("\n\t\tEnter Your Choice : ");
							ch=sc.nextInt();
							switch(ch)
							{
								case 1:NumMenu:
									  do
									  {
										  Main.clrscr();
										  System.out.println("\n******************************************************************************");
										  System.out.println("\n<\t\t\tCHECK FOR NUMBER MENU\t\t\t\t     >");
										  System.out.println("\n******************************************************************************");
										  System.out.println("\n\t\t1.\tGreatest Of Number");
										  System.out.println("\n\t\t2.\tCheck Number Is Positive Or Negative");
										  System.out.println("\n\t\t3.\tCheck Number Is Even Or Odd ");
										  System.out.println("\n\t\t4.\tCheck Number Is Divisible Or Not");
										  System.out.println("\n\t\t5.\tBack To IfElse Menu");
										  System.out.println("\n\t\t6.\tBack To Main Menu");
										  System.out.println("\n\t\t7.\tExit");
										  System.out.println("\n==============================================================================");
										  System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
										  System.out.println("\n==============================================================================");
										  System.out.print("\n\t\tEnter Your Choice : ");
										  ch=sc.nextInt();
										  switch(ch)
										  {
											  case 1:do
													{
														Main.clrscr();
													    System.out.println("\n******************************************************************************");
													    System.out.println("\n<\t\t\tGREATEST OF NUMBER MENU\t\t\t\t     >");
													    System.out.println("\n******************************************************************************");
													    System.out.println("\n\t\t1.\tGreatest of two numbers");
													    System.out.println("\n\t\t2.\tGreatest of three numbes");
													    System.out.println("\n\t\t3.\tBack To Check For Number Menu");
													    System.out.println("\n\t\t4.\tBack To If-Else Programs Menu");
													    System.out.println("\n\t\t5.\tBack To Main Menu");
													    System.out.println("\n\t\t6.\tExit");
													    System.out.println("\n==============================================================================");
													    System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
													    System.out.println("\n==============================================================================");
													    System.out.print("\n\t\tEnter Your Choice : ");
														ch=sc.nextInt();
														switch(ch)
														{
															case 1:Main.clrscr();
																   System.out.println("\n\t  Program For Find Greatest Among Two Numbers");
																   System.out.println("\n\t======================================================");
																   System.out.print("\n\t\tEnter First Number\t= ");
																   fno=sc.nextInt();
																   System.out.print("\n\t\tEnter Second Number\t= ");
																   sno=sc.nextInt();
																   System.out.println("\n\t-----------------------------------------------------");
																   if(fno==sno)
																		System.out.println("\n\t\t\tBoth are same");
																	else
																	{
																		if(fno>sno)
																			System.out.println("\n\t\t\t"+fno+" is greater ");
																		else
																			System.out.println("\n\t\t\t"+sno+" is greater");
																	}
																	System.out.println("\n\t=======================================================");break;
															case 2:Main.clrscr();
																	System.out.println("\n\t   Program For Find Greatest Among Three Numbers");
																	System.out.println("\n\t======================================================");
																	System.out.print("\n\t\tEnter First Number\t= ");
																	fno=sc.nextInt();
																	System.out.print("\n\t\tEnter Second Number\t= ");
																	sno=sc.nextInt();
																	System.out.print("\n\t\tEnter third Number\t= ");
																	tno=sc.nextInt();
																	System.out.println("\n\t-----------------------------------------------------");
																	if(fno==sno && sno==tno)
																	{
																		System.out.println("\n\t\t\tAll three are same");
																	}
																	else
																	{
																		if(fno>sno && fno>tno)
																			System.out.println("\n\t\t\t"+fno+" is greater ");
																		else
																		{
																			if(sno>tno)
																				System.out.println("\n\t\t\t"+sno+" is greater");
																			else
																				System.out.println("\n\t\t"+tno+" is greater");
																		}
																	}
																	System.out.println("\n\t=======================================================");break;
															case 3:continue NumMenu;
															case 4:continue IfMenu;
															case 5:continue MainMenu;
															case 6:System.exit(0);
															default:System.out.println("Please Enter Valid Choice");
														}
														sc.nextLine();
														System.out.print("\n\tTo Continue With Greatest Of Number Menu Press (Y/N) : ");
														ch2=sc.nextLine();
													}while(ch2.equals("Y") || ch2.equals("y"));break;
											  case 2:Main.clrscr();
											  		System.out.println("\n\tProgram For Check Number Is Positive Or Negative");
											  		System.out.println("\n\t======================================================");
													System.out.print("\n\t\tEnter Any Number = ");
													num=sc.nextInt();
													if(num==0)
														System.out.println("\n\t\tEntered number is Zero");
													else
													{
														if(num>0)
															System.out.println("\n\t\t"+num+" is positive");
														else
															System.out.println("\n\t\t"+num+" is negative ");
													}
													System.out.println("\n\t=====================================================");break;
											  case 3:Main.clrscr();
											  		System.out.println("\n\t  Program For Check Number Is Even Or Odd");
													System.out.println("\n\t======================================================");
													System.out.print("\n\t\tEnter Any Number = ");
													num=sc.nextInt();
													System.out.println("\n\t-----------------------------------------------------");
													if(num%2==0)
														System.out.println("\n\t\t"+num+" is even number");
													else
														System.out.println("\n\t\t"+num+" is odd number");
													System.out.println("\n\t======================================================");break;
											  case 4:Main.clrscr();
											  		System.out.println("\n\t  Program To Check Number Is Divisible By 5 And 11");
													System.out.println("\t===============================================================");
													System.out.print("\n\t\tEnter any number = ");
													num=sc.nextInt();
													System.out.println("\n\t-------------------------------------------------------------");
													if(num%5==0 && num%11==0)
														System.out.println("\n\t\t"+num+" is divisible by 5 and 11");
													else
														System.out.println("\n\t\t"+num+" is not divisible by 5 and 11");
													System.out.println("\n\t==============================================================");break;
											  case 5:continue IfMenu;
											  case 6:continue MainMenu;
											  case 7:System.exit(0);
											  default:System.out.println("Please Enter Valid Choice");
										  }
										  sc.nextLine();
										  System.out.print("\n\tTo Continue With Check For Number Menu Press (Y/N) : ");
                            			  ch2=sc.nextLine();
                        			 }while(ch2.equals("Y") || ch2.equals("y"));break;
								case 2:Main.clrscr();
										int sub1=0,sub2=0,sub3=0,marks=0;
										float per=0.0f;
										System.out.println("\n\tProgram For Printing Total Marks, Percentage And Class");
										System.out.println("\n\t======================================================");
										System.out.print("\n\t\tEnter marks in subject 1\t= ");
										sub1=sc.nextInt();
										System.out.print("\n\t\tEnter marks in subject 2\t= ");
										sub2=sc.nextInt();
										System.out.print("\n\t\tEnter marks in subject 3\t= ");
										sub3=sc.nextInt();
										System.out.println("\n\t------------------------------------------------------");
										if(sub1<0 || sub2<0 || sub3<0 || sub1>100 || sub2>100 || sub3>100)
											System.out.println("\n\t\tPlease enter valid marks");
										else
										{
											marks=sub1+sub2+sub3;
											System.out.println("\n\t\tTotal Marks = "+marks);
											if(sub1<40 || sub2<40 || sub3<40)
											{
												System.out.println("\n\t\tSorry , you are fail");
											}
											else
											{
												per=marks/3.0f;
												System.out.println("\n\t\tPercentage = "+per+" %");
												if(per>=70)
													System.out.println("\n\t\tClass = Distinction");
												else
												{
													if(per>=60)
														System.out.println("\n\t\tClass = First class");
													else
													{
														if(per>=50)
															System.out.println("\n\t\tClass = Second class");
														else
															System.out.println("\n\t\tClass = Pass class");
													}
												}
											}
										}
										System.out.println("\n\t======================================================");break;
								case 3:int s1=0,s2=0,s3=0;
									  do
									  {
										 Main.clrscr();
										 System.out.println("\n***************************************************************************");
										 System.out.println("\n<\t\t\tTRIANGLE VALIDITY MENU\t\t\t\t >");
										 System.out.println("\n***************************************************************************");
										 System.out.println("\n\t\t1.\tNumbers Are Of Angles Of Triangle Or Not");
										 System.out.println("\n\t\t2.\tTriangle Is Valid Or Not From Sides");
										 System.out.println("\n\t\t3.\tCheck Type Of Triangle");
										 System.out.println("\n\t\t4.\tBack To If-Else Program Menu");
										 System.out.println("\n\t\t5.\tBack To Main Menu");
										 System.out.println("\n\t\t6.\tExit");
										 System.out.println("\n==============================================================================");
										 System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
										 System.out.println("\n==============================================================================");
										 System.out.print("\n\t\tEnter Your Choice : ");
										 ch=sc.nextInt();
										 switch(ch)
										 {
											 case 1: Main.clrscr();int num1=0,num2=0,num3=0,sum;
													System.out.println("\n\tProgram For Check Numbers Are Angles Of Triangle Or Not");
													System.out.println("\n\t=========================================================");
													System.out.print("\n\t\tEnter First Number\t= ");
													num1=sc.nextInt();
													System.out.print("\n\t\tEnter Second Number\t= ");
													num2=sc.nextInt();
													System.out.print("\n\t\tEnter Third Number\t= ");
													num3=sc.nextInt();
													System.out.println("\n\t-------------------------------------------------------");
													if(num1<=0 || num2<=0 || num3<=0 || num1>=180 || num2>=180 || num3>=180)
														System.out.println("\n\t\tEnter valid numbers");
													else
													{
														sum=num1+num2+num3;
														if(sum==180)
															System.out.println("\n\t\t"+num1+", "+num2+", "+num3+" are angles of triangle");
														else
															System.out.println("\n\t\t"+num1+", "+num2+", "+num3+" are not angles of triangle");
													}
													System.out.println("\n\t=========================================================");break;
											 case 2: Main.clrscr();
													System.out.println("\n\tProgram To Check Triangle Is Valid Or Not From Input Sides");
													System.out.println("\n\t============================================================");
													System.out.print("\n\t\tEnter First Side\t= ");
													s1=sc.nextInt();
													System.out.print("\n\t\tEnter Second Side\t= ");
													s2=sc.nextInt();
													System.out.print("\n\t\tEnter Third Number\t= ");
													s3=sc.nextInt();
													if(s1<=0 || s2<=0 || s3<=0)
													{
														System.out.println("\n\t\tEnter valid sides");
													}
													else
													{
														if(s1+s2>s3 && s2+s3>s1 && s1+s3>s2)
															System.out.println("\n\t\tTriangle is valid ");
														else
															System.out.println("\n\t\tTriangle is not valid");
													}
													System.out.println("\n\t===========================================================");
													break;
											 case 3: Main.clrscr();
													System.out.println("\n\tProgram To Check Whether Triangle is Eqilateral , Isosceles ,\n\t Right-angle ,scalene Triangle ");
													System.out.println("\n\t=================================================================");
													System.out.print("\n\t\tEnter First Side\t= ");
													s1=sc.nextInt();
													System.out.print("\n\t\tEnter Second Side\t= ");
													s2=sc.nextInt();
													System.out.print("\n\t\tEnter Third Number\t= ");
													s3=sc.nextInt();
													System.out.println("\n\t------------------------------------------------------------------");
													if(s1<=0 || s2<=0 || s3<=0)
													{
														System.out.println("\n\t\tEnter valid sides");
													}
													else
													{
														if(s1+s2<s3 || s2+s3<s1 || s1+s3<s2)
															System.out.println("\n\t\tTriangle is not valid");
														else
														{
															if(s1==s2 && s2==s3)
																System.out.println("\n\t\tTriangle = Equilateral triangle");
															else
															{
																if(s1==s2 || s2==s3 || s1==s3)
																	System.out.println("\n\t\tTriangle = Isosceles triangle");
																else
																{
																	if(s1*s1+s2*s2==s3*s3 || s2*s2+s3*s3==s1*s1 || s1*s1+s3*s3==s2*s2 )
																		System.out.println("\n\t\tTriangle = Right angle triangle");
																	else
																		System.out.println("\n\t\tTriangle = Scalene Triangle");
																}
															}
														}
													}
													System.out.println("\n\t==================================================================");break;
											 case 4:continue IfMenu;
											 case 5:continue MainMenu;
											 case 6:System.exit(0);
											 default:System.out.println("Please Enter Valid Choice");
										 }
										 sc.nextLine();
										 System.out.print("\n\tTo Continue With Triangle Validity Menu Press (Y/N) : ");
										 ch2=sc.nextLine();
                        			 }while(ch2.equals("Y") || ch2.equals("y"));break;
								case 4:int sp=0,pp=0;
										System.out.println("\n\t\tProgram To Check Profit Or Loss");
										System.out.println("\n\t======================================================");
										System.out.print("\n\t\tEnter purchase price\t= ");
										pp=sc.nextInt();
										System.out.print("\n\t\tEnter selling price\t= ");
										sp=sc.nextInt();
										if(pp<0 || sp<0)
											System.out.println("\n\t\tPlease enter valid price");
										else
										{
											if(pp == sp)
												System.out.println("\n\t\tNeither profit nor loss");
											else
											{
												if(sp>pp)
													System.out.println("\n\t\tProfit");
												else
													System.out.println("\n\t\tLoss");
											}
										}
										System.out.println("\n\t======================================================");
								case 5:
									  do
									  {
										  Main.clrscr();
										  System.out.println("\n***************************************************************************");
										  System.out.println("\n<\t\t\tCHARACTER PROGRAM MENU\t\t\t\t >");
										  System.out.println("\n***************************************************************************");
										  System.out.println("\n\t\t1.\tTo Check Type Of Character");
										  System.out.println("\n\t\t2.\tTo Check Character Is Vowel Or Consonant");
										  System.out.println("\n\t\t3.\tBack To If-Else Programs Menu");
										  System.out.println("\n\t\t4.\tBack To Main Menu");
										  System.out.println("\n\t\t5.\tExit");
										  System.out.println("\n==============================================================================");
										  System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
										  System.out.println("\n==============================================================================");
										  System.out.print("\n\t\tEnter Your Choice : ");
										  ch=sc.nextInt();
										  switch(ch)
										  {
											  case 1:Main.clrscr();
													System.out.println("\n\t=====================================================================");
													System.out.println("\n\tProgram For Checking Character Is Alphabet , Digit Or Special Symbol");
													System.out.println("\n\t=====================================================================");
													System.out.print("\n\n\t\tEnter any character : ");
													try {
														cho=(char)System.in.read();
													} catch(IOException e){};
													if(cho>='A' && cho<='Z')
														System.out.println("\n\t\t"+cho+" is capital alphabet");
													else
														if(cho>='a' && cho<='z')
															System.out.println("\n\t\t"+cho+" is small alphabet");
														else
															if(cho>='0' && cho<='9')
																System.out.println("\n\t\t"+cho+" is digit");
															else
																System.out.println("\n\t\t"+cho+" is special symbol");
													System.out.println("\n\t================================================================");break;
											  case 2:Main.clrscr();
													System.out.println("\n\t=================================================================");
													System.out.println("\n\tProgram For Checking Character Is Vowel Or Consonant");
													System.out.println("\n\t=================================================================");
													System.out.print("\n\n\t\tEnter any character : ");
													try {
														cho=(char)System.in.read();
													} catch(IOException e){};
													if(cho=='A' || cho=='E' ||cho=='I' ||cho=='O' ||cho=='U' ||cho=='a' ||cho=='e' ||cho=='i' ||cho=='o' ||cho=='u')
														System.out.println("\n\t\t"+cho+" is vowel ");
													else
													    if(cho>='A' && cho<='Z' || cho>='a' && cho<='z')
													    	System.out.println("\n\t\t"+cho+" is consonant");
													    else
													    	System.out.println("\n\t\t"+cho+" is not alphabet");
													System.out.println("\n\t==================================================================");break;
											  case 3:continue IfMenu;
											  case 4:continue MainMenu;
											  case 5:System.exit(0);
											  default:System.out.println("Please Enter Valid Choice");
										  }
										  sc.nextLine();
										  System.out.print("\n\tTo Continue With Character Program Menu Press (Y/N) : ");
										  try{ch2=d1.readLine();}catch(IOException e){};
									   }while(ch2.equals("Y") || ch2.equals("y"));break;
								case 6:Main.clrscr();
										int year=0;
										System.out.println("\n\t  Program To Check Given Year Is Leap Year Not");
										System.out.println("\t===============================================================");
										System.out.print("\n\t\tEnter any year = ");
										year=sc.nextInt();
										if(year%4==0 && year%100!=0 || year%400==0)
											System.out.println("\n\t\t"+year+" is leap year");
										else
											System.out.println("\n\t\t"+year+" is not leap year");
										System.out.println("\n\t==============================================================");break;
								case 7:Main.clrscr();
										int unit=0;
										float sch=0.0f, rs=0.0f;
										System.out.println("\n\t   Program To Calculate Total Electricity Bill");
										System.out.println("\t========================================================");
										System.out.print("\n\t\tEnter total units\t= ");
										unit=sc.nextInt();
										if(unit<=50)
										{
											rs=unit*0.5f;
											System.out.println("\n\t\tElectricity bill\t= Rs "+rs);
										}
										else
										{
											if(unit<=150)
											{
												unit=unit-50;
												rs=unit*0.75f;
												rs=rs+25;
												System.out.println("\n\t\tElectricity bill\t= Rs "+rs);
											}
											else
											{
												if(unit<=250)
												{
													unit=unit-150;
													rs=unit*1.20f;
													rs=rs+100;
													System.out.println("\n\t\tElectricity bill\t= Rs "+rs);
												}
												else
												{
													unit=unit-250;
													rs=unit*1.50f;
													rs=rs+220;
													System.out.println("\n\t\tElectricity bill\t= Rs "+rs);
												}
											}
										}
										sch=(2*rs)/10;
										System.out.println("\n\t\tadditional surcharge\t= Rs "+sch);
										System.out.println("\t------------------------------------------------------------");
										System.out.println("\n\tTotal Electricity bil with additional surcharge = Rs "+(rs+sch));
										System.out.println("\t============================================================");break;
								case 8:continue MainMenu;
								case 9:System.exit(0);
								default:System.out.println("Please Enter Valid Choice");
							}
							sc.nextLine();
							System.out.print("\n\tTo Continue With If-Else Menu Press (Y/N) : ");
                            ch2=sc.nextLine();
                        }while(ch2.equals("Y") || ch2.equals("y"));break;
                case 4:LoopMenu:
					do
					{
						 Main.clrscr();
						 System.out.println("\n******************************************************************************");
						 System.out.println("\n<\t\t\t\tLOOPS MENU\t\t\t\t     >");
						 System.out.println("\n******************************************************************************");
						 System.out.println("\n1.\tTables Programs\t\t\t\t6.\tNumber Raised To Power");
						 System.out.println("\n2.\tPrinting Numbers In Range\t\t7.\tBack To Main Menu");
						 System.out.println("\n3.\tFibonacci Series\t\t\t8.\tExit");
						 System.out.println("\n4.\tPrime , Palindrome , Armstrong Numbers");
						 System.out.println("\n5.\tFactorial Of Numbers");
						 System.out.println("\n==============================================================================");
						 System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
						 System.out.println("\n==============================================================================");
						 System.out.print("\n\t\tEnter Your Choice : ");
						 ch=sc.nextInt();
						 switch(ch)
						 {
							 case 1:do
									{
										Main.clrscr();
									    System.out.println("\n*****************************************************************************");
									    System.out.println("\n<\t\t\tTABLE PROGRAM MENU\t\t\t\t     >");
									    System.out.println("\n*****************************************************************************");
									    System.out.println("\n\t\t1.\tTable Of Two");
									    System.out.println("\n\t\t2.\tTable Of Three");
									    System.out.println("\n\t\t3.\tTable Of Given Number");
									    System.out.println("\n\t\t4.\tBack To Loops Program Menu");
									    System.out.println("\n\t\t5.\tBack To Main Menu");
									    System.out.println("\n\t\t6.\tExit");
									    System.out.println("\n==============================================================================");
									    System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
									    System.out.println("\n==============================================================================");
									    System.out.print("\n\t\tEnter Your Choice : ");
										ch=sc.nextInt();
										switch(ch)
										{
											case 1:Main.clrscr();
													i=1;
													System.out.println("\n\t\tProgram For Printing 2's Table ");
													System.out.println("\t===========================================================");
													while(i<=10)
													{
														System.out.println("\t\t\t"+(2*i));
														i++;
													}
													System.out.println("\n\t===========================================================");break;
											case 2:Main.clrscr();
													i=1;
													System.out.println("\n\t\tProgram For Printing 3's Table ");
													System.out.println("\t===========================================================");
													while(i<=10)
													{
														System.out.println("\t\t\t"+(3*i));
														i++;
													}
													System.out.println("\n\t===========================================================");break;
											case 3:Main.clrscr();
													i=1;
													System.out.println("\n\t\tProgram For Printing Table Of Given Number ");
													System.out.println("\t===========================================================");
													System.out.print("\n\t\tEnter any number : ");
													num=sc.nextInt();
													while(i<=10)
													{
														System.out.println("\t\t\t"+(num*i));
														i++;
													}
													System.out.println("\n\t===========================================================");break;
											case 4:continue LoopMenu;
											case 5:continue MainMenu;
											case 6:System.exit(0);
											default:System.out.println("Please Enter Valid Choice ");
										}
										sc.nextLine();
	 									System.out.print("\n\tTo Continue With Table Program Menu Press (Y/N) : ");
										ch2=sc.nextLine();
									}while(ch2.equals("Y") || ch2.equals("y"));break;
							 case 2:do
							 		{

										 Main.clrscr();
										 System.out.println("\n******************************************************************************");
										 System.out.println("\n<\t\t\tNUMBERS IN RANGE MENU\t\t\t             >");
										 System.out.println("\n******************************************************************************");
										 System.out.println("\n\t\t1.\tPrinting Numbers in 1 to 100");
										 System.out.println("\n\t\t2.\tPrinting Numbers In Given Range");
										 System.out.println("\n\t\t3.\tPrinting 1 to 100 Even Numbers");
										 System.out.println("\n\t\t4.\tPrinting Even numbers In Given Range");
										 System.out.println("\n\t\t5.\tPrinting 1 to 100 Odd Numbers");
										 System.out.println("\n\t\t6.\tPrinting Odd numbers In Given Range");
										 System.out.println("\n\t\t7.\tBack To Loops Menu");
										 System.out.println("\n\t\t8.\tBack To Main Menu");
										 System.out.println("\n\t\t9.\tExit");
										 System.out.println("\n==============================================================================");
										 System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
										 System.out.println("\n==============================================================================");
										 System.out.print("\n\t\tEnter Your Choice : ");
										 ch=sc.nextInt();
										 switch(ch)
										 {
											 case 1:Main.clrscr();
											 		i=1;
											 		System.out.println("\n\tProgram For Printing 1 To 100 Numbers");
													System.out.println("\t===========================================================");
													while(i<=100)
													{
														System.out.print("\t\t\t"+i);
														i++;
													}
													System.out.println("\n\n\t===========================================================");break;
											 case 2:Main.clrscr();
													System.out.println("\n\t\tProgram For Printing Numbers In Given Range");
													System.out.println("\t===========================================================");
													System.out.print("\n\t\tEnter first number = ");
													fno=sc.nextInt();
													System.out.print("\n\t\tEnter second number = ");
													sno=sc.nextInt();
													System.out.println("\n\t----------------------------------------------------------");
													if(fno<=sno)
													{
														while(fno<=sno)
														{
															System.out.print("\t\t\t"+fno);
															fno++;
														}
													}
													else
													{
														while(fno>=sno)
														{
															System.out.print("\t\t\t"+sno);
															sno++;
														}
													}
													System.out.println("\n\n\t===========================================================");break;
											 case 3:Main.clrscr();
											 		i=1;
													System.out.println("\n\t   Program For Printing 1 To 100 Even Numbers");
													System.out.println("\t====================================================================");
													while(i<=100)
													{
														if(i%2==0)
															System.out.print("\t\t\t"+i);
														i++;
													}
													System.out.println("\n\n\t====================================================================");break;
											 case 4:Main.clrscr();
											 		int temp=0;
													System.out.println("\n\t\tProgram For Printing Even Numbers In Given Range");
													System.out.println("\t===========================================================");
													System.out.print("\n\t\tEnter first number = ");
													fno=sc.nextInt();
													System.out.print("\n\t\tEnter second number = ");
													sno=sc.nextInt();
													System.out.println("\n\t----------------------------------------------------------");
													if(fno>sno)
													{
														temp=fno;
														fno=sno;
														sno=temp;
													}
													if(fno<=sno)
													{
														while(fno<=sno)
														{
															if(fno%2==0)
																System.out.print("\t\t\t"+fno);
															fno++;
														}
													}
													System.out.println("\n\n\t===========================================================");break;
											 case 5:Main.clrscr();
											 		System.out.println("\n\tProgram For Printing 1 To 100 Odd Numbers");
													System.out.println("\t====================================================================");
													i=1;
													while(i<=100)
													{
														if(i%2!=0)
															System.out.print("\t\t\t"+i);
														i++;
													}
													System.out.println("\n\n\t=====================================================================");
											 case 6:Main.clrscr();
													System.out.println("\n\t\tProgram For Printing Odd Numbers In Given Range");
													System.out.println("\t===========================================================");
													System.out.print("\n\t\tEnter first number = ");
													fno=sc.nextInt();
													System.out.print("\n\t\tEnter second number = ");
													sno=sc.nextInt();
													System.out.println("\n\t----------------------------------------------------------");
													if(fno>sno)
													{
														temp=fno;
														fno=sno;
														sno=temp;
													}
													if(fno<=sno)
													{
														while(fno<=sno)
														{
															if(fno%2!=0)
																System.out.print("\t\t\t"+fno);
															fno++;
														}
													}
													System.out.println("\n\n\t===========================================================");break;
											 case 7:continue LoopMenu;
											 case 8:continue MainMenu;
											 case 9:System.exit(0);
											 default:System.out.println("Please Enter Valid Choice ");
										 }
										 sc.nextLine();
										 System.out.print("\n\tTo Continue With Number In Range Menu Press (Y/N) : ");
										 try
										 {ch2=d1.readLine();}catch(IOException e){};
									}while(ch2.equals("Y") || ch2.equals("y"));break;
							 case 3:int sum=0,j=1;
							 	  do
								  {
									  Main.clrscr();
									  System.out.println("\n*****************************************************************************");
									  System.out.println("\n<\t\t\tFIBONACCI SERIES MENU\t\t\t\t     >");
									  System.out.println("\n*****************************************************************************");
									  System.out.println("\n\t\t1.\tFibonacci Series Up To 34");
									  System.out.println("\n\t\t2.\tFibonacci Series Up To Given Range");
									  System.out.println("\n\t\t3.\tFibonacci Series In Reverse");
									  System.out.println("\n\t\t4.\tFibonacci Series In Given Terms");
									  System.out.println("\n\t\t5.\tBack To Loop Menu");
									  System.out.println("\n\t\t6.\tBack To Main Menu");
									  System.out.println("\n\t\t7.\tExit");
									  System.out.println("\n==============================================================================");
									  System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
									  System.out.println("\n==============================================================================");
									  System.out.print("\n\t\tEnter Your Choice : ");
									  ch=sc.nextInt();
									  switch(ch)
									  {
										  case 1:Main.clrscr();
										  		i=0;j=1;sum=0;
												System.out.println("\n\tProgram For Printing Fibonacci Series");
												System.out.println("\t==================================================");
												while(i<=34)
												{
													System.out.print("\t\t\t"+i);
													sum=i+j;
													i=j;
													j=sum;
												}
												System.out.println("\n\t======================================================");break;
										  case 2:Main.clrscr();
										  		i=0;j=1;sum=0;
										  		int range=0;
										  		System.out.println("\n\tProgram For Printing Fibonacci Series Up To Given Range");
										  		System.out.println("\t=====================================================================");
										  		System.out.print("\n\t\tEnter the range : ");
										  		range=sc.nextInt();
										  		System.out.print("\n\n");
										  		while(i<=range)
										  		{
													System.out.print("\t\t\t"+i);
													sum=i+j;
													i=j;
													j=sum;
												}
												System.out.println("\n\t================================================================");break;
										  case 3:Main.clrscr();
										  		i=34;j=21;sum=0;
												System.out.println("\n\tProgram For Printing Fibonacci Series In Reverse");
												System.out.println("\t==================================================================");
												while(i>=0)
												{
													System.out.print("\t\t\t"+i);
													if(i==0)break;
													sum=i-j;
													i=j;
													j=sum;
												}
												System.out.println("\n\t===============================================================");break;
										  case 4:Main.clrscr();
										  		i=0;j=1;sum=0;
										  		int term=0;
										  		System.out.println("\n\tProgram For Printing Fibonacci Series In Given Term");
										  		System.out.println("\t=====================================================================");
										  		System.out.print("\n\t\tEnter the term : ");
										  		term=sc.nextInt();
										  		System.out.print("\n\n");
										  		while(term>0)
										  		{
													System.out.print("\t\t\t"+i);
													sum=i+j;
													i=j;
													j=sum;
													term--;
												}
												System.out.println("\n\t===================================================================");break;
										  case 5:continue LoopMenu;
										  case 6:continue MainMenu;
										  case 7:System.exit(0);
										  default:System.out.println("Please Enter Valid Choice");
									  }
									  sc.nextLine();
									  System.out.print("\n\tTo Continue With Fibonacci Series Menu Press (Y/N) : ");
									  try{ch2=d1.readLine();}catch(IOException e){};
								}while(ch2.equals("Y") || ch2.equals("y"));break;
							 case 4:PpaMenu:
									do
								 	{
									    Main.clrscr();
									    System.out.println("\n*****************************************************************************");
									    System.out.println("\n<\t\t\tPRIME , PALINDROME , ARMSTRONG NUMBER MENU\t   >");
									    System.out.println("\n*****************************************************************************");
									    System.out.println("\n\t\t1.\tPrime Number");
									    System.out.println("\n\t\t2.\tPalindrome Number");
									    System.out.println("\n\t\t3.\tArmstrong Number");
									    System.out.println("\n\t\t4.\tBack To Loop Menu");
									    System.out.println("\n\t\t5.\tBack To Main Menu");
									    System.out.println("\n\t\t6.\tExit");
									    System.out.println("\n==============================================================================");
									    System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
									    System.out.println("\n==============================================================================");
									    System.out.print("\n\t\tEnter Your Choice : ");
										ch=sc.nextInt();
										switch(ch)
									  	{
											case 1:do
												   {
													   clrscr();
													   System.out.println("\n*****************************************************************************");
													   System.out.println("\n<\t\t\tPRIME NUMBER MENU\t\t\t\t    >");
													   System.out.println("\n*****************************************************************************");
													   System.out.println("\n\t\t1.\tPrime Number Or Not");
													   System.out.println("\n\t\t2.\tPrime Number In Given Range");
													   System.out.println("\n\t\t3.\tBack To Prime, Palindrome, Armstrong Number Menu");
													   System.out.println("\n\t\t4.\tBack To Loops Menu");
													   System.out.println("\n\t\t5.\tBack To Main Menu");
													   System.out.println("\n\t\t6.\tExit");
													   System.out.println("\n==============================================================================");
													   System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
													   System.out.println("\n==============================================================================");
													   System.out.print("\n\t\tEnter Your Choice : ");
													   ch=sc.nextInt();
													   switch(ch)
													   {
														   case 1:Main.clrscr();
														   		i=1;int count=0;num=0;
																System.out.println("\n\tProgram For Printing Given Number Is Prime Or Not");
																System.out.println("\t==================================================================");
																System.out.print("\n\t\tEnter any number = ");
																num=sc.nextInt();
																for(i=1;i<=num;i++)
																{
																	if(num%i==0)
																		count=count+1;
																}
																if(count==2)
																	System.out.println("\n\t\t"+num+" is prime number");
																else
																	System.out.println("\n\t\t"+num+" is not prime number");
																System.out.println("\n\t================================================================");break;
														   case 2:Main.clrscr();
														   			int flag=0;
																	i=2;
																	System.out.println("\n\tProgram For Printing Prime Numbers In Given Range");
																	System.out.println("\t===========================================================");
																	System.out.print("\n\t\tEnter first number = ");
																	n1=sc.nextInt();
																	System.out.print("\n\t\tEnter second number = ");
																	n2=sc.nextInt();
																	System.out.println("\n\t----------------------------------------------------------");
																	if(n1<=n2)
																	{
																		while(n1<=n2)
																		{
																			i=2;flag=0;
																			while(i<n1)
																			{
																				if(n1%i==0)
																				{
																					flag=flag+1;
																				}
																				i++;
																			}
																			if(flag==0)
																				System.out.println("\t\t\t"+n1);
																			n1++;
																		}
																	}
																	else
																	{
																		while(n1>=n2)
																		{
																			i=2;flag=0;
																			while(i<n2)
																			{
																				if(n2%i==0)
																				{
																					flag=flag+1;
																				}
																				i++;
																			}
																			if(flag==0)
																				System.out.println("\t\t\t"+n2);
																			n2++;
																		}
																	}
																	System.out.println("\t===========================================================");break;
														   case 3:continue PpaMenu;
														   case 4:continue LoopMenu;
														   case 5:continue MainMenu;
														   case 6:System.exit(0);
														   default:System.out.println("Please Enter Valid Choice ");
														}
													   sc.nextLine();
													   System.out.print("\n\tTo Continue With Prime Number Menu Press (Y/N) : ");
													   try{ch2=d1.readLine();}catch(IOException e){};
													}while(ch2.equals("Y") || ch2.equals("y"));break;
											case 2:
												do
												{
													clrscr();
													System.out.println("\n*****************************************************************************");
													System.out.println("\n<\t\t\tPALINDROME NUMBER MENU\t\t\t\t   >");
													System.out.println("\n*****************************************************************************");
													System.out.println("\n\t\t1.\tPalindrome Number Or Not");
													System.out.println("\n\t\t2.\tPalindrome Number In Given Range");
													System.out.println("\n\t\t3.\tBack To Prime,Palindrome,Armstrong Menu");
													System.out.println("\n\t\t4.\tBack To Loops Menu");
													System.out.println("\n\t\t5.\tBack To Main Menu");
													System.out.println("\n\t\t6.\tExit");
													System.out.println("\n==============================================================================");
													System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
													System.out.println("\n==============================================================================");
													System.out.print("\n\t\tEnter Your Choice : ");
													ch=sc.nextInt();
													switch(ch)
													{
														case 1:Main.clrscr();
															   rev=0;rem=0;back=0;
																num=0;
																System.out.println("\n\tProgram For Printing Given Number Is Palindrome Or Not");
																System.out.println("\t==================================================================");
																System.out.print("\n\t\tEnter any number = ");
																num=sc.nextInt();
																back=num;
																for(rev=0;num>0;num=num/10)
																{
																	rem=num%10;
																	rev=rev*10+rem;
																}
																if(back==rev)
																	System.out.println("\n\t\t"+back+" is palindrome number");
																else
																	System.out.println("\n\t\t"+back+" is not palindrome number");
																System.out.println("\n\t================================================================");break;
														case 2:Main.clrscr();n1=0;n2=0;rev=0;rem=0;
																System.out.println("\n\tProgram For Printing Palindrome Numbers In Given Range");
																System.out.println("\t=====================================================================");
																System.out.print("\n\t\tEnter first number = ");
																n1=sc.nextInt();
																System.out.print("\n\t\tEnter second number = ");
																n2=sc.nextInt();
																System.out.println("\n\t------------------------------------------------------------------\n");
																if(n1<=n2)
																{
																	while(n1<=n2)
																	{

																		num=n1;
																		for(rev=0;num>0;num=num/10)
																		{
																			rem=num%10;
																			rev=rev*10+rem;
																		}
																		if(rev==n1)
																			System.out.println("\t\t\t"+n1);
																		n1++;
																	}
																}
																else
																{
																	while(n1>=n2)
																	{
																		num=n2;
																		for(rev=0;num>0;num=num/10)
																		{
																			rem=num%10;
																			rev=rev*10+rem;
																		}
																		if(rev==n2)
																			System.out.println("\t\t\t"+n2);
																		n2++;
																	}
																}
																System.out.println("\n\n\t====================================================================");break;
														case 3:continue PpaMenu;
														case 4:continue LoopMenu;
														case 5:continue MainMenu;
														case 6:System.exit(0);
														default:System.out.println("Please Enter Valid Choice ");
													}
													sc.nextLine();
													System.out.print("\n\tTo Continue With Palindrome Number  Menu Press (Y/N) : ");
													try{ch2=d1.readLine();}catch(IOException e){};
												}while(ch2.equals("Y") || ch2.equals("y"));break;
											case 3:do
												   {
														clrscr();
														System.out.println("\n***************************************************************************");
														System.out.println("\n<\t\t\tARMSTRONG NUMBER MENU\t\t\t\t >");
														System.out.println("\n***************************************************************************");
														System.out.println("\n\t\t1.\tArmstrong Number Or Not");
														System.out.println("\n\t\t2.\tArmstronge Number In Given Range");
														System.out.println("\n\t\t3.\tBack To Prime,Palindrome,Armstrong Menu");
														System.out.println("\n\t\t4.\tBack To Loops Menu");
														System.out.println("\n\t\t5.\tBack To Main Menu");
														System.out.println("\n\t\t6.\tExit");
														System.out.println("\n==============================================================================");
														System.out.println("\n\t\tM : Main Menu\tP : Previous Menu    X : Exit");
														System.out.println("\n==============================================================================");
														System.out.print("\n\t\tEnter Your Choice : ");
														ch=sc.nextInt();
														switch(ch)
														{
															case 1:Main.clrscr();
																	num=0;rem=0;sum=0;back=0;
																	System.out.println("\n\tProgram For Printing Given Number Is Armstrong Or Not");
																	System.out.println("\t==================================================================");
																	System.out.print("\n\t\tEnter any number = ");
																	num=sc.nextInt();
																	back=num;
																	for(sum=0;num>0;num=num/10)
																	{
																		rem=num%10;
																		sum=sum+rem*rem*rem;
																	}
																	if(back==sum)
																		System.out.println("\n\t\t"+back+" is armstrong number");
																	else
																		System.out.println("\n\t\t"+back+" is not armstrong number");
																	System.out.println("\n\t=================================================================");break;
															case 2:Main.clrscr();
																	n1=0;n2=0;sum=0;rem=0;
																	System.out.println("\n\tProgram For Printing Armstrong Numbers In Given Range");
																	System.out.println("\t================================================================");
																	System.out.print("\n\t\tEnter first number = ");
																	n1=sc.nextInt();
																	System.out.print("\n\t\tEnter second number = ");
																	n2=sc.nextInt();
																	System.out.println("\n\t------------------------------------------------------------------\n");
																	if(n1<=n2)
																	{
																		while(n1<=n2)
																		{

																			num=n1;
																			for(sum=0;num>0;num=num/10)
																			{
																				rem=num%10;
																				sum=sum+rem*rem*rem;
																			}
																			if(sum==n1)
																				System.out.println("\t\t\t"+n1);
																			n1++;
																		}
																	}
																	else
																	{
																		while(n1>=n2)
																		{
																			num=n2;
																			for(sum=0;num>0;num=num/10)
																			{
																				rem=num%10;
																				sum=sum+rem*rem*rem;
																			}
																			if(sum==n2)
																				System.out.println("\t\t\t"+n2);
																			n2++;
																		}
																	}
																	System.out.println("\n\n\t================================================================");break;
															case 3:continue PpaMenu;
															case 4:continue LoopMenu;
															case 5:continue MainMenu;
															case 6:System.exit(0);
															default:System.out.println("Please Enter Valid Choice");
														}
														sc.nextLine();
														System.out.print("\n\tTo Continue With Armstrong Number Menu Press (Y/N) : ");
														try{ch2=d1.readLine();}catch(IOException e){};
													}while(ch2.equals("Y") || ch2.equals("y"));break;
											case 4:continue LoopMenu;
											case 5:continue MainMenu;
											case 6:System.exit(0);
											default:System.out.println("Please Enter Valid Choice ");
										}
										sc.nextLine();
										System.out.print("\n\tTo Continue With Prime, Palindrome, Armstrong Menu Press (Y/N) : ");
										try{ch2=d1.readLine();}catch(IOException e){};
								}while(ch2.equals("Y") || ch2.equals("y"));break;
							 case 5:Main.clrscr();
							 		long fact=1;
									num=0;i=1;
									System.out.println("\n\t   Program To Calculate factorial Of Given Number");
									System.out.println("\t================================================================");
									System.out.print("\t\tEnter any number = ");
									num=sc.nextInt();
									i=num;
									while(num>0)
									{
										fact=fact*num;
										num=num-1;
									}
									System.out.println("\n\t\tFactorial of "+i+" is = "+fact);
									System.out.println("\t===============================================================");break;
							 case 6:Main.clrscr();
							 		num=0;
							 		int pow=0,value=1;
									System.out.println("\n\tProgram For Caculating Number raised To Power");
									System.out.println("\t====================================================================");
									System.out.print("\n\t\tEnter any number = ");
									num=sc.nextInt();
									System.out.print("\n\t\tEnter any power = ");
									pow=sc.nextInt();
									int p=pow;
									while(pow>0)
									{
										value=value*num;
										pow=pow-1;
									}
									System.out.println("\n\t\t"+num+" raised to "+p+" is = "+value);
									System.out.println("\n\t=====================================================================");break;
							 case 7:continue MainMenu;
							 case 8:System.exit(0);
							 default:System.out.println("Please Enter Valid Choice ");
						 }
						 sc.nextLine();
						 System.out.print("\n\tTo Continue With Loop Menu Press (Y/N) : ");
						 try{ch2=d1.readLine();}catch(IOException e){};
					}while(ch2.equals("Y") || ch2.equals("y"));break;
                case 5:System.exit(0);
                default:System.out.println("Please Enter Valid Choice");
            }
            System.out.print("\n\tTo Continue With Main Menu Press (Y/N) : ");
            ch2=sc.nextLine();
        }
        while(ch2.equals("Y") || ch2.equals("y"));
        System.out.println("\n\n=============================================================================");
    }
}
