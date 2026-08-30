package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m2 extends android.os.Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f1006a;

    static {
        f1006a = com.applovin.impl.xp.f1515a >= 30 ? android.os.IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public static com.applovin.impl.db a(android.os.IBinder iBinder) {
        int i;
        com.applovin.impl.db.a aVarF = com.applovin.impl.db.f();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            aVarF.b((android.os.Bundle) com.applovin.impl.b1.a(parcelObtain2.readBundle()));
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i3 = i;
                } catch (android.os.RemoteException e) {
                    throw new java.lang.RuntimeException(e);
                }
            } catch (java.lang.Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return aVarF.a();
    }
}
