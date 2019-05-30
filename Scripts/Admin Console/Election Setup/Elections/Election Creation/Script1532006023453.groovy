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

'Click the Elections link under Election Setup.'
WebUI.navigateToUrl(GlobalVariable.Election_Import)

'Election Creation Step 1 - Choose the file to upload.'
WebUI.setText(findTestObject('Common ePulse Objects/Choose File'), '/Users/alonzomack/Downloads/Imports/Missouri/voters_200_mcvr.txt')

'Election Creation Step 1 - Click Continue once the file is specified.'
WebUI.click(findTestObject('Common ePulse Objects/Continue Button'), FailureHandling.STOP_ON_FAILURE)

'Delay to account for loading times.'
WebUI.delay(10)

WebUI.delay(10)

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'Election Creation Step 2 - Enter an election name.'
WebUI.setText(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Election Name'), 'Election Creation')

'Election Creation Step 2 - Enter an election code.'
WebUI.setText(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Election Code'), '123')

'Election Creation Step 2 - Select an election type.'
WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Select Election Type'), 
    'general', true)

WebUI.clearText(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/DATE'))

'Election Creation Step 2 - Select an election date.'
WebUI.setText(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/DATE'), '07/21/2021')

'Election Creation Step 2 - Click Submit to continue to Step 3.'
WebUI.click(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Next'))

'Delay to account for load times.'
WebUI.waitForElementPresent(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Step3 Done'), 0)

'Step 3 - Click Done to continue.'
WebUI.click(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Step3 Done'))

'Delay to account for load times.'
WebUI.waitForElementVisible(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Step4 Done'), 0)

'Step 4 - Click Done to Continue.'
WebUI.click(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Step4 Done'))

'Delay to account for load times.'
WebUI.waitForElementPresent(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Step5 Confirm'), 
    0)

'Step 5 - Click Confirm to finish the setup wizard and create the election.'
WebUI.click(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Step5 Confirm'))

'Delay to account for load times.'
WebUI.delay(20)

'Verify the election created by checking for unique text on the screen.'
WebUI.verifyTextPresent('Election Creation', true)

WebUI.verifyTextPresent('Election Seed Files', true)

WebUI.delay(1)

WebUI.navigateToUrl(GlobalVariable.Reg_Voters)

WebUI.delay(1)

WebUI.delay(1)

WebUI.verifyTextPresent('TWEEDIE MARIE AARON', true)

WebUI.closeBrowser()

