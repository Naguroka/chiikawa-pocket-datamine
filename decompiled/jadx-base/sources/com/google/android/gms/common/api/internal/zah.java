package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zah extends com.google.android.gms.common.api.internal.zad {
    public final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zab;

    public zah(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.zab = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(com.google.android.gms.common.api.internal.zabo zaboVar) {
        com.google.android.gms.common.api.internal.zacg zacgVar = (com.google.android.gms.common.api.internal.zacg) zaboVar.zah().get(this.zab);
        return zacgVar != null && zacgVar.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabo zaboVar) {
        com.google.android.gms.common.api.internal.zacg zacgVar = (com.google.android.gms.common.api.internal.zacg) zaboVar.zah().get(this.zab);
        if (zacgVar == null) {
            return null;
        }
        return zacgVar.zaa.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void zac(com.google.android.gms.common.api.internal.zabo zaboVar) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.zacg zacgVar = (com.google.android.gms.common.api.internal.zacg) zaboVar.zah().remove(this.zab);
        if (zacgVar == null) {
            this.zaa.trySetResult(false);
            return;
        }
        zacgVar.zab.unregisterListener(zaboVar.zaf(), this.zaa);
        zacgVar.zaa.clearListener();
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(com.google.android.gms.common.api.internal.zaac zaacVar, boolean z) {
    }
}
