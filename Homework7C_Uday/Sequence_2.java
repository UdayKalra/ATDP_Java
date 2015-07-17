import java.util.Scanner;
import java.util.ArrayList;
public class Sequence_2
{
private ArrayList<Integer> values;
public Sequence_2(){ 
    values = new ArrayList<Integer>(); 
}
/*public Sequence_2 mergeSorted(){
This is the sort merge method. -Uday
/*  }*/
public void add(int n) {
    values.add(n); 
}
public String toString() { 
    return values.toString(); 
}
public ArrayList getList(){
    return values;
}

public Sequence_2 mergeSorted(Sequence_2 other){
    //find the longest sorted prefix for values
    int[][] valuesOrder = new int[10][2];
    findSortedPrefix(values, valuesOrder);
    
    System.out.println("Sort Order prefix for values : ");
    for ( int c=0; c < 10; c++){
        if(valuesOrder[c][0] == -1)
            break;
        System.out.println("Count: " + valuesOrder[c][0] + " Index: " + valuesOrder[c][1]);
    }
    
    int startIndexValue = 0;
    int valueCount = 0;
 

    for( int u = 0; u < 10; u++){
       int count = valuesOrder[u][0];
       int index = valuesOrder[u][1];
       
       if(count == -1) {
           break;
       }
           if(count > valueCount){
               valueCount = count;
               startIndexValue = index;
               System.out.println("Values - Setting MAX count/index to : " + valueCount + "/" + startIndexValue);
            }    
    }
           
    
    
    //find the longest sorted prefix for other.values
    ArrayList othervalues = other.getList();
    int[][] otherOrder = new int[10][2];
    findSortedPrefix(othervalues, otherOrder);
    
    System.out.println("Sort Order prefix for othervalues : ");
    for ( int c=0; c < 10; c++){
        if(otherOrder[c][0] == -1)
            break;
        System.out.println("Count: " + otherOrder[c][0] + " Index: " + otherOrder[c][1]);
    } 
    
    int startIndexOtherValues = 0;
    int otherValueCount = 0;
    for( int u = 0; u < 10; u++){
       int count = otherOrder[u][0];
       int index = otherOrder[u][1];
       
       if(count == -1) {
           break;
       }
           if(count > otherValueCount){
               otherValueCount = count;
               startIndexOtherValues = index;
               System.out.println("Other - Setting MAX count/index to : " + otherValueCount + "/" + startIndexOtherValues);
            }    
   }
           
    //Merge
      for(int y = startIndexOtherValues; y < (startIndexOtherValues + otherValueCount); y++){
        int otherVal = (int)othervalues.get(y);
        System.out.println("merging from 2nd arraylist sorted value: " + otherVal);
       for ( int x = startIndexValue; ; x++){
         //  System.out.println("x : " + x);
           if(x == valueCount){
            values.add(otherVal);
            break;
         }
           
           int initial = (int)values.get(x);
          // System.out.println("x : " + initial);
         
         if(initial >= otherVal){
             values.add(x, otherVal);
             valueCount++;
             break;
         }
         
       } 
       
    }
    
    System.out.println("\nOriginal sequence merged with longest sorted prefix from 2nd sequence is : " );
    for (int d = 0; d < values.size(); d++){
        System.out.println(values.get(d));
    }
    return this;
    
}
private void findSortedPrefix(ArrayList arr, int[][] sortOrder){
       //get the largest sorted sequence in values
   
    initAndReset(sortOrder);
    int arrindex1 = 0;
    int origval1 = 0;
    int count1 = 0;
    int index1 = 0;
    for ( int c=0; c < arr.size(); c++){
        int val = (int)arr.get(c);
        
       // System.out.println("Orig/Val : " + origval1 + "/" + val);
        if( val > origval1 ){
            origval1 = val;
        }else{
            origval1 = val;
           // System.out.println("Saving : " + count1 + "  " + index1);
            sortOrder[arrindex1][0] = count1;
            sortOrder[arrindex1][1] = index1;
            index1 = c;
            count1 = 0;
            arrindex1++;
        }
           count1++; 
    }
    sortOrder[arrindex1][0] = count1;
    sortOrder[arrindex1][1] = index1;
    /*
    for ( int c=0; c <= arrindex1; c++){
        System.out.println(sortOrder1[c][0] + "/" + sortOrder1[c][1]);
    }
    */
}

public Sequence_2 append(Sequence_2 other){
  
    ArrayList al = other.getList();
    for(int i =0; i<al.size(); i++){
        values.add((int) al.get(i));
    
    }
    return this;
}

private void initAndReset(int [][] arr){
    for( int i = 0; i < 10; i++){
        arr[i][0] = -1;
        arr[i][1] = -1;
    }
}

public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Sequence_2 a = new Sequence_2();
    Sequence_2 b = new Sequence_2();
    System.out.println("Enter 5 numbers for first Sequence");
    for(int i = 0;i<5;i++){
    a.add(in.nextInt());
    }
    System.out.println("Enter 5 numbers for second Sequence");
    for(int i = 0;i<5;i++){
    b.add(in.nextInt());
    }
    //a.append(b);
    //System.out.println("Appended Sequences: "+a.toString());
   a.mergeSorted(b);
}
}