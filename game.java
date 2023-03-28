import java.util.Random;
import java.util.Scanner;
public class App {
    public static int Score=0,j=0;
    int random()
    {
        Random r = new Random();
        return  r.nextInt(100);
    }
    void game()
    {
        int rand,flag=0,i=0;
        j++;
        System.out.println("Round "+j+" starts...");
        Scanner sc=new Scanner(System.in);
        rand=random();
        System.out.println(rand);
        do
        {
            System.out.println("Entered the guess number");
            int num=sc.nextInt();
            if(num>100)
            {
                System.out.println("the number is less than 100");
            }
            else if(num<1)
            {
                System.out.println("the number is greater than 1");
            }
            else if(num>=1 && num<=100)
            {
                if(num>rand)
                {
                    if((num-rand)>10){
                    System.out.println("Extremely greater number");}
                    else{
                        System.out.println("slightly greater number");
                    }
                }
                else if(num<rand)
                {
                    if((rand-num)>10)
                    System.out.println("Extremely lower number");
                    else{
                        System.out.println("slightly low number");
                    }
                }
                if(num==rand)
                {
                    System.out.println("Congratulations!!! you have guessed the right number: "+num);
                    flag=1;
                    switch(i)
                {
                    case 0:
                        Score=Score+100;
                        System.out.println("Your Score : "+Score);
                        break;
                    case 1:
                        Score=Score+80;
                        System.out.println("Your Score : "+Score);
                        break;
                    case 2:
                        Score=Score+50;
                        System.out.println("Your Score : "+Score);
                        break;
                    default:
                        Score=Score+0;
                        System.out.println("Your Score : "+Score);
                        break;
                }
                    break;
                }
                else
                {
                    System.out.println("you have entered the wrong number");
                }
            }
            i++;
        }while(i<3);
        if(flag==0)
        {
            System.out.println("Opps, better luck next time");
            System.out.println("you have exhausted all your chances");
            Score=Score+0;
            System.out.println("Your Score : "+Score);
        }
    }
    public static void main(String[] args) throws Exception {
        App a=new App();
        System.out.println("Welocme to number Guessing Game");
        do{
        System.out.println("1.new round");
        System.out.println("2.exit");
        System.out.println("enter your choice");
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        switch(value)
        {
            case 1:
                a.game();
                break;
            case 2:
                System.exit(0);
            default:
                System.out.println("wrong entered");
        }
    }while(true);
    }
}