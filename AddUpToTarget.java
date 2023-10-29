class AddUpToTarget{
	public static void main(String args[]){
		int array[]={2,7,11,15},target=26;
		System.out.println("array elements are:");
		for(int index=0;index<array.length;index++){
			System.out.print(array[index]+" ");
		}
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(array[i]+array[j]==target){
					System.out.println("\nyou found two numbers "+array[i]+" "+array[j]+" which suits for the target "+target);
				    System.out.println("indices are "+i+" "+j);
					return;
				}
			}
		}
	}
}