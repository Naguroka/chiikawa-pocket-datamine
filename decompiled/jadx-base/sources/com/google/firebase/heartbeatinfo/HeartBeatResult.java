package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class HeartBeatResult {
    public abstract java.util.List<java.lang.String> getUsedDates();

    public abstract java.lang.String getUserAgent();

    public static com.google.firebase.heartbeatinfo.HeartBeatResult create(java.lang.String str, java.util.List<java.lang.String> list) {
        return new com.google.firebase.heartbeatinfo.AutoValue_HeartBeatResult(str, list);
    }
}
