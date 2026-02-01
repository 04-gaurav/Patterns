public class V {
    public static void main(String[] args) {
        int n=5;
       
        for(int i=0; i<n; i++){
            System.out.println("*" +"  ".repeat(n-i)+"*");
        }
        
        System.out.print(" ".repeat((2*n+1)/2)+"*");
    }
    
}
