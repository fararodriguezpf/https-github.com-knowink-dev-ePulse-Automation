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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cchshsdc.com/users/sign_in')

WebUI.setText(findTestObject('1 Admin Login/input_useremail'), 'crystal.scordias+automated_tester@knowink.com')

WebUI.setText(findTestObject('1 Admin Login/input_userpassword'), '&T2?RdkkC_vk7_Tg*-c9%^gZ')

WebUI.click(findTestObject('Login Objects/input_commit'))

WebUI.click(findTestObject('2 Accounts/a_Login'))

WebUI.switchToWindowTitle('Epulse | Admin | Accounts')

WebUI.verifyAllLinksOnCurrentPageAccessible(false, [''])

not_run: WebUI.verifyAllLinksOnCurrentPageAccessible(false, ['https://am-canada.epulsedev2.com/pages/election_day', 'https://am-canada.epulsedev2.com/issues#sort=severity&direction=desc&display=list&page=1'
        , 'https://am-canada.epulsedev2.com/issues/call_center', 'https://am-canada.epulsedev2.com/issue_types#sort=name&direction=asc&display=list&page=1'
        , 'https://am-canada.epulsedev2.com/inventory_assets#sort=name&direction=asc&display=list&page=1', 'https://am-canada.epulsedev2.com/reports'
        , 'https://am-canada.epulsedev2.com/reports/downloads', 'https://am-canada.epulsedev2.com/audit_logs#sort=created_at&direction=DESC&display=list&page=1'
        , 'https://am-canada.epulsedev2.com/ballots#sort=name&direction=asc&display=list&page=1', 'https://am-canada.epulsedev2.com/messages'
        , 'https://am-canada.epulsedev2.com/poll_pads#sort=sort_name&direction=asc&display=list&page=1', 'https://am-canada.epulsedev2.com/poll_pad_configs#sort=name&direction=asc&display=list'
        , 'https://am-canada.epulsedev2.com/poll_pad_tags#sort=name&direction=asc&display=list&page=1', 'https://am-canada.epulsedev2.com/voters#sort=last_name&direction=asc&display=list&page=1'
        , 'https://am-canada.epulsedev2.com/check_ins#sort=time&direction=desc&display=list&page=1', 'https://am-canada.epulsedev2.com/voter_adds#sort=created_at&direction=desc&display=list&page=1'
        , 'https://am-canada.epulsedev2.com/voter_address_changes#sort=created_at&direction=desc&display=list&page=1', 'https://am-canada.epulsedev2.com/voter_name_changes#sort=created_at&direction=desc&display=list&page=1'
        , 'https://am-canada.epulsedev2.com/voters/update_statuses', 'https://am-canada.epulsedev2.com/polling_places#sort=name&direction=asc&display=list&page=1'
        , 'https://am-canada.epulsedev2.com/poll_workers#sort=last_name&direction=asc&display=list&page=1', 'https://am-canada.epulsedev2.com/poll_worker_roles#sort=name&direction=asc&display=list'
        , 'https://am-canada.epulsedev2.com/poll_workers/copy', 'https://am-canada.epulsedev2.com/elections#sort=from_date&direction=desc&display=list&page=1'
        , 'https://am-canada.epulsedev2.com/parties', 'https://am-canada.epulsedev2.com/statuses', 'https://am-canada.epulsedev2.com/ballot_types'
        , 'https://am-canada.epulsedev2.com/encoder_settings', 'https://am-canada.epulsedev2.com/encoder_ballots', 'https://am-canada.epulsedev2.com/account_settings'
        , 'https://am-canada.epulsedev2.com/import_settings', 'https://am-canada.epulsedev2.com/account_settings/poll_pad'
        , 'https://am-canada.epulsedev2.com/help_menu_items', 'https://am-canada.epulsedev2.com/voter_id_methods', 'https://am-canada.epulsedev2.com/prompts'
        , 'https://am-canada.epulsedev2.com/account_oaths#sort=created_at&direction=DESC&display=list&page=1', 'https://am-canada.epulsedev2.com/add_voters'
        , 'https://am-canada.epulsedev2.com/users#sort=last_name&direction=asc&display=list&page=1', 'https://am-canada.epulsedev2.com/restrictions'
        , 'https://am-canada.epulsedev2.com/languages#sort=lang_key&direction=asc&display=list&page=1', 'https://am-canada.epulsedev2.com/election_groups#'])

WebUI.closeWindowUrl('https://test.cchshsdc.com/')

