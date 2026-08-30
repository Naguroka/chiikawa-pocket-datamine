package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zam extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {
    zam(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zae(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.common.internal.zax zaxVar) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zad(parcelZaa, iObjectWrapper);
        com.google.android.gms.internal.base.zac.zac(parcelZaa, zaxVar);
        android.os.Parcel parcelZab = zab(2, parcelZaa);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZab.readStrongBinder());
        parcelZab.recycle();
        return iObjectWrapperAsInterface;
    }
}
