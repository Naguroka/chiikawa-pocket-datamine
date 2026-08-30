package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zaf extends com.google.android.gms.common.api.internal.zad {
    public final com.google.android.gms.common.api.internal.zacg zab;

    public zaf(com.google.android.gms.common.api.internal.zacg zacgVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.zab = zacgVar;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(com.google.android.gms.common.api.internal.zabo zaboVar) {
        return this.zab.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabo zaboVar) {
        return this.zab.zaa.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void zac(com.google.android.gms.common.api.internal.zabo zaboVar) throws android.os.RemoteException {
        this.zab.zaa.registerListener(zaboVar.zaf(), this.zaa);
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = this.zab.zaa.getListenerKey();
        if (listenerKey != null) {
            zaboVar.zah().put(listenerKey, this.zab);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(com.google.android.gms.common.api.internal.zaac zaacVar, boolean z) {
    }
}
