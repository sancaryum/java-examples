package deneme;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Mainimiz {

	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	Say�Listesi liste = new Say�Listesi(10);
	
	liste.ekle(5, 0);
	liste.ekle(2, 0);
	liste.ekle(1, 0);
	liste.ekle(4, 0);
	liste.ekle(5, 0);
	liste.ekle(22, 0);
	liste.ekle(8, 0);
	liste.ekle(0, 0);
	liste.ekle(33, 0);
	
	liste.yaz();
	System.out.println();
	System.out.println("K���kten B�y��e");
	
	liste.selectionSort();
	liste.bubbleSort();
	
	
	
	

//	System.out.println();
//	System.out.println("B�y�kten K����e");
//	liste.selectionSortTers();
//	liste.yaz();
	
	

	
	
	
	
	
	
	
	
	
	
	}
	
	
}
	



