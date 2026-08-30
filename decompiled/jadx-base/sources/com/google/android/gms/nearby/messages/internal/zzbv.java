package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbv extends com.google.android.gms.nearby.messages.internal.zzaa {
    private static final com.google.android.gms.internal.nearby.zzhr<com.google.android.gms.nearby.messages.SubscribeCallback> zza = new com.google.android.gms.nearby.messages.internal.zzbu();
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.SubscribeCallback> zzb;

    public zzbv(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.SubscribeCallback> listenerHolder) {
        this.zzb = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzab
    public final void zzd() {
        this.zzb.notifyListener(zza);
    }
}
