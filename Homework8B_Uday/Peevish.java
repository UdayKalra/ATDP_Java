public class Peevish {
    public static void main(String[] args) {
        boolean[] door;
 final int DOOR_BEYOND = 101; // We will not use door[0]
 final boolean OPEN = true;
 final boolean CLOSED = false; 
 door = new boolean[DOOR_BEYOND]; 
 
 for (int i = 0; i < DOOR_BEYOND; i++)
 {
 door[i] = CLOSED;
 } 

        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {
                if(j % i == 0){ 
                    door[j] = !door[j];
                    
                }
                
                
                }
                System.out.println("\nClosed: ");
        for(int j =1;j<100;j++){
        if(door[j]==CLOSED){
                    System.out.print(j+", ");
                }
                
         
                
        }
        System.out.println("\nOpen: ");
        for(int k =1;k<100;k++){
        if(door[k]==OPEN){
                    System.out.print(k+", ");
                }
                
         
                
        }
                
                }
        
        }
        
}
