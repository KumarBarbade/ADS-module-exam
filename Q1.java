import java.util.*;

class Sorting{
	
	void insertionSort(int a1[]){
		int n1= a1.length;
		int temp=a1[n1-1];
		for(int i=n1-2;i>=0;i--){
			
		if(a1[i]>temp){
			
			a1[i+1]=a1[i];
			System.out.println();
			for(int j=0;j<n1;j++){
				System.out.print(a1[j]+" ");
			}
		}
		else{
			a1[i+1]=temp;
			System.out.println();
			for(int j=0;j<n1;j++){
				System.out.print(a1[j]+" ");
			}
			break;
		}
		}
		
	}
	
	
		

public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	int a1[] = new int[n];
	
	if(n>=1  && n<=1000){
	for(int i=0;i<n;i++){
		a1[i] = sc.nextInt();
	}
	}
	Sorting s1= new Sorting();	
	s1.insertionSort(a1);
	
	
}
}


	
	
