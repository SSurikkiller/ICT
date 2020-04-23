import java.util.*;
import java.util.Scanner;
public class BubbleBlue {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	final int sz = 4;
	int cur_sz, temp;
	int[] x = new int[sz];
	int i;
	for(i=0;i<sz;i++){
			x[i] = input.nextInt();
	}
	
	for(cur_sz=sz;cur_sz>1;cur_sz--)
		for(i=0;i<cur_sz-1;i++)
			if(x[i]>x[i+1]){
				temp=x[i];
				x[i]=x[i+1]; 
				x[i+1]=temp;
			}
	System.out.print(Arrays.toString(x));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}