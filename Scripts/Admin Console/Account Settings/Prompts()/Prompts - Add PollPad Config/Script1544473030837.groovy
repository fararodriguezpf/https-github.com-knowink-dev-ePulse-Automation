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

WebUI.navigateToUrl(GlobalVariable.Prompts, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('Add PollPad Config/Select PollPad Config'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('Add PollPad Config/Select PollPad Config'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('Add PollPad Config/input_Cancel_commit'))

WebUI.delay(1)

WebUI.click(findTestObject('Add PollPad Config/Add Configs Button(Gear Icon)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin Console ePulse Menu/Account Settings/Prompts/Assign Prompt to Configs/a_Test3_search-choice-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin Console ePulse Menu/Account Settings/Prompts/Assign Prompt to Configs/a_Test2_search-choice-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin Console ePulse Menu/Account Settings/Prompts/Assign Prompt to Configs/input_Cancel_commit'))

