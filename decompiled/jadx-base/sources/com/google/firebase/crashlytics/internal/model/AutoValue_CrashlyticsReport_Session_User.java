package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_User extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User {
    private final java.lang.String identifier;

    private AutoValue_CrashlyticsReport_Session_User(java.lang.String str) {
        this.identifier = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
    public java.lang.String getIdentifier() {
        return this.identifier;
    }

    public java.lang.String toString() {
        return "User{identifier=" + this.identifier + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User) {
            return this.identifier.equals(((com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User) obj).getIdentifier());
        }
        return false;
    }

    public int hashCode() {
        return this.identifier.hashCode() ^ 1000003;
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder {
        private java.lang.String identifier;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder setIdentifier(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null identifier");
            }
            this.identifier = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User build() {
            if (this.identifier == null) {
                throw new java.lang.IllegalStateException("Missing required properties: identifier");
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User(this.identifier);
        }
    }
}
