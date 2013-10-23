
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author krystian
 */
public class DataFile {

    private PrintWriter writer;
    private String fName;

    public DataFile(String fileName) {
        try {
            fName = fileName;
            writer = new PrintWriter("./test/"+fileName+".txt", "UTF-8");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(DataFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void write(long inv, long comp) {
        writer.println(inv+" "+comp);
    }
    
    public void closeStream() {
        writer.close();
    }
    
    public String getFileName() {
        return fName;
    }
}
