package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport {
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo appExitInfo;
    private final java.lang.String appQualitySessionId;
    private final java.lang.String buildVersion;
    private final java.lang.String displayVersion;
    private final java.lang.String firebaseAuthenticationToken;
    private final java.lang.String firebaseInstallationId;
    private final java.lang.String gmpAppId;
    private final java.lang.String installationUuid;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload ndkPayload;
    private final int platform;
    private final java.lang.String sdkVersion;
    private final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session;

    private AutoValue_CrashlyticsReport(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload filesPayload, com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.sdkVersion = str;
        this.gmpAppId = str2;
        this.platform = i;
        this.installationUuid = str3;
        this.firebaseInstallationId = str4;
        this.firebaseAuthenticationToken = str5;
        this.appQualitySessionId = str6;
        this.buildVersion = str7;
        this.displayVersion = str8;
        this.session = session;
        this.ndkPayload = filesPayload;
        this.appExitInfo = applicationExitInfo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getGmpAppId() {
        return this.gmpAppId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public int getPlatform() {
        return this.platform;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getInstallationUuid() {
        return this.installationUuid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getAppQualitySessionId() {
        return this.appQualitySessionId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getBuildVersion() {
        return this.buildVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public java.lang.String getDisplayVersion() {
        return this.displayVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session getSession() {
        return this.session;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload getNdkPayload() {
        return this.ndkPayload;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.appExitInfo;
    }

    public java.lang.String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.sdkVersion + ", gmpAppId=" + this.gmpAppId + ", platform=" + this.platform + ", installationUuid=" + this.installationUuid + ", firebaseInstallationId=" + this.firebaseInstallationId + ", firebaseAuthenticationToken=" + this.firebaseAuthenticationToken + ", appQualitySessionId=" + this.appQualitySessionId + ", buildVersion=" + this.buildVersion + ", displayVersion=" + this.displayVersion + ", session=" + this.session + ", ndkPayload=" + this.ndkPayload + ", appExitInfo=" + this.appExitInfo + "}";
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload filesPayload;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport crashlyticsReport = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport) obj;
        if (this.sdkVersion.equals(crashlyticsReport.getSdkVersion()) && this.gmpAppId.equals(crashlyticsReport.getGmpAppId()) && this.platform == crashlyticsReport.getPlatform() && this.installationUuid.equals(crashlyticsReport.getInstallationUuid()) && ((str = this.firebaseInstallationId) != null ? str.equals(crashlyticsReport.getFirebaseInstallationId()) : crashlyticsReport.getFirebaseInstallationId() == null) && ((str2 = this.firebaseAuthenticationToken) != null ? str2.equals(crashlyticsReport.getFirebaseAuthenticationToken()) : crashlyticsReport.getFirebaseAuthenticationToken() == null) && ((str3 = this.appQualitySessionId) != null ? str3.equals(crashlyticsReport.getAppQualitySessionId()) : crashlyticsReport.getAppQualitySessionId() == null) && this.buildVersion.equals(crashlyticsReport.getBuildVersion()) && this.displayVersion.equals(crashlyticsReport.getDisplayVersion()) && ((session = this.session) != null ? session.equals(crashlyticsReport.getSession()) : crashlyticsReport.getSession() == null) && ((filesPayload = this.ndkPayload) != null ? filesPayload.equals(crashlyticsReport.getNdkPayload()) : crashlyticsReport.getNdkPayload() == null)) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.appExitInfo;
            if (applicationExitInfo == null) {
                if (crashlyticsReport.getAppExitInfo() == null) {
                    return true;
                }
            } else if (applicationExitInfo.equals(crashlyticsReport.getAppExitInfo())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.sdkVersion.hashCode() ^ 1000003) * 1000003) ^ this.gmpAppId.hashCode()) * 1000003) ^ this.platform) * 1000003) ^ this.installationUuid.hashCode()) * 1000003;
        java.lang.String str = this.firebaseInstallationId;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.firebaseAuthenticationToken;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.appQualitySessionId;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.buildVersion.hashCode()) * 1000003) ^ this.displayVersion.hashCode()) * 1000003;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session = this.session;
        int iHashCode5 = (iHashCode4 ^ (session == null ? 0 : session.hashCode())) * 1000003;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload filesPayload = this.ndkPayload;
        int iHashCode6 = (iHashCode5 ^ (filesPayload == null ? 0 : filesPayload.hashCode())) * 1000003;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.appExitInfo;
        return iHashCode6 ^ (applicationExitInfo != null ? applicationExitInfo.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    protected com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder toBuilder() {
        return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport.Builder(this);
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder {
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo appExitInfo;
        private java.lang.String appQualitySessionId;
        private java.lang.String buildVersion;
        private java.lang.String displayVersion;
        private java.lang.String firebaseAuthenticationToken;
        private java.lang.String firebaseInstallationId;
        private java.lang.String gmpAppId;
        private java.lang.String installationUuid;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload ndkPayload;
        private int platform;
        private java.lang.String sdkVersion;
        private com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session;
        private byte set$0;

        Builder() {
        }

        private Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport crashlyticsReport) {
            this.sdkVersion = crashlyticsReport.getSdkVersion();
            this.gmpAppId = crashlyticsReport.getGmpAppId();
            this.platform = crashlyticsReport.getPlatform();
            this.installationUuid = crashlyticsReport.getInstallationUuid();
            this.firebaseInstallationId = crashlyticsReport.getFirebaseInstallationId();
            this.firebaseAuthenticationToken = crashlyticsReport.getFirebaseAuthenticationToken();
            this.appQualitySessionId = crashlyticsReport.getAppQualitySessionId();
            this.buildVersion = crashlyticsReport.getBuildVersion();
            this.displayVersion = crashlyticsReport.getDisplayVersion();
            this.session = crashlyticsReport.getSession();
            this.ndkPayload = crashlyticsReport.getNdkPayload();
            this.appExitInfo = crashlyticsReport.getAppExitInfo();
            this.set$0 = (byte) 1;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setSdkVersion(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null sdkVersion");
            }
            this.sdkVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setGmpAppId(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null gmpAppId");
            }
            this.gmpAppId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setPlatform(int i) {
            this.platform = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setInstallationUuid(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null installationUuid");
            }
            this.installationUuid = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setFirebaseInstallationId(java.lang.String str) {
            this.firebaseInstallationId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setFirebaseAuthenticationToken(java.lang.String str) {
            this.firebaseAuthenticationToken = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setAppQualitySessionId(java.lang.String str) {
            this.appQualitySessionId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setBuildVersion(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null buildVersion");
            }
            this.buildVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setDisplayVersion(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null displayVersion");
            }
            this.displayVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setSession(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session session) {
            this.session = session;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setNdkPayload(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload filesPayload) {
            this.ndkPayload = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setAppExitInfo(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.appExitInfo = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport build() {
            if (this.set$0 != 1 || this.sdkVersion == null || this.gmpAppId == null || this.installationUuid == null || this.buildVersion == null || this.displayVersion == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.sdkVersion == null) {
                    sb.append(" sdkVersion");
                }
                if (this.gmpAppId == null) {
                    sb.append(" gmpAppId");
                }
                if ((1 & this.set$0) == 0) {
                    sb.append(" platform");
                }
                if (this.installationUuid == null) {
                    sb.append(" installationUuid");
                }
                if (this.buildVersion == null) {
                    sb.append(" buildVersion");
                }
                if (this.displayVersion == null) {
                    sb.append(" displayVersion");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport(this.sdkVersion, this.gmpAppId, this.platform, this.installationUuid, this.firebaseInstallationId, this.firebaseAuthenticationToken, this.appQualitySessionId, this.buildVersion, this.displayVersion, this.session, this.ndkPayload, this.appExitInfo);
        }
    }
}
