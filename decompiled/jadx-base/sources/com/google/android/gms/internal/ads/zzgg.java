package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgg implements com.google.android.gms.internal.ads.zzfx {
    private com.google.android.gms.internal.ads.zzgy zzb;
    private java.lang.String zzc;
    private boolean zzf;
    private final com.google.android.gms.internal.ads.zzgs zza = new com.google.android.gms.internal.ads.zzgs();
    private int zzd = 8000;
    private int zze = 8000;

    public final com.google.android.gms.internal.ads.zzgg zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgg zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgg zzd(int i) {
        this.zze = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgg zze(com.google.android.gms.internal.ads.zzgy zzgyVar) {
        this.zzb = zzgyVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgg zzf(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzgl zza() {
        com.google.android.gms.internal.ads.zzgl zzglVar = new com.google.android.gms.internal.ads.zzgl(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        com.google.android.gms.internal.ads.zzgy zzgyVar = this.zzb;
        if (zzgyVar != null) {
            zzglVar.zzf(zzgyVar);
        }
        return zzglVar;
    }
}
