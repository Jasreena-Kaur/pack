package sorting;

import java.util.Scanner;

public class BubbleSort {
int temp, size;
int[] arr; 
public void sort()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of an array");
	size=sc.nextInt();
	arr=new int[size];
	System.out.println("Enter "+size+" Numbers");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for (int i = 0; i < size; i++) 
	{
		for (int j = 1; j < size; j++) 
		{
			if (arr[j-i]>arr[j])
			{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
			/*System.out.println("array after bubble sort");
			for(int j=0;j<size;j++)
			{
				System.out.println(arr[j]);
			}*/
		}
		

}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BubbleSort oo=new BubbleSort();
oo.sort();
	}

}
