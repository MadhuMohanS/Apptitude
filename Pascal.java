class Pascal{
	static int fact(int n){
		if(n==0 || n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String args[]){
		int i,j,n=5,res=0;
		for(i=0;i<n;i++){
			for(j=0;j<n-i;j++){
				System.out.print(" ");
			}
					for(j=0;j<=i;j++){
						res=fact(i)/(fact(i-j)*fact(j));
						System.out.print(res+" ");
					}
			System.out.println();
		}
	}
}