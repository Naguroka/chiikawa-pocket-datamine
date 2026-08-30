package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfzb extends com.google.android.gms.internal.ads.zzfxs {
    private final transient com.google.android.gms.internal.ads.zzfxq zza;
    private final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzfzb(com.google.android.gms.internal.ads.zzfxq zzfxqVar, java.lang.Object[] objArr, int i, int i2) {
        this.zza = zzfxqVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
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

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final int zza(java.lang.Object[] objArr, int i) {
        return zzd().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi
    /* JADX INFO: renamed from: zze */
    public final com.google.android.gms.internal.ads.zzfzt iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    final com.google.android.gms.internal.ads.zzfxn zzi() {
        return new com.google.android.gms.internal.ads.zzfza(this);
    }
}
