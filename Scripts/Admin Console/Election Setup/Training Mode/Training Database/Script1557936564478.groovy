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

WebUI.callTestCase(findTestCase('Login/AdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.navigateToUrl(GlobalVariable.Demo_DB)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Poll Pad Setup/DEMO DB/Creating Training DB/Create Database button'))

WebUI.delay(1)

WebUI.setText(findTestObject('Creating Training DB/Name for Training DB'), 'Demo DB')

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Poll Pad Setup/DEMO DB/Select Election'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Poll Pad Setup/DEMO DB/Creating Training DB/Page_Epulse am-Automation-test/Select Election Creation'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Poll Pad Setup/DEMO DB/Creating Training DB/Page_Epulse am-Automation-test/Select Pollpad Config'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Poll Pad Setup/DEMO DB/Creating Training DB/Page_Epulse am-Automation-test/Select Polling Place'))

WebUI.click(findTestObject('Creating Training DB/Training DB Modal Save Button'))

WebUI.verifyElementPresent(findTestObject('Admin Console ePulse Menu/Account Settings/Poll Pad Setup/DEMO DB/Creating Training DB/Processing indicator'), 
    0)

WebUI.delay(120)

WebUI.refresh()

WebUI.verifyElementNotPresent(findTestObject('Admin Console ePulse Menu/Account Settings/Poll Pad Setup/DEMO DB/Creating Training DB/Processing indicator'), 
    0)

WebUI.delay(1)

WebUI.closeBrowser()

