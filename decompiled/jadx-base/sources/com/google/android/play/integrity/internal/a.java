package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public class a implements android.os.IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.IBinder f2328a;
    private final java.lang.String b;

    protected a(android.os.IBinder iBinder, java.lang.String str) {
        this.f2328a = iBinder;
        this.b = str;
    }

    protected final android.os.Parcel a() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f2328a;
    }

    protected final void b(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            this.f2328a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
