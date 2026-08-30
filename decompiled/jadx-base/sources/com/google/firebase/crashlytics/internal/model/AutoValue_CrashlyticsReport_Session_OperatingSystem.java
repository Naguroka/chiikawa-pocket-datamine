package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem {
    private final java.lang.String buildVersion;
    private final boolean jailbroken;
    private final int platform;
    private final java.lang.String version;

    private AutoValue_CrashlyticsReport_Session_OperatingSystem(int i, java.lang.String str, java.lang.String str2, boolean z) {
        this.platform = i;
        this.version = str;
        this.buildVersion = str2;
        this.jailbroken = z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public int getPlatform() {
        return this.platform;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public java.lang.String getVersion() {
        return this.version;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public java.lang.String getBuildVersion() {
        return this.buildVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public boolean isJailbroken() {
        return this.jailbroken;
    }

    public java.lang.String toString() {
        return "OperatingSystem{platform=" + this.platform + ", version=" + this.version + ", buildVersion=" + this.buildVersion + ", jailbroken=" + this.jailbroken + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem operatingSystem = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem) obj;
        return this.platform == operatingSystem.getPlatform() && this.version.equals(operatingSystem.getVersion()) && this.buildVersion.equals(operatingSystem.getBuildVersion()) && this.jailbroken == operatingSystem.isJailbroken();
    }

    public int hashCode() {
        return ((((((this.platform ^ 1000003) * 1000003) ^ this.version.hashCode()) * 1000003) ^ this.buildVersion.hashCode()) * 1000003) ^ (this.jailbroken ? 1231 : 1237);
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder {
        private java.lang.String buildVersion;
        private boolean jailbroken;
        private int platform;
        private byte set$0;
        private java.lang.String version;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setPlatform(int i) {
            this.platform = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setVersion(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null version");
            }
            this.version = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setBuildVersion(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null buildVersion");
            }
            this.buildVersion = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setJailbroken(boolean z) {
            this.jailbroken = z;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem build() {
            if (this.set$0 != 3 || this.version == null || this.buildVersion == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if ((this.set$0 & 1) == 0) {
                    sb.append(" platform");
                }
                if (this.version == null) {
                    sb.append(" version");
                }
                if (this.buildVersion == null) {
                    sb.append(" buildVersion");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" jailbroken");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem(this.platform, this.version, this.buildVersion, this.jailbroken);
        }
    }
}
