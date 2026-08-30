package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
public class DependencyCycleException extends com.google.firebase.components.DependencyException {
    private final java.util.List<com.google.firebase.components.Component<?>> componentsInCycle;

    public DependencyCycleException(java.util.List<com.google.firebase.components.Component<?>> list) {
        super("Dependency cycle detected: " + java.util.Arrays.toString(list.toArray()));
        this.componentsInCycle = list;
    }

    public java.util.List<com.google.firebase.components.Component<?>> getComponentsInCycle() {
        return this.componentsInCycle;
    }
}
