package com.google.android.gms.common.moduleinstall.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface zae extends android.os.IInterface {
    void zab(com.google.android.gms.common.api.Status status) throws android.os.RemoteException;

    void zac(com.google.android.gms.common.api.Status status, com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse moduleInstallIntentResponse) throws android.os.RemoteException;

    void zad(com.google.android.gms.common.api.Status status, com.google.android.gms.common.moduleinstall.ModuleInstallResponse moduleInstallResponse) throws android.os.RemoteException;

    void zae(com.google.android.gms.common.api.Status status, com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse moduleAvailabilityResponse) throws android.os.RemoteException;
}
