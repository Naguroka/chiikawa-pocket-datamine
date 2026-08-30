package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_Application extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application {
    private final java.lang.String developmentPlatform;
    private final java.lang.String developmentPlatformVersion;
    private final java.lang.String displayVersion;
    private final java.lang.String identifier;
    private final java.lang.String installationUuid;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization organization;
    private final java.lang.String version;

    private AutoValue_CrashlyticsReport_Session_Application(java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization organization, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.identifier = str;
        this.version = str2;
        this.displayVersion = str3;
        this.organization = organization;
        this.installationUuid = str4;
        this.developmentPlatform = str5;
        this.developmentPlatformVersion = str6;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public java.lang.String getIdentifier() {
        return this.identifier;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public java.lang.String getVersion() {
        return this.version;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public java.lang.String getDisplayVersion() {
        return this.displayVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization getOrganization() {
        return this.organization;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public java.lang.String getInstallationUuid() {
        return this.installationUuid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public java.lang.String getDevelopmentPlatform() {
        return this.developmentPlatform;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public java.lang.String getDevelopmentPlatformVersion() {
        return this.developmentPlatformVersion;
    }

    public java.lang.String toString() {
        return "Application{identifier=" + this.identifier + ", version=" + this.version + ", displayVersion=" + this.displayVersion + ", organization=" + this.organization + ", installationUuid=" + this.installationUuid + ", developmentPlatform=" + this.developmentPlatform + ", developmentPlatformVersion=" + this.developmentPlatformVersion + "}";
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization organization;
        java.lang.String str2;
        java.lang.String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application application = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application) obj;
        if (this.identifier.equals(application.getIdentifier()) && this.version.equals(application.getVersion()) && ((str = this.displayVersion) != null ? str.equals(application.getDisplayVersion()) : application.getDisplayVersion() == null) && ((organization = this.organization) != null ? organization.equals(application.getOrganization()) : application.getOrganization() == null) && ((str2 = this.installationUuid) != null ? str2.equals(application.getInstallationUuid()) : application.getInstallationUuid() == null) && ((str3 = this.developmentPlatform) != null ? str3.equals(application.getDevelopmentPlatform()) : application.getDevelopmentPlatform() == null)) {
            java.lang.String str4 = this.developmentPlatformVersion;
            if (str4 == null) {
                if (application.getDevelopmentPlatformVersion() == null) {
                    return true;
                }
            } else if (str4.equals(application.getDevelopmentPlatformVersion())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.identifier.hashCode() ^ 1000003) * 1000003) ^ this.version.hashCode()) * 1000003;
        java.lang.String str = this.displayVersion;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization organization = this.organization;
        int iHashCode3 = (iHashCode2 ^ (organization == null ? 0 : organization.hashCode())) * 1000003;
        java.lang.String str2 = this.installationUuid;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.developmentPlatform;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        java.lang.String str4 = this.developmentPlatformVersion;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    protected com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder toBuilder() {
        return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application.Builder(this);
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder {
        private java.lang.String developmentPlatform;
        private java.lang.String developmentPlatformVersion;
        private java.lang.String displayVersion;
        private java.lang.String identifier;
        private java.lang.String installationUuid;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization organization;
        private java.lang.String version;

        Builder() {
        }

        private Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application application) {
            this.identifier = application.getIdentifier();
            this.version = application.getVersion();
            this.displayVersion = application.getDisplayVersion();
            this.organization = application.getOrganization();
            this.installationUuid = application.getInstallationUuid();
            this.developmentPlatform = application.getDevelopmentPlatform();
            this.developmentPlatformVersion = application.getDevelopmentPlatformVersion();
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setIdentifier(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null identifier");
            }
            this.identifier = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setVersion(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null version");
            }
            this.version = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDisplayVersion(java.lang.String str) {
            this.displayVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setOrganization(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization organization) {
            this.organization = organization;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setInstallationUuid(java.lang.String str) {
            this.installationUuid = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDevelopmentPlatform(java.lang.String str) {
            this.developmentPlatform = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDevelopmentPlatformVersion(java.lang.String str) {
            this.developmentPlatformVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application build() {
            if (this.identifier == null || this.version == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.identifier == null) {
                    sb.append(" identifier");
                }
                if (this.version == null) {
                    sb.append(" version");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application(this.identifier, this.version, this.displayVersion, this.organization, this.installationUuid, this.developmentPlatform, this.developmentPlatformVersion);
        }
    }
}
