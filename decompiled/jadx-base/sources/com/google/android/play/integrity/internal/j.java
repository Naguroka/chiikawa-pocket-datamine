package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j extends com.google.android.play.integrity.internal.b implements com.google.android.play.integrity.internal.k {
    public j() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.b
    protected final boolean a(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 2) {
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.play.integrity.internal.c.a(parcel, android.os.Bundle.CREATOR);
            com.google.android.play.integrity.internal.c.b(parcel);
            e(bundle);
            return true;
        }
        if (i == 3) {
            android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.play.integrity.internal.c.a(parcel, android.os.Bundle.CREATOR);
            com.google.android.play.integrity.internal.c.b(parcel);
            c(bundle2);
            return true;
        }
        if (i == 4) {
            android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.play.integrity.internal.c.a(parcel, android.os.Bundle.CREATOR);
            com.google.android.play.integrity.internal.c.b(parcel);
            d(bundle3);
            return true;
        }
        if (i != 5) {
            return false;
        }
        android.os.Bundle bundle4 = (android.os.Bundle) com.google.android.play.integrity.internal.c.a(parcel, android.os.Bundle.CREATOR);
        com.google.android.play.integrity.internal.c.b(parcel);
        b(bundle4);
        return true;
    }
}
