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

'Verify Actor In Elements Page'
WebUI.verifyElementPresent(findTestObject('Global/pageHead', [('text') : head_name]), 30)

'Verify Text Box Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Text Box', ('id') : 'item-0']), 30)

'Verify Check Box Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Check Box', ('id') : 'item-1']), 30)

'Verify Radio Button Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Radio Button', ('id') : 'item-2']), 
    30)

'Verify Web Tables Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Web Tables', ('id') : 'item-3']), 
    30)

'Verify Button Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Buttons', ('id') : 'item-4']), 30)

'Verify Links Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Links', ('id') : 'item-5']), 30)

'Verify Broken Links - Images Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Broken Links - Images', ('id') : 'item-6']), 
    30)

'Verify Upload and Download Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Upload and Download', ('id') : 'item-7']), 
    30)

'Verify Dyímic Properties Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Dynamic Properties', ('id') : 'item-8']), 
    30)

WebUI.click(findTestObject('Modules/ElementsTab/ElementLargeTab', [('text') : head_name]), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

'Verify Text Box Item Is Not Displayed'
WebUI.verifyElementNotVisible(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Text Box', ('id') : 'item-0']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Check Box Item  Is Not Displayed'
WebUI.verifyElementNotVisible(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Check Box', ('id') : 'item-1']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Radio Button Item  Is Not Displayed'
WebUI.verifyElementNotVisible(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Radio Button', ('id') : 'item-2']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Web Tables Item  Is Not Displayed'
WebUI.verifyElementNotVisible(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Web Tables', ('id') : 'item-3']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Button Item  Is Not Displayed'
WebUI.verifyElementNotVisible(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Buttons', ('id') : 'item-4']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Links Item Is Not Displayed'
WebUI.verifyElementNotVisible(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Links', ('id') : 'item-5']), FailureHandling.STOP_ON_FAILURE)

'Verify Broken Links - Images Item Is Not Displayed'
WebUI.verifyElementNotVisible(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Broken Links - Images', ('id') : 'item-6']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Upload and Download Item Is Not Displayed'
WebUI.verifyElementNotVisible(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Upload and Download', ('id') : 'item-7']), 
    FailureHandling.STOP_ON_FAILURE)

'Verify Dyímic Properties Item  Is Not Displayed'
WebUI.verifyElementNotVisible(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Dynamic Properties', ('id') : 'item-8']), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modules/ElementsTab/ElementLargeTab', [('text') : head_name]), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

'Verify Text Box Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Text Box', ('id') : 'item-0']), 30)

'Verify Check Box Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Check Box', ('id') : 'item-1']), 30)

'Verify Radio Button Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Radio Button', ('id') : 'item-2']), 
    30)

'Verify Web Tables Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Web Tables', ('id') : 'item-3']), 
    30)

'Verify Button Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Buttons', ('id') : 'item-4']), 30)

'Verify Links Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Links', ('id') : 'item-5']), 30)

'Verify Broken Links - Images Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Broken Links - Images', ('id') : 'item-6']), 
    30)

'Verify Upload and Download Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Upload and Download', ('id') : 'item-7']), 
    30)

'Verify Dyímic Properties Item Displayed'
WebUI.verifyElementPresent(findTestObject('Modules/ElementsTab/SubTabs', [('text') : 'Dynamic Properties', ('id') : 'item-8']), 
    30)

