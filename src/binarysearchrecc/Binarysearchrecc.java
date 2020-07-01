package binarysearchrecc;

public class Binarysearchrecc {
private	int[] arr;
	public Binarysearchrecc(int[] arr){
		this.arr=arr;
	} public boolean binaryseachrecc(int searchel, int  low ,int high){
		boolean res = false;
		 low =0;
		 high = arr.length-1;
		if(low<=high){
			int mid =(low+high)/2;
			if(searchel==arr[mid]){
				res = true;
			} else if(searchel<arr[mid]){
				res = binaryseachrecc(searchel,low,mid-1);
			} else {
				res = binaryseachrecc(searchel,mid+1,high);
			}
		} return res;
	}
}
