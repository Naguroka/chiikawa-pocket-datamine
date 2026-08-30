package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaf {
    private java.lang.String zza;
    private android.net.Uri zzb;
    private final com.google.android.gms.internal.ads.zzag zzc = new com.google.android.gms.internal.ads.zzag();
    private final java.util.List zzd;
    private final com.google.android.gms.internal.ads.zzfxn zze;
    private final com.google.android.gms.internal.ads.zzak zzf;
    private final com.google.android.gms.internal.ads.zzao zzg;

    public zzaf() {
        com.google.android.gms.internal.ads.zzfxn.zzn();
        this.zzd = java.util.Collections.emptyList();
        this.zze = com.google.android.gms.internal.ads.zzfxn.zzn();
        this.zzf = new com.google.android.gms.internal.ads.zzak();
        this.zzg = com.google.android.gms.internal.ads.zzao.zza;
    }

    public final com.google.android.gms.internal.ads.zzaf zza(java.lang.String str) {
        this.zza = str;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaf zzb(android.net.Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzar zzc() {
        com.google.android.gms.internal.ads.zzam zzamVar;
        android.net.Uri uri = this.zzb;
        if (uri != null) {
            zzamVar = new com.google.android.gms.internal.ads.zzam(uri, null, null, null, this.zzd, null, this.zze, null, androidx.media3.common.C.TIME_UNSET, null);
        } else {
            zzamVar = null;
        }
        java.lang.String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new com.google.android.gms.internal.ads.zzar(str, new com.google.android.gms.internal.ads.zzai(this.zzc, null), zzamVar, new com.google.android.gms.internal.ads.zzal(this.zzf, null), com.google.android.gms.internal.ads.zzav.zza, this.zzg, null);
    }
}
