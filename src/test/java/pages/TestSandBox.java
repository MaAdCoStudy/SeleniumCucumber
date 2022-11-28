package pages;

public class TestSandBox extends BasePage {
    //private String categoryDropdown = "//select[@id='testingDropdown']";
    private String categoryDropdown = "//select[@id='select']";

    public TestSandBox(){
        super(driver);
    }

    public void navigateToSandbox(){
        //navigateTo("https://www.testandquiz.com/selenium/testing.html");
        navigateTo("https://latex.vercel.app/elements#forms__select");
    }

    public void selectCategory(String category){
        //selectFromDropdownByValue(categoryDropdown, category);
        selectFromDropdownByText(categoryDropdown, category);
    }
}