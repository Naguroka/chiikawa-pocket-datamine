package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdl extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdl(com.google.android.gms.internal.measurement.zzff zzffVar, java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z) {
        super(zzffVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z;
        this.zze = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze.zzj)).setUserProperty(this.zza, this.zzb, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzc), this.zzd, this.zzh);
    }
}
