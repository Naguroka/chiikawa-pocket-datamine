package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzxm extends com.google.android.gms.internal.ads.zzxo implements java.lang.Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzxm(int i, com.google.android.gms.internal.ads.zzbr zzbrVar, int i2, com.google.android.gms.internal.ads.zzxh zzxhVar, int i3, java.lang.String str) {
        int iZzc;
        super(i, zzbrVar, i2);
        int i4 = 0;
        this.zzf = com.google.android.gms.internal.ads.zzlk.zza(i3, false);
        int i5 = this.zzd.zze;
        int i6 = zzxhVar.zzw;
        this.zzg = 1 == (i5 & 1);
        this.zzh = (i5 & 2) != 0;
        com.google.android.gms.internal.ads.zzfxn zzfxnVarZzo = zzxhVar.zzu.isEmpty() ? com.google.android.gms.internal.ads.zzfxn.zzo("") : zzxhVar.zzu;
        int i7 = 0;
        while (true) {
            if (i7 >= zzfxnVarZzo.size()) {
                i7 = Integer.MAX_VALUE;
                iZzc = 0;
                break;
            }
            com.google.android.gms.internal.ads.zzab zzabVar = this.zzd;
            java.lang.String str2 = (java.lang.String) zzfxnVarZzo.get(i7);
            boolean z = zzxhVar.zzx;
            iZzc = com.google.android.gms.internal.ads.zzxt.zzc(zzabVar, str2, false);
            if (iZzc > 0) {
                break;
            } else {
                i7++;
            }
        }
        this.zzi = i7;
        this.zzj = iZzc;
        int iZzb = com.google.android.gms.internal.ads.zzxt.zzb(this.zzd.zzf, zzxhVar.zzv);
        this.zzk = iZzb;
        this.zzm = (this.zzd.zzf & 1088) != 0;
        int iZzc2 = com.google.android.gms.internal.ads.zzxt.zzc(this.zzd, str, com.google.android.gms.internal.ads.zzxt.zzh(str) == null);
        this.zzl = iZzc2;
        boolean z2 = iZzc > 0 || (zzxhVar.zzu.isEmpty() && iZzb > 0) || this.zzg || (this.zzh && iZzc2 > 0);
        if (com.google.android.gms.internal.ads.zzlk.zza(i3, zzxhVar.zzO) && z2) {
            i4 = 1;
        }
        this.zze = i4;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.gms.internal.ads.zzxm zzxmVar) {
        com.google.android.gms.internal.ads.zzfxc zzfxcVarZzb = com.google.android.gms.internal.ads.zzfxc.zzj().zzd(this.zzf, zzxmVar.zzf).zzc(java.lang.Integer.valueOf(this.zzi), java.lang.Integer.valueOf(zzxmVar.zzi), com.google.android.gms.internal.ads.zzfyy.zzc().zza()).zzb(this.zzj, zzxmVar.zzj).zzb(this.zzk, zzxmVar.zzk).zzd(this.zzg, zzxmVar.zzg).zzc(java.lang.Boolean.valueOf(this.zzh), java.lang.Boolean.valueOf(zzxmVar.zzh), this.zzj == 0 ? com.google.android.gms.internal.ads.zzfyy.zzc() : com.google.android.gms.internal.ads.zzfyy.zzc().zza()).zzb(this.zzl, zzxmVar.zzl);
        if (this.zzk == 0) {
            zzfxcVarZzb = zzfxcVarZzb.zze(this.zzm, zzxmVar.zzm);
        }
        return zzfxcVarZzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final /* bridge */ /* synthetic */ boolean zzc(com.google.android.gms.internal.ads.zzxo zzxoVar) {
        return false;
    }
}
