package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaps {
    public final java.lang.Object zza;
    public final com.google.android.gms.internal.ads.zzaov zzb;
    public final com.google.android.gms.internal.ads.zzapv zzc;
    public boolean zzd;

    private zzaps(com.google.android.gms.internal.ads.zzapv zzapvVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzapvVar;
    }

    private zzaps(java.lang.Object obj, com.google.android.gms.internal.ads.zzaov zzaovVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaovVar;
        this.zzc = null;
    }

    public static com.google.android.gms.internal.ads.zzaps zza(com.google.android.gms.internal.ads.zzapv zzapvVar) {
        return new com.google.android.gms.internal.ads.zzaps(zzapvVar);
    }

    public static com.google.android.gms.internal.ads.zzaps zzb(java.lang.Object obj, com.google.android.gms.internal.ads.zzaov zzaovVar) {
        return new com.google.android.gms.internal.ads.zzaps(obj, zzaovVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
