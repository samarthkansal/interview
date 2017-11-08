package geeksforGeeks;

import java.sql.Time;

public class GCD {

	private int array [ ];
	private int index=0;
	private int count[ ]=new int[30];
	private int div[ ]=new int[30];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCD g = new GCD();
		long start= System.currentTimeMillis();
		
		g.findGCD();
		g.displayGCD();

		long end= System.currentTimeMillis();
		System.out.println("Time Taken:::"+(end-start));
		
	}

	GCD(){
		array = new int[7];
		
		array[0]=2;
		array[1]=4;
		array[2]=3;
		array[3]=9;
		array[4]=6;
		array[5]=12;
		array[6]=18;
	}
	
	private void findGCD(){
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(i!=j){
				
					if(array[j]%array[i]==0){
						count[index]=array[j]/array[i];
						index++;
					}
					
						
				}
				
			}
			count[index]=-1;
			index++;
		}
	}
	
	private void displayGCD(){
		for(int i=0;i<index;i++){
			System.out.println(count[i]);
		}
	}
}
