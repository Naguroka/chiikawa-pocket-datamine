package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcis {
    private com.google.android.gms.internal.ads.zzcha zza;
    private com.google.android.gms.internal.ads.zzcjn zzb;
    private com.google.android.gms.internal.ads.zzfgr zzc;
    private com.google.android.gms.internal.ads.zzcka zzd;
    private com.google.android.gms.internal.ads.zzfdl zze;

    private zzcis() {
        throw null;
    }

    /* synthetic */ zzcis(com.google.android.gms.internal.ads.zzcjm zzcjmVar) {
    }

    public final com.google.android.gms.internal.ads.zzcgx zza() {
        com.google.android.gms.internal.ads.zzhez.zzc(this.zza, com.google.android.gms.internal.ads.zzcha.class);
        com.google.android.gms.internal.ads.zzhez.zzc(this.zzb, com.google.android.gms.internal.ads.zzcjn.class);
        if (this.zzc == null) {
            this.zzc = new com.google.android.gms.internal.ads.zzfgr();
        }
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.ads.zzcka();
        }
        if (this.zze == null) {
            this.zze = new com.google.android.gms.internal.ads.zzfdl();
        }
        return new com.google.android.gms.internal.ads.zzcih(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final com.google.android.gms.internal.ads.zzcis zzb(com.google.android.gms.internal.ads.zzcha zzchaVar) {
        this.zza = zzchaVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcis zzc(com.google.android.gms.internal.ads.zzcjn zzcjnVar) {
        this.zzb = zzcjnVar;
        return this;
    }
}
