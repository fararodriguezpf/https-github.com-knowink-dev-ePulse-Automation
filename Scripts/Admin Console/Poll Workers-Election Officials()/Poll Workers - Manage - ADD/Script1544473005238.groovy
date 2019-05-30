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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

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

for (def row = 1; row <= findTestData('PollWorker - Add').getRowNumbers(); row++) {
	
    WebUI.navigateToUrl(GlobalVariable.Poll_Workers)

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/Poll Workers (Actions Options)/Actions'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/Poll Workers (Actions Options)/Add Poll Worker'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/New Poll Worker/Personal Information/Personal Information dropdown'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/New Poll Worker/Personal Information/input_First Name'), 
        findTestData('PollWorker - Add').getValue('FirstName', row))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/New Poll Worker/Personal Information/input_Middle Name'), 
        findTestData('PollWorker - Add').getValue('MiddleName', row))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/New Poll Worker/Personal Information/input_Last Name'), 
        findTestData('PollWorker - Add').getValue('LastName', row))

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/New Poll Worker/Personal Information/Party Select/Select DEM'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/New Poll Worker/Personal Information/Status Select/Select Active'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/New Poll Worker/Poll Pad Login/Poll Pad Login Dropdown'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/New Poll Worker/Poll Pad Login/input_Username'), 
        findTestData('PollWorker - Add').getValue('UserName', row))

    WebUI.delay(1)

    WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/New Poll Worker/Poll Pad Login/Select Poll Worker Type'), 
        '0', false)

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/New Poll Worker/Poll Pad Login/input_Password'), 
        findTestData('PollWorker - Add').getValue('Password1', row))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/New Poll Worker/Poll Pad Login/input_Confirm Password'), 
        findTestData('PollWorker - Add').getValue('Password2', row))

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers - Manage Page/New Poll Worker/Submit Poll Worker'))

    WebUI.delay(1)

    
}


WebUI.verifyTextPresent('PW', true)
WebUI.closeBrowser()

