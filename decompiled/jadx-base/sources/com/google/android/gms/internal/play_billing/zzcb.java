package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcb extends com.google.android.gms.internal.play_billing.zzbt {
    final /* synthetic */ com.google.android.gms.internal.play_billing.zzcc zza;

    zzcb(com.google.android.gms.internal.play_billing.zzcc zzccVar) {
        java.util.Objects.requireNonNull(zzccVar);
        this.zza = zzccVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        com.google.android.gms.internal.play_billing.zzcc zzccVar = this.zza;
        com.google.android.gms.internal.play_billing.zzbg.zza(i, zzccVar.zzc, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        int i2 = i + i;
        return new java.util.AbstractMap.SimpleImmutableEntry(java.util.Objects.requireNonNull(zzccVar.zzb[i2]), java.util.Objects.requireNonNull(zzccVar.zzb[i2 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean zzf() {
        return true;
    }
}
