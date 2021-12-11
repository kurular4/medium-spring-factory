package com.omer.medium.factorypattern.viewer;

import com.omer.medium.factorypattern.model.Image;
import org.springframework.stereotype.Component;

@Component
public class ImageViewer implements Viewer<Image> {
    private static final ViewerType VIEWER_TYPE = ViewerType.IMAGE;

    @Override
    public ViewerType getType() {
        return VIEWER_TYPE;
    }

    @Override
    public void view(Image object) {
        System.out.println("Viewing image");
        // some logic to view image
    }
}
