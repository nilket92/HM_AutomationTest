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

WebUI.setText(findTestObject('ProgressionNote/Page_HM Web/txt_username'), '00020')

WebUI.setEncryptedText(findTestObject('ProgressionNote/Page_HM Web/txt_password'), '1lNO57yZFUU=')

WebUI.click(findTestObject('ProgressionNote/Page_HM Web/btn_login'))

WebUI.click(findTestObject('ProgressionNote/Page_HM Web/lbl_menuIPD'))

WebUI.click(findTestObject('ProgressionNote/Page_HM Web/label_06 MS33'))

WebUI.click(findTestObject('ProgressionNote/Page_HM Web/div_29 xxxxHN 0019295 26012022 1720'))

for (def row = 1; row <= 5; row++) {
    WebUI.click(findTestObject('ProgressionNote/Page_HM Web/tab_Progression note'))

    WebUI.setText(findTestObject('ProgressionNote/Page_HM Web/txt_progressS'), findTestData('ExcelData_ProgressioNote').getValue(
            'S', row))

    WebUI.setText(findTestObject('ProgressionNote/Page_HM Web/txt_progressO'), findTestData('ExcelData_ProgressioNote').getValue(
            'O', row))

    WebUI.setText(findTestObject('ProgressionNote/Page_HM Web/txt_progressA'), findTestData('ExcelData_ProgressioNote').getValue(
            'A', row))

    WebUI.setText(findTestObject('ProgressionNote/Page_HM Web/txt_progressP'), findTestData('ExcelData_ProgressioNote').getValue(
            'P', row))

    WebUI.click(findTestObject('ProgressionNote/Page_HM Web/btn_save'))

    WebUI.click(findTestObject('ProgressionNote/Page_HM Web/btn_Order'))
}

