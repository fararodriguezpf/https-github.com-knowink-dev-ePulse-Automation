import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

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

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/USERS'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Poll Pads/Poll Pads Account Filter/Account Filter'))

WebUI.click(findTestObject('SuperAdminConsole/Poll Pads/Poll Pads Account Filter/dropdown'))

WebUI.click(findTestObject('SuperAdminConsole/Poll Pads/Poll Pads Account Filter/Filter_AM-Canada'))

WebUI.delay(1)

WebUI.click(findTestObject('Common ePulse Objects/Apply Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Poll Pads/Poll Pads Account Filter/Remove_Account AM-Canada_Filter'))

WebUI.delay(2)

WebUI.closeBrowser()
