package labor10_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("Labor_10/students.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }
        PrintStream printStream = null;
        try {
            printStream = new PrintStream("Labor_10/warning.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(2);
        }

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String items [] = line.split(",");
            if(items.length < 7){
                System.out.println("Incomplete line: " + line);
                continue;
            }
            //NeptunId, firstname, lastname, credits, birthyear, birthmonth, birthday
            int credits = 0;
            try{
                credits = Integer.parseInt(items[3].trim());
            }catch(NumberFormatException e){
                System.out.println("Number format exception: " + line + "CREDITS: " + items[3]);
                continue;
            }
            int year, month, day;
            try{
                year = Integer.parseInt(items[4].trim());
            }catch (NumberFormatException e){
                System.out.println("Number format exception: " + line + "YEAR " + items[4]);
                continue;
            }
            try{
                month = Integer.parseInt(items[5].trim());
            }catch (NumberFormatException e){
                System.out.println("Number format exception: " + line + "MONTH " + items[5]);
                continue;
            }
            try{
                day = Integer.parseInt(items[6].trim());
            }catch (NumberFormatException e){
                System.out.println("Number format exception: " + line + "DAY " + items[6]);
                continue;
            }
            if( !DateUtil.isValidDate(year, month, day)){
                System.out.println("Invalid date: "+ " " + year + " " + month + " " + day);
                continue;
            }
            if(credits < 30){
                printStream.println(line);
            }
        }
    }
}
