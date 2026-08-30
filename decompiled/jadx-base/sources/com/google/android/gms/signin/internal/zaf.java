package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {
    zaf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        parcelZaa.writeInt(i);
        zac(7, parcelZaa);
    }

    public final void zaf(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, int i, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zad(parcelZaa, iAccountAccessor);
        parcelZaa.writeInt(i);
        parcelZaa.writeInt(z ? 1 : 0);
        zac(9, parcelZaa);
    }

    public final void zag(com.google.android.gms.signin.internal.zai zaiVar, com.google.android.gms.signin.internal.zae zaeVar) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zac(parcelZaa, zaiVar);
        com.google.android.gms.internal.base.zac.zad(parcelZaa, zaeVar);
        zac(12, parcelZaa);
    }
}
