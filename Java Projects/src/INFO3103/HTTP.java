//package INFO3103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class HTTP {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String protocol;
        String domainName;
        String documentPath;
        int portNum;
        CharSequence compare1 = "http";
        CharSequence compare2 = "https";
        String command;



        //Getting the Protocol
        System.out.println("Please enter either https or https all lowercase   ");
        protocol = scan.next();

        /**
         if(protocol.contains(compare1) == false) {
         System.out.println("Please enter either HTTP or HTTPS   ");
         protocol =scan.next();
         }

         else if(protocol.contains(compare2) == false) {
         System.out.println("Please enter either HTTP or HTTPS   ");
         protocol =scan.next();
         }

         else{}
         */

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
        System.out.println(protocol);
        System.out.println(documentPath);
        System.out.println(portNum);
        System.out.println(domainName);
         */
        String passURL = protocol + "://" + domainName + documentPath;
        System.out.println(passURL);

        try {
            URL theURL = new URL(protocol, domainName, portNum, documentPath);
            System.out.println("HERE    " + theURL.toString());
            BufferedReader in = new BufferedReader(new InputStreamReader(theURL.openStream()));
            String[] terminalCommand = new String[] {"xterm -hold -e ","wget -O AlexTest.html " + theURL.toString()};

            String input;
            while((input = in.readLine()) != null) {
                System.out.println(input);
            }
            in.close();

            ProcessBuilder pb = new ProcessBuilder("xterm","wget -O ~/Desktop/AlexTest.html" + theURL.toString());
            Process p = pb.start();
            p.waitFor();

        }catch(MalformedURLException e) {
            System.out.println("Caught a bad URL OH No!" + e.getMessage());
        }
        catch(IOException IOE) {
            System.out.println("Caught a bad URL Connection OH No!" + IOE.getMessage());
        }
        catch(InterruptedException IOE) {
            System.out.println("Interrupt   " + IOE.getMessage());
        }

        //Grab the file using wget
       // Runtime newTerminal = new Runtime.getRuntime();
        //newTerminal.exec("wget" + theURL.get )
        //wget -O index.html [URL]


    }//end of main

}//end of class