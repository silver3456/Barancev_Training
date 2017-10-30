package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


    @Test
    public void testGroupDeletion() {

       app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage(By.linkText("group page"));
    }

}
