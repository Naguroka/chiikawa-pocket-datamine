package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
class zzbd extends com.google.android.gms.nearby.messages.internal.zzu {
    private static final com.google.android.gms.internal.nearby.zzhr<com.google.android.gms.nearby.messages.PublishCallback> zza = new com.google.android.gms.nearby.messages.internal.zzbc();
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.PublishCallback> zzb;

    public zzbd(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.PublishCallback> listenerHolder) {
        this.zzb = listenerHolder;
    }

    public void zzd() {
        com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.PublishCallback> listenerHolder = this.zzb;
        if (listenerHolder != null) {
            listenerHolder.notifyListener(zza);
        }
    }
}
