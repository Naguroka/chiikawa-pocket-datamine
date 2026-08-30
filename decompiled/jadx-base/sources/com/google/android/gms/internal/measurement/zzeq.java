package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzeq extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ android.content.Intent zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeq(com.google.android.gms.internal.measurement.zzff zzffVar, android.content.Intent intent) {
        super(zzffVar, true);
        this.zza = intent;
        this.zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb.zzj)).setSgtmDebugInfo(this.zza);
    }
}
