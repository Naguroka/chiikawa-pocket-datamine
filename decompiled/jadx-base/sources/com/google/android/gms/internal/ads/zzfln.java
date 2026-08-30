package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfln {
    private final com.google.android.gms.internal.ads.zzfnb zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzfkw zzc;
    private final java.lang.String zzd = "Ad overlay";

    public zzfln(android.view.View view, com.google.android.gms.internal.ads.zzfkw zzfkwVar, java.lang.String str) {
        this.zza = new com.google.android.gms.internal.ads.zzfnb(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfkwVar;
    }

    public final com.google.android.gms.internal.ads.zzfkw zza() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzfnb zzb() {
        return this.zza;
    }

    public final java.lang.String zzc() {
        return this.zzd;
    }

    public final java.lang.String zzd() {
        return this.zzb;
    }
}
