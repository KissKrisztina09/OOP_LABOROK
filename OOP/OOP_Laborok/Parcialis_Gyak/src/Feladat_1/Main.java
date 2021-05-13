package Feladat_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Informatika felvetelizo = new Informatika();
        felvetelizo.ujBeiratkozo(new Diak("Mezei", "Mária", 7.56, 8.78));
        felvetelizo.ujBeiratkozo(new Diak("Asztalos", "Imre", 8.45,  7.25));
        felvetelizo.listazOsszes();
        System.out.println("******************************");

        Scanner scanner = null;
        try{
            scanner = new Scanner(new File("Parcialis_Gyak/felveteli_gyak.txt"));
            System.out.println("try blokk");
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Nem talalhato fajl!");
            //kilepes a programbol;
            System.exit(1);
        }


        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.isEmpty()){
                continue;
            }
            String [] items = line.split(" ");
            String vnev = items[0].trim();
            String knev = items[1].trim();
            double erettsegi = Double.parseDouble(items[2].trim());
            double matematika = Double.parseDouble(items[3].trim());
            felvetelizo.ujBeiratkozo(new Diak(items[0].trim(), items[1].trim(), Double.parseDouble(items[2].trim()), Double.parseDouble(items[3].trim())));
        }
        felvetelizo.listazAtlag(8);
        System.out.println("Felvetelizok szama: " + felvetelizo.felvetelizokSzama() + ", atlag: " + felvetelizo.felvetelizokAtlaga());
    }
}
