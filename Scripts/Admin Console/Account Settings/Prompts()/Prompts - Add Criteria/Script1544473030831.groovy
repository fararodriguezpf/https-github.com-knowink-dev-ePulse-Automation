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

WebUI.delay(1)

WebUI.navigateToUrl(GlobalVariable.Prompts, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Click [Criteria] link to existing prompt'
WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Add_CRITERIA_To_Prompt'))

WebUI.delay(1)

'Selects [Voter Status] from "Add Criteria\' dropdown'
WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Add Criteria Dropdown'), 
    'status_id', true)

WebUI.delay(1)

'Adds Voter Status = Active criteria'
WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Add Criteria(Plus Sign)'))

WebUI.delay(1)

'Select Voter Status reason from from Add Criteria dropdown'
WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Add Criteria Dropdown'), 
    'voter_status_reason', true)

WebUI.delay(1)

'Select Voter Status reason \'=\''
WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Voter Status Reason Operator'), 
    '1', true)

WebUI.delay(1)

'Input value for Voter Status reason'
WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Voter Status Reason Input Field'), 
    'Voted')

WebUI.delay(1)

'Adds Voter Status Reason criteria'
WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Add Criteria(Plus Sign)'))

WebUI.delay(1)

'Select "Voter over 18" from Add Criteria dropdown'
WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Add Criteria Dropdown'), 
    'voter_over_18', true)

WebUI.delay(1)

'Add "Voter over 18" Criteria'
WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Add Criteria(Plus Sign)'))

WebUI.delay(1)

'Select Party Affiliation from Add Criteria dropdown'
WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Add Criteria Dropdown'), 
    'voter_party', true)

WebUI.delay(1)

'Adds Party Affiliation criteria'
WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Add Criteria(Plus Sign)'))

WebUI.delay(1)

'Selects "Absentee Status" from Add Criteria dropdown\n'
WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Add Criteria Dropdown'), 
    'voter_absentee_information', true)

WebUI.delay(1)

'Select Absentee Status Value'
WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Absentee Status Type'), 
    'S', true)

WebUI.delay(2)

'Adds Absentee Criteria'
WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Add Criteria(Plus Sign)'))

WebUI.delay(1)

'Selects "Absentee Status" from Add Criteria dropdown\n'
WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Add Criteria Dropdown'), 
    'voter_absentee_information', true)

WebUI.delay(1)

'Select Absentee Status Value'
WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Absentee Status Type'), 
    'R', true)

WebUI.delay(2)

'Adds Absentee Criteria'
WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Add Criteria(Plus Sign)'))

WebUI.delay(1)

'Save Criteria'
WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Criteria Modal/Save'))

WebUI.closeBrowser()

