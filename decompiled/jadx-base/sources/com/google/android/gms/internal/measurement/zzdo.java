package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdo extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcs zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdo(com.google.android.gms.internal.measurement.zzff zzffVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        super(zzffVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcsVar;
        this.zzd = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd.zzj)).getConditionalUserProperties(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    protected final void zzb() {
        this.zzc.zze(null);
    }
}
