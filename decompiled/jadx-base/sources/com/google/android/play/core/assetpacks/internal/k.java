package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class k extends com.google.android.play.core.assetpacks.internal.a implements android.os.IInterface {
    k(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void c(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        b(4, parcelA);
    }

    public final void d(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        b(3, parcelA);
    }

    public final void e(android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle);
        com.google.android.play.core.assetpacks.internal.c.c(parcelA, bundle2);
        b(2, parcelA);
    }
}
