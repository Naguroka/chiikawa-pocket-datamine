package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbc extends com.google.android.gms.internal.nearby.zzhr<com.google.android.gms.nearby.messages.PublishCallback> {
    zzbc() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.nearby.messages.PublishCallback) obj).onExpired();
    }
}
