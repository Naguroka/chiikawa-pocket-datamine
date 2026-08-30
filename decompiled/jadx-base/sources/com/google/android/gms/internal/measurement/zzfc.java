package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfc extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ android.app.Activity zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcs zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfc(com.google.android.gms.internal.measurement.zzfe zzfeVar, android.app.Activity activity, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        super(zzfeVar.zza, true);
        this.zza = activity;
        this.zzb = zzcsVar;
        this.zzc = zzfeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zza.zzj)).onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj.zza(this.zza), this.zzb, this.zzi);
    }
}
