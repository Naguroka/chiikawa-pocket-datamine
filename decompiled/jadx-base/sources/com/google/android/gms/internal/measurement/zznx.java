package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zznx implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzoa zza;
    private int zzb = -1;
    private boolean zzc;
    private java.util.Iterator zzd;

    /* synthetic */ zznx(com.google.android.gms.internal.measurement.zzoa zzoaVar, com.google.android.gms.internal.measurement.zznz zznzVar) {
        this.zza = zzoaVar;
    }

    private final java.util.Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        com.google.android.gms.internal.measurement.zzoa zzoaVar = this.zza;
        if (i >= zzoaVar.zzb) {
            return !zzoaVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        com.google.android.gms.internal.measurement.zzoa zzoaVar = this.zza;
        return i < zzoaVar.zzb ? (com.google.android.gms.internal.measurement.zznw) zzoaVar.zza[i] : (java.util.Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        com.google.android.gms.internal.measurement.zzoa zzoaVar = this.zza;
        zzoaVar.zzo();
        int i = this.zzb;
        if (i >= zzoaVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzoaVar.zzm(i);
        }
    }
}
