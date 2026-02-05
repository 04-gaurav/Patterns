class SquareL {
    public static void main(String args[]) {
        
        for(int i=1; i<=7; i++) {
            System.out.println("      "+"g"+"   ");
        }
        for(int j=1; j<=7; j++) {
            for(int k=1; k<=7; k++) {
                System.out.print("* ");
            }
            if(j==4) {
                for(int a=1; a<=7; a++) {
                    System.out.print("g ");
                }
            }
            System.out.println(" ");
        }
    }
}