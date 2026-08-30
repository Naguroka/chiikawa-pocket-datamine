package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzej extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcs zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzej(com.google.android.gms.internal.measurement.zzff zzffVar, java.lang.String str, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        super(zzffVar, true);
        this.zza = str;
        this.zzb = zzcsVar;
        this.zzc = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zzj)).getMaxUserProperties(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    protected final void zzb() {
        this.zzb.zze(null);
    }
}
