package com.omer.medium.factorypattern.service;

import com.omer.medium.factorypattern.model.Document;
import com.omer.medium.factorypattern.model.Image;
import com.omer.medium.factorypattern.model.Video;
import com.omer.medium.factorypattern.viewer.ViewerFactory;
import com.omer.medium.factorypattern.viewer.ViewerType;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ViewerService {
    private final ViewerFactory viewerFactory;

    public ViewerService(ViewerFactory viewerFactory) {
        this.viewerFactory = viewerFactory;
    }

    public void view(ViewerType viewerType, Object o) {
        viewerFactory.getViewer(viewerType).view(o);
    }

    @PostConstruct
    public void test() {
        view(ViewerType.VIDEO, new Video());
        view(ViewerType.DOCUMENT, new Document());
        view(ViewerType.IMAGE, new Image());
    }
}
