package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class o extends com.google.android.play.integrity.internal.b implements com.google.android.play.integrity.internal.p {
    public o() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.b
    protected final boolean a(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.play.integrity.internal.c.a(parcel, android.os.Bundle.CREATOR);
        com.google.android.play.integrity.internal.c.b(parcel);
        b(bundle);
        return true;
    }
}
