package com.example.componentdragdynamic;

public class ComponentDragModel {
    private String layoutTitle;
    private String layoutButton;
    private int layoutImage;
    private String layoutSeparator;


    public ComponentDragModel(String layoutTitle, String layoutButton, int layoutImage, String layoutSeparator) {
        this.layoutTitle = layoutTitle;
        this.layoutButton = layoutButton;
        this.layoutImage = layoutImage;
        this.layoutSeparator = layoutSeparator;
    }

    public String getLayoutTitle() {
        return layoutTitle;
    }

    public void setLayoutTitle(String layoutTitle) {
        this.layoutTitle = layoutTitle;
    }

    public String getLayoutButton() {
        return layoutButton;
    }

    public void setLayoutButton(String layoutButton) {
        this.layoutButton = layoutButton;
    }

    public int getLayoutImage() {
        return layoutImage;
    }

    public void setLayoutImage(int layoutImage) {
        this.layoutImage = layoutImage;
    }

    public String getLayoutSeparator() {
        return layoutSeparator;
    }

    public void setLayoutSeparator(String layoutSeparator) {
        this.layoutSeparator = layoutSeparator;
    }
}
