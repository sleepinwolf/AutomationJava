package screens;

import testUI.elements.UIElement;

import static testUI.Utils.By.byAndroidUIAutomator;
import static testUI.Utils.By.byId;
import static testUI.elements.TestUI.E;

public class LandingScreen {
    private final UIElement shoppingListInput = E(byAndroidUIAutomator("textContains(\"Add a shopping list\")"));
    private final UIElement inputShoppingList = E(byId("editText"));
    private final UIElement addListButton = E(byId("android:id/button1"));
    private final UIElement titleCheck = E(byAndroidUIAutomator("textContains(\"OurGroceries\")"));
    private final UIElement shoppingListCheck = E(byAndroidUIAutomator("textContains(\"Add a shopping list...\")"));
    private final UIElement addRecipeCheck = E(byAndroidUIAutomator("textContains(\"Add a recipe\")"));


    public void checkLandingScreen() {
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
}
