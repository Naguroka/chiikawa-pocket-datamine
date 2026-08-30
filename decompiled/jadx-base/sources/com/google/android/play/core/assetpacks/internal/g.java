package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g extends com.google.android.play.core.assetpacks.internal.b implements com.google.android.play.core.assetpacks.internal.h {
    public g() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // com.google.android.play.core.assetpacks.internal.b
    protected final boolean a(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 2:
                int i3 = parcel.readInt();
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                n(i3, bundle);
                return true;
            case 3:
                int i4 = parcel.readInt();
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                b(i4, bundle2);
                return true;
            case 4:
                int i5 = parcel.readInt();
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                f(i5, bundle3);
                return true;
            case 5:
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                g(arrayListCreateTypedArrayList);
                return true;
            case 6:
                android.os.Bundle bundle4 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                android.os.Bundle bundle5 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                i(bundle4, bundle5);
                return true;
            case 7:
                android.os.Bundle bundle6 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                d(bundle6);
                return true;
            case 8:
                android.os.Bundle bundle7 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                android.os.Bundle bundle8 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                j(bundle7, bundle8);
                return true;
            case 9:
            default:
                return false;
            case 10:
                android.os.Bundle bundle9 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                android.os.Bundle bundle10 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                k(bundle9, bundle10);
                return true;
            case 11:
                android.os.Bundle bundle11 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                android.os.Bundle bundle12 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                h(bundle11, bundle12);
                return true;
            case 12:
                android.os.Bundle bundle13 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                android.os.Bundle bundle14 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                e(bundle13, bundle14);
                return true;
            case 13:
                android.os.Bundle bundle15 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                android.os.Bundle bundle16 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                m(bundle15, bundle16);
                return true;
            case 14:
                android.os.Bundle bundle17 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                android.os.Bundle bundle18 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                l(bundle17, bundle18);
                return true;
            case 15:
                android.os.Bundle bundle19 = (android.os.Bundle) com.google.android.play.core.assetpacks.internal.c.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.play.core.assetpacks.internal.c.b(parcel);
                c(bundle19);
                return true;
        }
    }
}
