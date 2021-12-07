package HomeWork5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private Integer[][] data;

    public static final String semicolon = ";";

    public void readFile(String fileName) {
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            ArrayList<Integer[]> lineList = new ArrayList<>();
            header = (in.readLine().split(semicolon));
            String result;
            while ((result = in.readLine()) != null)
               {String[] apSt = result.split(semicolon);
                Integer[] apIn = new Integer[apSt.length];
            for (int i = 0; i < apSt.length; i++)
                {apIn[i] = Integer.parseInt(apSt[i]);}
                lineList.add(apIn);}
            data = lineList.toArray(new Integer[][]{});}
            catch (IOException e) {e.printStackTrace();}
    }

    public void writeFile(String newFileName) {
        try {
            BufferedWriter wrt = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newFileName), StandardCharsets.UTF_8));
            StringBuffer line = new StringBuffer();

            for (String s : header) {line.append(s); line.append(semicolon);}
                 wrt.write(line.toString());
            for (Integer[] row : data) {
                line.delete(0, line.length());
            for (Integer rowDatum : row) {line.append(rowDatum);line.append(semicolon);}
                wrt.newLine(); wrt.write(line.toString());}
                wrt.flush(); wrt.close();
        } catch (IOException e) {e.printStackTrace();}
    }
    public String[] getHeader(){
        return header;
    }
    public Integer[][] getData(){
        return data;
    }
}