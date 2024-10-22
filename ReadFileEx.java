package com.sks.read.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class ReadFileEx {
    public static void main(String[] args) {
        Path  filePath = Paths.get("Example.txt");
        //Reading a File Line by Line
//        try {
//            List<String> lines = Files.readAllLines(filePath);
//            for(String line : lines) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        //Using Streams to Read a File
//        try(Stream<String> stream = Files.lines(filePath)) {
//            stream.forEach(System.out::println);
//
//        } catch(IOException e) {
//            throw new RuntimeException(e);
//        }
        //Reading File into a Byte Array
        try {
            byte[] bytes = Files.readAllBytes(filePath);
            String content = new String(bytes);
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
