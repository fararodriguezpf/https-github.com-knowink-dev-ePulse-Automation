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

WebUI.callTestCase(findTestCase('Login/AdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.navigateToUrl(GlobalVariable.Users, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Users/Add User'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Add User/input_First name'), 'add')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Add User/input_Last name'), 'User')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Add User/input_Phone'), '3137777777')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Add User/input_E-mail'), 'addnew2-user@knowink.com')

WebUI.delay(1)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Add User/Select Epulse User'), '1', 
    true)

WebUI.delay(1)

not_run: WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Add User/Select Notify by'), 
    '2', true)

not_run: WebUI.delay(1)

not_run: WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Add User/Select User Rights'), 
    'basic', true)

not_run: WebUI.delay(1)

WebUI.click(findTestObject('Common ePulse Objects/Submit Button'))

WebUI.closeBrowser()

