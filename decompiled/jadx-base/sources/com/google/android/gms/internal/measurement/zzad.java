package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzad implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzae zza;
    private int zzb = 0;

    zzad(com.google.android.gms.internal.measurement.zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        com.google.android.gms.internal.measurement.zzae zzaeVar = this.zza;
        if (this.zzb < zzaeVar.zzc()) {
            int i = this.zzb;
            this.zzb = i + 1;
            return zzaeVar.zze(i);
        }
        throw new java.util.NoSuchElementException("Out of bounds index: " + this.zzb);
    }
}
