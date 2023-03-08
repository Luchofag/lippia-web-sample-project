package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static lippia.web.services.AutoTestService.closeAds;


public class ShopService extends ActionManager {


        public static double taxCalculate() {

                WebDriver webDriver = DriverManager.getDriverInstance();
                WebElement subTElement = webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[3]/div[2]/table/tfoot/tr[1]/td/span/text()"));
                String subTotalText = subTElement.getText();
                subTotalText = subTotalText.replaceAll("[₹,]+", "");
                WebElement taxElement = webDriver.findElement((By.xpath("//*[@id=\"order_review\"]/table/tfoot/tr[2]/td/span/text()")));
                String taxElemText = taxElement.getText();
                taxElemText = taxElemText.replaceAll("[₹,]+", "");
                float subtotal = Float.parseFloat(subTotalText);
                float impuesto = Float.parseFloat(taxElemText);
                System.out.println(impuesto + subtotal);
                float calculo = subtotal * impuesto;
                return calculo;
    }
}