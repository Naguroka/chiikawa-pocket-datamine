package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class a implements android.os.IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.IBinder f2237a;
    private final java.lang.String b;

    protected a(android.os.IBinder iBinder, java.lang.String str) {
        this.f2237a = iBinder;
        this.b = str;
    }

    protected final android.os.Parcel a() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f2237a;
    }

    protected final void b(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            this.f2237a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
