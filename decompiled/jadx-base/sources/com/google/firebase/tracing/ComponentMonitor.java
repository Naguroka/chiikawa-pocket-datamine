package com.google.firebase.tracing;

/* JADX INFO: loaded from: classes5.dex */
public class ComponentMonitor implements com.google.firebase.components.ComponentRegistrarProcessor {
    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public java.util.List<com.google.firebase.components.Component<?>> processRegistrar(com.google.firebase.components.ComponentRegistrar componentRegistrar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final com.google.firebase.components.Component<?> componentWithFactory : componentRegistrar.getComponents()) {
            final java.lang.String name = componentWithFactory.getName();
            if (name != null) {
                componentWithFactory = componentWithFactory.withFactory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.tracing.ComponentMonitor$$ExternalSyntheticLambda0
                    @Override // com.google.firebase.components.ComponentFactory
                    public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                        return com.google.firebase.tracing.ComponentMonitor.lambda$processRegistrar$0(name, componentWithFactory, componentContainer);
                    }
                });
            }
            arrayList.add(componentWithFactory);
        }
        return arrayList;
    }

    static /* synthetic */ java.lang.Object lambda$processRegistrar$0(java.lang.String str, com.google.firebase.components.Component component, com.google.firebase.components.ComponentContainer componentContainer) {
        try {
            com.google.firebase.tracing.FirebaseTrace.pushTrace(str);
            return component.getFactory().create(componentContainer);
        } finally {
            com.google.firebase.tracing.FirebaseTrace.popTrace();
        }
    }
}
