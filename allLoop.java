public class allLoop {
    static int i=0;
    static int j=0;
    static int k=0;
    public static void main(String[] args) {
        
        while(i>0){
            System.out.println(i);
            i++;
        }
        do{
        System.out.println(j);
        j++;    
        }
        while(j<0);
        for(k=0;k>0;k++){
            System.out.println(k);
        }
        
        System.out.println("false condition");
    }
    
}
