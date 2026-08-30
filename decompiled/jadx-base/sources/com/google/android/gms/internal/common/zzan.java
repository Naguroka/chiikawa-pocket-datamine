package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzan extends com.google.android.gms.internal.common.zzal {
    static final com.google.android.gms.internal.common.zzal zza = new com.google.android.gms.internal.common.zzan(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzan(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.common.zzv.zza(i, this.zzc, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return java.util.Objects.requireNonNull(this.zzb[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzal, com.google.android.gms.internal.common.zzag
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzag
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzag
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzag
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzag
    final java.lang.Object[] zzg() {
        return this.zzb;
    }
}
