package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzeh extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.Object zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeh(com.google.android.gms.internal.measurement.zzff zzffVar, boolean z, int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        super(zzffVar, false);
        this.zza = str;
        this.zzb = obj;
        this.zzc = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
        ((com.google.android.gms.internal.measurement.zzcv) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zzj)).logHealthData(5, this.zza, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb), com.google.android.gms.dynamic.ObjectWrapper.wrap(null), com.google.android.gms.dynamic.ObjectWrapper.wrap(null));
    }
}
