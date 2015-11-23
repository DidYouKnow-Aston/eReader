package eReader;

import java.util.Scanner;

public class runTest {
	
	private static Scanner keyboard;

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		System.out.println("enter the book path");
		keyboard = new Scanner(System.in);
		String path = keyboard.nextLine();
		Loader load = new Loader(path);
		Ebook ebook = new Ebook(load.getBook());
	}
}
