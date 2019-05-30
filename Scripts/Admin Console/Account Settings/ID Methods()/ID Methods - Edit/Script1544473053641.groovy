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

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/ID Methods Page/Page_Epulse  am-Automation-test/Edit Selected ID Method'))

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Name'), 'Drivers License_Edit')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Heading'), 'State Drivers License_Edit')

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Select Color'), 
    '0', true)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Instructions'), 
    'State Drivers License_Edit')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Order'), '2')

not_run: WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Show Does Name Match_slider'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Show Does Address Match_slider'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Show is ID Expired_slider'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Page_Epulse  am-Automation-test/Incorrect Heading'), 
    'No Drivers License_Edit?')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Page_Epulse  am-Automation-test/Incorrect Instructions'), 
    'Vote Provisional_Edit')

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/ID Methods/New ID Method Modal/Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

