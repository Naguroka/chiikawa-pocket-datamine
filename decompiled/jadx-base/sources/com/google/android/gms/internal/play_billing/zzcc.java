package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcc extends com.google.android.gms.internal.play_billing.zzbx {
    private final transient com.google.android.gms.internal.play_billing.zzbw zza;
    private final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzcc(com.google.android.gms.internal.play_billing.zzbw zzbwVar, java.lang.Object[] objArr, int i, int i2) {
        this.zza = zzbwVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final int zza(java.lang.Object[] objArr, int i) {
        return zzd().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, com.google.android.gms.internal.play_billing.zzbq
    /* JADX INFO: renamed from: zze */
    public final com.google.android.gms.internal.play_billing.zzch iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    final com.google.android.gms.internal.play_billing.zzbt zzh() {
        return new com.google.android.gms.internal.play_billing.zzcb(this);
    }
}
