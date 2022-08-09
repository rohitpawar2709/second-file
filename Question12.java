package com.practiceQue;
//second largest no. in array
public class Question12 {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("second largest number="+a[1]);
	}

}
