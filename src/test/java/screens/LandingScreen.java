package screens;

import testUI.elements.UIElement;

import static testUI.Utils.By.*;
import static testUI.elements.TestUI.E;

public class LandingScreen {
    private final UIElement shoppingListInput = E(byAndroidUIAutomator("textContains(\"Add a shopping list\")"));
    private final UIElement inputShoppingList = E(byId("editText"));
    private final UIElement addListButton = E(byId("android:id/button1"));
    private final UIElement titleCheck = E(byAndroidUIAutomator("textContains(\"OurGroceries\")"));
    private final UIElement shoppingListCheck = E(byAndroidUIAutomator("textContains(\"Add a shopping list...\")"));
    private final UIElement addRecipeCheck = E(byAndroidUIAutomator("textContains(\"Add a recipe\")"));
    private final UIElement clickOnShopingList = E(byAndroidUIAutomator("textContains(\"First List\")"));
    private final UIElement clickOnOptionButton = E(byAccesibilityId("More options"));
    private final UIElement clickOnDeleteList = E(byAndroidUIAutomator("textContains(\"Delete list\")"));


    private final UIElement backArrow = E(byAccesibilityId("Navigate up"));
    private final UIElement barCode = E(byId("menu.ScanBarcode"));
    private final UIElement plusButton = E(byId("menu.AddItem"));
    private final UIElement addItemInput = E(byId("android:id/text1"));


    public void checkShoppingList(String arg){
        backArrow.waitFor(5).untilIsVisible();
        barCode.waitFor(5).untilIsVisible();
        plusButton.waitFor(5).untilIsVisible();
        addItemInput.waitFor(5).untilIsVisible();
        E(byAndroidUIAutomator("text(\""+arg+ "\")")).waitFor(5).untilIsVisible();
    }

    public void checkLandingScreen(){
        titleCheck.waitFor(5).untilIsVisible();
        shoppingListCheck.waitFor(5).untilIsVisible();
        addRecipeCheck.waitFor(5).untilIsVisible();


    }
    public void clickAddShoppingList() {
        shoppingListInput.click();
    }

    public void typeInShoppingName(String var) {
        inputShoppingList.sendKeys(var);
    }

    public void clickOnAddList() {
        addListButton.shouldHave().attribute("text").equalTo("ADD LIST");
        addListButton.click();
    }

    public void checkNewList(String arg) {
        UIElement element = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        element.waitFor(5).untilIsVisible();
    }

    public void clickOnShoppingList(){
        clickOnShopingList.click();

    }

    public void clickOnOptionButton(){
        clickOnOptionButton.click();
    }
    public void setClickOnDeleteList(){
        clickOnDeleteList.click();
    }

    public void checkRemovedList(String arg){
        UIElement checkList = E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
        checkList.waitFor(5).untilNotVisible();
    }
}
