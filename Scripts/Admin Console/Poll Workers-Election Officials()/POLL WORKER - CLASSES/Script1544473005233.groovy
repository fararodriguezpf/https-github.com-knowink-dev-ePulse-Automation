import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Open browser.'
WebUI.openBrowser('')

'Navigate to ePulse login page.'
WebUI.navigateToUrl(GlobalVariable.URL)

'Enter user name'
WebUI.setText(findTestObject('Login/Email Address'), GlobalVariable.User_email)

'Enter Password'
WebUI.setEncryptedText(findTestObject('Login/Password'), GlobalVariable.Pswrd)

'Login'
WebUI.click(findTestObject('Login/Sign In'))


WebUI.delay(1)

for (def row = 1; row <= findTestData('PollWorker - Classes').getRowNumbers(); row++) {
	
		WebUI.navigateToUrl(GlobalVariable.Poll_Workers_Classes_New)
	
		WebUI.click(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Class Information/Class Information dropdown'))
		
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Class Information/Name'),
			findTestData('PollWorker - Classes').getValue('Name', row))
		
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Class Information/Instructor'), 
		    findTestData('PollWorker - Classes').getValue('Instructor', row))
		
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Address Information/Location'), 
		    findTestData('PollWorker - Classes').getValue('Location', row))
		
		WebUI.delay(1)
		
		WebUI.doubleClick(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Class Information/Date'))
		
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Class Information/Rate'), 
		    findTestData('PollWorker - Classes').getValue('Rate', row))
		
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Class Information/Class Description'), 
		    findTestData('PollWorker - Classes').getValue('Descript', row))
		
		WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Class Information/Name'), 
		    findTestData('PollWorker - Classes').getValue('Name', row))
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Address Information/Address Information dropdown'))
		
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Address Information/Address1'), 
		    findTestData('PollWorker - Classes').getValue('Address1', row))
		
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Address Information/Address2'), 
		    findTestData('PollWorker - Classes').getValue('Address2', row))
		
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Address Information/City'), 
			findTestData('PollWorker - Classes').getValue('City', row))
		
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Address Information/State'), 
		    findTestData('PollWorker - Classes').getValue('State', row))
		
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Address Information/Zip'), 
			findTestData('PollWorker - Classes').getValue('Zip', row))
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Admin Console ePulse Menu/Poll Workers/New Poll Worker Class/Submit'))

}

WebUI.closeBrowser()

