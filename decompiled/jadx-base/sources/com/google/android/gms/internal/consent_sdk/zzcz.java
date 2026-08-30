package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcz extends com.google.android.gms.internal.consent_sdk.zzda {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzda zzc;

    zzcz(com.google.android.gms.internal.consent_sdk.zzda zzdaVar, int i, int i2) {
        this.zzc = zzdaVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.consent_sdk.zzct.zza(i, this.zzb, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    @javax.annotation.CheckForNull
    final java.lang.Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    /* JADX INFO: renamed from: zzf */
    public final com.google.android.gms.internal.consent_sdk.zzda subList(int i, int i2) {
        com.google.android.gms.internal.consent_sdk.zzct.zzc(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
