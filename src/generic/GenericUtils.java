package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils {
	public static void gSelectByIndex(WebElement element, int n)
	{
		Select sel=new Select(element);
		sel.selectByIndex(n);
	}
	public static void gSelectByValue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public static void gSelectByVisibleText(WebElement element, String vt)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(vt);
	}

}
