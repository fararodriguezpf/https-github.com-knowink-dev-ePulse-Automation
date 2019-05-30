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
import com.kms.katalon.core.webui.keyword.builtin.CloseBrowserKeyword as CloseBrowserKeyword
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login/AdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.Registered_Voters)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Status_Filter'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Select Status'), 'IA', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Apply_Filters Status'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Close_Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Status_Filter'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Select Status'), 'A', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Apply_Filters Status'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Close_Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Status_Filter'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Select Status'), 'IE', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Apply_Filters Status'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Close_Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Absentee_Filter'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Select Absentee'), 'R', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Apply_Filters Absentee'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Close_Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Absentee_Filter'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Select Absentee'), 'S', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Apply_Filters Absentee'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Close_Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Vote Status_Filter'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Select Voted Status'), 
    'voted', true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Apply_Filters Voter_Status'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Close_Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Vote Status_Filter'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Select Voted Status'), 
    'not_voted', true)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Apply_Filters Voter_Status'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Close_Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Vote Status_Filter'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Select Voted Status'), 
    'provisional', true)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Apply_Filters Voter_Status'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Close_Filters'))

WebUI.delay(1)

WebUI.closeBrowser()

