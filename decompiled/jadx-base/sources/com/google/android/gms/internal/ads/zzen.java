package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzen extends com.google.android.gms.internal.ads.zzeq {
    public final long zza;
    public final java.util.List zzb;
    public final java.util.List zzc;

    public zzen(int i, long j) {
        super(i, null);
        this.zza = j;
        this.zzb = new java.util.ArrayList();
        this.zzc = new java.util.ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final java.lang.String toString() {
        java.util.List list = this.zzb;
        return zze(this.zzd) + " leaves: " + java.util.Arrays.toString(list.toArray()) + " containers: " + java.util.Arrays.toString(this.zzc.toArray());
    }

    public final com.google.android.gms.internal.ads.zzen zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.gms.internal.ads.zzen zzenVar = (com.google.android.gms.internal.ads.zzen) this.zzc.get(i2);
            if (zzenVar.zzd == i) {
                return zzenVar;
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.ads.zzeo zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.gms.internal.ads.zzeo zzeoVar = (com.google.android.gms.internal.ads.zzeo) this.zzb.get(i2);
            if (zzeoVar.zzd == i) {
                return zzeoVar;
            }
        }
        return null;
    }

    public final void zzc(com.google.android.gms.internal.ads.zzen zzenVar) {
        this.zzc.add(zzenVar);
    }

    public final void zzd(com.google.android.gms.internal.ads.zzeo zzeoVar) {
        this.zzb.add(zzeoVar);
    }
}
