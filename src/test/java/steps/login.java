package steps;

import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import page.createcontact;

public class login 
{
    private final createcontact contact=new createcontact();
    private final vsctest test=new vsctest();
    WebDriver driver;
   @Test
    public void create_contact()
    {
                    contact.vscoder();
              
    }
    
  @Test
    public void retrieve_data() throws IOException
    {
        //test.vscode();
        String filepath="D:\\Software\\JavaWorkspace\\vscode\\Cred.xlsx";
        excelutil.setexcelFile(filepath, "Steps");
        for(int i=0;i<2;i++)
        {
            String saction = excelutil.getexceldata(i, 1);
            System.out.println("value is : "+ ""+saction);

        }
    }
}
