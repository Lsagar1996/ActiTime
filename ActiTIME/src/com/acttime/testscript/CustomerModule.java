package com.acttime.testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.acttime.generic.BaseCls;
import com.acttime.generic.FileLib;
import com.acttime.pom.EnterTimeTrackPage;
import com.acttime.pom.LoginPage;
import com.acttime.pom.TaskListPage;

@Listeners(com.acttime.generic.ListenerImplementation.class)

public class CustomerModule extends BaseCls{

	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException {
		Reporter.log("createCustomer",true);
		FileLib f=new FileLib();
		String expectdCustName = f.getExcelData("CreateCustomer", 1, 2);
		String enterCustDesc = f.getExcelData("CreateCustomer", 1, 3);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTaskTb();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCust().click();
		t.getEnterCustName().sendKeys(expectdCustName);
		t.getEnterCustDesc().sendKeys(enterCustDesc);
		t.getSelectCustDrpDn().click();
		t.getOurCmpOpt().click();
		t.getCrtCustBtn().click();
		String actlCustCrtd = t.getActualCustCrtd().getText();
		Assert.assertEquals(actlCustCrtd, expectdCustName);	
	}
}
