package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzht extends com.google.android.gms.nearby.messages.internal.zzx {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.StatusCallback> zza;

    public zzht(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.StatusCallback> listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzy
    public final void zzd(boolean z) {
        this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzhs(this, z));
    }
}
