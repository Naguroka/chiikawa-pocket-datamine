package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zal extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {
    zal(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(com.google.android.gms.common.internal.service.zak zakVar) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zad(parcelZaa, zakVar);
        zad(1, parcelZaa);
    }
}
