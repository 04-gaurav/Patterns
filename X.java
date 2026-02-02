public class X {
    public static void main(String[] args) {
        int n=4;
        for(int i=0; i<=n; i++) {
            System.out.println(" ".repeat(i)+"*" + "  ".repeat(n-i)+"*");
        }

         for(int j=0; j<=n; j++) {
            System.out.println(" ".repeat(n-j)+"*" + "  ".repeat(j)+"*");
        }
    }
    
}
