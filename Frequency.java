class Frequency{
public static void main(String args[]){
	int array[]={2,3,2,6,3,5},count=0;
	System.out.println("array elements are:");
	for(int index=0;index<array.length;index++){
		System.out.print(array[index]+" ");
	}
	for(int index=0;index<array.length;index++){
		if(array[index]==3)
			count++;
	}
	System.out.println("\nfrequency is:"+count);
}
}