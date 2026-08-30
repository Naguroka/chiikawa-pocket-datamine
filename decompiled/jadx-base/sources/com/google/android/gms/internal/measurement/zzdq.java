package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdq extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzdj zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdq(com.google.android.gms.internal.measurement.zzff zzffVar, com.google.android.gms.internal.measurement.zzdj zzdjVar, java.lang.String str, java.lang.String str2) {
        super(zzffVar, true);
        this.zza = zzdjVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd.zzj)).setCurrentScreenByScionActivityInfo(this.zza, this.zzb, this.zzc, this.zzh);
    }
}
