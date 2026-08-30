package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zaa implements android.os.IInterface {
    private final android.os.IBinder zaa;
    private final java.lang.String zab;

    protected zaa(android.os.IBinder iBinder, java.lang.String str) {
        this.zaa = iBinder;
        this.zab = str;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.zaa;
    }

    protected final android.os.Parcel zaa() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zab);
        return parcelObtain;
    }

    protected final android.os.Parcel zab(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.zaa.transact(2, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (java.lang.RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (java.lang.Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    protected final void zac(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.zaa.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void zad(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            this.zaa.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
