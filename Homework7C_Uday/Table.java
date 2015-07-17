import java.util.Scanner;
public class Table
{
static Scanner in = new Scanner(System.in);
private static int[][] values;
static int a=0;
static int b=0;
static int c=0;
static int d=0;
static int e=0;
static int f=0;
static int g=0;
static int h=0;
static int i=0;
private static int[] row;
private static int[] col;
static int totalRows = 0;
static int totalCols = 0;
public Table(int rows, int columns) { 
    values = new int[rows][columns]; 
    row = new int[rows];
    col = new int[columns];
    totalRows = rows;
    totalCols = columns;
}
public static void set(int i, int j, int n) { 
values[i][j] = n;

}
/*public static void neighborAverage(int row, int column){
   if((column==0&&(row==0||row==2)||(column==2&&(row==0||row==2)))){
   System.out.println("There are only three neighbors.");
   }
   else if((column==0&&row==1)||(column==1&&(row==0||row==2))||(column==2&&row==1)){
    System.out.println("There are only five neighbors.");
    }
   else if(row==1&&column==1){
    System.out.println("The average of the neighbors is: "+((a+b+c+d+e+f+g+h)/8));
    }
    //error
    if(row<0||row>2){
    System.out.println("The argument is invalid.");
    }
    if(column<0||column>2){
    System.out.println("The argument is invalid.");
    }
}   */
public static void main(String[] args){


    
    Table tab = new Table(3,3);
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter 9 values, each separated by enter: ");
    a = in.nextInt();
    set(0,0,a);
    b = in.nextInt();
    set(0,1,b);
    c = in.nextInt();
    set(0,2,c);
    d = in.nextInt();
    set(1,0,d);
     i = in.nextInt();
    set(1,1,i);
    e = in.nextInt();
    set(1,2,e);
    f = in.nextInt();
    set(2,0,f);
    g = in.nextInt();
    set(2,1,g);
    h = in.nextInt();
    set(2,2,h);
   System.out.println();
   System.out.println("Array:");
   System.out.println(a+" "+b+" "+c);
   System.out.println(d+" "+i+" "+e);
   System.out.println(f+" "+g+" "+h);

    System.out.println("Please enter the desired row(0-2): ");
    int x = in.nextInt();
    System.out.println("Please enter the desired column(0-2): ");
    int y = in.nextInt();
  //  neighborAverage(x,y);
    tab.resetRowsCols();
    tab.computeRowsCols(x, y);
    System.out.println("Average : " + tab.computeAverage(x, y));
}

private double computeAverage(int inpr, int inpc){//Computes average of naighbors.
    double sum = 0;
    double count = 0;
    for ( int r =0; r < totalRows; r++) {
        int x = row[r];
        if( x== -1)
            break;
            
        for(int c = 0; c < totalCols; c++){
           
           int y = col[c];
           
           if(y == -1)
            break;
            if(x == inpr && y == inpc) {//skip the actual row/col and only add neighbors
                continue;
            }
            System.out.println("X/y: " + x + "/" + y); 
            
           sum = sum + values[x][y];
           count++;
        }
    }
    
    return sum/count;
}

private void computeRowsCols(int r, int c){    //computes the algorithm for the finding neighbors based on dimensions.
    int rowcount = 0;
    
    row[rowcount] = r;
    rowcount++;
    if(r -1 >= 0){
        row[rowcount] = r - 1;
        rowcount++;
    }
    
    if((r+1) <= totalRows-1){
        row[rowcount] = r + 1;
    }    
    
    int colcount = 0;
    col[colcount] = c;
    colcount++;
    if(c -1 >= 0){
        col[colcount] = c - 1;
        colcount++;
    }
    if(c+1 <= totalCols-1)
        col[colcount] = c + 1;
 
        
}

private void resetRowsCols(){ //Initializes arrays to -1.
    for ( int i = 0; i < totalRows; i++){
         row[i] = -1;
    }
    for ( int j =0; j < totalCols; j++) {
        col[j] = -1;
    }
}

}