package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CrashlyticsReportWithSessionId {
    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport getReport();

    public abstract java.io.File getReportFile();

    public abstract java.lang.String getSessionId();

    public static com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId create(com.google.firebase.crashlytics.internal.model.CrashlyticsReport crashlyticsReport, java.lang.String str, java.io.File file) {
        return new com.google.firebase.crashlytics.internal.common.AutoValue_CrashlyticsReportWithSessionId(crashlyticsReport, str, file);
    }
}
