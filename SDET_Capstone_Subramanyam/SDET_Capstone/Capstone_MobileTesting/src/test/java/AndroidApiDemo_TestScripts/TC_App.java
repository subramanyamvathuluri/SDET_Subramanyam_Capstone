package AndroidApiDemo_TestScripts;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import AndroidApiDemo_Pages.TP_AppPage;

public class TC_App extends TestBase {
	@Test
	public void f() throws InterruptedException {

		TP_AppPage app = new TP_AppPage(driver);
		
		app.getapp().click();
		Thread.sleep(2000);
		app.getActivity().click();
		Thread.sleep(2000);
		app.getCustomTitle().click();

		try {
			//Workbook workbook1 = WorkbookFactory.create(new FileInputStream("input.xlsx"));3
			Workbook workbook = WorkbookFactory.create(new File("C:/Users/SVATHULURI/eclipse-workspace/Seliniumjava/Capstone_MobileTesting/src/test/java/AndroidApiDemo_TestScripts/input.xlsx"));
			Sheet sheet = workbook.getSheetAt(0);
			

			for (Row row : sheet) {
				
				//Left
				Thread.sleep(2000);
				app.getleft().click();
				Thread.sleep(2000);
				app.getleft().clear();
				app.setleft1().sendKeys(row.getCell(0).toString());
				Thread.sleep(2000);
				app.getChangeLeft().click();
				
				//Right
				Thread.sleep(2000);
				app.getright().click();
				Thread.sleep(2000);
				app.getright().clear();
				app.setright1().sendKeys(row.getCell(1).toString());
				Thread.sleep(2000);
				app.getChangeRight().click();
				Thread.sleep(2000);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		
		
		

	}
}
