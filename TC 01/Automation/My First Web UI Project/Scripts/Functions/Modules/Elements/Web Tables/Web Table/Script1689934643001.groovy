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

'Verify Add Button Is Displayed'
WebUI.verifyElementPresent(findTestObject('Global/ButtonById', [('id') : 'addNewRecordButton']), 30)

'Verrify Search Field Is Displayed'
WebUI.verifyElementPresent(findTestObject('Global/InputById', [('id') : 'searchBox']), 30)

'Verify Search Button Is Displayed'
WebUI.verifyElementPresent(findTestObject('Global/SearchButtonId', [('id') : 'basic-addon2']), 30)

WebUI.callTestCase(findTestCase('Functions/Search/SearchInvalidtext'), [('search_text') : '12345'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Functions/Search/Search Field Clear'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Functions/Search/SearchValidtext'), [('search_text') : 'Cierra'], FailureHandling.STOP_ON_FAILURE)

'Click Add Button'
WebUI.click(findTestObject('Global/ButtonById', [('id') : 'addNewRecordButton']))

'Verify Registration Form Pop Up is Displayed'
WebUI.verifyElementPresent(findTestObject('Global/divId', [('id') : 'registration-form-modal']), 30)

'Verify First Name Field is Displayed'
WebUI.verifyElementPresent(findTestObject('Global/InputById', [('id') : 'firstName']), 30)

'Verify Last Name Field is Displayed'
WebUI.verifyElementPresent(findTestObject('Global/InputById', [('id') : 'lastName']), 30)

'Verify Email Field is Displayed'
WebUI.verifyElementPresent(findTestObject('Global/InputById', [('id') : 'userEmail']), 30)

'Verify Age Field is Displayed'
WebUI.verifyElementPresent(findTestObject('Global/InputById', [('id') : 'age']), 30)

'Verify Salary Field is Displayed'
WebUI.verifyElementPresent(findTestObject('Global/InputById', [('id') : 'salary']), 30)

'Verify Department Field is Displayed'
WebUI.verifyElementPresent(findTestObject('Global/InputById', [('id') : 'department']), 30)

'Verify Submit button is Clickable'
WebUI.verifyElementClickable(findTestObject('Global/ButtonById', [('id') : 'submit']))

'Click Submit button'
WebUI.click(findTestObject('Global/ButtonById', [('id') : 'submit']))

'Verify Registration Form Pop Up is Displayed'
WebUI.verifyElementPresent(findTestObject('Global/divId', [('id') : 'registration-form-modal']), 30)

'Verify First Name Field is Displayed'
WebUI.setText(findTestObject('Global/InputById', [('id') : 'firstName']), first_name)

'Verify Last Name Field is Displayed'
WebUI.setText(findTestObject('Global/InputById', [('id') : 'lastName']), last_name)

'Verify Email Field is Displayed'
WebUI.setText(findTestObject('Global/InputById', [('id') : 'userEmail']), email)

'Verify Age Field is Displayed'
WebUI.setText(findTestObject('Global/InputById', [('id') : 'age']), age)

'Verify Salary Field is Displayed'
WebUI.setText(findTestObject('Global/InputById', [('id') : 'salary']), salary)

'Verify Department Field is Displayed'
WebUI.setText(findTestObject('Global/InputById', [('id') : 'department']), department)

'Click Submit button'
WebUI.click(findTestObject('Global/ButtonById', [('id') : 'submit']))

