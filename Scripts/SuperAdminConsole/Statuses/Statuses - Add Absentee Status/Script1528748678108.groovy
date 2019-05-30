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

WebUI.click(findTestObject('SuperAdminConsole/STATUS/STATUSES'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/STATUS/Add Status'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/STATUS/Selet_Voter Type'), 'absentee', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/STATUS/Select Absentee Status'), '17', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/STATUS/select_Color'), '2', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/STATUS/select_Allowed to Vote'), 'false', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/STATUS/Select Confirm ID Scan'), 'false', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/STATUS/Select_Name Shown on Voter Lookup'), 'true', true)

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/STATUS/SAVE'))

WebUI.delay(1)

WebUI.closeBrowser()

