package com.google.android.a;

/* JADX INFO: compiled from: BaseProxy.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements android.os.IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.IBinder f2126a;
    private final java.lang.String b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected a(android.os.IBinder iBinder) {
        this.f2126a = iBinder;
    }

    protected final android.os.Parcel a() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f2126a;
    }

    protected final android.os.Parcel b(android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.f2126a.transact(1, parcel, parcelObtain, 0);
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
