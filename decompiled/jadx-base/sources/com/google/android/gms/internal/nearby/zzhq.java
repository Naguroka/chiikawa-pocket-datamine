package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhq extends com.google.android.gms.nearby.messages.internal.zzq {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> zza;
    private boolean zzb = false;

    public zzhq(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzr
    public final synchronized void zzd(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        if (!this.zzb) {
            this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzhp(this, status));
            this.zzb = true;
            return;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(status);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 28);
        sb.append("Received multiple statuses: ");
        sb.append(strValueOf);
        android.util.Log.wtf("NearbyMessagesCallbackWrapper", sb.toString(), new java.lang.Exception());
    }
}
