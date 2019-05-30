import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

WebUI.callTestCase(findTestCase('Login/SuperAdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SuperAdminConsole/Account Creation/a_Add Account'))

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Account Information/Display Title'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Account Information/County'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Account Information/County Code'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Account Information/Country'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Account Information/StateProvince'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Account Information/TimeZone'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Account Information/Pad Type'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Account Information/Poll Pad 3 Version'), 
    0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Account Information/Select Seal'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Account Information/Scan ID'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Account Information/Manual Entry ID'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Misc Options/Election Night Results'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Misc Options/Gateway Enabled'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Misc Options/Absentee Requests'), 
    0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Misc Options/Sort Place Code As Number'), 
    0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Misc Options/Allow Multiple Unaffiliated Ballots'), 
    0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Locales/Available Locales - Select'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Locales/Default Locale Selector'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Select_Voter File'), 
    0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Select_Supplemental file'), 
    0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Polling Places'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Street Rules'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Voter History Exporter'), 
    0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Signature Parser'), 
    0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Add Other ImportersExport'), 
    0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Select Other ImportersExporters'), 
    0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/CANCEL'), 0)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('SuperAdminConsole/Account Creation/Parsers and Exporters/Submit'), 0)

WebUI.delay(1)

WebUI.closeBrowser()

