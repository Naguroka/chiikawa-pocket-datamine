package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_FilesPayload_File extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File {
    private final byte[] contents;
    private final java.lang.String filename;

    private AutoValue_CrashlyticsReport_FilesPayload_File(java.lang.String str, byte[] bArr) {
        this.filename = str;
        this.contents = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public java.lang.String getFilename() {
        return this.filename;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public byte[] getContents() {
        return this.contents;
    }

    public java.lang.String toString() {
        return "File{filename=" + this.filename + ", contents=" + java.util.Arrays.toString(this.contents) + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File file = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File) obj;
        if (this.filename.equals(file.getFilename())) {
            if (java.util.Arrays.equals(this.contents, file instanceof com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File ? ((com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File) file).contents : file.getContents())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.filename.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.contents);
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder {
        private byte[] contents;
        private java.lang.String filename;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder setFilename(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null filename");
            }
            this.filename = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] bArr) {
            if (bArr == null) {
                throw new java.lang.NullPointerException("Null contents");
            }
            this.contents = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File build() {
            if (this.filename == null || this.contents == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (this.filename == null) {
                    sb.append(" filename");
                }
                if (this.contents == null) {
                    sb.append(" contents");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File(this.filename, this.contents);
        }
    }
}
