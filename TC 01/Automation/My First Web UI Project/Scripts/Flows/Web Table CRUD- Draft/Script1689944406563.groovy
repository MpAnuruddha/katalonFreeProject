import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Functions/Login and Logout/Login web Site'), [('url') : 'https://demoqa.com'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Functions/Modules/Home Page/Tabs Verify Checking'), [('tab_1') : 'Elements', ('tab_2') : 'Forms'
        , ('tab_3') : 'Alerts, Frame & Windows', ('tab_4') : 'Widgets', ('tab_5') : 'Interactions', ('tab_6') : 'Book Store Application'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Functions/Navigations/Navigation Home Page Tabs'), [('Tab_name') : 'Elements'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Functions/Modules/Elements/Verification Elements'), [('head_name') : 'Elements'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Functions/Navigations/Elements/Navigate Sub Tabs In Element Tab'), [('name') : 'Web Tables'
        , ('id') : 'item-3'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Functions/Modules/Elements/Web Tables/Web Table'), [('first_name') : 'Anuruddha', ('last_name') : 'Dissanayake'
        , ('email') : 'anuruddha.d@gmail.com', ('age') : '26', ('salary') : '12500', ('department') : 'Computer'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Functions/Login and Logout/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

