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

WebUI.callTestCase(findTestCase('Login/AdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.navigateToUrl(GlobalVariable.Prompts, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Create_New_Prompt_Button'))

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Add_Edit Prompt Modal/Name'), 'Test Prompt')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Add_Edit Prompt Modal/Heading'), 'Prompt')

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Add_Edit Prompt Modal/Select Color'), 
    '0', true)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Add_Edit Prompt Modal/Order'), '1')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Add_Edit Prompt Modal/Field Label'), 'Prompt')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Add_Edit Prompt Modal/Field Name'), 'Prompt')

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Add_Edit Prompt Modal/Show Voter Info_slider'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Add_Edit Prompt Modal/Show DOB Field_slider'))

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Add_Edit Prompt Modal/Instructions textarea '), 
    'Test Prompt')

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Prompts/Add_Edit Prompt Modal/Submit'))

WebUI.delay(2)

WebUI.closeBrowser()

