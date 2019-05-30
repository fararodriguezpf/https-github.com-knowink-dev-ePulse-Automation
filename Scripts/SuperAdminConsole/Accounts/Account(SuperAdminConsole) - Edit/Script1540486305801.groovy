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

WebUI.click(findTestObject('Login/am-Automation-test'))

WebUI.delay(1)

WebUI.setText(findTestObject('SuperAdminConsole/Account Creation/Account Information/Display Title'), 'AM-MO-AUTO123')

WebUI.delay(1)

WebUI.setText(findTestObject('SuperAdminConsole/Account Creation/Account Information/County'), 'AM-MO-AUTO123')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Account Information/Poll Pad 3 Version'), '2.0.1', 
    true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Select_Voter File'), 
    'boone', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Select_Supplemental file'), 
    'boone', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Select Other ImportersExporters'), 
    'boone_dream', true)

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Add Other ImportersExport'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Submit'))

WebUI.delay(1)

WebUI.closeBrowser()

