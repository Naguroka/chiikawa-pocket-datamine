package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfzc extends com.google.android.gms.internal.ads.zzfxs {
    private final transient com.google.android.gms.internal.ads.zzfxq zza;
    private final transient com.google.android.gms.internal.ads.zzfxn zzb;

    zzfzc(com.google.android.gms.internal.ads.zzfxq zzfxqVar, com.google.android.gms.internal.ads.zzfxn zzfxnVar) {
        this.zza = zzfxqVar;
        this.zzb = zzfxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final int zza(java.lang.Object[] objArr, int i) {
        return this.zzb.zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi
    public final com.google.android.gms.internal.ads.zzfxn zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi
    /* JADX INFO: renamed from: zze */
    public final com.google.android.gms.internal.ads.zzfzt iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return true;
    }
}
