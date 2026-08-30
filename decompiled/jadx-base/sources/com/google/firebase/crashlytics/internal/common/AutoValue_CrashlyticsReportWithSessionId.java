package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReportWithSessionId extends com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId {
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport report;
    private final java.io.File reportFile;
    private final java.lang.String sessionId;

    AutoValue_CrashlyticsReportWithSessionId(com.google.firebase.crashlytics.internal.model.CrashlyticsReport crashlyticsReport, java.lang.String str, java.io.File file) {
        if (crashlyticsReport == null) {
            throw new java.lang.NullPointerException("Null report");
        }
        this.report = crashlyticsReport;
        if (str == null) {
            throw new java.lang.NullPointerException("Null sessionId");
        }
        this.sessionId = str;
        if (file == null) {
            throw new java.lang.NullPointerException("Null reportFile");
        }
        this.reportFile = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport getReport() {
        return this.report;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public java.lang.String getSessionId() {
        return this.sessionId;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public java.io.File getReportFile() {
        return this.reportFile;
    }

    public java.lang.String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.report + ", sessionId=" + this.sessionId + ", reportFile=" + this.reportFile + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId) obj;
        return this.report.equals(crashlyticsReportWithSessionId.getReport()) && this.sessionId.equals(crashlyticsReportWithSessionId.getSessionId()) && this.reportFile.equals(crashlyticsReportWithSessionId.getReportFile());
    }

    public int hashCode() {
        return ((((this.report.hashCode() ^ 1000003) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.reportFile.hashCode();
    }
}
