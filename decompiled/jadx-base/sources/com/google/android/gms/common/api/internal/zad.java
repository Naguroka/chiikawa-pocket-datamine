package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zad extends com.google.android.gms.common.api.internal.zac {
    protected final com.google.android.gms.tasks.TaskCompletionSource zaa;

    public zad(int i, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(i);
        this.zaa = taskCompletionSource;
    }

    protected abstract void zac(com.google.android.gms.common.api.internal.zabo zaboVar) throws android.os.RemoteException;

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(com.google.android.gms.common.api.Status status) {
        this.zaa.trySetException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(java.lang.Exception exc) {
        this.zaa.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabo zaboVar) throws android.os.DeadObjectException {
        try {
            zac(zaboVar);
        } catch (android.os.DeadObjectException e) {
            zad(com.google.android.gms.common.api.internal.zai.zah(e));
            throw e;
        } catch (android.os.RemoteException e2) {
            zad(com.google.android.gms.common.api.internal.zai.zah(e2));
        } catch (java.lang.RuntimeException e3) {
            this.zaa.trySetException(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void zag(com.google.android.gms.common.api.internal.zaac zaacVar, boolean z) {
    }
}
