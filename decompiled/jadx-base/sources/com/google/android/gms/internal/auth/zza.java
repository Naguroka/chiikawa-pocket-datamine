package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public class zza implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb;

    protected zza(android.os.IBinder iBinder, java.lang.String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.zza;
    }

    protected final android.os.Parcel obtainAndWriteInterfaceToken() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zzb);
        return parcelObtain;
    }

    protected final android.os.Parcel transactAndReadException(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.zza.transact(i, parcel, parcelObtain, 0);
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

    protected final void transactAndReadExceptionReturnVoid(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.zza.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
