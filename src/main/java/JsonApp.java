package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JsonApp {
    public static void main(String[] args) {
        init();
    }
    
    public static void init(){
        List<Contact> contactList = new ArrayList<>();
        
        try{
            List<String> contactFileStrings = Files.readAllLines(Path.get(
                    "src/main/java/contacts.txt"));
        } catch(IOException e){
            System.out.println("idk man");
        }
        
        
        // make contact and add to the list
//
        List<Contact> contactList =
                new Gson().fromJson(contactFileStrings.get(0),
                        new TypeToken<List<Contact>>(){}.getType());
        
        for(Contact c: contactList){
            System.out.println(c.getPrintableString());
        }
        
            // i really don't know man:
//        for(int i =0; i< 30; i++){
//            Contact contact new Contact(i,"Laura" , "Laura",
//                    "12312312343");
//        }
        
        //
        Contact newC = new Contact(31, "yo", "yo", "123123123");
        contactList.add(newC);
//
//        contactList.add(contact);
//
//        List<String> contactStringList = new ArrayList<>();
        String contactString = new Gson().toJson(contactList);
        contactStringList.add(contactString);
//
        try {
            Files.write(
                    Paths.get("src/main/java/contacts.txt"), contactString,
                    StandardOpenOption.APPEND);
        } catch (IOException e){
//            System.out.println(" contact added");
//            e.printStackTrace;
        }
//
//
        System.out.println("new contact added");
        
    }
}
