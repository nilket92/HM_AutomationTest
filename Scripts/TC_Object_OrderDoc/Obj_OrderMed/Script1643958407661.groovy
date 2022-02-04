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

WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_Welcome to HM Systems_username'), '00020')

WebUI.setEncryptedText(findTestObject('Order_Med/Page_HM Web/input_Welcome to HM Systems_password'), '1lNO57yZFUU=')

WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Login'))

WebUI.click(findTestObject('Order_Med/Page_HM Web/span_IPD'))

WebUI.click(findTestObject('Order_Med/Page_HM Web/label_06 MS33'))

WebUI.click(findTestObject('Order_Med/Page_HM Web/div_29 xxxxHN 0019295 26012022 1720'))

for (def row = 1; row <= 1; row++) {
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

WebUI.click(findTestObject('Order_Med/Page_HM Web/th_Order for one day'))

for (def rowmed = 1; rowmed <= 5; rowmed++) {
    WebUI.click(findTestObject('Order_Med/Page_HM Web/a_Med'))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_HM_004Desc'), findTestData('ExcelData_Drug').getValue('itemname', 
            rowmed))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_Med_004Desc'), findTestData('ExcelData_Drug').getValue('administrationUsage', 
            rowmed))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/input__004Desc'), findTestData('ExcelData_Drug').getValue('dose', 
            rowmed))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/textarea__004Desc'), findTestData('ExcelData_Drug').getValue('description', 
            rowmed))

    WebUI.click(findTestObject('Order_Med/Page_HM Web/span__checkbox-checkmark'))

    WebUI.click(findTestObject('Order_Med/Page_HM Web/span__checkbox-checkmark'))

    WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Save'))
}

WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Submit'))

not_run: WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Order'))

WebUI.click(findTestObject('Order_Med/Page_HM Web/th_Order for one day'))

for (def rowmedcon = 6; rowmedcon <= 10; rowmedcon++) {
    WebUI.click(findTestObject('Order_Med/Page_HM Web/a_Med'))

    not_run: WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_HM_004Desc'), 'paracetamol 500 stat')

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_HM_004Desc'), findTestData('ExcelData_Drug').getValue('itemname', 
            rowmedcon))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_Med_004Desc'), findTestData('ExcelData_Drug').getValue('administrationUsage', 
            rowmedcon))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/input__004Desc'), findTestData('ExcelData_Drug').getValue('dose', 
            rowmedcon))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/textarea__004Desc'), findTestData('ExcelData_Drug').getValue('description', 
            rowmedcon))

    not_run: WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_Med_004Desc'), 'วิธีใช้')

    not_run: WebUI.setText(findTestObject('Order_Med/Page_HM Web/input__004Desc'), '50')

    not_run: WebUI.setText(findTestObject('Order_Med/Page_HM Web/textarea__004Desc'), 'Test From Katalon')

    WebUI.click(findTestObject('Order_Med/Page_HM Web/span__checkbox-checkmark'))

    WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Save'))
}

WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Submit'))

not_run: WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Order'))

not_run: WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Order'))

WebUI.click(findTestObject('Object/Page_HM Web/th_Order for continue'))

for (def row = 1; row <= 5; row++) {
    WebUI.click(findTestObject('Order_Med/Page_HM Web/a_Med'))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_HM_004Desc'), findTestData('ExcelData_Drug').getValue('itemname', 
            row))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_Med_004Desc'), findTestData('ExcelData_Drug').getValue('administrationUsage', 
            row))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/input__004Desc'), findTestData('ExcelData_Drug').getValue('dose', 
            row))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/textarea__004Desc'), findTestData('ExcelData_Drug').getValue('description', 
            row))

    not_run: WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_HM_004Desc'), 'paracetamol 500 gg')

    not_run: WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_Med_004Desc'), 'วิธีใช้')

    not_run: WebUI.setText(findTestObject('Order_Med/Page_HM Web/input__004Desc'), '50')

    not_run: WebUI.setText(findTestObject('Order_Med/Page_HM Web/textarea__004Desc'), 'Test From Katalon')

    WebUI.click(findTestObject('Order_Med/Page_HM Web/span__checkbox-checkmark'))

    WebUI.click(findTestObject('Order_Med/Page_HM Web/span__checkbox-checkmark'))

    WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Save'))
}

WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Submit'))

not_run: WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Order'))

WebUI.click(findTestObject('Object/Page_HM Web/th_Order for continue'))

for (def row = 1; row <= 5; row++) {
    WebUI.click(findTestObject('Order_Med/Page_HM Web/a_Med'))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_HM_004Desc'), findTestData('ExcelData_Drug').getValue('itemname', 
            row))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_Med_004Desc'), findTestData('ExcelData_Drug').getValue('administrationUsage', 
            row))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/input__004Desc'), findTestData('ExcelData_Drug').getValue('dose', 
            row))

    WebUI.setText(findTestObject('Order_Med/Page_HM Web/textarea__004Desc'), findTestData('ExcelData_Drug').getValue('description', 
            row))

    not_run: WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_HM_004Desc'), 'paracetamol 500 stat')

    not_run: WebUI.setText(findTestObject('Order_Med/Page_HM Web/input_Med_004Desc'), 'วิธีใช้')

    not_run: WebUI.setText(findTestObject('Order_Med/Page_HM Web/input__004Desc'), '50')

    not_run: WebUI.setText(findTestObject('Order_Med/Page_HM Web/textarea__004Desc'), 'Test From Katalon')

    WebUI.click(findTestObject('Order_Med/Page_HM Web/span__checkbox-checkmark'))

    WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Save'))
}

WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Submit'))

WebUI.click(findTestObject('Order_Med/Page_HM Web/button_Order'))

