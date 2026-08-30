package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbe extends com.google.android.gms.internal.nearby.zzhr<com.google.android.gms.nearby.messages.SubscribeCallback> {
    zzbe() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.nearby.messages.SubscribeCallback) obj).onExpired();
    }
}
