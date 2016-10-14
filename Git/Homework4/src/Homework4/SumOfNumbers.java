package Homework4;

public class SumOfNumbers {
	public void Sumofnumbers(int num){
		int sum=0;
		
		for(int i=1; i<=num; i++){
			sum+=i;
		}
		
		System.out.printf("총 합은  %d 입니다.",sum);

	}
	
}
