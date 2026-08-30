package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfzq extends com.google.android.gms.internal.ads.zzfxs {
    final transient java.lang.Object zza;

    zzfzq(java.lang.Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzfxw(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return com.ironsource.y8.i.d + this.zza.toString() + com.ironsource.y8.i.e;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final int zza(java.lang.Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi
    public final com.google.android.gms.internal.ads.zzfxn zzd() {
        return com.google.android.gms.internal.ads.zzfxn.zzo(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi
    /* JADX INFO: renamed from: zze */
    public final com.google.android.gms.internal.ads.zzfzt iterator() {
        return new com.google.android.gms.internal.ads.zzfxw(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return false;
    }
}
