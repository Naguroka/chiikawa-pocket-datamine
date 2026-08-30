package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaci extends com.google.android.gms.common.api.internal.RegisterListenerMethod {
    final /* synthetic */ com.google.android.gms.common.api.internal.RegistrationMethods.Builder zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaci(com.google.android.gms.common.api.internal.RegistrationMethods.Builder builder, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.common.Feature[] featureArr, boolean z, int i) {
        super(listenerHolder, featureArr, z, i);
        this.zaa = builder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    protected final void registerListener(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) throws android.os.RemoteException {
        this.zaa.zaa.accept(anyClient, taskCompletionSource);
    }
}
