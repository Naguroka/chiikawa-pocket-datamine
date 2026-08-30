package com.google.android.gms.common.moduleinstall.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements android.os.IInterface {
    zaf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zae(com.google.android.gms.common.moduleinstall.internal.zae zaeVar, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zad(parcelZaa, zaeVar);
        com.google.android.gms.internal.base.zac.zac(parcelZaa, apiFeatureRequest);
        zac(1, parcelZaa);
    }

    public final void zaf(com.google.android.gms.common.moduleinstall.internal.zae zaeVar, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zad(parcelZaa, zaeVar);
        com.google.android.gms.internal.base.zac.zac(parcelZaa, apiFeatureRequest);
        zac(3, parcelZaa);
    }

    public final void zag(com.google.android.gms.common.moduleinstall.internal.zae zaeVar, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequest, com.google.android.gms.common.moduleinstall.internal.zah zahVar) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zad(parcelZaa, zaeVar);
        com.google.android.gms.internal.base.zac.zac(parcelZaa, apiFeatureRequest);
        com.google.android.gms.internal.base.zac.zad(parcelZaa, zahVar);
        zac(2, parcelZaa);
    }

    public final void zah(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest apiFeatureRequest) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zad(parcelZaa, iStatusCallback);
        com.google.android.gms.internal.base.zac.zac(parcelZaa, apiFeatureRequest);
        zac(4, parcelZaa);
    }

    public final void zai(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback, com.google.android.gms.common.moduleinstall.internal.zah zahVar) throws android.os.RemoteException {
        android.os.Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zad(parcelZaa, iStatusCallback);
        com.google.android.gms.internal.base.zac.zad(parcelZaa, zahVar);
        zac(6, parcelZaa);
    }
}
