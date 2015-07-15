
public class Sequence
{
private int[] values;
public int[] getValues(){
    return values;
}
public Sequence(int size) {
    values = new int[size]; 
}
public void set(int i, int n) { 
    values[i] = n; 
}
public boolean equals(Sequence other){
    int[] otherVal = other.getValues();
    int len = values.length;
    if(otherVal.length != len){
    return false;
    }
    for(int i=0;i<len;i++){
    if(values[i]!=otherVal[i]){
    return false;
    }
    }
    return true;
}
public static void main(String[] args){
    
    System.out.println("Expected: true");
    Sequence one = new Sequence(5);
    one.set(0, 4);
    one.set(1, 6);
    one.set(2, 1);
    one.set(3, 7);
    one.set(4, 3);
    Sequence two = new Sequence(5);
    two.set(0, 4);
    two.set(1, 6);
    two.set(2, 1);
    two.set(3, 7);
    two.set(4, 3);
    System.out.println(one.equals(two));
    
    
    System.out.println("Expected: false");
    Sequence three = new Sequence(5);
    three.set(0, 4);
    three.set(1, 6);
    three.set(2, 4);
    three.set(3, 7);
    three.set(4, 3);
    Sequence four = new Sequence(5);
    four.set(0, 4);
    four.set(1, 2);
    four.set(2, 1);
    four.set(3, 7);
    four.set(4, 3);
    System.out.println(three.equals(four));
}
}