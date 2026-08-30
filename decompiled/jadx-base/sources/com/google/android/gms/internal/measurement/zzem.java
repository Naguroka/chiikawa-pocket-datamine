package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzem extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcs zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzem(com.google.android.gms.internal.measurement.zzff zzffVar, com.google.android.gms.internal.measurement.zzcs zzcsVar, int i) {
        super(zzffVar, true);
        this.zza = zzcsVar;
        this.zzb = i;
        this.zzc = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zzj)).getTestFlag(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    protected final void zzb() {
        this.zza.zze(null);
    }
}
