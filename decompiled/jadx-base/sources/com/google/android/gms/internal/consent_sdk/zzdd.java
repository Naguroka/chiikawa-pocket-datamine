package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdd extends com.google.android.gms.internal.consent_sdk.zzda {
    static final com.google.android.gms.internal.consent_sdk.zzda zza = new com.google.android.gms.internal.consent_sdk.zzdd(new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    zzdd(java.lang.Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.consent_sdk.zzct.zza(i, this.zzc, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return java.util.Objects.requireNonNull(this.zzb[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda, com.google.android.gms.internal.consent_sdk.zzcx
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    final java.lang.Object[] zze() {
        return this.zzb;
    }
}
