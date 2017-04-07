package com.example;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@Theme ( "valo" )
@SpringUI
public class MyVaadinUI extends UI {

    @Override
    protected void init ( VaadinRequest request ) {

        final VerticalLayout root = new VerticalLayout ();
        root.setSizeFull ();
        root.setMargin ( true );
        root.setSpacing ( true );
        setContent ( root );

        final Panel viewContainer = new Panel ();
        viewContainer.setSizeFull ();
        root.addComponent ( viewContainer );
        root.setExpandRatio ( viewContainer, 1.0f );

        Label label = new Label ( "Hello World" );

        HorizontalLayout mainLayout = new HorizontalLayout ();
        mainLayout.setSizeFull ();
        mainLayout.addComponent ( label );
        mainLayout.setComponentAlignment ( label, Alignment.MIDDLE_CENTER );

        viewContainer.setContent ( mainLayout );
    }
}