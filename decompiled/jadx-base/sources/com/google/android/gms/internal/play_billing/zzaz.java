package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaz {
    private static final com.google.android.gms.internal.play_billing.zzbl zza;

    static {
        com.google.android.gms.internal.play_billing.zzbl zzayVar;
        try {
            android.os.SystemClock.elapsedRealtimeNanos();
            zzayVar = new com.google.android.gms.internal.play_billing.zzax();
        } catch (java.lang.Throwable unused) {
            android.os.SystemClock.elapsedRealtime();
            zzayVar = new com.google.android.gms.internal.play_billing.zzay();
        }
        zza = zzayVar;
    }

    public static com.google.android.gms.internal.play_billing.zzbl zza() {
        return zza;
    }
}
