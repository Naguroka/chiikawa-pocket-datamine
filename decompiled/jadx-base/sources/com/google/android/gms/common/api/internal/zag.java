package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zag extends com.google.android.gms.common.api.internal.zac {
    private final com.google.android.gms.common.api.internal.TaskApiCall zaa;
    private final com.google.android.gms.tasks.TaskCompletionSource zab;
    private final com.google.android.gms.common.api.internal.StatusExceptionMapper zad;

    public zag(int i, com.google.android.gms.common.api.internal.TaskApiCall taskApiCall, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.zab = taskCompletionSource;
        this.zaa = taskApiCall;
        this.zad = statusExceptionMapper;
        if (i == 2 && taskApiCall.shouldAutoResolveMissingFeatures()) {
            throw new java.lang.IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(com.google.android.gms.common.api.internal.zabo zaboVar) {
        return this.zaa.shouldAutoResolveMissingFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabo zaboVar) {
        return this.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(com.google.android.gms.common.api.Status status) {
        this.zab.trySetException(this.zad.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(java.lang.Exception exc) {
        this.zab.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabo zaboVar) throws android.os.DeadObjectException {
        try {
            this.zaa.doExecute(zaboVar.zaf(), this.zab);
        } catch (android.os.DeadObjectException e) {
            throw e;
        } catch (android.os.RemoteException e2) {
            zad(com.google.android.gms.common.api.internal.zai.zah(e2));
        } catch (java.lang.RuntimeException e3) {
            this.zab.trySetException(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(com.google.android.gms.common.api.internal.zaac zaacVar, boolean z) {
        zaacVar.zad(this.zab, z);
    }
}
