package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzar implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzat zza;
    private int zzb = 0;

    zzar(com.google.android.gms.internal.measurement.zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zza.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        com.google.android.gms.internal.measurement.zzat zzatVar = this.zza;
        int i = this.zzb;
        if (i >= zzatVar.zza.length()) {
            throw new java.util.NoSuchElementException();
        }
        this.zzb = i + 1;
        return new com.google.android.gms.internal.measurement.zzat(java.lang.String.valueOf(i));
    }
}
