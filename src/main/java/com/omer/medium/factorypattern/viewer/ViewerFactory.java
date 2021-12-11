package com.omer.medium.factorypattern.viewer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class ViewerFactory {
    private Map<ViewerType, Viewer> viewerMap;

    @Autowired
    private ViewerFactory(List<Viewer> viewers) {
        viewerMap = viewers.stream().collect(Collectors.toUnmodifiableMap(Viewer::getType, Function.identity()));
    }

    public Viewer getViewer(ViewerType viewerType) {
        return Optional.ofNullable(viewerMap.get(viewerType)).orElseThrow(IllegalArgumentException::new);
    }
}
