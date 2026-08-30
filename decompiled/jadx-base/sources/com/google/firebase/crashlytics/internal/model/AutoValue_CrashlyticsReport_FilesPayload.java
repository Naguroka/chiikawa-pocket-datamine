package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_FilesPayload extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload {
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> files;
    private final java.lang.String orgId;

    private AutoValue_CrashlyticsReport_FilesPayload(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> list, java.lang.String str) {
        this.files = list;
        this.orgId = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> getFiles() {
        return this.files;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public java.lang.String getOrgId() {
        return this.orgId;
    }

    public java.lang.String toString() {
        return "FilesPayload{files=" + this.files + ", orgId=" + this.orgId + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload filesPayload = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload) obj;
        if (this.files.equals(filesPayload.getFiles())) {
            java.lang.String str = this.orgId;
            if (str == null) {
                if (filesPayload.getOrgId() == null) {
                    return true;
                }
            } else if (str.equals(filesPayload.getOrgId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.files.hashCode() ^ 1000003) * 1000003;
        java.lang.String str = this.orgId;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder toBuilder() {
        return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload.Builder(this);
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder {
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> files;
        private java.lang.String orgId;

        Builder() {
        }

        private Builder(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload filesPayload) {
            this.files = filesPayload.getFiles();
            this.orgId = filesPayload.getOrgId();
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder setFiles(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> list) {
            if (list == null) {
                throw new java.lang.NullPointerException("Null files");
            }
            this.files = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder setOrgId(java.lang.String str) {
            this.orgId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload build() {
            if (this.files == null) {
                throw new java.lang.IllegalStateException("Missing required properties: files");
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload(this.files, this.orgId);
        }
    }
}
