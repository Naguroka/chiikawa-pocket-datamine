package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzheh implements java.util.Iterator {
    int zza = 0;
    final /* synthetic */ com.google.android.gms.internal.ads.zzhei zzb;

    zzheh(com.google.android.gms.internal.ads.zzhei zzheiVar) {
        this.zzb = zzheiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            com.google.android.gms.internal.ads.zzhei zzheiVar = this.zzb;
            zzheiVar.zza.add(zzheiVar.zzb.next());
            return next();
        }
        com.google.android.gms.internal.ads.zzhei zzheiVar2 = this.zzb;
        int i = this.zza;
        this.zza = i + 1;
        return zzheiVar2.zza.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
