package services;

import java.util.Scanner;

public class GetInfoService {
    public static void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your name and surname.");
        System.out.print("Fullname: ");
        String fullname = sc.next();
        
        System.out.println("Please enter ip and port. (example: localhost:5678)");
        String fullLink = sc.next();
        
        System.out.print("Please enter file's path: ");
        String filePath = sc.next();
        
        String[] splittedLink = fullLink.split(":");
        String hostIp = splittedLink[0];
        int port = Integer.valueOf(splittedLink[1]) ;
        
        SendService.send(hostIp, port, filePath);
        
        System.out.println("The image sent successfully!!!  :)");
    }
}
