public class lowerHalfPyramid {
    public static void main(String args[]) {
        int n=5;
        for(int i=1; i<=n; i++) {
            System.out.println();

            for(int j=1; j<=(i*1-1); j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=(n-i)*2;k++) {
                System.out.print("*");
            }
        }
    }
    
}
