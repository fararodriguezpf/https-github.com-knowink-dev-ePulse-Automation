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

WebUI.switchToWindowTitle('Epulse | AM-IA1 | At a Glance')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  At a Glance/span_Poll Pads'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  At a Glance/a_Tags'))

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/a_Add Tag'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/input_poll_pad_tagname'), 'Black')

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/textarea_poll_pad_tagdescripti'), 'Black')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/input_commit'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/a_Add Tag'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/input_poll_pad_tagname'), 'Gold')

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/textarea_poll_pad_tagdescripti'), 'Gold')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/input_commit'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/a_Add Tag'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/input_poll_pad_tagname'), 'Green')

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/textarea_poll_pad_tagdescripti'), 'Green')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/input_commit'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/a_Add Tag'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/input_poll_pad_tagname'), 'Red')

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/textarea_poll_pad_tagdescripti'), 'Red')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Epulse  AM-IA1  Poll Pad Tags/input_commit'))

WebUI.delay(1)

WebUI.closeBrowser()

