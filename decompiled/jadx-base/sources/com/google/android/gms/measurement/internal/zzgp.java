package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgp extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.measurement.internal.zzgr {
    zzgp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final void zze(com.google.android.gms.measurement.internal.zzpe zzpeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbo.zzd(parcelZza, zzpeVar);
        zzd(2, parcelZza);
    }
}
