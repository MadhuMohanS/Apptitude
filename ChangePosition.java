class ChangePosition{
	public static void main(String args[]){
		int array[]={1,2,3,4,5},changeArray[]={0,0,0,0,0};
		System.out.println("array elements are:");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		for(int i=0;i<array.length;i++){
			if(i+2<array.length){
			changeArray[i+2]=array[i];
			}else{
				for(int j=0;j<2;j++){
					changeArray[j]=array[i];
					i++;
				}
			}
		}
		System.out.println("\nafter changing array elements are:");
		for(int i=0;i<array.length;i++){
			System.out.print(changeArray[i]+" ");
		}
	}
}