package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzet extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.Long zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ android.os.Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzet(com.google.android.gms.internal.measurement.zzff zzffVar, java.lang.Long l, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2) {
        super(zzffVar, true);
        this.zza = l;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z;
        this.zzf = z2;
        this.zzg = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        java.lang.Long l = this.zza;
        ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzg.zzj)).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, l == null ? this.zzh : l.longValue());
    }
}
