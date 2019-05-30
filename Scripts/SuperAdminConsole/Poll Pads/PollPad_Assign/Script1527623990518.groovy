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

WebUI.callTestCase(findTestCase('Login/SuperAdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Poll Pads/POLL PADS link'))

WebUI.delay(1)

WebUI.setText(findTestObject('SuperAdminConsole/Poll Pads/Test PollPad table search'), 'Test Pollpad')

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Poll Pads/Add Poll Pad Options/Assign/edit pad-AM-Mississippi'))

WebUI.delay(1)

'Click account dropdown'
WebUI.click(findTestObject('SuperAdminConsole/Poll Pads/Add Poll Pad Options/Account'))

WebUI.delay(1)

'Select Account'
WebUI.click(findTestObject('SuperAdminConsole/Poll Pads/Add Poll Pad Options/Assign/Account(am-Automation-test)'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Poll Pads/Add Poll Pad Options/Election'))

WebUI.click(findTestObject('SuperAdminConsole/Poll Pads/Add Poll Pad Options/Assign/Election(Election Creation)'))

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/Poll Pads/Add Poll Pad Options/Polling Places'))

WebUI.click(findTestObject('SuperAdminConsole/Poll Pads/Add Poll Pad Options/Assign/Polling Place(MATHEWS DICKEY)'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('SuperAdminConsole/Poll Pads/Add Poll Pad Options/Assign/Select Configuration'), 
    'Automation Created Config', true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Save'))

WebUI.delay(1)

WebUI.closeBrowser()

