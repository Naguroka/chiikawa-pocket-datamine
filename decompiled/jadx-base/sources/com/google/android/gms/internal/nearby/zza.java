package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zza implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb;

    protected zza(android.os.IBinder iBinder, java.lang.String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.zza;
    }

    protected final android.os.Parcel zza() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zzb);
        return parcelObtain;
    }

    protected final void zzp(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.zza.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void zzq(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            this.zza.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
