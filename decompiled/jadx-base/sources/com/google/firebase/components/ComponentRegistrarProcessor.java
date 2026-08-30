package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
public interface ComponentRegistrarProcessor {
    public static final com.google.firebase.components.ComponentRegistrarProcessor NOOP = new com.google.firebase.components.ComponentRegistrarProcessor() { // from class: com.google.firebase.components.ComponentRegistrarProcessor$$ExternalSyntheticLambda0
        @Override // com.google.firebase.components.ComponentRegistrarProcessor
        public final java.util.List processRegistrar(com.google.firebase.components.ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    java.util.List<com.google.firebase.components.Component<?>> processRegistrar(com.google.firebase.components.ComponentRegistrar componentRegistrar);
}
