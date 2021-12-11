package com.omer.medium.factorypattern.viewer;

import com.omer.medium.factorypattern.model.Document;
import org.springframework.stereotype.Component;

@Component
public class DocumentViewer implements Viewer<Document>{
    private static final ViewerType VIEWER_TYPE = ViewerType.DOCUMENT;

    @Override
    public ViewerType getType() {
        return VIEWER_TYPE;
    }

    @Override
    public void view(Document object) {
        System.out.println("Viewing document");
        // some logic to view document
    }
}
