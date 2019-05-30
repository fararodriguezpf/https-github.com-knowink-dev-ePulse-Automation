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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.builtin.CloseBrowserKeyword as CloseBrowserKeyword

WebUI.callTestCase(findTestCase('Login/AdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.Registered_Voters)

WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add Voter Button'))

for (def row = 1; row <= findTestData('Add_Voter').getRowNumbers(); row++) {
    WebUI.setText(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Personal Information/First_Name'), 
        findTestData('Add_Voter').getValue('F_Name', row))

    not_run: WebUI.setText(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Personal Information/Middle_Name'), 
        findTestData('Add_Voter - Add').getValue('M_Name', row))

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Personal Information/Last_Name'), 
        findTestData('Add_Voter').getValue('L_Name', row))

    WebUI.doubleClick(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Personal Information/DOB'))

    WebUI.delay(1)

    WebUI.clearText(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Personal Information/DOB'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Personal Information/DOB'), 
        findTestData('Add_Voter').getValue('DOB', row))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Personal Information/SSN'), 
        findTestData('Add_Voter').getValue('SSN', row))

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Personal Information/DL'), 
        findTestData('Add_Voter').getValue('DL', row))

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Address Information/House_Number'), 
        findTestData('Add_Voter').getValue('House_No', row))

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Address Information/House_Suffix'), 
        findTestData('Add_Voter').getValue('House_Suffix', row))

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Address Information/Pre_Dir'), 
        findTestData('Add_Voter').getValue('Pre_dir', row))

    WebUI.setText(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Address Information/Street_Name'), 
        findTestData('Add_Voter').getValue('Street_Name', row))

    WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Polling Information/Staus'))

    WebUI.selectOptionByValue(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Polling Information/Staus'), 
        'A', true)

    not_run: WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Polling Information/Party-Rep'))

    WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Polling Information/Party-Rep'))

    WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Polling Information/Polling Places'))

    WebUI.click(findTestObject('Admin Console ePulse Menu/Voters/Registered Voters page/Add_Voter/Voter Polling Information/li_MATHEWS DICKEY'))
}

WebUI.closeBrowser()

