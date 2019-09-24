package com.payment;

import java.util.Scanner;

public class UserInputService {
    
    private Scanner scanner = new Scanner(System.in);
    
    public String getUserInput(){
        return Integer.valueOf(scanner.nextLine());
    }
    
}
