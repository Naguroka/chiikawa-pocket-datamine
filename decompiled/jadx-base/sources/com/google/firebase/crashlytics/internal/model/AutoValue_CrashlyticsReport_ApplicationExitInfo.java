package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo {
    private final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> buildIdMappingForArch;
    private final int importance;
    private final int pid;
    private final java.lang.String processName;
    private final long pss;
    private final int reasonCode;
    private final long rss;
    private final long timestamp;
    private final java.lang.String traceFile;

    private AutoValue_CrashlyticsReport_ApplicationExitInfo(int i, java.lang.String str, int i2, int i3, long j, long j2, long j3, java.lang.String str2, java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
        this.pid = i;
        this.processName = str;
        this.reasonCode = i2;
        this.importance = i3;
        this.pss = j;
        this.rss = j2;
        this.timestamp = j3;
        this.traceFile = str2;
        this.buildIdMappingForArch = list;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getPid() {
        return this.pid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public java.lang.String getProcessName() {
        return this.processName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getReasonCode() {
        return this.reasonCode;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getImportance() {
        return this.importance;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getPss() {
        return this.pss;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getRss() {
        return this.rss;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public java.lang.String getTraceFile() {
        return this.traceFile;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> getBuildIdMappingForArch() {
        return this.buildIdMappingForArch;
    }

    public java.lang.String toString() {
        return "ApplicationExitInfo{pid=" + this.pid + ", processName=" + this.processName + ", reasonCode=" + this.reasonCode + ", importance=" + this.importance + ", pss=" + this.pss + ", rss=" + this.rss + ", timestamp=" + this.timestamp + ", traceFile=" + this.traceFile + ", buildIdMappingForArch=" + this.buildIdMappingForArch + "}";
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo) obj;
        if (this.pid == applicationExitInfo.getPid() && this.processName.equals(applicationExitInfo.getProcessName()) && this.reasonCode == applicationExitInfo.getReasonCode() && this.importance == applicationExitInfo.getImportance() && this.pss == applicationExitInfo.getPss() && this.rss == applicationExitInfo.getRss() && this.timestamp == applicationExitInfo.getTimestamp() && ((str = this.traceFile) != null ? str.equals(applicationExitInfo.getTraceFile()) : applicationExitInfo.getTraceFile() == null)) {
            java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list = this.buildIdMappingForArch;
            if (list == null) {
                if (applicationExitInfo.getBuildIdMappingForArch() == null) {
                    return true;
                }
            } else if (list.equals(applicationExitInfo.getBuildIdMappingForArch())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.pid ^ 1000003) * 1000003) ^ this.processName.hashCode()) * 1000003) ^ this.reasonCode) * 1000003) ^ this.importance) * 1000003;
        long j = this.pss;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.rss;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.timestamp;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        java.lang.String str = this.traceFile;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list = this.buildIdMappingForArch;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    static final class Builder extends com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder {
        private java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> buildIdMappingForArch;
        private int importance;
        private int pid;
        private java.lang.String processName;
        private long pss;
        private int reasonCode;
        private long rss;
        private byte set$0;
        private long timestamp;
        private java.lang.String traceFile;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setPid(int i) {
            this.pid = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null processName");
            }
            this.processName = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int i) {
            this.reasonCode = i;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int i) {
            this.importance = i;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setPss(long j) {
            this.pss = j;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setRss(long j) {
            this.rss = j;
            this.set$0 = (byte) (this.set$0 | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long j) {
            this.timestamp = j;
            this.set$0 = (byte) (this.set$0 | 32);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(java.lang.String str) {
            this.traceFile = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setBuildIdMappingForArch(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
            this.buildIdMappingForArch = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo build() {
            if (this.set$0 != 63 || this.processName == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if ((this.set$0 & 1) == 0) {
                    sb.append(" pid");
                }
                if (this.processName == null) {
                    sb.append(" processName");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" reasonCode");
                }
                if ((this.set$0 & 4) == 0) {
                    sb.append(" importance");
                }
                if ((this.set$0 & 8) == 0) {
                    sb.append(" pss");
                }
                if ((this.set$0 & 16) == 0) {
                    sb.append(" rss");
                }
                if ((this.set$0 & 32) == 0) {
                    sb.append(" timestamp");
                }
                throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
            }
            return new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo(this.pid, this.processName, this.reasonCode, this.importance, this.pss, this.rss, this.timestamp, this.traceFile, this.buildIdMappingForArch);
        }
    }
}
