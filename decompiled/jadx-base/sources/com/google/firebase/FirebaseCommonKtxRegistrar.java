package com.google.firebase;

/* JADX INFO: compiled from: Firebase.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements com.google.firebase.components.ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        com.google.firebase.components.Component componentBuild = com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, kotlinx.coroutines.CoroutineDispatcher.class)).add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, java.util.concurrent.Executor.class))).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            public final kotlinx.coroutines.CoroutineDispatcher create(com.google.firebase.components.ComponentContainer componentContainer) {
                java.lang.Object obj = componentContainer.get(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, java.util.concurrent.Executor.class));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.Executor) obj);
            }
        }).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(componentBuild, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        com.google.firebase.components.Component componentBuild2 = com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Lightweight.class, kotlinx.coroutines.CoroutineDispatcher.class)).add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Lightweight.class, java.util.concurrent.Executor.class))).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // com.google.firebase.components.ComponentFactory
            public final kotlinx.coroutines.CoroutineDispatcher create(com.google.firebase.components.ComponentContainer componentContainer) {
                java.lang.Object obj = componentContainer.get(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Lightweight.class, java.util.concurrent.Executor.class));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.Executor) obj);
            }
        }).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(componentBuild2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        com.google.firebase.components.Component componentBuild3 = com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, kotlinx.coroutines.CoroutineDispatcher.class)).add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, java.util.concurrent.Executor.class))).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // com.google.firebase.components.ComponentFactory
            public final kotlinx.coroutines.CoroutineDispatcher create(com.google.firebase.components.ComponentContainer componentContainer) {
                java.lang.Object obj = componentContainer.get(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, java.util.concurrent.Executor.class));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.Executor) obj);
            }
        }).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(componentBuild3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        com.google.firebase.components.Component componentBuild4 = com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.UiThread.class, kotlinx.coroutines.CoroutineDispatcher.class)).add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.UiThread.class, java.util.concurrent.Executor.class))).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // com.google.firebase.components.ComponentFactory
            public final kotlinx.coroutines.CoroutineDispatcher create(com.google.firebase.components.ComponentContainer componentContainer) {
                java.lang.Object obj = componentContainer.get(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.UiThread.class, java.util.concurrent.Executor.class));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.Executor) obj);
            }
        }).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(componentBuild4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.google.firebase.components.Component[]{componentBuild, componentBuild2, componentBuild3, componentBuild4});
    }
}
