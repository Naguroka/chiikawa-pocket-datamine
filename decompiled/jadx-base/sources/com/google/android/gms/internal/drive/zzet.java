package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzet extends com.google.android.gms.internal.drive.zzb implements com.google.android.gms.internal.drive.zzes {
    public zzet() {
        super("com.google.android.gms.drive.internal.IEventCallback");
    }

    @Override // com.google.android.gms.internal.drive.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zzc((com.google.android.gms.internal.drive.zzfp) com.google.android.gms.internal.drive.zzc.zza(parcel, com.google.android.gms.internal.drive.zzfp.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
