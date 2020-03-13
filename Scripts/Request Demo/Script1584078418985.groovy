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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.mile.app/landing')

WebUI.click(findTestObject('Object Repository/Page_Mileapp - The best Logistics Platform _f3cbcb/p_Request Demo'))

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Full name_name'), 'Amma Bernard Ben Bella')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Email_email'), 'benbernard34@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Phone number_phone'), '85860990253')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Company name_organization_name'), 'TESTING')

WebUI.click(findTestObject('Object Repository/Page_Mileapp  Request Demo/button_Request Demo'))

WebUI.click(findTestObject('Object Repository/Page_Mileapp - The best Logistics Platform _f3cbcb/p_Request Demo'))

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Full name_name'), '9842748264762')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Email_email'), '-097623=')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Phone number_phone'), '867326465236452')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Company name_organization_name'), 'COBA NEGATIF')

WebUI.click(findTestObject('Object Repository/Page_Mileapp  Request Demo/button_Request Demo'))

WebUI.closeBrowser()

