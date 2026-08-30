package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzha implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.play_billing.zzhd zza;
    private int zzb;
    private boolean zzc;
    private java.util.Iterator zzd;

    /* synthetic */ zzha(com.google.android.gms.internal.play_billing.zzhd zzhdVar, com.google.android.gms.internal.play_billing.zzhc zzhcVar) {
        java.util.Objects.requireNonNull(zzhdVar);
        this.zza = zzhdVar;
        this.zzb = -1;
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
        com.google.android.gms.internal.play_billing.zzhd zzhdVar = this.zza;
        if (i >= zzhdVar.zzb) {
            return !zzhdVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        com.google.android.gms.internal.play_billing.zzhd zzhdVar = this.zza;
        return i < zzhdVar.zzb ? (com.google.android.gms.internal.play_billing.zzgz) zzhdVar.zza[i] : (java.util.Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        com.google.android.gms.internal.play_billing.zzhd zzhdVar = this.zza;
        zzhdVar.zzo();
        int i = this.zzb;
        if (i >= zzhdVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzhdVar.zzm(i);
        }
    }
}
