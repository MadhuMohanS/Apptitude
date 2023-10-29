class ChangePosition{
	public static void main(String args[]){
		int array[]={1,2,3,4,5},changeArray[]={0,0,0,0,0},position=3;
		System.out.println("array elements are:");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		for(int i=0;i<array.length;i++){
			if(i+position<array.length){
			changeArray[i+position]=array[i];
			}else{
				for(int j=0;j<position;j++){
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