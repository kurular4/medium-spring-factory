package com.omer.medium.factorypattern.viewer;

public interface Viewer<T> {
    ViewerType getType();
    void view(T object);
}
