import java.util.Scanner;
public class Theater{
    static Scanner in = new Scanner(System.in);
    static int[][] theaterChart;
    public static void printChart(int[][] chart){
    for(int i=0; i<chart.length; i++)
       {
           for(int j=0; j<chart[i].length; j++)
           {
               if (j>0)
                   System.out.print("\t");
                   System.out.print(chart[i][j]);
           }
           System.out.println();
       }
    } 
    public static void main(String[] args){
    theaterChart = new int[][]{
          { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
          { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, 
          { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, 
          { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, 
          { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, 
          { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
          { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
          { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
          { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 }};
          for(int i=0; i<theaterChart.length; i++)
       {
           for(int j=0; j<theaterChart[i].length; j++)
           {
               if (j>0)
                   System.out.print("\t");
                   System.out.print(theaterChart[i][j]);
           }
           System.out.println();
       }
        
        String answer = "";
        while(!answer.equals("q")){ //repeat until q is pressed
        System.out.print("Would you like to pick by seat or price? q to quit: ");
        answer = in.next();
        if(answer.equals("price")){
        System.out.print("Please enter a price 10-50: ");
            int price = in.nextInt();
  boolean found = false;
             first: for (int i=0;i<9;i++)
                for (int j=0;j<10;j++){
                    if (theaterChart[i][j]==price)
                        { theaterChart[i][j]=0; found = true; break first; } //break out outer loop.
                        
                }
            printChart(theaterChart);
            if(found){
                System.out.println("Your seat has been reserved.");//successful
            }else{System.out.println("Sorry! All seats for the price have been reserved.");}
        
    } else if(answer.equals("seat")){
       System.out.print("What row would you like to sit on?(1 is bottom): ");
       int row = in.nextInt();
       row = Math.abs(row-9); //Convert given row to the proper array format.
       System.out.print("What seat of that row would you like to sit in?(1 is left.): ");
       int column = in.nextInt();
       column = column-1; //Because the order starts with 0, 1 must be subtracted.
       if (theaterChart[row][column]!=0)
       {
           theaterChart[row][column] = 0;
           printChart(theaterChart);
           System.out.println("Your seat has been reserved.");//successful
       }
       else { System.out.println("That seat has already been reserved."); }//already bought
        }
        
    }
    System.out.println("Have a Nice Day!");
    }
}