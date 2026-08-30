package com.google.android.gms.internal.ads_identifier;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zza implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

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

    protected final android.os.Parcel zzb(int i, android.os.Parcel parcel) throws android.os.RemoteException {
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
}
