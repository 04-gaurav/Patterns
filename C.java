public class C {
    public static void main(String arsg[]) {
        int n=7;
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=n; j++) {
                if(i==0 || j==0 || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }
    }
    
}
