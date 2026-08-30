package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_SdkHeartBeatResult extends com.google.firebase.heartbeatinfo.SdkHeartBeatResult {
    private final long millis;
    private final java.lang.String sdkName;

    AutoValue_SdkHeartBeatResult(java.lang.String str, long j) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null sdkName");
        }
        this.sdkName = str;
        this.millis = j;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public java.lang.String getSdkName() {
        return this.sdkName;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.millis;
    }

    public java.lang.String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.sdkName + ", millis=" + this.millis + "}";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.firebase.heartbeatinfo.SdkHeartBeatResult)) {
            return false;
        }
        com.google.firebase.heartbeatinfo.SdkHeartBeatResult sdkHeartBeatResult = (com.google.firebase.heartbeatinfo.SdkHeartBeatResult) obj;
        return this.sdkName.equals(sdkHeartBeatResult.getSdkName()) && this.millis == sdkHeartBeatResult.getMillis();
    }

    public int hashCode() {
        int iHashCode = (this.sdkName.hashCode() ^ 1000003) * 1000003;
        long j = this.millis;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }
}
