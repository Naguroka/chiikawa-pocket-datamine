package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzca extends com.google.android.gms.internal.play_billing.zzbt {
    static final com.google.android.gms.internal.play_billing.zzbt zza = new com.google.android.gms.internal.play_billing.zzca(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzca(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.play_billing.zzbg.zza(i, this.zzc, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return java.util.Objects.requireNonNull(this.zzb[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, com.google.android.gms.internal.play_billing.zzbq
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = this.zzb;
        int i2 = this.zzc;
        java.lang.System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final java.lang.Object[] zzg() {
        return this.zzb;
    }
}
