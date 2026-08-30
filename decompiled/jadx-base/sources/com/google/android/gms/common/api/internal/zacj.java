package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zacj extends com.google.android.gms.common.api.internal.UnregisterListenerMethod {
    final /* synthetic */ com.google.android.gms.common.api.internal.RegistrationMethods.Builder zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zacj(com.google.android.gms.common.api.internal.RegistrationMethods.Builder builder, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zaa = builder;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    protected final void unregisterListener(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource) throws android.os.RemoteException {
        this.zaa.zab.accept(anyClient, taskCompletionSource);
    }
}
