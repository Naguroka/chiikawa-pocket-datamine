package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfkt extends com.google.android.gms.internal.ads.zzfkp {
    private final com.google.android.gms.internal.ads.zzfkr zza;
    private com.google.android.gms.internal.ads.zzfnb zzc;
    private com.google.android.gms.internal.ads.zzfma zzd;
    private final java.lang.String zzg;
    private final com.google.android.gms.internal.ads.zzflo zzb = new com.google.android.gms.internal.ads.zzflo();
    private boolean zze = false;
    private boolean zzf = false;

    zzfkt(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkr zzfkrVar, java.lang.String str) {
        this.zza = zzfkrVar;
        this.zzg = str;
        zzk(null);
        if (zzfkrVar.zzd() == com.google.android.gms.internal.ads.zzfks.HTML || zzfkrVar.zzd() == com.google.android.gms.internal.ads.zzfks.JAVASCRIPT) {
            this.zzd = new com.google.android.gms.internal.ads.zzfmb(str, zzfkrVar.zza());
        } else {
            this.zzd = new com.google.android.gms.internal.ads.zzfme(str, zzfkrVar.zzi(), null);
        }
        this.zzd.zzo();
        com.google.android.gms.internal.ads.zzflk.zza().zzd(this);
        this.zzd.zzf(zzfkqVar);
    }

    private final void zzk(android.view.View view) {
        this.zzc = new com.google.android.gms.internal.ads.zzfnb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfkp
    public final void zzb(android.view.View view, com.google.android.gms.internal.ads.zzfkw zzfkwVar, java.lang.String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfkwVar, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.zzfkp
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zze();
        com.google.android.gms.internal.ads.zzflk.zza().zze(this);
        this.zzd.zzc();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfkp
    public final void zzd(android.view.View view) {
        if (this.zzf || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzb();
        java.util.Collection<com.google.android.gms.internal.ads.zzfkt> collectionZzc = com.google.android.gms.internal.ads.zzflk.zza().zzc();
        if (collectionZzc == null || collectionZzc.isEmpty()) {
            return;
        }
        for (com.google.android.gms.internal.ads.zzfkt zzfktVar : collectionZzc) {
            if (zzfktVar != this && zzfktVar.zzf() == view) {
                zzfktVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkp
    public final void zze() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        com.google.android.gms.internal.ads.zzflk.zza().zzf(this);
        this.zzd.zzl(com.google.android.gms.internal.ads.zzfls.zzb().zza());
        this.zzd.zzg(com.google.android.gms.internal.ads.zzfli.zza().zzb());
        this.zzd.zzi(this, this.zza);
    }

    public final android.view.View zzf() {
        return (android.view.View) this.zzc.get();
    }

    public final com.google.android.gms.internal.ads.zzfma zzg() {
        return this.zzd;
    }

    public final java.lang.String zzh() {
        return this.zzg;
    }

    public final java.util.List zzi() {
        return this.zzb.zza();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
