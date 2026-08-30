package com.google.firebase.crashlytics.internal;

/* JADX INFO: loaded from: classes5.dex */
public interface CrashlyticsNativeComponent {
    com.google.firebase.crashlytics.internal.NativeSessionFileProvider getSessionFileProvider(java.lang.String str);

    boolean hasCrashDataForCurrentSession();

    boolean hasCrashDataForSession(java.lang.String str);

    void prepareNativeSession(java.lang.String str, java.lang.String str2, long j, com.google.firebase.crashlytics.internal.model.StaticSessionData staticSessionData);
}
