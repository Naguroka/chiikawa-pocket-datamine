package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
class zzbf extends com.google.android.gms.nearby.messages.internal.zzaa {
    private static final com.google.android.gms.internal.nearby.zzhr<com.google.android.gms.nearby.messages.SubscribeCallback> zza = new com.google.android.gms.nearby.messages.internal.zzbe();
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.SubscribeCallback> zzb;

    public zzbf(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.SubscribeCallback> listenerHolder) {
        this.zzb = listenerHolder;
    }

    public void zzd() {
        com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.SubscribeCallback> listenerHolder = this.zzb;
        if (listenerHolder != null) {
            listenerHolder.notifyListener(zza);
        }
    }
}
