package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class NewFile1 {
	

        static String str="";

        public static String listFilesForFolder( File folder) {
            for (File fileEntry : folder.listFiles()) {
                if (fileEntry.isDirectory()) {

                    listFilesForFolder(fileEntry);
                } else {
                    String name = fileEntry.getName();
                    System.out.println(name);
                    if (name.endsWith(".txt")) {
                        
                        String fullName = "/home/gayathri/Desktop/checkfile/";
                        fullName = fullName.concat(name);
                        InputStream fins = null;
                        try {
                            fins = new FileInputStream(fullName);
                            byte file_content[] = new byte[1024];
                            int read_count = 0;
                            while ((read_count = fins.read(file_content)) > 0) {
                                str=str.concat((new String(file_content, 0, read_count - 1)));

                            }

                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                if (fins != null)
                                    fins.close();
                            } catch (Exception ex) {

                            }
                        }

                    }
                }
            }
            return str;


        }

            }




