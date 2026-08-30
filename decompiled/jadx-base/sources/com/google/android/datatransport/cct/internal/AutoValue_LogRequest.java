package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_LogRequest extends com.google.android.datatransport.cct.internal.LogRequest {
    private final com.google.android.datatransport.cct.internal.ClientInfo clientInfo;
    private final java.util.List<com.google.android.datatransport.cct.internal.LogEvent> logEvents;
    private final java.lang.Integer logSource;
    private final java.lang.String logSourceName;
    private final com.google.android.datatransport.cct.internal.QosTier qosTier;
    private final long requestTimeMs;
    private final long requestUptimeMs;

    private AutoValue_LogRequest(long j, long j2, com.google.android.datatransport.cct.internal.ClientInfo clientInfo, java.lang.Integer num, java.lang.String str, java.util.List<com.google.android.datatransport.cct.internal.LogEvent> list, com.google.android.datatransport.cct.internal.QosTier qosTier) {
        this.requestTimeMs = j;
        this.requestUptimeMs = j2;
        this.clientInfo = clientInfo;
        this.logSource = num;
        this.logSourceName = str;
        this.logEvents = list;
        this.qosTier = qosTier;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public long getRequestTimeMs() {
        return this.requestTimeMs;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public long getRequestUptimeMs() {
        return this.requestUptimeMs;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public com.google.android.datatransport.cct.internal.ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public java.lang.Integer getLogSource() {
        return this.logSource;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public java.lang.String getLogSourceName() {
        return this.logSourceName;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @com.google.firebase.encoders.annotations.Encodable.Field(name = "logEvent")
    public java.util.List<com.google.android.datatransport.cct.internal.LogEvent> getLogEvents() {
        return this.logEvents;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public com.google.android.datatransport.cct.internal.QosTier getQosTier() {
        return this.qosTier;
    }

    public java.lang.String toString() {
        return "LogRequest{requestTimeMs=" + this.requestTimeMs + ", requestUptimeMs=" + this.requestUptimeMs + ", clientInfo=" + this.clientInfo + ", logSource=" + this.logSource + ", logSourceName=" + this.logSourceName + ", logEvents=" + this.logEvents + ", qosTier=" + this.qosTier + "}";
    }

    public boolean equals(java.lang.Object obj) {
        com.google.android.datatransport.cct.internal.ClientInfo clientInfo;
        java.lang.Integer num;
        java.lang.String str;
        java.util.List<com.google.android.datatransport.cct.internal.LogEvent> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.LogRequest)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.LogRequest logRequest = (com.google.android.datatransport.cct.internal.LogRequest) obj;
        if (this.requestTimeMs == logRequest.getRequestTimeMs() && this.requestUptimeMs == logRequest.getRequestUptimeMs() && ((clientInfo = this.clientInfo) != null ? clientInfo.equals(logRequest.getClientInfo()) : logRequest.getClientInfo() == null) && ((num = this.logSource) != null ? num.equals(logRequest.getLogSource()) : logRequest.getLogSource() == null) && ((str = this.logSourceName) != null ? str.equals(logRequest.getLogSourceName()) : logRequest.getLogSourceName() == null) && ((list = this.logEvents) != null ? list.equals(logRequest.getLogEvents()) : logRequest.getLogEvents() == null)) {
            com.google.android.datatransport.cct.internal.QosTier qosTier = this.qosTier;
            if (qosTier == null) {
                if (logRequest.getQosTier() == null) {
                    return true;
                }
            } else if (qosTier.equals(logRequest.getQosTier())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.requestTimeMs;
        long j2 = this.requestUptimeMs;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        com.google.android.datatransport.cct.internal.ClientInfo clientInfo = this.clientInfo;
        int iHashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        java.lang.Integer num = this.logSource;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        java.lang.String str = this.logSourceName;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.util.List<com.google.android.datatransport.cct.internal.LogEvent> list = this.logEvents;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        com.google.android.datatransport.cct.internal.QosTier qosTier = this.qosTier;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.LogRequest.Builder {
        private com.google.android.datatransport.cct.internal.ClientInfo clientInfo;
        private java.util.List<com.google.android.datatransport.cct.internal.LogEvent> logEvents;
        private java.lang.Integer logSource;
        private java.lang.String logSourceName;
        private com.google.android.datatransport.cct.internal.QosTier qosTier;
        private java.lang.Long requestTimeMs;
        private java.lang.Long requestUptimeMs;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public com.google.android.datatransport.cct.internal.LogRequest.Builder setRequestTimeMs(long j) {
            this.requestTimeMs = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public com.google.android.datatransport.cct.internal.LogRequest.Builder setRequestUptimeMs(long j) {
            this.requestUptimeMs = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public com.google.android.datatransport.cct.internal.LogRequest.Builder setClientInfo(com.google.android.datatransport.cct.internal.ClientInfo clientInfo) {
            this.clientInfo = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        com.google.android.datatransport.cct.internal.LogRequest.Builder setLogSource(java.lang.Integer num) {
            this.logSource = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        com.google.android.datatransport.cct.internal.LogRequest.Builder setLogSourceName(java.lang.String str) {
            this.logSourceName = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public com.google.android.datatransport.cct.internal.LogRequest.Builder setLogEvents(java.util.List<com.google.android.datatransport.cct.internal.LogEvent> list) {
            this.logEvents = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public com.google.android.datatransport.cct.internal.LogRequest.Builder setQosTier(com.google.android.datatransport.cct.internal.QosTier qosTier) {
            this.qosTier = qosTier;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public com.google.android.datatransport.cct.internal.LogRequest build() {
            java.lang.String str = this.requestTimeMs == null ? " requestTimeMs" : "";
            if (this.requestUptimeMs == null) {
                str = str + " requestUptimeMs";
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:" + str);
            }
            return new com.google.android.datatransport.cct.internal.AutoValue_LogRequest(this.requestTimeMs.longValue(), this.requestUptimeMs.longValue(), this.clientInfo, this.logSource, this.logSourceName, this.logEvents, this.qosTier);
        }
    }
}
