package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zai {
    public final int zac;

    public zai(int i) {
        this.zac = i;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zah(android.os.RemoteException remoteException) {
        return new com.google.android.gms.common.api.Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void zad(com.google.android.gms.common.api.Status status);

    public abstract void zae(java.lang.Exception exc);

    public abstract void zaf(com.google.android.gms.common.api.internal.zabo zaboVar) throws android.os.DeadObjectException;

    public abstract void zag(com.google.android.gms.common.api.internal.zaac zaacVar, boolean z);
}
