class RotateArray{
	public static void main(String args[]){
		int[] values={1,2,3,4,5,6,7},changeArray={0,0,0,0,0,0,0};
		int k=3,i,j;
		System.out.println("array elements are:");
		for(int index=0;index<values.length;index++){
			System.out.print(values[index]);
		}
		for(i=0;i<values.length;i++){
			if(i+k<values.length){
			changeArray[i+k]=values[i];
			}else{
				for(j=0;j<k;j++){
					changeArray[j]=values[i];
					i++;
				}
			}
		}
		System.out.println("\nafter changing array elements are:");
		for(int index=0;index<values.length;index++){
			System.out.print(changeArray[index]);
		}
	}
}