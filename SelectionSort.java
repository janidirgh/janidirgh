class SelectionSort
{
	public static void main(String args[]){
		int a[]={33,18,20,15,24,19,14,11,29,30,23,21};
		int x=0;
		
	      for(int i=0;i<a.length;i++){
			int temp=a[i];
		for(int j=i+1;i<a.length;j++)
		{
		   
			if(a[j]<temp)
			{
			   temp=a[j];
			   x=j; 
			}
		}
  		int y=a[i];
		a[i]=a[x];
		a[x]=y;
	      }
		for(int k=0;k<a.length;k++){
		System.out.println(a[k]);
	      }
	}
}