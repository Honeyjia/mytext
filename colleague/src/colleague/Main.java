package colleague;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		int[] a = new int[5];
		int min = a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i] = in.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		for(int i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}*/
//		Scanner in = new Scanner(System.in);
//		System.out.println("请输入数组大小：");
//		int N = in.nextInt();
//		int[] array = new int[N];
//		for(int i=0;i<array.length;i++) {
//			array[i] = in.nextInt();
//		}
//		for(int i=0;i<array.length-1;i++){
//			int min=i;      
//			for(int j=min+1;j<array.length;j++){
//				if(array[j]<array[min]){
//					min=j;
//				}
//			}
//			int t=array[i];
//			array[i]=array[min];
//			array[min]=t;
//		}
//		for(int i=0;i<array.length;i++) {
//			System.out.print(array[i]+" ");
//		}
		int a[]=new int[] {7,8,9,5,6,3,2,1,0};
		   for(int x=0;x<a.length;x++) {
			   for(int y=0;y<a.length-1;y++) {
				   if(a[y]>a[y+1]) {
					   int temp=a[y];
					   a[y]=a[y+1];
					   a[y+1]=temp;					   
				   }
			   }   
		   }
		   print(a);
	   }
	   public static void print(int temp[]) {
		   for(int x=0;x<temp.length;x++) {
			   System.out.println(temp[x]+"\t");
		   }
		   System.out.println();
	   }

		
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		String t="";
//		if(n>=0 && n<=(int)(Math.pow(2, 31))) {
//			while(n!=0) {
//				t+=n%2;
//				n/=2;
//			}
//		}
//		String t1="";
//		for(int i=t.length()-1;i>=0;i--) {
//			t1+=t.charAt(i);
//		}
//		System.out.println(t1.length());
//		int p=0;
//		for(int i=0;i<t1.length();i++) {
//			char s=t1.charAt(i);
//			if(s=='1') {
//				p=32-(t1.length()-i);
//				break;
//			}
//		}
//		System.out.println(p);
		
	}	
