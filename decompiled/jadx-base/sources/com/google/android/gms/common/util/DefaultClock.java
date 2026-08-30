package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultClock implements com.google.android.gms.common.util.Clock {
    private static final com.google.android.gms.common.util.DefaultClock zza = new com.google.android.gms.common.util.DefaultClock();

    private DefaultClock() {
    }

    public static com.google.android.gms.common.util.Clock getInstance() {
        return zza;
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long currentThreadTimeMillis() {
        return android.os.SystemClock.currentThreadTimeMillis();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long nanoTime() {
        return java.lang.System.nanoTime();
    }
}
