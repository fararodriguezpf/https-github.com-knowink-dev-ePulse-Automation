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

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Add_BUTTON_To_Prompt'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Input Button Label'), 
    'test')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Select Button Type Dropdown'), 
    '0', true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Add New Button(plus sign)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Input Button Label'), 
    'test1')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Select Button Type Dropdown'), 
    '1', true)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Page_Epulse  am-Automation-test  Pr/Prompt Button Value'), 
    'Allow to vote', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Add New Button(plus sign)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Input Button Label'), 
    'test3')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Select Button Type Dropdown'), 
    '2', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Page_Epulse  am-Automation-test  Pr/Prompt Button Value'), 
    'asdf')

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Add New Button(plus sign)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Input Button Label'), 
    'test2')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Select Button Type Dropdown'), 
    '3', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Input Button Label'), 
    'test4')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Select Button Type Dropdown'), 
    '4', true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Add New Button(plus sign)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Input Button Label'), 
    'test5')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Select Button Type Dropdown'), 
    '5', true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Add New Button(plus sign)'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Close Button'))

WebUI.delay(1)

WebUI.closeBrowser()

