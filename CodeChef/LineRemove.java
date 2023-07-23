/*
Problem Statement:
when I copy paste from the Console Logs(Terminal) to Notepad 
it shows Empty Line after each logs so the file have large nos of line 
In order to avoid the Empty(blank) Line
*/

import java.io.*;
import java.util.Scanner;

class LineRemove
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream in = null;
        FileWriter out = null;
      
        try
        {
            in = new FileInputStream("C:\\Users\\rmaria459\\Documents\\vscode workspace\\sample.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            out = new FileWriter("C:\\Users\\rmaria459\\Documents\\vscode workspace\\sample_crt.txt");

            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                if (strLine.isEmpty()){
                    System.out.println("EmptyLine Found");
                }
                else{ 
                    out.write(strLine+"\n");
                }
            }
            //Close the input stream
            br.close();

            System.out.println("reading and writing successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            if(in!=null)
            {
                in.close();
            }
            if(out!=null)
            {
                out.close();
            }
        }
    }
}
