package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
public class zzd extends android.os.Binder implements android.os.IInterface {
    private static com.google.android.gms.internal.p000authapi.zzf zze;

    protected zzd(java.lang.String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    protected boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        boolean zOnTransact;
        if (i > 16777215) {
            zOnTransact = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return dispatchTransaction(i, parcel, parcel2, i2);
    }
}
