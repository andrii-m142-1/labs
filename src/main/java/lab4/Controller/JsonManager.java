package lab4.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lab4.Model.University;

import javax.annotation.processing.Filer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class JsonManager {
    University oldUniversity;

    public JsonManager(){}

    public String writeFile(University oldUniversity) throws FileNotFoundException, JsonProcessingException {
        Gson gson = new Gson();
        String resultJson =gson.toJson(oldUniversity);
        System.out.println(resultJson);
        File file_out= new File("file_out.txt");
        PrintWriter pw = new PrintWriter(file_out);
        pw.println(resultJson);
        pw.close();
        return "file_out.txt";
    }

    public University readFile(String name) throws FileNotFoundException, JsonProcessingException {
        Gson gson = new Gson();
        FileReader fr = new FileReader(name);
        Scanner scan = new Scanner(fr);
        University university  = gson.fromJson(fr,University.class);
        return university;
    }



}
