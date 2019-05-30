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

WebUI.navigateToUrl(GlobalVariable.Automation_Account, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/Create Issue'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/Severity_Critical'))

WebUI.delay(1)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/Select Status'), '0', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/Status Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/div_Status'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/select_All'), '1', true)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/Status Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/div_Status'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/select_All'), '2', true)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/Status Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/div_Type'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/Type Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/li_Type Broken Poll Pad'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/div_Type'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/select_Broken Poll Pad'), '41', true)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/Type Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/li_Type Broken Printer'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/div_Polling Place'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/Polling Place Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/div_Polling Place'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/a_ALBURNETT METHODIST CHURCH'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/li_ISAAC NEWTON ACADEMY'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/Polling Place Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/div_Assigned User'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/Assigned Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/li_Assigned User ePulse User'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/div_Assigned User'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/a_ePulse User'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/div_Dispatched Tech'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/Dispatched Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/li_Dispatched Tech Rover Tech'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/a_active icn icn-display-list'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/a_icn icn-display-map'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/div_slider'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Issue Tracker/div_slider'))

WebUI.delay(1)

WebUI.closeBrowser()

