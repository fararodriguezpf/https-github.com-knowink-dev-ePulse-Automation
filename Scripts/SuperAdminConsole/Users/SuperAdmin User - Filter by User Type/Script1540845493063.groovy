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

WebUI.callTestCase(findTestCase('Login/SuperAdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/USERS'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/User Type Dropdown'))

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/SuperAdmin Users/select_User Type'), 'both', false)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/UserType Apply Filters'))

WebUI.delay(2)

WebUI.click(findTestObject('Common ePulse Objects/Remove_Filter'))

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/User Type Dropdown'))

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/SuperAdmin Users/select_User Type'), 'super_admin', true)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/UserType Apply Filters'))

WebUI.delay(2)

WebUI.click(findTestObject('Common ePulse Objects/Remove_Filter'))

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/User Type Dropdown'))

WebUI.selectOptionByValue(findTestObject('SuperAdminConsole/SuperAdmin Users/select_User Type'), 'regular', true)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/UserType Apply Filters'))

WebUI.delay(2)

WebUI.click(findTestObject('Common ePulse Objects/Remove_Filter'))

WebUI.delay(2)

WebUI.closeBrowser()

