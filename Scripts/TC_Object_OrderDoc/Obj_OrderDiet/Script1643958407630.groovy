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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://43.229.79.185/hmdev/#/login')

WebUI.setText(findTestObject('Object Repository/Order_Diet/Page_HM Web/input_Welcome to HM Systems_username'), '00020')

WebUI.setEncryptedText(findTestObject('Object Repository/Order_Diet/Page_HM Web/input_Welcome to HM Systems_password'), 
    '1lNO57yZFUU=')

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/button_Login'))

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/span_IPD'))

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/label_06 MS33'))

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/div_29 xxxxHN 0019295 26012022 1720'))

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/th_Order for one day'))

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/a_Diet'))

WebUI.setText(findTestObject('Object Repository/Order_Diet/Page_HM Web/input_HM_004Desc'), 'Diet Name')

WebUI.setText(findTestObject('Object Repository/Order_Diet/Page_HM Web/textarea_Diet_004Desc'), 'Test From Katalon Detail')

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/button_Save'))

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/button_Submit'))

not_run: WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/button_Order'))

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/th_Order for continue'))

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/a_Diet'))

WebUI.setText(findTestObject('Object Repository/Order_Diet/Page_HM Web/input_HM_004Desc'), 'Diet Order Continue')

WebUI.setText(findTestObject('Object Repository/Order_Diet/Page_HM Web/textarea_Diet_004Desc'), 'Test From Katalon Detail')

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/button_Save'))

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/button_Submit'))

WebUI.click(findTestObject('Object Repository/Order_Diet/Page_HM Web/button_Order'))

