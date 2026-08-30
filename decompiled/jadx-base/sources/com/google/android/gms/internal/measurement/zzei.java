package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzei extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcs zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzei(com.google.android.gms.internal.measurement.zzff zzffVar, android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        super(zzffVar, true);
        this.zza = bundle;
        this.zzb = zzcsVar;
        this.zzc = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zzj)).performAction(this.zza, this.zzb, this.zzh);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    protected final void zzb() {
        this.zzb.zze(null);
    }
}
