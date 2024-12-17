package pom.util;

import org.openqa.selenium.By;

public class ConstantsConfig {
	
	public static final String TSE_StaffUser = "flemingclara@3diemail.com";
	public static final String TSE_StaffPass = "admin@123456";
	
	public static final String LADBS_URL = "https://angelenologinuat.lacity.org/";
	public static final By LADBS_Username = By.xpath("//input[@id='idp-discovery-username']");
	public static final By LADBS_Next = By.xpath("//*[@id='idp-discovery-submit']");
	public static final By LADBS_Password = By.xpath("//*[@id='okta-signin-password']");
	public static final By LADBS_SignIn = By.xpath("//input[@id='okta-signin-submit']");
	
	public static final By LADBS_Service = By.xpath("(//button[@type='button'])[2]");
	public static final By PermitLA = By.xpath("//p[normalize-space()='PermitLA']");
	
	public static final By ClosePopup = By.xpath("//img[@src='login_files/close.png']");
	public static final By Angeleno_login = By.xpath("//img[@src='login_files/angeleno_login_btn.png']");
	
	public static final By ReviewTSE_FromDate = By.xpath("//a[@id='T:dclay:oc_8835434672rusPHz1:id1::glyph']");
	public static final By ReviewTSE_FromYear = By.xpath("//input[@id='T:dclay:oc_8835434672rusPHz1:id1::pop::cd::ys::content']");
	public static final By ReviewTSE_FromMonth = By.xpath("//select[@id='T:dclay:oc_8835434672rusPHz1:id1::pop::cd::mSel::content']");
	
	public static final By ReviewTSE_ToDate = By.xpath("//a[@id='T:dclay:oc_8835434672rusPHz1:id2::glyph']");
	public static final By ReviewTSE_ToYear = By.xpath("//input[@id='T:dclay:oc_8835434672rusPHz1:id2::pop::cd::ys::content']");
	public static final By ReviewTSE_ToMonth = By.xpath("//select[@id='T:dclay:oc_8835434672rusPHz1:id2::pop::cd::mSel::content']");
	public static final String daycellclass = "af_chooseDate_regular-day";
	
	public static final By ClickonReviewTSE = By.xpath("//a[text()='Review TSE Clearance Applications']");
	
	
	public static final String URL="https://www.tutorialspoint.com/selenium/practice/text-box.php";
	public static final String ChromeDriverPath="C:/Users/IDC-212/Downloads/Selenium Code/ExtentReportGeneration/drivers/chromedriver.exe";

	public static final String AlertURL= "https://www.tutorialspoint.com/selenium/practice/alerts.php";
	public static final String ModalDialogs = "https://www.tutorialspoint.com/selenium/practice/modal-dialogs.php";
	public static final String AccordionURL = "https://www.tutorialspoint.com/selenium/practice/accordion.php";
	public static final String SliderURL = "https://www.tutorialspoint.com/selenium/practice/slider.php";
	public static final String ToolTipsURL= "https://www.tutorialspoint.com/selenium/practice/tool-tips.php";
	public static final String StaticWebTableURL = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
	public static final String DatePicker = "https://www.tutorialspoint.com/selenium/practice/date-picker.php";
	public static final String FormData = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
	
	public static final String GoogleURL = "https://www.google.co.in/";
	public static final String BingURL = "https://www.bing.com/";
	//Selenium Using Java
	public static final By ClickOn_TextBox=By.xpath("//a[normalize-space()='Text Box']");
	public static final By FullName = By.xpath("//input[@id='fullname']");
	public static final By Email = By.xpath("//input[@id='email']");
	public static final By CurrentAddress = By.xpath("//textarea[@id='address']");
	public static final By Password = By.xpath("//input[@id='password']");
	public static final By SubmitBtn = By.xpath("//input[@value='Submit']");
	
	public static final String FullName1 = "Joel Smith";
	public static final String Email1 = "Joel@yopmail.com";
	public static final String CurrentAddress1 = "201 n Fig";
	public static final String Password1 = "Abc@123";
	
	public static final By CheckboxPage = By.xpath("//a[normalize-space()='Check Box']");
	public static final By ButtonsPage = By.xpath("//a[normalize-space()='Buttons']");
	public static final By RadioButtonPage = By.xpath("//a[normalize-space()='Radio Button']");
	public static final By LinksPage = By.xpath("//a[normalize-space()='Links']");
	public static final By UploadFilePage = By.xpath("//a[normalize-space()='Upload and Download']");
	
	public static final By MainLevel1_Checkbox = By.xpath("//input[@id='c_bs_1']");
	public static final By MainLevel1_Plus = By.xpath("//li[@id='bs_1']/span[1]");
	
	public static final By SubLevel1_Checkbox = By.xpath("//input[@id='c_bf_1']");
	public static final By SubKevel1_Plus = By.xpath("//li[@id='bf_1']//span[@class='plus']");
	public static final By LastLevel1 = By.xpath("//input[@id='c_io_1']");
	public static final By LastLevel2 = By.xpath("//input[@id='c_io_2']");
	public static final By LastLevel3 = By.xpath("//input[@id='c_io_3']");
	public static final By LastLevel4 = By.xpath("//input[@id='c_io_4']");
	
	public static final By SubLevel2_Checkbox = By.xpath("//input[@id='c_bf_2']");
	public static final By SubKevel2_Plus = By.xpath("//li[@id='bf_2']//span[@class='plus']");
	public static final By LastLevel5 = By.xpath("//input[@id='c_io_5']");
	public static final By LastLevel6 = By.xpath("//input[@id='c_io_6']");
	public static final By LastLevel7 = By.xpath("//input[@id='c_io_7']");
	public static final By LastLevel8 = By.xpath("//input[@id='c_io_8']");
	
	
	public static final By MainLevel2_Checkbox = By.xpath("//input[@id='c_bs_2']");
	public static final By MainLevel2_Plus = By.xpath("//li[@id='bs_2']/span[1]");
	
