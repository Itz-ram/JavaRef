package com.core.s7.controlstatements.hw;

public class AdminGuestMode {

	public static void main(String[] args) {
		boolean isAdmin = false;
		boolean isGuest = false;
		if (args[0].contains("--admin")) {
			isAdmin = true;
		}
		if (args[0].equals("--guest")) {
			isGuest = true;
		}
		if (!(isAdmin && isGuest)) {
			if (isAdmin) {
				System.out.println("Hello, Admin!");
			} else if (isGuest) {
				System.out.println("Hello, Guest!");
			} 
		} else {
			System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		}
	}

}