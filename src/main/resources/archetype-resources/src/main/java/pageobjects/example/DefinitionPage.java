#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.pageobjects.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cognifide.qa.bb.qualifier.PageObject;

@PageObject
public class DefinitionPage {

  @FindBy(id = "firstHeading")
  private WebElement heading;

  public String getHeading() {
    return heading.getText();
  }
}
