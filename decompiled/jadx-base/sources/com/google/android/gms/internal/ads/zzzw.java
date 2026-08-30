package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzzw {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzaal zzb;
    private com.google.android.gms.internal.ads.zzca zzc;
    private com.google.android.gms.internal.ads.zzbl zzd;
    private final java.util.List zze = com.google.android.gms.internal.ads.zzfxn.zzn();
    private com.google.android.gms.internal.ads.zzcx zzf = com.google.android.gms.internal.ads.zzcx.zza;
    private boolean zzg;

    public zzzw(android.content.Context context, com.google.android.gms.internal.ads.zzaal zzaalVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzaalVar;
    }

    public final com.google.android.gms.internal.ads.zzzw zzd(com.google.android.gms.internal.ads.zzcx zzcxVar) {
        this.zzf = zzcxVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaah zze() {
        com.google.android.gms.internal.ads.zzcw.zzf(!this.zzg);
        com.google.android.gms.internal.ads.zzaag zzaagVar = null;
        if (this.zzd == null) {
            if (this.zzc == null) {
                this.zzc = new com.google.android.gms.internal.ads.zzaae(null);
            }
            this.zzd = new com.google.android.gms.internal.ads.zzaaf(this.zzc);
        }
        com.google.android.gms.internal.ads.zzaah zzaahVar = new com.google.android.gms.internal.ads.zzaah(this, zzaagVar);
        this.zzg = true;
        return zzaahVar;
    }
}
