package project17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        System.out.println("============= CREATING A FILE ==============");

        try {
            File myObj = new File("file.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Ввести информацию

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== WRITING IN FILE ===========");
        System.out.print("Enter a text: ");

        try {
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write(scanner.nextLine());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Прочитать и вывести информацию

        System.out.println("============ READING FROM FILE ==============");

        try {
            File myObj = new File("file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Заменить информацию

        System.out.println("=========== WRITING IN FILE AGAIN =============");

        try {
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write(scanner.nextLine());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("============ READING FROM FILE AGAIN ==============");

        String data = "";

        try {
            File myObj = new File("file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Добавить в конец файла новую информацию

        System.out.println("=========== WRITING IN FILE FOR THE LAST TIME =============");

        try {
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write(data + scanner.nextLine());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("============ READING FROM FILE FOR THE LAST TIME ==============");

        try {
            File myObj = new File("file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String newData = myReader.nextLine();
                System.out.println(newData);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}