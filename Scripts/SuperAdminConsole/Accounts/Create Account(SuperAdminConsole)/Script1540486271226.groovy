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

WebUI.callTestCase(findTestCase('Login/SuperAdminLogin',), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Account Creation/a_Add Account'))

WebUI.delay(1)

WebUI.setText(findTestObject('SuperAdminConsole/Account Creation/Account Information/Display Title'), 'am-Automation-test')

WebUI.delay(1)

WebUI.setText(findTestObject('SuperAdminConsole/Account Creation/Account Information/County'), 'am-Automation-test')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Account Information/StateProvince'), 'MO', 
    true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Account Information/Pad Type'), '1', true)

WebUI.delay(1)

not_run: WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Account Information/Poll Pad 3 Version'), 
    '1.0.1', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Select_Voter File'), 
    'mcvr', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Select_Supplemental file'), 
    'mcvr', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Polling Places'), 'epulse', 
    true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Street Rules'), 'mcvr', 
    true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Voter History Exporter'), 
    'mcvr', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Signature Parser'), 'epulse', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Submit'))

WebUI.delay(1)

WebUI.closeBrowser()

