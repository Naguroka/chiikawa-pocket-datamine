package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzho extends com.google.android.gms.nearby.messages.internal.zzn {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.MessageListener> zza;

    public zzho(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.messages.MessageListener> listenerHolder) {
        this.zza = listenerHolder;
    }

    public static void zzb(java.lang.Iterable<com.google.android.gms.nearby.messages.internal.Update> iterable, com.google.android.gms.nearby.messages.MessageListener messageListener) {
        for (com.google.android.gms.nearby.messages.internal.Update update : iterable) {
            if (update.zza(1)) {
                messageListener.onFound(update.zzc);
            }
            if (update.zza(2)) {
                messageListener.onLost(update.zzc);
            }
            if (update.zza(4)) {
                messageListener.onDistanceChanged(update.zzc, update.zzd);
            }
            if (update.zza(8)) {
                messageListener.onBleSignalChanged(update.zzc, update.zze);
            }
            if (update.zza(16)) {
                com.google.android.gms.nearby.messages.Message message = update.zzc;
                com.google.android.gms.internal.nearby.zzhj zzhjVar = update.zzf;
            }
        }
    }

    public static void zzc(android.content.Intent intent, com.google.android.gms.nearby.messages.MessageListener messageListener) {
        android.os.Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.nearby.messages.UPDATES");
        zzb(bundleExtra == null ? java.util.Collections.emptyList() : bundleExtra.getParcelableArrayList("com.google.android.gms.nearby.messages.UPDATES"), messageListener);
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzo
    public final void zzd(java.util.List<com.google.android.gms.nearby.messages.internal.Update> list) throws android.os.RemoteException {
        this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzhn(this, list));
    }
}
