package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzef extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcs zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzef(com.google.android.gms.internal.measurement.zzff zzffVar, java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.internal.measurement.zzcs zzcsVar) {
        super(zzffVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = zzcsVar;
        this.zze = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze.zzj)).getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    protected final void zzb() {
        this.zzd.zze(null);
    }
}