	public static final By SubLevel3_Checkbox = By.xpath("//input[@id='c_bf_4']");
	public static final By SubLevel4_Checkbox = By.xpath("//input[@id='c_bf_4']");
	
	//Buttons
	public static final By Click = By.xpath("//button[normalize-space()='Click Me']");
	public static final By RightClick = By.xpath("//button[normalize-space()='Right Click Me']");
	public static final By DoubleClick = By.xpath("//button[normalize-space()='Double Click Me']");
	public static final By ClickMessage = By.xpath("//div[@id='welcomeDiv']");
	
	//Radio Buttons
	public static final By Yes_Radio = By.xpath("//input[@value='igottwo']");
	public static final By Impressive_Radio = By.xpath("//input[@value='igotthree']");
	public static final By Disable_Radio = By.xpath("//input[@value='option3']");
	
	public static final By Yes_RadioCheckedMessage = By.xpath("//b[normalize-space()='Yes']");
	public static final By Impressive_RadioCheckedMessage = By.xpath("//b[normalize-space()='Impressive']");

	public static final By YesRadioMessage = By.xpath("//div[@id='check' and contains(text(), 'You have checked')]");
	public static final By ImpressiveRadioMessage = By.xpath("//div[@id='check' and contains(text(), 'You have checked')]");
	
	public static final By TotalLinks = By.xpath("//*[@class='col-md-8 col-lg-8 col-xl-8']//a");

	//Upload-Download File
	public static final By UploadFile = By.xpath("//input[@id='uploadFile']");
	public static final By DownloadFile = By.xpath("//a[@id='downloadButton']");
	public static String FilePath = "D:\\Pankaj\\File\\sampleFile.jpeg";
	
	//Alert
	public static final By Alert1 = By.xpath("//div[@class='d-flex justify-content-between']/button");
	public static final By Alert2 = By.xpath("//div[@class='d-flex justify-content-between mt-4'][1]/button");
	public static final By Alert3 = By.xpath("//div[@class='d-flex justify-content-between mt-4'][2]/button");
	public static final By Alert4 = By.xpath("//div[@class='d-flex justify-content-between mt-4'][3]/button");
	
	public static final By AlertResult = By.xpath("//div[@id='desk']");
	
	public static final By SmallModal = By.xpath("//button[normalize-space()='Small Modal']");
	public static final By LargeModal = By.xpath("//button[normalize-space()='Large Modal']");
	
	public static final By SmallModalCloseBtn = By.xpath("//*[@class='btn btn-primary'][@data-bs-target='#exampleModalToggle2']");
	public static final By SmallModalText = By.xpath("//div[@class='modal-dialog modal-sm']//div[@class='modal-body'][contains(text(),'Show a second modal and hide this one with the but')]");
	
	public static final By LargeModalCloseBtn = By.xpath("//*[@class='btn btn-primary'][@data-bs-target='#exampleModalLg'][normalize-space()='Close']");
	public static final By LargeModalText = By.xpath("//div[@class='modal-dialog modal-lg']//div[@class='modal-body'][contains(text(),'Show a second modal and hide this one with the but')]");
	
	//Accordion
	public static final By Accordion1 = By.xpath("//h2[@id='headingTwentyOne']");
	public static final By Accordion2 = By.xpath("//h2[@id='headingTwentyTwo']");
	public static final By Accordion3 = By.xpath("//h2[@id='headingTwentyThree']");
	
	public static final By sliderHandle = By.xpath("//input[@id='ageInputId']");
	
	public static final By TooltiponTop = By.xpath("//button[normalize-space()='Tooltip on top']");
	public static final By TooltiponRight = By.xpath("//button[normalize-space()='Tooltip on right']");
	public static final By TooltiponBottom = By.xpath("//button[normalize-space()='Tooltip on bottom']");
	public static final By TooltiponLeft = By.xpath("//button[normalize-space()='Tooltip on left']");
	
	public static final By StaticWebTable = By.xpath("//table[@id='customers']");
	public static final By StaticWebTableRows = By.xpath("//table[@id='customers']/tbody/tr");
	public static final By StaticWebTableColumns = By.xpath("//table[@id='customers']/tbody/tr/th");
	
	//DatePicker
	public static final By DatePicker1 = By.xpath("//input[@id='datetimepicker1']");
	public static final By DatePicker2 = By.xpath("//input[@id='datetimepicker2']");
	
	public static final By DatePicker1Visible = By.xpath("//div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']");
	public static final By DatePicker2Visible = By.xpath("//div[@class='flatpickr-calendar hasTime animate open arrowTop arrowLeft']");
	
	public static final By Calendar1Month = By.xpath("//div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']//select[@aria-label='Month']");
	public static final By Calendar1Year = By.xpath("//div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']//input[@aria-label='Year']");
	
	public static final By Calendar2Month = By.xpath("//div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']//select[@aria-label='Month']");
	public static final By Calendar2Year = By.xpath("//div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']//input[@aria-label='Year']");

	public static final By Hours = By.xpath("//div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']//input[@aria-label='Hour']");
	public static final By Minute = By.xpath("//div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']//input[@aria-label='Minute']");
	public static final By toggle_AMPM = By.xpath("//div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']//span[@title='Click to toggle'][normalize-space()='PM']");

	//Form
	public static final By F_name = By.xpath("//input[@id='name']");
	public static final By F_email = By.xpath("//input[@id='email']");
	
	
}
