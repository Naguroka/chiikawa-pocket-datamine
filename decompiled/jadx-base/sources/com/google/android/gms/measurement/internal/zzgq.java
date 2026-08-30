package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgq extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.measurement.internal.zzgr {
    public zzgq() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        com.google.android.gms.measurement.internal.zzpe zzpeVar = (com.google.android.gms.measurement.internal.zzpe) com.google.android.gms.internal.measurement.zzbo.zza(parcel, com.google.android.gms.measurement.internal.zzpe.CREATOR);
        com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
        zze(zzpeVar);
        return true;
    }
}
