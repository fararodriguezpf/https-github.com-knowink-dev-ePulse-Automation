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

WebUI.navigateToUrl(GlobalVariable.Issue_Type, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Tracking - Create Issue/Add Type'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Type/Name'), 'New Type')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Type/Election group'), 'All', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Type/Prompt_issue'), 'New Type')

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Issue Tracking/Issue Type/Save'))

WebUI.delay(1)

WebUI.closeBrowser()

