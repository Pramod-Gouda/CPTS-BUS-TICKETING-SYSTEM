/**
 * City Public Transport System App
 * @pramod 
 * @1.0 s
 */
import java.util.*;
import java.io.*;
class Cpts
{  
    public static void mainMenu()throws Exception
    {
        Cpts bus=new Cpts();
        Scanner sc=new Scanner(System.in);
        int ch;
        main:
        do
        {
            System.out.println("\t*******************");
            System.out.println("\tWelcome to CPTS App");
            System.out.println("\t*******************");
            System.out.println("Enter 1 - Trip Planner");
            System.out.println("Enter 2 - Feedback");
            System.out.println("Enter 3 - Exit");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                bus.trip_plan();
                break;
                case 2:
                bus.feedback();
                break; 
                case 3:
                System.exit(0);
                break;
                default:
                System.out.println("Wrong choice!! Please Enter correct choice.");
            }
        }while(ch!=3);
    }

    public static void main(String args[])throws Exception
    {
        mainMenu();
    }

    public void trip_plan() throws Exception
    {
        Cpts bus=new Cpts();
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            System.out.println("\t*********************");
            System.out.println("\tTrip Planner-CPTS App");
            System.out.println("\t*********************");
            System.out.println("Enter 1-Route Map");
            System.out.println("Enter 2 - Buy Ticket");
            System.out.println("Enter 3 - Buy Daily Pass");
            System.out.println("Enter 4 - To main menu");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                bus.route_map();
                break; 
                case 2:
                bus.buy_ticket();
                break; 
                case 3:
                bus.buy_dailypass();
                break; 
                case 4:
                mainMenu();
                break; 
                default:
                System.out.println("Wrong choice!! Please Enter correct choice.");
            }
        }while(ch!=3);
    }

    public void route_map() throws Exception
    {
        Cpts bus=new Cpts();
        Scanner sc=new Scanner(System.in);
        System.out.println("\t****************************");
        System.out.println("\tBuy Route Map Page-CPTS App");
        System.out.println("\t****************************");
        System.out.println("Enter Source :");
        String src=sc.nextLine();
        System.out.println("Enter Destination :");
        String dst=sc.nextLine();
        System.out.println("The Bus Details are :-");
        System.out.println("Source: "+src);
        System.out.println("Destination: "+dst);
        System.out.println("Bus Number is: 285MA");
        System.out.println("The Route Map is :-\n");
        bus.StrToken();
        System.out.println("\n");
    }

    public void buy_ticket() throws Exception
    {
        Cpts bus=new Cpts();
        Scanner sc=new Scanner(System.in);
        bus.route_map();
        System.out.println("\t************************");
        System.out.println("\tBuy Ticket Page-CPTS App");
        System.out.println("\t************************");
        System.out.println("Would you like to buy ticket(Yes-1/No-0):");
        int yn=sc.nextInt();
        System.out.println("Enter the Number of Passengers:");
        int n=sc.nextInt();
        if(yn==1)
        {
            for(int i=1;i<=n;i++)
            {
                System.out.println("Enter Passenger "+i+" :");
                System.out.println("Enter Name: ");
                String name=sc.next();
                System.out.println("Enter Aadhar Card Number: ");
                String uid=sc.next();
                System.out.println("Enter E-Mail ID: ");
                String email=sc.next();
                System.out.println("Enter Phone Number: ");
                String phno=sc.next();
                System.out.println("Enter Age: ");
                int age=sc.nextInt();
                System.out.println("\n");
            }
            int chrg=(n*27);
            System.out.println("Your Ticket Price is : "+chrg);
            bus.payment();
            System.out.println("Your Ticket Number is : "+bus.random());
            System.out.println("\nHave a nice Day.");
            System.out.println("\n");
        }
    }

    public void payment()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t*****************");
        System.out.println("\tPayment-CPTS App");
        System.out.println("\t*****************");
        System.out.println("The Available list of Payment Methods are:");
        System.out.println("Enter 1 - Cash");
        System.out.println("Enter 2 - Credit/Debit Card");
        System.out.println("Enter 3 - Paytm");
        System.out.println("Enter your Mode of Payment: ");
        int pay=sc.nextInt();
        switch(pay)
        {
            case 1:
            System.out.println("Please insert the cash in the machine:");
            System.out.println("Thank You for paying.\n");
            break; 
            case 2:
            //
            break; 
            case 3:
            //
            break; 
            default:
            System.out.println("Wrong choice!! Please Enter correct choice.");
        }
    }

    public static void StrToken() throws Exception 
    {
        try{
            File f = new File("rmap.txt");				// code to open a file...
            FileInputStream fis = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String s = "";
            int counter = 1;					// counter for number of lines in the file
            StringTokenizer st;					// declare the String Tokenizer here
            s = br.readLine( );					// read the first line of the file

            while(s != null){					// for each line of the File...
                st = new StringTokenizer(s, ",");			// separate based on a ,
                while (st.hasMoreTokens()) {			// for each token in the line
                    System.out.print(st.nextToken());
                    System.out.print("\n");
                }
                s = br.readLine( );				// read the next line of the File
                counter++;
            }
        }

        catch(FileNotFoundException fnfe){
            System.out.println("File not found");			// if input file is missing...
        }
    }

    public void buy_dailypass() throws Exception
    {
        Cpts bus=new Cpts();
        Scanner sc=new Scanner(System.in);
        bus.route_map();
        System.out.println("\t***************************");
        System.out.println("\tBuy DailyPass Page-CPTS App");
        System.out.println("\t***************************");
        System.out.println("Would you like to buy Daily Pass(Yes-1/No-0):");
        int yn=sc.nextInt();
        if(yn==1)
        {
            System.out.println("Enter your Name: ");
            String name=sc.next();
            System.out.println("Enter your Aadhar Card Number: ");
            String uid=sc.next();
            System.out.println("Enter your E-Mail ID: ");
            String email=sc.next();
            System.out.println("Enter your Phone Number: ");
            String phno=sc.next();
            System.out.println("Enter your Age: ");
            int age=sc.nextInt();
            System.out.println("Cost of the Daily pass is: 70 Rupees\n");
            bus.payment();
            System.out.println("Your Daily Pass Number is : "+bus.PassUID());
            System.out.println("\nHave a nice Day.");
            System.out.println("\n");
        }
    }

    public static int random()
    {
        int aN = 0;
        aN = (int)((Math.random() * 9000000)+1000000);
        return aN;
    }

    public static String PassUID()
    {
        int DIGITS = 14;
        StringBuilder sb = new StringBuilder(DIGITS);
        for(int i = 0;i < DIGITS;i++) {	
            sb.append((char) (Math.random() * 10 + '0'));
        }
        return sb.toString();
    }

    public void feedback()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t**********************");
        System.out.println("\tFeedback Page-CPTS App");
        System.out.println("\t**********************");
        System.out.println("Enter your Name: ");
        String name=sc.nextLine();
        System.out.println("Enter your E-Mail ID: ");
        String email=sc.nextLine();
        System.out.println("Enter your Phone Number: ");
        String phno=sc.nextLine();
        System.out.println("Rate from 1 star to 10 star for the feedback ");
        System.out.println("Enter your Rating: ");
        String rate=sc.nextLine();
        System.out.println("Enter your Suggestion: ");
        String sugg=sc.nextLine();
        System.out.println("Your Feedback has been recorded ");
        System.out.println("Thank You for your Feedback.");
    } 
}