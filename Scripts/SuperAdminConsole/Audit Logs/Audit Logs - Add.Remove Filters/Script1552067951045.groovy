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

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/AUDIT LOGS link'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Filter Buttons/User Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/User Filter Dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Select alonzo.mackknowink.com'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Filters Apply buttons/User Apply Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Remove Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Filter Buttons/Election Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Logs/Select General Election'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/SuperAdminConsole/Audit Logs/Logs/input'), '')

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Logs/Select linncounty 11-2'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Filters Apply buttons/Election Apply Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Logs/Remove Election Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Filter Buttons/Account Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Logs/Account dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Logs/Select am-Automation-test'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Filters Apply buttons/Account Apply Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Logs/Remove ACCOUNT Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Filter Buttons/Action Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Logs/Select All'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/SuperAdminConsole/Audit Logs/Logs/li_Super Admin Client Account'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Filters Apply buttons/Action Apply Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/SuperAdminConsole/Audit Logs/Logs/span_Action Super Admin Client'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Filter Buttons/Created At Filter'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/SuperAdminConsole/Audit Logs/Logs/select_More than'), 'pre', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Filters Apply buttons/Created AT Apply Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/SuperAdminConsole/Audit Logs/Logs/span_Created At Less than 10 m'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Filter Buttons/Created At Filter'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/SuperAdminConsole/Audit Logs/Logs/select_More than'), 'post', 
    true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/SuperAdminConsole/Audit Logs/Logs/select_More than'), 'pre', 
    true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/SuperAdminConsole/Audit Logs/Logs/select_minutes ago'), 'hour', 
    true)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/SuperAdminConsole/Audit Logs/Logs/input_Created At_filter_create'), '1')

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Filters Apply buttons/Created AT Apply Filter'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/SuperAdminConsole/Audit Logs/Logs/span_Created At Less than 1 ho'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Download'))

WebUI.delay(20)

WebUI.click(findTestObject('SuperAdminConsole/Audit Logs/Audit Logs Modal Download_button'))

WebUI.delay(1)

WebUI.closeBrowser()

