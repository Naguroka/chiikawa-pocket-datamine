package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
public class zzc implements android.os.IInterface {
    private final android.os.IBinder zzc;
    private final java.lang.String zzd;

    protected zzc(android.os.IBinder iBinder, java.lang.String str) {
        this.zzc = iBinder;
        this.zzd = str;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.zzc;
    }

    protected final android.os.Parcel obtainAndWriteInterfaceToken() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zzd);
        return parcelObtain;
    }

    protected final void transactAndReadExceptionReturnVoid(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.zzc.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
