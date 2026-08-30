package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class SdkHeartBeatResult implements java.lang.Comparable<com.google.firebase.heartbeatinfo.SdkHeartBeatResult> {
    public abstract long getMillis();

    public abstract java.lang.String getSdkName();

    public static com.google.firebase.heartbeatinfo.SdkHeartBeatResult create(java.lang.String str, long j) {
        return new com.google.firebase.heartbeatinfo.AutoValue_SdkHeartBeatResult(str, j);
    }

    @Override // java.lang.Comparable
    public int compareTo(com.google.firebase.heartbeatinfo.SdkHeartBeatResult sdkHeartBeatResult) {
        return getMillis() < sdkHeartBeatResult.getMillis() ? -1 : 1;
    }
}
