package labor12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Storage {
    private java.util.Map<Integer, Product>products = new java.util.TreeMap<>();

    public Storage( String filename ){
        try (Scanner scanner = new Scanner( new File( filename))){
            while( scanner.hasNextLine()){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String items[] = line.split(" ");
                int id = Integer.parseInt(items[0]);
                Product product = new Product(id, items[1], Integer.parseInt(items[2]), Integer.parseInt(items[3]));
                products.put(id, product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void update( String filename ){
        try (Scanner scanner = new Scanner( new File( filename));){
            int counter = 0;
            while( scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String items[] = line.split(" ");
                int id = Integer.parseInt(items[0]);
                int amount = Integer.parseInt(items[1]);
                Product product = products.get(id);
                if( product == null ) {
                    continue;
                }
                product.updateAmount( amount );
                ++counter;
            }
            System.out.println(filename +": " + counter + " updates");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}