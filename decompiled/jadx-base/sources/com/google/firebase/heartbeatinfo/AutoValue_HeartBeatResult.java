package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_HeartBeatResult extends com.google.firebase.heartbeatinfo.HeartBeatResult {
    private final java.util.List<java.lang.String> usedDates;
    private final java.lang.String userAgent;

    AutoValue_HeartBeatResult(java.lang.String str, java.util.List<java.lang.String> list) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null userAgent");
        }
        this.userAgent = str;
        if (list == null) {
            throw new java.lang.NullPointerException("Null usedDates");
        }
        this.usedDates = list;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public java.lang.String getUserAgent() {
        return this.userAgent;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public java.util.List<java.lang.String> getUsedDates() {
        return this.usedDates;
    }

    public java.lang.String toString() {
        return "HeartBeatResult{userAgent=" + this.userAgent + ", usedDates=" + this.usedDates + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.heartbeatinfo.HeartBeatResult)) {
            return false;
        }
        com.google.firebase.heartbeatinfo.HeartBeatResult heartBeatResult = (com.google.firebase.heartbeatinfo.HeartBeatResult) obj;
        return this.userAgent.equals(heartBeatResult.getUserAgent()) && this.usedDates.equals(heartBeatResult.getUsedDates());
    }

    public int hashCode() {
        return ((this.userAgent.hashCode() ^ 1000003) * 1000003) ^ this.usedDates.hashCode();
    }
}
