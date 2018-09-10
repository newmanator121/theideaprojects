//package INFO3103.Assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class URLClass {
    public static void main(String[] args) {
        /**
         * Global Variables
         */
        Scanner scan = new Scanner(System.in);
        String protocol;
        String domainName;
        String documentPath;
        int portNum;



        //Getting the Protocol
        System.out.println("Please enter either https or https all lowercase   ");
        protocol = scan.next();

        //Getting the domain
        System.out.println("Please enter the domain name, EX: wizards.cs.unb.ca ");
        domainName = scan.next();

        //Getting the document path
        System.out.println("Please enter the document path, EX: /index.html ");
        documentPath = scan.next();

        //Getting the port number
        System.out.println("Please enter the port number, EX: 80 ");
        portNum = scan.nextInt();

        /**
         * Used for error checking
         System.out.println(protocol);
         System.out.println(documentPath);
         System.out.println(portNum);
         System.out.println(domainName);
         */
        String passURL = protocol + "://" + domainName + documentPath;
        System.out.println(passURL);

        try {
            java.net.URL theURL = new java.net.URL(protocol, domainName, portNum, documentPath);
            System.out.println("HERE    " + theURL.toString());
            BufferedReader in = new BufferedReader(new InputStreamReader(theURL.openStream()));

            //Print out the webpage into the terminal
            String input;
            while((input = in.readLine()) != null) {
                System.out.println(input);
            }
            in.close();

            //Will open a stream to the webpage using URL java methods and puts it into the users Desktop directory
            Path pth = Paths.get(System.getProperty("user.home"),"Desktop", "index.html.html");
            InputStream urlFileIn = theURL.openStream();
            Files.copy(urlFileIn,pth,StandardCopyOption.REPLACE_EXISTING);


        }catch(MalformedURLException e) {
            System.out.println("Something is wrong with the URL " + e.getMessage());
        }
        catch(IOException IOE) {
            System.out.println("Something threw an I/O exception  " + IOE.getMessage());
        }
    }//end of main

}//end of class
