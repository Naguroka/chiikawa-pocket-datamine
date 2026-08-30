package com.google.android.gms.internal.appset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zza implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb = "com.google.android.gms.appset.internal.IAppSetService";

    protected zza(android.os.IBinder iBinder, java.lang.String str) {
        this.zza = iBinder;
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

    protected final void zzb(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.zza.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
