import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    int n=sc.nextInt();
	    int a[][]=new int[m][n];
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            a[i][j]=sc.nextInt();
	        }
	    }
	    int max=0;
	    for(int i=0;i<m;i++){
	        max=a[i][0];
	        for(int j=0;j<n;j++){
	            if(max<a[i][j])
	            max=a[i][j];
	        }
	        System.out.print(max+" ");
	    }
	}
}

3 3
1 2 3
4 5 6
7 8 9

3 6 9
