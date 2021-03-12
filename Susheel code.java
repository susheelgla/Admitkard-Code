import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N2=sc.nextInt();
		int X2=sc.nextInt();
		int Y2=sc.nextInt();
		int T2=sc.nextInt();
		ArrayList<Integer> a1=new ArrayList<>();
		
		for(int i=1;i<=N2;i++){
		    if(i%X2==0){
		        a1.add(i);
		    }
		}
		ArrayList<Integer> b1=new ArrayList<>();
		
		for(int j=1;j<=N2;j++){
		    if(j%Y2==0){
		        b1.add(j);
		    }
		}
		for(int k=0;k<a1.size();k++){
		    for(int l=0;l<b1.size();l++){
		        if(a1.get(k)+b1.get(l)==T2){
		            System.out.println(a1.get(k)+","+b1.get(l));
		            
		        }
		    }
		}
	}
}
