package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-base@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzayb extends android.os.Binder implements android.os.IInterface {
    protected zzayb(java.lang.String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return zzdD(i, parcel, parcel2, i2);
    }

    protected boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        throw null;
    }
}
