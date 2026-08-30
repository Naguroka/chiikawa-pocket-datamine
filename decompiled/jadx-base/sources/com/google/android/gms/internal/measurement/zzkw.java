package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkw extends com.google.android.gms.internal.measurement.zzkx {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzld zza;
    private int zzb = 0;
    private final int zzc;

    zzkw(com.google.android.gms.internal.measurement.zzld zzldVar) {
        this.zza = zzldVar;
        this.zzc = zzldVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
