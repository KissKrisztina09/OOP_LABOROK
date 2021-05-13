package labor12_3;

import labor12_2.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Processing {
    private java.util.Map<Integer, Student>  students = new java.util.HashMap<>();

    public Processing( String filename ){
        try (Scanner scanner = new Scanner( new File( filename))){
            while( scanner.hasNextLine()){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String items[] = line.split(" ");
                int id = Integer.parseInt(items[0]);
                Student student = new Student(id, items[1], items[2]);
                students.put( id, student);
            }
           // System.out.println(students.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void Math ( String filename ){
        try (Scanner scanner = new Scanner( new File( filename))){
            while( scanner.hasNextLine()){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String items[] = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                double mathGrade = Double.parseDouble(items[1].trim());
                students.get(id).setMath(mathGrade);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void Hungarian ( String filename ){
        try (Scanner scanner = new Scanner( new File( filename))){
            while( scanner.hasNextLine()){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String items[] = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                double hungarianGrade = Double.parseDouble(items[1].trim());
                students.get(id).setHungarian(hungarianGrade);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void Romanian ( String filename ){
        try (Scanner scanner = new Scanner( new File( filename))){
            while( scanner.hasNextLine()){
                String line = scanner.nextLine();
                if( line.isEmpty() ){
                    continue;
                }
                String items[] = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                double romanianGrade = Double.parseDouble(items[1].trim());
                students.get(id).setRomanian(romanianGrade);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void Average (){
        for( int id:students.keySet()){
            students.get(id).setAverage();
        }
    }

    public void BAC(){
        int counter = 0;
        ArrayList<Student> studentsFailed = new ArrayList<>();
        for( int id:students.keySet()){
            if((students.get(id).getAverage() < 6) || (students.get(id).getHungarian() < 5) || (students.get(id).getMath() < 5)
                    || (students.get(id).getRomanian() < 5)){
                studentsFailed.add(students.get(id));
            }
            else{
                counter++;
            }
        }
        System.out.println(counter + " tanulonak sikerult az erettsegi");

        Collections.sort(studentsFailed, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                if(o1.getFristName().compareTo(o2.getFristName()) == 0){
                    return o1.getLastName().compareTo(o2.getLastName());
                }
                return o1.getFristName().compareTo(o2.getFristName());
            }
        });

        for( Student student:studentsFailed){
            System.out.println(student);
        }
    }
}
