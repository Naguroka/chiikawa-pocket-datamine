package com.google.firebase;

/* JADX INFO: compiled from: Firebase.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\rH\u0082\b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u001a\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"app", "Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/Firebase;", "getApp", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/FirebaseApp;", "options", "Lcom/google/firebase/FirebaseOptions;", "getOptions", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/FirebaseOptions;", "coroutineDispatcher", "Lcom/google/firebase/components/Component;", "Lkotlinx/coroutines/CoroutineDispatcher;", "T", "", "name", "", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "context", "Landroid/content/Context;", "com.google.firebase-firebase-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FirebaseKt {
    public static final com.google.firebase.FirebaseApp getApp(com.google.firebase.Firebase firebase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        com.google.firebase.FirebaseApp firebaseApp = com.google.firebase.FirebaseApp.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseApp, "getInstance()");
        return firebaseApp;
    }

    public static final com.google.firebase.FirebaseApp app(com.google.firebase.Firebase firebase, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.google.firebase.FirebaseApp firebaseApp = com.google.firebase.FirebaseApp.getInstance(name);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseApp, "getInstance(name)");
        return firebaseApp;
    }

    public static final com.google.firebase.FirebaseApp initialize(com.google.firebase.Firebase firebase, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return com.google.firebase.FirebaseApp.initializeApp(context);
    }

    public static final com.google.firebase.FirebaseApp initialize(com.google.firebase.Firebase firebase, android.content.Context context, com.google.firebase.FirebaseOptions options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        com.google.firebase.FirebaseApp firebaseAppInitializeApp = com.google.firebase.FirebaseApp.initializeApp(context, options);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseAppInitializeApp, "initializeApp(context, options)");
        return firebaseAppInitializeApp;
    }

    public static final com.google.firebase.FirebaseApp initialize(com.google.firebase.Firebase firebase, android.content.Context context, com.google.firebase.FirebaseOptions options, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.google.firebase.FirebaseApp firebaseAppInitializeApp = com.google.firebase.FirebaseApp.initializeApp(context, options, name);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseAppInitializeApp, "initializeApp(context, options, name)");
        return firebaseAppInitializeApp;
    }

    public static final com.google.firebase.FirebaseOptions getOptions(com.google.firebase.Firebase firebase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        com.google.firebase.FirebaseOptions options = getApp(com.google.firebase.Firebase.INSTANCE).getOptions();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(options, "Firebase.app.options");
        return options;
    }

    private static final /* synthetic */ <T extends java.lang.annotation.Annotation> com.google.firebase.components.Component<kotlinx.coroutines.CoroutineDispatcher> coroutineDispatcher() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.google.firebase.components.Component.Builder builder = com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(java.lang.annotation.Annotation.class, kotlinx.coroutines.CoroutineDispatcher.class));
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.google.firebase.components.Component.Builder builderAdd = builder.add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.qualified(java.lang.annotation.Annotation.class, java.util.concurrent.Executor.class)));
        kotlin.jvm.internal.Intrinsics.needClassReification();
        com.google.firebase.components.Component<kotlinx.coroutines.CoroutineDispatcher> componentBuild = builderAdd.factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.FirebaseKt.coroutineDispatcher.1
            @Override // com.google.firebase.components.ComponentFactory
            public final kotlinx.coroutines.CoroutineDispatcher create(com.google.firebase.components.ComponentContainer componentContainer) {
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                java.lang.Object obj = componentContainer.get(com.google.firebase.components.Qualified.qualified(java.lang.annotation.Annotation.class, java.util.concurrent.Executor.class));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.Executor) obj);
            }
        }).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(componentBuild, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return componentBuild;
    }
}
