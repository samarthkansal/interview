package geeksforGeeks;

public class LargestlengthConti {

	int [] arr = {19,19,21,22,23,24,25,26,26,30,31};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LargestlengthConti l= new LargestlengthConti();
		l.find();
		l.display();
	}
	int [] secarr;
	
	public void find(){
		int flag=0;
		secarr= new int[arr.length];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]+flag == arr[j]){
					flag++;
					secarr[i]++;
				}
				
				
			}
			flag=0;
		}
		
		
	}
	public void display(){
		for(int i =0 ; i < secarr.length;i++){
			System.out.println(secarr[i]);
		}
	}
	
	

}
