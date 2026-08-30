package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class b5 {
    public com.applovin.impl.db a(byte[] bArr) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        android.os.Bundle bundle = parcelObtain.readBundle(android.os.Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return com.applovin.impl.p2.a(com.applovin.impl.a5.t, (java.util.ArrayList) com.applovin.impl.b1.a(bundle.getParcelableArrayList("c")));
    }
}
