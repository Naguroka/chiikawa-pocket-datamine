package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_LogEvent extends com.google.android.datatransport.cct.internal.LogEvent {
    private final com.google.android.datatransport.cct.internal.ComplianceData complianceData;
    private final java.lang.Integer eventCode;
    private final long eventTimeMs;
    private final long eventUptimeMs;
    private final com.google.android.datatransport.cct.internal.ExperimentIds experimentIds;
    private final com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo;
    private final byte[] sourceExtension;
    private final java.lang.String sourceExtensionJsonProto3;
    private final long timezoneOffsetSeconds;

    private AutoValue_LogEvent(long j, java.lang.Integer num, com.google.android.datatransport.cct.internal.ComplianceData complianceData, long j2, byte[] bArr, java.lang.String str, long j3, com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo, com.google.android.datatransport.cct.internal.ExperimentIds experimentIds) {
        this.eventTimeMs = j;
        this.eventCode = num;
        this.complianceData = complianceData;
        this.eventUptimeMs = j2;
        this.sourceExtension = bArr;
        this.sourceExtensionJsonProto3 = str;
        this.timezoneOffsetSeconds = j3;
        this.networkConnectionInfo = networkConnectionInfo;
        this.experimentIds = experimentIds;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventTimeMs() {
        return this.eventTimeMs;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public java.lang.Integer getEventCode() {
        return this.eventCode;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public com.google.android.datatransport.cct.internal.ComplianceData getComplianceData() {
        return this.complianceData;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventUptimeMs() {
        return this.eventUptimeMs;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public byte[] getSourceExtension() {
        return this.sourceExtension;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public java.lang.String getSourceExtensionJsonProto3() {
        return this.sourceExtensionJsonProto3;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getTimezoneOffsetSeconds() {
        return this.timezoneOffsetSeconds;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public com.google.android.datatransport.cct.internal.NetworkConnectionInfo getNetworkConnectionInfo() {
        return this.networkConnectionInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public com.google.android.datatransport.cct.internal.ExperimentIds getExperimentIds() {
        return this.experimentIds;
    }

    public java.lang.String toString() {
        return "LogEvent{eventTimeMs=" + this.eventTimeMs + ", eventCode=" + this.eventCode + ", complianceData=" + this.complianceData + ", eventUptimeMs=" + this.eventUptimeMs + ", sourceExtension=" + java.util.Arrays.toString(this.sourceExtension) + ", sourceExtensionJsonProto3=" + this.sourceExtensionJsonProto3 + ", timezoneOffsetSeconds=" + this.timezoneOffsetSeconds + ", networkConnectionInfo=" + this.networkConnectionInfo + ", experimentIds=" + this.experimentIds + "}";
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.Integer num;
        com.google.android.datatransport.cct.internal.ComplianceData complianceData;
        java.lang.String str;
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.LogEvent)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.LogEvent logEvent = (com.google.android.datatransport.cct.internal.LogEvent) obj;
        if (this.eventTimeMs == logEvent.getEventTimeMs() && ((num = this.eventCode) != null ? num.equals(logEvent.getEventCode()) : logEvent.getEventCode() == null) && ((complianceData = this.complianceData) != null ? complianceData.equals(logEvent.getComplianceData()) : logEvent.getComplianceData() == null) && this.eventUptimeMs == logEvent.getEventUptimeMs()) {
            if (java.util.Arrays.equals(this.sourceExtension, logEvent instanceof com.google.android.datatransport.cct.internal.AutoValue_LogEvent ? ((com.google.android.datatransport.cct.internal.AutoValue_LogEvent) logEvent).sourceExtension : logEvent.getSourceExtension()) && ((str = this.sourceExtensionJsonProto3) != null ? str.equals(logEvent.getSourceExtensionJsonProto3()) : logEvent.getSourceExtensionJsonProto3() == null) && this.timezoneOffsetSeconds == logEvent.getTimezoneOffsetSeconds() && ((networkConnectionInfo = this.networkConnectionInfo) != null ? networkConnectionInfo.equals(logEvent.getNetworkConnectionInfo()) : logEvent.getNetworkConnectionInfo() == null)) {
                com.google.android.datatransport.cct.internal.ExperimentIds experimentIds = this.experimentIds;
                if (experimentIds == null) {
                    if (logEvent.getExperimentIds() == null) {
                        return true;
                    }
                } else if (experimentIds.equals(logEvent.getExperimentIds())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.eventTimeMs;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        java.lang.Integer num = this.eventCode;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        com.google.android.datatransport.cct.internal.ComplianceData complianceData = this.complianceData;
        int iHashCode2 = complianceData == null ? 0 : complianceData.hashCode();
        long j2 = this.eventUptimeMs;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ java.util.Arrays.hashCode(this.sourceExtension)) * 1000003;
        java.lang.String str = this.sourceExtensionJsonProto3;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j3 = this.timezoneOffsetSeconds;
        int i2 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo = this.networkConnectionInfo;
        int iHashCode5 = (i2 ^ (networkConnectionInfo == null ? 0 : networkConnectionInfo.hashCode())) * 1000003;
        com.google.android.datatransport.cct.internal.ExperimentIds experimentIds = this.experimentIds;
        return iHashCode5 ^ (experimentIds != null ? experimentIds.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.LogEvent.Builder {
        private com.google.android.datatransport.cct.internal.ComplianceData complianceData;
        private java.lang.Integer eventCode;
        private java.lang.Long eventTimeMs;
        private java.lang.Long eventUptimeMs;
        private com.google.android.datatransport.cct.internal.ExperimentIds experimentIds;
        private com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo;
        private byte[] sourceExtension;
        private java.lang.String sourceExtensionJsonProto3;
        private java.lang.Long timezoneOffsetSeconds;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setEventTimeMs(long j) {
            this.eventTimeMs = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setEventCode(java.lang.Integer num) {
            this.eventCode = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setComplianceData(com.google.android.datatransport.cct.internal.ComplianceData complianceData) {
            this.complianceData = complianceData;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setEventUptimeMs(long j) {
            this.eventUptimeMs = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtension(byte[] bArr) {
            this.sourceExtension = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtensionJsonProto3(java.lang.String str) {
            this.sourceExtensionJsonProto3 = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setTimezoneOffsetSeconds(long j) {
            this.timezoneOffsetSeconds = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setNetworkConnectionInfo(com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo) {
            this.networkConnectionInfo = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setExperimentIds(com.google.android.datatransport.cct.internal.ExperimentIds experimentIds) {
            this.experimentIds = experimentIds;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent build() {
            java.lang.String str = this.eventTimeMs == null ? " eventTimeMs" : "";
            if (this.eventUptimeMs == null) {
                str = str + " eventUptimeMs";
            }
            if (this.timezoneOffsetSeconds == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new com.google.android.datatransport.cct.internal.AutoValue_LogEvent(this.eventTimeMs.longValue(), this.eventCode, this.complianceData, this.eventUptimeMs.longValue(), this.sourceExtension, this.sourceExtensionJsonProto3, this.timezoneOffsetSeconds.longValue(), this.networkConnectionInfo, this.experimentIds);
        }
    }
}
