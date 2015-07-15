
/**
 * Write a description of class E7_2_Class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMethods
{
private int[] values;
int size = 0;
public ArrayMethods(int[] initialValues) { 
    values = initialValues; 
    size = values.length;

}
public void swapFirstAndLast() { 
    
    int lastVal = values[size -1];
    int firstVal = values[0];
    values[0]=lastVal;
    values[size-1]=firstVal;

}
public void evenToZero(){
for(int i = 0; i<size;i++){
    if(values[i]%2==0){
            values[i]=0;
        }
    }

}
public void shiftRight() {
    int pos1 = 0;
    int pos2 = 0;
    for(int i=0;i<size;i++){
            if(i==0)pos1=values[i];
                pos2=values[i+1];
                values[i+1]=pos1;
                pos1=pos2;
            if(i+1==size-1){
                    values[0]=pos2;
                    break;
}
}
}
public void getArray(){
    for(int i =0; i<size;i++){
           System.out.println(values[i]);
     }

}
public static void main(String[] args){
    int[] arr={21,30,41,50};
    ArrayMethods jarr = new ArrayMethods(arr);
    System.out.println("Initial Array: ");
    jarr.getArray();
    System.out.println("After Swap(First and Last): ");
    jarr.swapFirstAndLast();
    jarr.getArray();
    System.out.println("After Right Shift and Swap(First and Last): ");
    jarr.shiftRight();
    jarr.getArray();
    System.out.println("After Even to Zero: ");
    jarr.evenToZero();
    jarr.getArray();
}
}
