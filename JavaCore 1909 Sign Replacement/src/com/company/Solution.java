package com.company;

/*

1909 Sign Replacement
Read 2 file names from the console.
The first file contains text.
Read the contents of the first file and replace all dots "." on the sign "!".
Output the result to the second file.
Close streams.

Requirements:
1. The program should read the file names from the console (use BufferedReader).
2. BufferedReader must be closed for reading data from the console.
3. The program should read the contents of the first file (use BufferedReader with the FileReader constructor).
4. The stream of reading from the file (BufferedReader) should be closed.
5. The program should write to the second file the contents of the first file, where all the dots "." Are replaced on the sign "!" (Use BufferedWriter with the FileWriter constructor to write to the file).
6. The write stream to the file (BufferedWriter) must be closed.


*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = conReader.readLine();
        String fileName2 = conReader.readLine();
        conReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        while(fileReader.ready()) {
            String s = fileReader.readLine();
            fileWriter.write(s.replace('.','!'));
        }
        fileWriter.close();
        fileReader.close();
    }
}




