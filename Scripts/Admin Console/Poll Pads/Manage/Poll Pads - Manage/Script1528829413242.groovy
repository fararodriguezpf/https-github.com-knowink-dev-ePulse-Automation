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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://epulsedev2.com/users/sign_in')

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Epulse/input_useremail'), 'alonzo.mack@knowink.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Epulse/input_userpassword'), 'S3v3nmc7')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Page_Epulse/input_userpassword'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Epulse  Admin  Accounts/input_table-search'), 'AM-IA1')

WebUI.delay(1)

WebUI.click(findTestObject('a_Login'))

WebUI.delay(1)

WebUI.switchToWindowTitle('Epulse | AM-IA1 | At a Glance')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  At a Glance/span_Poll Pads'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  At a Glance/a_Manage'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/div_Status'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/button_Apply Filters - Status'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/div_Election'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/a_All'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/li_6 7'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/button_Apply Filters - Election'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/div_Place'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/a_ALBURNETT METHODIST CHURCH'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/li_ISAAC NEWTON ACADEMY'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/button_Apply Filters - Place'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/div_Place'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/div_Config'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Page_Epulse  AM-IA1  Poll Pads/select_5-2'), '339', true)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/button_Apply Filters - Config'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/span_icn-close'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/div_Config'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Page_Epulse  AM-IA1  Poll Pads/select_5-2'), '529', true)

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/button_Apply Filters - Config'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pads/li_Config iowa config'))

WebUI.delay(1)

WebUI.closeBrowser()

