package com.google.firebase.crashlytics;

/* JADX INFO: compiled from: FirebaseCrashlytics.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\f\u001a#\u0010\r\u001a\u00020\u0006*\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\f\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000e"}, d2 = {"crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "Lcom/google/firebase/Firebase;", "getCrashlytics", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "recordException", "", "throwable", "", com.ironsource.y8.a.f, "Lkotlin/Function1;", "Lcom/google/firebase/crashlytics/KeyValueBuilder;", "Lkotlin/ExtensionFunctionType;", "setCustomKeys", "com.google.firebase-firebase-crashlytics"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FirebaseCrashlyticsKt {
    public static final com.google.firebase.crashlytics.FirebaseCrashlytics getCrashlytics(com.google.firebase.Firebase firebase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebase, "<this>");
        com.google.firebase.crashlytics.FirebaseCrashlytics firebaseCrashlytics = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance()");
        return firebaseCrashlytics;
    }

    public static final void setCustomKeys(com.google.firebase.crashlytics.FirebaseCrashlytics firebaseCrashlytics, kotlin.jvm.functions.Function1<? super com.google.firebase.crashlytics.KeyValueBuilder, kotlin.Unit> init) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseCrashlytics, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(init, "init");
        com.google.firebase.crashlytics.KeyValueBuilder keyValueBuilder = new com.google.firebase.crashlytics.KeyValueBuilder();
        init.invoke(keyValueBuilder);
        firebaseCrashlytics.setCustomKeys(keyValueBuilder.build$com_google_firebase_firebase_crashlytics());
    }

    public static final void recordException(com.google.firebase.crashlytics.FirebaseCrashlytics firebaseCrashlytics, java.lang.Throwable throwable, kotlin.jvm.functions.Function1<? super com.google.firebase.crashlytics.KeyValueBuilder, kotlin.Unit> init) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseCrashlytics, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "throwable");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(init, "init");
        com.google.firebase.crashlytics.KeyValueBuilder keyValueBuilder = new com.google.firebase.crashlytics.KeyValueBuilder();
        init.invoke(keyValueBuilder);
        firebaseCrashlytics.recordException(throwable, keyValueBuilder.build$com_google_firebase_firebase_crashlytics());
    }
}
