package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbs extends com.google.android.gms.internal.play_billing.zzbt {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.play_billing.zzbt zzc;

    zzbs(com.google.android.gms.internal.play_billing.zzbt zzbtVar, int i, int i2) {
        java.util.Objects.requireNonNull(zzbtVar);
        this.zzc = zzbtVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.play_billing.zzbg.zza(i, this.zzb, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final java.lang.Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: zzh */
    public final com.google.android.gms.internal.play_billing.zzbt subList(int i, int i2) {
        com.google.android.gms.internal.play_billing.zzbg.zzd(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
