import java.util.Scanner;

public class Game {
    private int _randomNumber;

     public Game(){
         int number_1=0;
         int number_2 =10;
         this._randomNumber=number_1+(int)(Math.random()*number_2);
     }



    public void Play(){

         for (int i=0;i<3;i++) {

                 System.out.println("Input a number");
                 Scanner in = new Scanner(System.in);
                 int num = in.nextInt();

                 if(this._randomNumber==num) {
                     System.out.println("You're right");
                     System.out.println("Game's over");

                     break;

                 }
                 else {
                     System.out.println("Wrong");
                     if(i==2){
                         System.out.println("Game's over");
                     }
                 }



         }


         }





    }



