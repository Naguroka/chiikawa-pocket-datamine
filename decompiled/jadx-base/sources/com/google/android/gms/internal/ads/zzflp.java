package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzflp {
    private static final com.google.android.gms.internal.ads.zzflp zza = new com.google.android.gms.internal.ads.zzflp();
    private android.content.Context zzb;

    private zzflp() {
    }

    public static com.google.android.gms.internal.ads.zzflp zzb() {
        return zza;
    }

    public final android.content.Context zza() {
        return this.zzb;
    }

    public final void zzc(android.content.Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
