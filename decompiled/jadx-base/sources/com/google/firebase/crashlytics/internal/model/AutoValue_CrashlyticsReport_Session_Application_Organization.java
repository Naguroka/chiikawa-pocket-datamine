package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Application_Organization extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization {
    private final java.lang.String clsId;

    private AutoValue_CrashlyticsReport_Session_Application_Organization(java.lang.String str) {
        this.clsId = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    public java.lang.String getClsId() {
        return this.clsId;
    }

    public java.lang.String toString() {
        return "Organization{clsId=" + this.clsId + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization) {
            return this.clsId.equals(((com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization) obj).getClsId());
        }
        return false;
    }

    public int hashCode() {
        return this.clsId.hashCode() ^ 1000003;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    protected com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder toBuilder() {
        return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization.Builder(this);
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder {
        private java.lang.String clsId;

        Builder() {
        }

        private Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization organization) {
            this.clsId = organization.getClsId();
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder setClsId(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null clsId");
            }
            this.clsId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization build() {
            if (this.clsId == null) {
                throw new java.lang.IllegalStateException("Missing required properties: clsId");
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application_Organization(this.clsId);
        }
    }
}
