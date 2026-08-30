package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzew extends com.google.android.gms.internal.drive.zza implements com.google.android.gms.internal.drive.zzeu {
    zzew(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IEventReleaseCallback");
    }

    @Override // com.google.android.gms.internal.drive.zzeu
    public final void zza(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.drive.zzc.writeBoolean(parcelZza, z);
        zzc(1, parcelZza);
    }
}
