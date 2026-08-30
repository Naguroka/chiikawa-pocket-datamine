package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends com.google.android.play.integrity.internal.a implements com.google.android.play.integrity.internal.n {
    l(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void c(android.os.Bundle bundle, com.google.android.play.integrity.internal.r rVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        com.google.android.play.integrity.internal.c.c(parcelA, bundle);
        parcelA.writeStrongBinder(rVar);
        b(3, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void d(android.os.Bundle bundle, com.google.android.play.integrity.internal.p pVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        com.google.android.play.integrity.internal.c.c(parcelA, bundle);
        parcelA.writeStrongBinder(pVar);
        b(2, parcelA);
    }
}
