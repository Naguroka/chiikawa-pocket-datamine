package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i extends com.google.android.play.core.assetpacks.internal.b implements com.google.android.play.core.assetpacks.internal.j {
    public i() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // com.google.android.play.core.assetpacks.internal.b
    protected final boolean a(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.play.core.assetpacks.internal.k kVar = null;
        if (i == 2) {
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                kVar = iInterfaceQueryLocalInterface instanceof com.google.android.play.core.assetpacks.internal.k ? (com.google.android.play.core.assetpacks.internal.k) iInterfaceQueryLocalInterface : new com.google.android.play.core.assetpacks.internal.k(strongBinder);
            }
            com.google.android.play.core.assetpacks.internal.c.b(parcel);
            c(bundle, kVar);
            return true;
        }
        if (i != 3) {
            return false;
        }
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
        android.os.IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            kVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.play.core.assetpacks.internal.k ? (com.google.android.play.core.assetpacks.internal.k) iInterfaceQueryLocalInterface2 : new com.google.android.play.core.assetpacks.internal.k(strongBinder2);
        }
        com.google.android.play.core.assetpacks.internal.c.b(parcel);
        b(bundle2, kVar);
        return true;
    }
}
