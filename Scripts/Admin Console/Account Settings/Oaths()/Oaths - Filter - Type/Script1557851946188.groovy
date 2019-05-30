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

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Filter Type Dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Apply Type Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Remove Filter Type ALL'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Filter Type Dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Filter Dropdown Options'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Select Id Method'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Apply Type Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Type Dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Filter Type Dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/a_Id Method'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/li_Allow Voter To Vote'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Apply Type Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/span_Type Allow Voter To Vote_'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Filter Type Dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/a_Allow Voter To Vote'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/li_Similar Name Affidavit'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Apply Type Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Remove Filter Similar Name Affidav'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Filter Type Dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/a_Similar Name Affidavit'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/li_Reasonable Impediment Decla'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Apply Type Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin Console ePulse Menu/Account Settings/Oaths/TEMP/TEMP Type Filter/Filter Oath Types/Remove Filter Reasonable Impediment'))

WebUI.delay(1)

