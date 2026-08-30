package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfzf extends com.google.android.gms.internal.ads.zzfxs {
    static final com.google.android.gms.internal.ads.zzfzf zza;
    private static final java.lang.Object[] zzd;
    final transient java.lang.Object[] zzb;
    final transient java.lang.Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        zzd = objArr;
        zza = new com.google.android.gms.internal.ads.zzfzf(objArr, 0, objArr, 0, 0);
    }

    zzfzf(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj != null) {
            java.lang.Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iZzb = com.google.android.gms.internal.ads.zzfxf.zzb(obj);
                while (true) {
                    int i = iZzb & this.zzf;
                    java.lang.Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZzb = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, i, this.zzg);
        return i + this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi
    /* JADX INFO: renamed from: zze */
    public final com.google.android.gms.internal.ads.zzfzt iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    final java.lang.Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    final com.google.android.gms.internal.ads.zzfxn zzi() {
        return com.google.android.gms.internal.ads.zzfxn.zzj(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    final boolean zzu() {
        return true;
    }
}
