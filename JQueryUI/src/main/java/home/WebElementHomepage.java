package home;

import common.WebAPI;

public class WebElementHomepage extends WebAPI {

    public static final String xPathDropTo="//div[@id='draggable']";
    public static final String xPathDialogTab= "//a[contains(text(),'Dialog')]";
    public static final String xPathDialogiFrame = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/iframe[1]";
    public static final String xPathDialogPopUp = "/html[1]/body[1]/div[1]";
    public static final String xPathJQueryImage = "//h2[@class='logo']//a[contains(text(),'jQuery UI')]";
    public static final String xPathJQueryCalenderIFrame = "//iframe[@class='demo-frame']";
    public static final String xPathJQuerySelectMenuIFrmae = "//iframe[@class='demo-frame']";
    public static final String xPathPracticeOpenNewTab = "//a[@id='opentab']";
    public static final String xPathValidateHomePage="//p[@class='intro']";
    public static final String xPathResizeableButton = "//a[contains(text(),'Resizable')]";
    public static final String xPathResizeFrameLocator = "//iframe[@class='demo-frame']";
    public static final String xPathResizeSnippet = "//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']";
    public static final String xPathRadioFrame = "//iframe[@class='demo-frame']";
    public static final String xPathDragAndDropButton = "//a[contains(text(),'Droppable')]";
    public static final String xPathDragAndDropFrame = "//iframe[@class='demo-frame']";
    public static final String xPathDragFrom = "//div[@id='draggable']";

}
