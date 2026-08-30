package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class Registrar$$Lambda$1 implements com.google.firebase.components.ComponentFactory {
    static final com.google.firebase.components.ComponentFactory $instance = new com.google.firebase.iid.Registrar$$Lambda$1();

    private Registrar$$Lambda$1() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
        return com.google.firebase.iid.Registrar.lambda$getComponents$1$Registrar(componentContainer);
    }
}
