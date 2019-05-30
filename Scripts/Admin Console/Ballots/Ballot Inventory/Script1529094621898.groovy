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

WebUI.setText(findTestObject('Page_Epulse  Admin  Accounts/input_table-search'), 'am-ia1')

WebUI.delay(1)

WebUI.click(findTestObject('a_Login'))

WebUI.delay(1)

WebUI.switchToWindowTitle('Epulse | AM-IA1 | At a Glance')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  At a Glance/span_Ballots'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/div_Polling Places'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/button_Apply Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/div_Polling Places'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/a_ALBURNETT METHODIST CHURCH'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/li_ANTIOCH CHRISTIAN CHURCH'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/button_Apply Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/div_Voters Left'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/Voters Left_Apply Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/div_Voters Left'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/div_Equal To'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/Voters Left_Apply Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/div_Spoiled'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/Spoiled_Apply Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/div_Remaining'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/Remaining_Apply Filters'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Ballot Invento/span_icn-close'))

WebUI.delay(1)

WebUI.closeBrowser()

WebUI.delay(1)

