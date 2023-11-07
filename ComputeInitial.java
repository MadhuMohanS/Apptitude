class ComputeInitial{
public static void main(String args[]){
	String names[]={"Madhu Mohan S","Kiran R","Manoj K"};
	String name="Madhu Mohan S";
	int arraylength=names.length;
	for(int i=0;i<arraylength;i++){
		if(names[i]==name){
			int length=name.length();
			System.out.println(names[i]+" initial is:"+names[i].charAt(length-1));
		}
	}
}
}