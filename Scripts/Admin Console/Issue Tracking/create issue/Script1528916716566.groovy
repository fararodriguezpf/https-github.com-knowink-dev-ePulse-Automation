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

WebUI.navigateToUrl(GlobalVariable.Issue_Logger, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/Severity_Critical'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/Select Status'), 
    '0', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/Issue Description'), 
    'Poll Pad Issue')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/select Polling Place'), 
    '0', true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/Select Name'))

WebUI.selectOptionByIndex(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/Select Name'), 
    '1', FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/Select Caller'), 
    '1', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/select Caller Name'), 
    '1', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/Select Related Euipment'), 
    '1', true)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracking/Severity'))

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/Select Type'), 
    '1', true)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracking/a_Select...'))

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracking/li_ISAAC NEWTON ACADEMY'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Page_Epulse  AM-IA1  Issue Tracking/select_Poll1  Worker1     Poll'), '2262', 
    true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Page_Epulse  AM-IA1  Issue Tracking/select_Select...Broken Poll Pa'), '42', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Page_Epulse  AM-IA1  Issue Tracking/select_Select...    Poll Pad'), 'pad', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Page_Epulse  AM-IA1  Issue Tracking/select_testpad1    testpad2'), '1576', true)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracking/a_Assign'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracking/a_Assign_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracking/input_commit'))

WebUI.delay(1)

WebUI.closeBrowser()

