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
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.Point as Point
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

TestObject button = new TestObject().addProperty('css', ConditionType.EQUALS, '#btn-make-appointment')

// open 2 Chrome browser, one in normal mode on the left, another in incognito mode on the right
WebDriver normalChrome = openChromeBrowserPlain()

resizeHorizontalHalfLocateLeft(normalChrome)

DriverFactory.changeWebDriver(normalChrome)

WebUI.navigateToUrl('http://43.229.79.185/hmdev/#/login')

WebUI.waitForPageLoad(10)

WebDriver incognitoChrome = openChromeBrowserInIncognitoMode()

resizeHorizontalHalfLocateRight(incognitoChrome)

DriverFactory.changeWebDriver(incognitoChrome)

WebUI.navigateToUrl('http://43.229.79.185/hmdev/#/login')

WebUI.waitForPageLoad(10)

//WebUI.acceptAlert()
// in the normal Chrome, do something
DriverFactory.changeWebDriver(normalChrome)

WebUI.comment("switched to ${WebUI.getUrl()}")
WebUI.verifyElementPresent(button, 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(button)
WebUI.delay(1)

// in the incoginto Chrome, do something
DriverFactory.changeWebDriver(incognitoChrome)

WebUI.comment("switched to $WebUI.getUrl()")
WebUI.navigateToUrl('http://43.229.79.185/hmdev/#/login')
WebUI.verifyElementPresent(button, 10, FailureHandling.STOP_ON_FAILURE)
WebUI.click(button)
WebUI.delay(1)

// close 2 browser windows
DriverFactory.changeWebDriver(normalChrome)

WebUI.closeBrowser()

WebUI.delay(1)

DriverFactory.changeWebDriver(incognitoChrome)

WebUI.closeBrowser( /**
 * opens a Chrome browser with nothing special
 * returns the ChromeDriver instance that is assocated with the window
 * @return
 */ ) /**
 * opens a Chrome browser with -incoginito mode,
 * returns the ChromeDriver instance that is associated with the window
 */
/**
 * opens a ChromeBrowser with the ChromeOptions given.
 * returns the ChromeDriver instance that is associated with the window
 * @param options
 * @return
 */
/**
 * resize the browser window to horizontal half, and move it to the right side
 * @param driver
 * @returns Dimension of the window
 */
/**
 * resize the browser window to horizontal half, and move it to the left side
 *
 * @param driver
 * @returns Dimension of the window
 */
/**
 * resize the browser window to half-width tile;
 * width=half of full screen, height=height of full screen
 *
 * @param driver
 * @return
 */

ChromeDriver openChromeBrowserPlain() {
    return openChromeBrowser(new ChromeOptions())
}

ChromeDriver openChromeBrowserInIncognitoMode() {
    ChromeOptions options = new ChromeOptions()

    options.addArguments('???incognito')

    return openChromeBrowser(options)
}

ChromeDriver openChromeBrowser(ChromeOptions options) {
    System.setProperty('webdriver.chrome.driver', DriverFactory.getChromeDriverPath())

    return new ChromeDriver(options)
}

Dimension resizeHorizontalHalfLocateLeft(WebDriver driver) {
    Dimension d = resizeToHorizontalHalf(driver)

    driver.manage().window().setPosition(new Point(0, 0))

    return d
}

Dimension resizeHorizontalHalfLocateRight(WebDriver driver) {
    Dimension d = resizeToHorizontalHalf(driver)

    driver.manage().window().setPosition(new Point(d.getWidth(), 0))

    return d
}

Dimension resizeToHorizontalHalf(WebDriver driver) {
    driver.manage().window().maximize()

    Dimension maxDim = driver.manage().window().getSize()

    Dimension curDim = new Dimension(((maxDim.getWidth() / 2) as Integer), maxDim.getHeight())

    driver.manage().window().setSize(curDim)

    return curDim
}

