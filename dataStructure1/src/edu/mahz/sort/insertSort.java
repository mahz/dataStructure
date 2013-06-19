package edu.mahz.sort;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Random;

import com.excellence.bigusercenter.interactive.address.vo.AddressVO;

public class insertSort {
	
	//public int[] datas = {0, 49, 38, 65, 97, 76, 13, 27, 49};
	
	int datasLength;
	
	public insertSort(int datasLength){
		this.datasLength = datasLength;
	}
	
	public int[] getDatas(int length){
		int[] datas = new int[length];
		Random r = new Random();
		for(int i = 0; i < length; ++i ){
			datas[i] = r.nextInt(1000000);
		}
		return datas;
	}
	
	public void insertSort(){
		int[] datas = getDatas(datasLength);
		//System.out.println("≈≈–Ú«∞");
		//System.out.println(Arrays.toString(datas));
		long startTime = System.currentTimeMillis();
		
		for(int i = 1; i < datas.length; i++){
			for(int j = 0; j <= i; j++){
				if(datas[i] < datas[j]){
					int tem = datas[i];
					for(int k = i; k > j; k--){
						datas[k] = datas[k-1];
					}
					datas[j] = tem;
				}
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime));
		//System.out.println("≈≈–Ú∫Û");
		//System.out.println(Arrays.toString(datas));
	}
	
	public void insertSort0(){
		int[] datas = getDatas(datasLength);
		//System.out.println("≈≈–Ú«∞");
		//System.out.println(Arrays.toString(datas));
		long startTime = System.currentTimeMillis();
		for(int i = 2; i < datas.length; ++ i ) {
			if(datas[i] < datas[i - 1]){
				datas[0] = datas[i];//…Ë÷√…⁄±¯
				int k = i - 1;
				for(; datas[0] < datas[k]; --k ) {
					datas[k + 1] = datas[k];
				}
				datas[k + 1] = datas[0];
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime));
		//System.out.println("≈≈–Ú∫Û");
		//System.out.println(Arrays.toString(datas));
	}
	
	public void insertSort1(){
		int[] datas = getDatas(datasLength);
		//System.out.println("≈≈–Ú«∞");
		//System.out.println(Arrays.toString(datas));
		long startTime = System.currentTimeMillis();
		for(int i = 2; i < datas.length; ++ i ) {
			if(datas[i] < datas[i - 1]){
				datas[0] = datas[i];//…Ë÷√…⁄±¯
				datas[i] = datas[i - 1];
				int k = i - 2;
				for(; datas[0] < datas[k]; --k ) {
					datas[k + 1] = datas[k];
				}
				datas[k + 1] = datas[0];
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime));
		//System.out.println("≈≈–Ú∫Û");
		//System.out.println(Arrays.toString(datas));
	}

	public static void main(String[] args) throws RemoteException {
		insertSort test = new insertSort(1000000);
		//test.insertSort();
		System.out.println("--------------------------------");
		test.insertSort0();
		System.out.println("--------------------------------");
		test.insertSort1();
	}
}
