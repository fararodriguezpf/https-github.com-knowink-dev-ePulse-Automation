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

WebUI.navigateToUrl(GlobalVariable.voter_id_methods, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/ID Methods Page/Page_Epulse  am-Automation-test/Buttons'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Button Label'), 'test')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Button Type'), '0', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Add Button(blue  sign)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Button Label'), '1test')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Button Type'), '1', 
    true)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Additional text field'), 'Allow to vote', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Add Button(blue  sign)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Button Label'), '2test')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Button Type'), '2', 
    true)

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Additional text field'), 'asdf')

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Add Button(blue  sign)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Button Label'), '3test')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Button Type'), '3', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Add Button(blue  sign)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Button Label'), '4test')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Button Type'), '4', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Add Button(blue  sign)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Button Label'), '5test')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Button Type'), '5', 
    true)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/Buttons/Add Button(blue  sign)'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Prompt Button Modal/Close Button'))

WebUI.delay(1)

WebUI.closeBrowser()

