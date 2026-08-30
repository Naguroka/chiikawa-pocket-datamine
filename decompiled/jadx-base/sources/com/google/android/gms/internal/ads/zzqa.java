package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzqa {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzoi zzb;
    private boolean zzc;
    private final com.google.android.gms.internal.ads.zzpy zzd;
    private final com.google.android.gms.internal.ads.zzpz zze;
    private com.google.android.gms.internal.ads.zzqc zzf;
    private com.google.android.gms.internal.ads.zzps zzg;

    @java.lang.Deprecated
    public zzqa() {
        this.zza = null;
        this.zzb = com.google.android.gms.internal.ads.zzoi.zza;
        this.zzd = com.google.android.gms.internal.ads.zzpy.zza;
        this.zze = com.google.android.gms.internal.ads.zzpz.zza;
    }

    public final com.google.android.gms.internal.ads.zzqm zzd() {
        com.google.android.gms.internal.ads.zzcw.zzf(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new com.google.android.gms.internal.ads.zzqc(new com.google.android.gms.internal.ads.zzch[0]);
        }
        if (this.zzg == null) {
            this.zzg = new com.google.android.gms.internal.ads.zzps(this.zza);
        }
        return new com.google.android.gms.internal.ads.zzqm(this, null);
    }

    public zzqa(android.content.Context context) {
        this.zza = context;
        this.zzb = com.google.android.gms.internal.ads.zzoi.zza;
        this.zzd = com.google.android.gms.internal.ads.zzpy.zza;
        this.zze = com.google.android.gms.internal.ads.zzpz.zza;
    }
}
