package com.omer.medium.factorypattern.viewer;

import com.omer.medium.factorypattern.model.Video;
import org.springframework.stereotype.Component;

@Component
public class VideoViewer implements Viewer<Video> {
    private static final ViewerType VIEWER_TYPE = ViewerType.VIDEO;

    @Override
    public ViewerType getType() {
        return VIEWER_TYPE;
    }

    @Override
    public void view(Video object) {
        System.out.println("Viewing video");
        // some logic to view video
    }
}
