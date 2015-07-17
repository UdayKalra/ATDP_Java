import java.util.Scanner;
import java.util.ArrayList;
public class Sequence
{
private ArrayList<Integer> values;
public Sequence() { 
    values = new ArrayList<Integer>(); 
}
public void add(int n) {
    values.add(n); 
}
public String toString() { 
    return values.toString(); 
}
public ArrayList getList(){
    return values;
}
public Sequence append(Sequence other){
    ArrayList al = other.getList();
    for(int i =0; i<al.size(); i++){
        values.add((int) al.get(i));
    
    }
    return this;
}
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Sequence a = new Sequence();
    Sequence b = new Sequence();
    System.out.println("Enter 5 numbers for first Sequence");
    for(int i = 0;i<5;i++){
    a.add(in.nextInt());
    }
    System.out.println("Enter 5 numbers for second Sequence");
    for(int i = 0;i<5;i++){
    b.add(in.nextInt());
    }
    a.append(b);
    System.out.println("Appended Sequences: "+a.toString());
}
}