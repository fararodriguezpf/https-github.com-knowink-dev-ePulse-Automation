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

WebUI.setText(findTestObject(null), '')

WebUI.delay(1)

WebUI.delay(1)

WebUI.navigateToUrl(GlobalVariable.Poll_Workers_Roles, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.delay(1)

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers Roles/Add Role'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers Roles/Add Poll Workers Roles Modal/input_Name'), 
    'Senior Admin')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers Roles/Add Poll Workers Roles Modal/Rate'), 
    '15')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers Roles/Add Poll Workers Roles Modal/Select Rate Type'), 
    '1', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers Roles/Add Poll Workers Roles Modal/input_Max hours for hourly pay'), 
    '8')

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Poll Workers/Poll Workers Roles/Add Poll Workers Roles Modal/SAVE'))

WebUI.delay(1)

WebUI.closeBrowser()

