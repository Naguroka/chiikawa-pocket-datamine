package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzcv extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.events.OpenFileCallback> {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzg zzfu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcv(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey, com.google.android.gms.internal.drive.zzg zzgVar) {
        super(listenerKey);
        this.zzfu = zzgVar;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    protected final /* synthetic */ void unregisterListener(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        taskCompletionSource.setResult(java.lang.Boolean.valueOf(this.zzfu.cancel()));
    }
}
