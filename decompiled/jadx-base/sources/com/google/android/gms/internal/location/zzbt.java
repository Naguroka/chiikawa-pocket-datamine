package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbt<E> extends com.google.android.gms.internal.location.zzbs<E> {
    static final com.google.android.gms.internal.location.zzbs<java.lang.Object> zza = new com.google.android.gms.internal.location.zzbt(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzbt(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final E get(int i) {
        com.google.android.gms.internal.location.zzbm.zza(i, this.zzc, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return (E) this.zzb[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final java.lang.Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.location.zzbs, com.google.android.gms.internal.location.zzbp
    final int zzg(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }
}
