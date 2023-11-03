class ListOfSheep{
	static int countOfSheeps(boolean list[]){
		int count=0;
		System.out.println("starting countOfSheeps in ListOfSheep");
		
		if(list==null){
			System.out.println("please enter the values in the list");
			return 0;
		}
		for(int index=0;index<list.length;index++){
			if(list[index]==true){
				count++;
			}
		}
		
		
		System.out.println("ending countOfSheeps in ListOfSheep");
		return count;
	}
	public static void main(String args[]){
		int res;
		boolean sheepList[]={true,true,true,false,true,true,true,true,true,false,true,false,true,false,false,true,true,true,true,true,false,false,true,true};
		System.out.println("starting main in ListOfSheep");
		res=countOfSheeps(sheepList);
		System.out.println("total no of sheeps are:"+sheepList.length);
		System.out.println("no of sheeps present are:"+res);
		System.out.println("no of sheeps absent are:"+(sheepList.length-res));
		System.out.println("ending main in ListOfSheep");
	}
}