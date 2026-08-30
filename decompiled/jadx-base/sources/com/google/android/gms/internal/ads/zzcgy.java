package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcgy {
    private com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza;
    private android.content.Context zzb;
    private long zzc;
    private java.lang.ref.WeakReference zzd;

    public final com.google.android.gms.internal.ads.zzcgy zzd(long j) {
        this.zzc = j;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcgy zze(android.content.Context context) {
        this.zzd = new java.lang.ref.WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcgy zzf(com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = versionInfoParcel;
        return this;
    }
}
