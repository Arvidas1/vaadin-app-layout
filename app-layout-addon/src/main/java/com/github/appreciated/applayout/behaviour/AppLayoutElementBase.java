package com.github.appreciated.applayout.behaviour;

import com.github.appreciated.applayout.builder.interfaces.NavigationElementContainer;
import com.github.appreciated.applayout.design.AppLayoutDesign;
import com.github.appreciated.applayout.webcomponents.applayout.AppDrawer;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * The interface every AppLayout Variant is required to be implemented to allow any {@link com.github.appreciated.applayout.builder.AppLayoutBuilder} to build it.
 */

public interface AppLayoutElementBase extends NavigationElementContainer {

    String getStyleName();

    void setDesign(AppLayoutDesign design);

    Component getTitleComponent();

    AppDrawer getDrawer();

    void setTitleComponent(Component titleComponent);

    HorizontalLayout getTitleWrapper();

    void setIconComponent(Component appBarIconComponent);

    void setAppLayoutContent(HasElement content);

    void setBackNavigation(boolean visible);

    void setAppBar(Component component);

    void setAppMenu(NavigationElementContainer component);
}
