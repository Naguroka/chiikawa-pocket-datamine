package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdnh {
    private final com.google.android.gms.internal.ads.zzcvr zza;
    private final com.google.android.gms.internal.ads.zzcxa zzb;
    private final com.google.android.gms.internal.ads.zzcxn zzc;
    private final com.google.android.gms.internal.ads.zzcxz zzd;
    private final com.google.android.gms.internal.ads.zzdap zze;
    private final com.google.android.gms.internal.ads.zzfbo zzf;
    private final com.google.android.gms.internal.ads.zzfbr zzg;
    private final com.google.android.gms.internal.ads.zzcmk zzh;

    public zzdnh(com.google.android.gms.internal.ads.zzcvr zzcvrVar, com.google.android.gms.internal.ads.zzcxa zzcxaVar, com.google.android.gms.internal.ads.zzcxn zzcxnVar, com.google.android.gms.internal.ads.zzcxz zzcxzVar, com.google.android.gms.internal.ads.zzdap zzdapVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar, com.google.android.gms.internal.ads.zzcmk zzcmkVar) {
        this.zza = zzcvrVar;
        this.zzb = zzcxaVar;
        this.zzc = zzcxnVar;
        this.zzd = zzcxzVar;
        this.zze = zzdapVar;
        this.zzf = zzfboVar;
        this.zzg = zzfbrVar;
        this.zzh = zzcmkVar;
    }

    public final void zza(com.google.android.gms.internal.ads.zzdnl zzdnlVar) {
        final com.google.android.gms.internal.ads.zzcxa zzcxaVar = this.zzb;
        com.google.android.gms.internal.ads.zzdmy zzdmyVar = zzdnlVar.zza;
        java.util.Objects.requireNonNull(zzcxaVar);
        zzdmyVar.zzh(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdng
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                zzcxaVar.zzb();
            }
        });
        zzdnlVar.zzh(this.zzf, this.zzg, this.zzh);
    }
}
