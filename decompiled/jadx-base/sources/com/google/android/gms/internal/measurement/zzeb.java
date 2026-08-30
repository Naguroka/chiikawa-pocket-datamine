package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzeb extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcs zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeb(com.google.android.gms.internal.measurement.zzff zzffVar, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        super(zzffVar, true);
        this.zza = zzcsVar;
        this.zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb.zzj)).getCachedAppInstanceId(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    protected final void zzb() {
        this.zza.zze(null);
    }
}
