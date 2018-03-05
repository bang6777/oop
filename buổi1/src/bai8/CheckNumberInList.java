package bai8;

import java.util.Scanner;

public class CheckNumberInList {
	int[] list;
	int x;
	public CheckNumberInList() {
		this.setList(list);
		this.setX(x);
	}
	
	public int[] getList() {
		return list;
	}

	public void setList(int[] list) {
		this.list = list;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	

	public CheckNumberInList(int[] list, int x) {
		this.list = list;
		this.x = x;
	}
	
	Scanner Sc = new Scanner(System.in);

	public static void sort(int [] list) {
        int temp = list[0];
        for (int i = 0 ; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
        }
	public void checkNumber(int[] list,int x) {
		int count = 0;
		int i = 0;
		for(i = 0; i < list.length; i++) {
			if(list[i] == x) {
				count++;
			}
		}
		System.out.println("So luong x trong list la: "+ count);
	}
	
	public static void show(int mangSoThuc[]) {
		System.out.println("after sort ");
		for (int i = 0; i < mangSoThuc.length; i++) {
            System.out.print(mangSoThuc[i] +" " );
        }		
	}
}
