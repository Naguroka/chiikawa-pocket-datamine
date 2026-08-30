package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Log extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log {
    private final java.lang.String content;

    private AutoValue_CrashlyticsReport_Session_Event_Log(java.lang.String str) {
        this.content = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log
    public java.lang.String getContent() {
        return this.content;
    }

    public java.lang.String toString() {
        return "Log{content=" + this.content + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log) {
            return this.content.equals(((com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log) obj).getContent());
        }
        return false;
    }

    public int hashCode() {
        return this.content.hashCode() ^ 1000003;
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder {
        private java.lang.String content;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder setContent(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null content");
            }
            this.content = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log build() {
            if (this.content == null) {
                throw new java.lang.IllegalStateException("Missing required properties: content");
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Log(this.content);
        }
    }
}
