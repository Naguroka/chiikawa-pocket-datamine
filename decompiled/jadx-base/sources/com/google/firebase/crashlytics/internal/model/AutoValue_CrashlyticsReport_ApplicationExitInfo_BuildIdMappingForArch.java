package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {
    private final java.lang.String arch;
    private final java.lang.String buildId;
    private final java.lang.String libraryName;

    private AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.arch = str;
        this.libraryName = str2;
        this.buildId = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public java.lang.String getArch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public java.lang.String getLibraryName() {
        return this.libraryName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public java.lang.String getBuildId() {
        return this.buildId;
    }

    public java.lang.String toString() {
        return "BuildIdMappingForArch{arch=" + this.arch + ", libraryName=" + this.libraryName + ", buildId=" + this.buildId + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
        return this.arch.equals(buildIdMappingForArch.getArch()) && this.libraryName.equals(buildIdMappingForArch.getLibraryName()) && this.buildId.equals(buildIdMappingForArch.getBuildId());
    }

    public int hashCode() {
        return ((((this.arch.hashCode() ^ 1000003) * 1000003) ^ this.libraryName.hashCode()) * 1000003) ^ this.buildId.hashCode();
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {
        private java.lang.String arch;
        private java.lang.String buildId;
        private java.lang.String libraryName;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setArch(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null arch");
            }
            this.arch = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setLibraryName(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null libraryName");
            }
            this.libraryName = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setBuildId(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null buildId");
            }
            this.buildId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch build() {
            if (this.arch == null || this.libraryName == null || this.buildId == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.arch == null) {
                    sb.append(" arch");
                }
                if (this.libraryName == null) {
                    sb.append(" libraryName");
                }
                if (this.buildId == null) {
                    sb.append(" buildId");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(this.arch, this.libraryName, this.buildId);
        }
    }
}
