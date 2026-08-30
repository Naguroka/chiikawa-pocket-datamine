package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zae extends com.google.android.gms.common.api.internal.zai {
    protected final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaa;

    public zae(int i, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(i);
        this.zaa = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) com.google.android.gms.common.internal.Preconditions.checkNotNull(apiMethodImpl, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(com.google.android.gms.common.api.Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (java.lang.IllegalStateException e) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(java.lang.Exception exc) {
        try {
            this.zaa.setFailedResult(new com.google.android.gms.common.api.Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (java.lang.IllegalStateException e) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabo zaboVar) throws android.os.DeadObjectException {
        try {
            this.zaa.run(zaboVar.zaf());
        } catch (java.lang.RuntimeException e) {
            zae(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(com.google.android.gms.common.api.internal.zaac zaacVar, boolean z) {
        zaacVar.zac(this.zaa, z);
    }
}
