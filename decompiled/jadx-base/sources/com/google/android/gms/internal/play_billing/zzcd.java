package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcd extends com.google.android.gms.internal.play_billing.zzbx {
    private final transient com.google.android.gms.internal.play_billing.zzbw zza;
    private final transient com.google.android.gms.internal.play_billing.zzbt zzb;

    zzcd(com.google.android.gms.internal.play_billing.zzbw zzbwVar, com.google.android.gms.internal.play_billing.zzbt zzbtVar) {
        this.zza = zzbwVar;
        this.zzb = zzbtVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final int zza(java.lang.Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, com.google.android.gms.internal.play_billing.zzbq
    public final com.google.android.gms.internal.play_billing.zzbt zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, com.google.android.gms.internal.play_billing.zzbq
    /* JADX INFO: renamed from: zze */
    public final com.google.android.gms.internal.play_billing.zzch iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final boolean zzf() {
        throw null;
    }
}
