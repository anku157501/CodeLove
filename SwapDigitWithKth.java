import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    int k=sc.nextInt();
	    int n=m,j=0,c=0,s=0,t=0;
	    while(m!=0){
	        m=m/10;
	        c++;
	    }
	    int a[]=new int[c];
	    while(n!=0){
	        s=s*10+n%10;
	        n/=10;
	    }
	    for(int i=0;i<c;i++){
	            a[i]=s%10;
	            s=s/10;
	    }
	    for(int i=0;i<c;i++){
	        if(i+k-1 <=c-1){
	            t=a[i];
	            a[i]=a[i+k-1];
	            a[i+k-1]=t;
	        }
	       else{
	               t=a[i];
	               a[i]=a[(i+(k-1)-(c-1))-1];
	               a[(i+(k-1)-(c-1))-1]=t;
	       }
	  }
	   int s1=0;
	  for(int i=0;i<c;i++){
	       s1=s1*10+a[i];
	   }
	        System.out.print(s1);
	}
}


432156
5
214356
