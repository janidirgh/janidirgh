class BinarySearch
{
	public static void main(String args[]){
	 int c=14;
	 int a[]={11,13,14,15,16,18,19,20,21,24};

	 int f=0;
	 int l=a.length;
	 if(c<a[l-1]){
	 while(f<=l){
		int mid=(f+l)/2;
		if(a[mid]>c)
		{
			l=mid-1;
		}
		else if(a[mid]==c){
			System.out.println(c+" is at number position "+ (mid+1));
			break;
		}
		else{
			f=mid+1;
		}

	 }
	}
	else{
		System.out.println(c+" is not found in array.");
	}
}
}