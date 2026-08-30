package com.google.firebase;

/* JADX INFO: loaded from: classes5.dex */
public abstract class StartupTime {
    public abstract long getElapsedRealtime();

    public abstract long getEpochMillis();

    public abstract long getUptimeMillis();

    public static com.google.firebase.StartupTime create(long j, long j2, long j3) {
        return new com.google.firebase.AutoValue_StartupTime(j, j2, j3);
    }

    public static com.google.firebase.StartupTime now() {
        return create(java.lang.System.currentTimeMillis(), android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
    }
}
