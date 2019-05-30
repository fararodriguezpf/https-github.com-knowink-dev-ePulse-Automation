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

WebUI.callTestCase(findTestCase('Login/AdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.navigateToUrl(GlobalVariable.Oaths, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/New Oath'))

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Name'), 'ID Method')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Instructions'), 'Oath Instructions')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Customized Oath Text Area'), 
    'Customize the oath displayed to voters')

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Type Dropdown'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Id Method'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Submit'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/New Oath'))

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Name'), 'Voter Check In Signing Page')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Instructions'), 'Oath Instructions')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Customized Oath Text Area'), 
    'Customize the oath displayed to voters')

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Type Dropdown'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Voter Check In Signing Pa'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Submit'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/New Oath'))

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Name'), 'Allow Voter to Vote')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Instructions'), 'Oath Instructions')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Customized Oath Text Area'), 
    'Customize the oath displayed to voters')

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Type Dropdown'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Allow Voter To Vote'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/New Oath'))

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Name'), 'Voter Check In Signing Page(Provisional')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Instructions'), 'Oath Instructions')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Customized Oath Text Area'), 
    'Customize the oath displayed to voters')

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Type Dropdown'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Voter Check In Signing Pa'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/New Oath'))

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Name'), 'Similar Name Affidavit')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Instructions'), 'Oath Instructions')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Customized Oath Text Area'), 
    'Customize the oath displayed to voters')

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Type Dropdown'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Similar Name Affidavit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/New Oath'))

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Name'), 'Reasonable Impediment Declaration')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Instructions'), 'Oath Instructions')

WebUI.setText(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Customized Oath Text Area'), 
    'Customize the oath displayed to voters')

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Oath Type Dropdown'))

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Reasonable Impediment Decla'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/Add_Edit Oath/Submit'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

