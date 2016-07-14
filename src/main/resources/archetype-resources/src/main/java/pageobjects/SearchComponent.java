#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cognifide.qa.bb.qualifier.PageObject;

@PageObject
public class SearchComponent {

  @FindBy(css = "input[type=search]")
  private WebElement searchField;

  public void searchForQuery(String query) {
    searchField.sendKeys(query);
    searchField.submit();
  }
}
