package com.google.android.a;

/* JADX INFO: compiled from: BaseStub.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends android.os.Binder implements android.os.IInterface {
    protected b() {
        attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    protected boolean a(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        throw null;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return a(i, parcel, parcel2);
    }
}
