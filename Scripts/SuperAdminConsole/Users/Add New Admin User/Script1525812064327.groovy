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

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/USERS'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/ADD_EDIT/Add Admin User'))

WebUI.delay(1)

WebUI.setText(findTestObject('SuperAdminConsole/SuperAdmin Users/ADD_EDIT/input_First name'), 'FirstN')

WebUI.delay(1)

WebUI.setText(findTestObject('SuperAdminConsole/SuperAdmin Users/ADD_EDIT/input_Last name'), 'LastN')

WebUI.delay(1)

WebUI.setText(findTestObject('SuperAdminConsole/SuperAdmin Users/ADD_EDIT/input_E-mail'), 'FirstN.LastN@knowink.com')

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/ADD_EDIT/Edit and Access Accounts_slider'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/ADD_EDIT/Create and Edit Admin User'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/ADD_EDIT/View  Manage Poll Pads_slider'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/ADD_EDIT/View and Manage Settings_slider'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/ADD_EDIT/View and Manage Reports_slider'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/ADD_EDIT/View Audit Logs_slider'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/ADD_EDIT/Restricted Account Access_slider'))

WebUI.delay(1)

WebUI.click(findTestObject('Common ePulse Objects/Submit Button'))

WebUI.closeBrowser()

