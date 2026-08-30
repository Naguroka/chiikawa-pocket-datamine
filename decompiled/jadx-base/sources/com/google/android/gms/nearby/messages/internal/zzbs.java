package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbs extends com.google.android.gms.nearby.messages.internal.zzu {
    private static final com.google.android.gms.internal.nearby.zzhr<com.google.android.gms.nearby.messages.PublishCallback> zza = new com.google.android.gms.nearby.messages.internal.zzbr();
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.PublishCallback> zzb;

    public zzbs(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.PublishCallback> listenerHolder) {
        this.zzb = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzv
    public final void zzd() {
        this.zzb.notifyListener(zza);
    }
}
