package gitt;

public class Gitt {

	public static void main(String[] args) {
		int[] array = {32,27,64,18,95,14,90,70,60,37};
		
		System.out.printf("%s%8s%n","Index","Value");
		int j=9;
		for(int i=0;i<array.length/2;i++) {
			int temp=array[i];
			array[i]=array[j];
			array[j]=+temp;
			j--;
		}
		
		
		for(int counter=0;counter<array.length;counter++) {
			System.out.printf("%5d%8s%n",counter,array[counter]);
		}
		
		
		
		
		
		
	}

}
