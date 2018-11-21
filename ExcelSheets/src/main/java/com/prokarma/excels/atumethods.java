package com.prokarma.excels;




import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;








import org.testng.collections.Lists;
import org.testng.xml.XmlSuite;

import atu.testng.reports.ATUReports;
import atu.testng.reports.utils.Utils;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.Reporter;
import org.testng.TestNG;
import org.testng.TestNG.ExitCodeListener;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class,MethodListener.class })


public class atumethods {


	
       //Set Property for ATU Reporter Configuration
		{
		System.setProperty("atu.reporter.config", "E://Gopimanohar-Prokarma//Cypress_Poc//SeleniumDemo//Resources//atu.properties");
        System.out.println(System.getProperty("atu.proj.header.logo"));
        //System.setProperty("atu.reports.dir",System.getProperty("user.dir")+"\\Results1\\" );
        //System.out.println("results root is "+System.getProperty("user.dir")+"\\Results1");
        //System.setProperty("atu.proj.header.logo",System.getProperty("user.dir")+"\\logo\\RealpageLogo.png" );
        setIndexPageDescription();
		}
  
		public static void setWebdriver(WebDriver driver) {
			ATUReports.setWebDriver(driver);
			
			}


         public static void setAuthorInfoForReports() {
             ATUReports.setAuthorInfo("Gopimanohar", Utils.getCurrentTime(),"1.0");
         	}

     	 public static void setIndexPageDescription() {
     		
     	        ATUReports.indexPageDescription = "Selenium Project Description <br/>Selenium Demo for Freshers <b>Selenium Application of HTML Tags</b>";
     	 	}
     	 
  
        public static void passResults(String Desc,String InputValue,String ExpectedValue,String ActualValue ){
            ATUReports.add(Desc,InputValue,ExpectedValue,ActualValue, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
            
            //ATUReports.add(Desc,InputValue,ExpectedValue,ActualValue, false);
        }
        
   
        public static void failResults(String Desc,String InputValue,String ExpectedValue,String ActualValue){
            ATUReports.add(Desc, InputValue,ExpectedValue,ActualValue, LogAs.FAILED, new CaptureScreen(ScreenshotOf.DESKTOP));
            //ATUReports.add(Desc,InputValue,ExpectedValue,ActualValue, false)
        }
        
        public static void warning(String Desc,String InputValue,String ExpectedValue,String ActualValue){
            ATUReports.add(Desc, InputValue,ExpectedValue,ActualValue, LogAs.WARNING, new CaptureScreen(ScreenshotOf.DESKTOP));
            //ATUReports.add(Desc,InputValue,ExpectedValue,ActualValue, false)
        }
        
        public static void info(String Desc,String InputValue,String ExpectedValue,String ActualValue){
            ATUReports.add(Desc, InputValue,ExpectedValue,ActualValue, LogAs.INFO, new CaptureScreen(ScreenshotOf.DESKTOP));
            //ATUReports.add(Desc,InputValue,ExpectedValue,ActualValue, false)
        }
        
       
		/*public static void passResults1(String Desc,String InputValue,String ExpectedValue,String ActualValue,WebElement Element ){
            ATUReports.add(Desc,InputValue,ExpectedValue,ActualValue, LogAs.PASSED, new CaptureScreen(Element));
            //ATUReports.add(Desc,InputValue,ExpectedValue,ActualValue, false);
        }
        
        public static void failResults1(String Desc,String InputValue,String ExpectedValue,String ActualValue){
            //ATUReports.add(Desc, InputValue,ExpectedValue,ActualValue, LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
            ATUReports.add(Desc,InputValue,ExpectedValue,ActualValue, true);
        }*/
        
        
        
        public  void reportsListeners(){
        	
        	Set<IReporter> m_reporters = null;//Sets.newHashSet();
        	
        	TestNG s = new TestNG();
        	s.getTestListeners();
        	System.out.println(" reports " + s.getTestListeners().size());
        	List<ISuite> suiteRunners =null;
        	for (IReporter reporter : m_reporters) {
        	      try {
        	        //long start = System.currentTimeMillis();
        	    	  List<XmlSuite> m_suites = Lists.newArrayList();
        	    	  String DEFAULT_OUTPUTDIR = "test-output";
        	    	  String m_outputDir = DEFAULT_OUTPUTDIR;
        	        reporter.generateReport(m_suites, suiteRunners, m_outputDir);
        	      }
        	      catch(Exception ex) {
        	        System.err.println("[TestNG] Reporter " + reporter + " failed");
        	        ex.printStackTrace(System.err);
        	      }
        	    }
        
        
        	
        }
        
       
        
}  	 
     
	