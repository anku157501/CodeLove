public class Pyramid {
    public static void main(String[] args) {
        int n=120,m=90,k=n/2;
        int l=n/2;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <=l; j++) {
                if (j <k) {
                    //System.out.print(j);
                    System.out.print(" ");

                }
                else{
                if(n%2==0){
                    if((i+j)%2==0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
            }
                else {
                    if ((i + j) % 2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }}
        }k--;l=l+1;
            System.out.println();
    }

    }

}
