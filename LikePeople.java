class LikePeople{
static void CountLike(String[] likes){
	for(int i=0;i<likes.length;i++){
		System.out.println(likes[i]+" likes this");
	}
	
}
public static void main(String args[]){
	String names[]={"peter","Jacob","Alex","Max","John","Mark"},likes[]=null;
	for(int i=0;i<names.length;i=i+2){
		names[i]=true;
	}
	for(int i=0;i<names.length;i++){
		if(names[i]==true)
			likes[i]=names[i];
	}
	CountLike(likes);
}
}