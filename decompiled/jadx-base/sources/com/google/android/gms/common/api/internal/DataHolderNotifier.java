package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class DataHolderNotifier<L> implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<L> {
    private final com.google.android.gms.common.data.DataHolder zaa;

    protected DataHolderNotifier(com.google.android.gms.common.data.DataHolder dataHolder) {
        this.zaa = dataHolder;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(L l) {
        notifyListener(l, this.zaa);
    }

    protected abstract void notifyListener(L l, com.google.android.gms.common.data.DataHolder dataHolder);

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public void onNotifyListenerFailed() {
        com.google.android.gms.common.data.DataHolder dataHolder = this.zaa;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
