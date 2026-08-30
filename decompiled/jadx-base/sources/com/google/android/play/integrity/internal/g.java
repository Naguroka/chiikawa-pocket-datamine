package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends com.google.android.play.integrity.internal.a implements com.google.android.play.integrity.internal.i {
    g(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void c(android.os.Bundle bundle, com.google.android.play.integrity.internal.r rVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        com.google.android.play.integrity.internal.c.c(parcelA, bundle);
        parcelA.writeStrongBinder(rVar);
        b(6, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void d(android.os.Bundle bundle, com.google.android.play.integrity.internal.k kVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        com.google.android.play.integrity.internal.c.c(parcelA, bundle);
        parcelA.writeStrongBinder(kVar);
        b(3, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void e(android.os.Bundle bundle, com.google.android.play.integrity.internal.k kVar) throws android.os.RemoteException {
        android.os.Parcel parcelA = a();
        com.google.android.play.integrity.internal.c.c(parcelA, bundle);
        parcelA.writeStrongBinder(kVar);
        b(2, parcelA);
    }
}
