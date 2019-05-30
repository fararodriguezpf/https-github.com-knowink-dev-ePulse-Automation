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

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/USERS'))

WebUI.delay(1)

WebUI.setText(findTestObject('Common ePulse Objects/table-search'), 'firstn')

WebUI.delay(1)

WebUI.click(findTestObject('SuperAdminConsole/SuperAdmin Users/User_firstn.lastnknowink.com'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Common ePulse Objects/Actions(Gear icon)'))

WebUI.delay(1)

WebUI.click(findTestObject('Common ePulse Objects/Delete Button'))

WebUI.delay(1)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Common ePulse Objects/table-search'), 'firstn')

WebUI.closeBrowser()

