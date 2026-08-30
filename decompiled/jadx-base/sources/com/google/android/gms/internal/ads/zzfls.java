package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfls implements com.google.android.gms.internal.ads.zzfll {
    private static com.google.android.gms.internal.ads.zzfls zza;
    private float zzb = 0.0f;
    private com.google.android.gms.internal.ads.zzflg zzc;
    private com.google.android.gms.internal.ads.zzflk zzd;

    public zzfls(com.google.android.gms.internal.ads.zzflh zzflhVar, com.google.android.gms.internal.ads.zzflf zzflfVar) {
    }

    public static com.google.android.gms.internal.ads.zzfls zzb() {
        if (zza == null) {
            zza = new com.google.android.gms.internal.ads.zzfls(new com.google.android.gms.internal.ads.zzflh(), new com.google.android.gms.internal.ads.zzflf());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfll
    public final void zzc(boolean z) {
        if (z) {
            com.google.android.gms.internal.ads.zzfmu.zzd().zzi();
        } else {
            com.google.android.gms.internal.ads.zzfmu.zzd().zzh();
        }
    }

    public final void zzd(android.content.Context context) {
        this.zzc = new com.google.android.gms.internal.ads.zzflg(new android.os.Handler(), context, new com.google.android.gms.internal.ads.zzfle(), this);
    }

    public final void zze(float f) {
        this.zzb = f;
        if (this.zzd == null) {
            this.zzd = com.google.android.gms.internal.ads.zzflk.zza();
        }
        java.util.Iterator it = this.zzd.zzb().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzfkt) it.next()).zzg().zzl(f);
        }
    }

    public final void zzf() {
        com.google.android.gms.internal.ads.zzflj.zza().zze(this);
        com.google.android.gms.internal.ads.zzflj.zza().zzf();
        com.google.android.gms.internal.ads.zzfmu.zzd().zzi();
        this.zzc.zza();
    }

    public final void zzg() {
        com.google.android.gms.internal.ads.zzfmu.zzd().zzj();
        com.google.android.gms.internal.ads.zzflj.zza().zzg();
        this.zzc.zzb();
    }
}
