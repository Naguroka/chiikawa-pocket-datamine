package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class UnregisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zaa;

    protected UnregisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> listenerKey) {
        this.zaa = listenerKey;
    }

    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa;
    }

    protected abstract void unregisterListener(A a2, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource) throws android.os.RemoteException;
}
