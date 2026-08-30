package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgn extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.measurement.internal.zzgo {
    public zzgn() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.measurement.internal.zzov.CREATOR);
        com.google.android.gms.internal.measurement.zzbo.zzc(parcel);
        zze(arrayListCreateTypedArrayList);
        return true;
    }
}
