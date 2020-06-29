package com.teska.naukaJavy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    sourceOfData source;
    Employee emp;


    public static void main(String[] args) throws FileNotFoundException {
        sourceOfData source = new sourceOfData("Lukasz","Teska!");
        Employee emp =  new Employee(source);
        emp.displayName();

        readFromFile ReadFile1 = new readFromFile();
        File fileThatWillBeAccessed1 = new File("C:\\Users\\ja\\IdeaProjects\\nauka\\FileAccessTest.txt");
        ReadFile1.readFile(fileThatWillBeAccessed1);
    }
}



class sourceOfData{
    String name, surname;

    public sourceOfData(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

}

class Employee{

    sourceOfData name;

    Employee(sourceOfData name){
    this.name=name;
    }

    void displayName(){
        System.out.println(name.name + " " + name.surname);
    }



}

class readFromFile {

    public void readFile(File file2read) throws FileNotFoundException {
        Scanner fileBeingRead = new Scanner(file2read);
        while (fileBeingRead.hasNext()) {
            System.out.println(fileBeingRead.nextLine());
        }
    }
}