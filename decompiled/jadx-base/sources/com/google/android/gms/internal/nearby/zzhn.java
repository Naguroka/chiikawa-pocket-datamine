package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhn extends com.google.android.gms.internal.nearby.zzhr<com.google.android.gms.nearby.messages.MessageListener> {
    final /* synthetic */ java.util.List zza;

    zzhn(com.google.android.gms.internal.nearby.zzho zzhoVar, java.util.List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        com.google.android.gms.internal.nearby.zzho.zzb(this.zza, (com.google.android.gms.nearby.messages.MessageListener) obj);
    }
}
