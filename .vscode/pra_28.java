import java.io.*;
public class pra_28 {
    public static void main(String[] args) {
     
        String wordToFind = "example"; 

      
        Integer lineNumber = 0; 
        boolean found = false;
        File f=new File("sample.txt");
     
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;

            while ((line = br.readLine()) != null) {
              ++lineNumber; 
                if (line.contains(wordToFind)) {
                    System.out.println("Found \"" + wordToFind + "\" in line " + lineNumber + ": " + line);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("The word \"" + wordToFind + "\" was not found in the file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}