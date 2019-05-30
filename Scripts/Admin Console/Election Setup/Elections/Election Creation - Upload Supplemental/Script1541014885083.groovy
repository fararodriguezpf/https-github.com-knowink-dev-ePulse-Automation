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
WebUI.navigateToUrl(GlobalVariable.Elections_Page)

WebUI.click(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Supplemental File Upload/Election (Election Creation)'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Supplemental File Upload/Import Supplemental Voters'))

'Election Creation Step 1 - Choose the file to upload.'
WebUI.setText(findTestObject('Common ePulse Objects/Choose File'), '/Users/alonzomack/Downloads/Automation uploads/voters_201_mcvr.txt')

WebUI.delay(1)

'Election Creation Step 1 - Click Continue once the file is specified.'
WebUI.click(findTestObject('Common ePulse Objects/Continue Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Election Setup/Election Creation/Supplemental File Upload/Done'))

'Verify the election created by checking for unique text on the screen.'
WebUI.verifyTextPresent('Election Creation', true)

WebUI.verifyTextPresent('Election Seed Files', true)

WebUI.delay(1)

WebUI.navigateToUrl(GlobalVariable.Reg_Voters)

WebUI.delay(1)

WebUI.delay(1)

WebUI.verifyTextPresent('ABRON A AAARON', true)

WebUI.closeBrowser()

