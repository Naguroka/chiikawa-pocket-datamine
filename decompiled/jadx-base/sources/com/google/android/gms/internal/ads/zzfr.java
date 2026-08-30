package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfr implements com.google.android.gms.internal.ads.zzfy {
    private final boolean zza;
    private final java.util.ArrayList zzb = new java.util.ArrayList(1);
    private int zzc;
    private com.google.android.gms.internal.ads.zzgd zzd;

    protected zzfr(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public /* synthetic */ java.util.Map zze() {
        return java.util.Collections.emptyMap();
    }

    protected final void zzg(int i) {
        com.google.android.gms.internal.ads.zzgd zzgdVar = this.zzd;
        int i2 = com.google.android.gms.internal.ads.zzei.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((com.google.android.gms.internal.ads.zzgy) this.zzb.get(i3)).zza(this, zzgdVar, this.zza, i);
        }
    }

    protected final void zzh() {
        com.google.android.gms.internal.ads.zzgd zzgdVar = this.zzd;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((com.google.android.gms.internal.ads.zzgy) this.zzb.get(i2)).zzb(this, zzgdVar, this.zza);
        }
        this.zzd = null;
    }

    protected final void zzi(com.google.android.gms.internal.ads.zzgd zzgdVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((com.google.android.gms.internal.ads.zzgy) this.zzb.get(i)).zzc(this, zzgdVar, this.zza);
        }
    }

    protected final void zzj(com.google.android.gms.internal.ads.zzgd zzgdVar) {
        this.zzd = zzgdVar;
        for (int i = 0; i < this.zzc; i++) {
            ((com.google.android.gms.internal.ads.zzgy) this.zzb.get(i)).zzd(this, zzgdVar, this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzf(com.google.android.gms.internal.ads.zzgy zzgyVar) {
        zzgyVar.getClass();
        if (this.zzb.contains(zzgyVar)) {
            return;
        }
        this.zzb.add(zzgyVar);
        this.zzc++;
    }
}
