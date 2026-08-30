package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzd {
    public static void zza(android.content.Context context) {
        int i = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeh.zza.zze()).booleanValue()) {
            try {
                if (android.provider.Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzl()) {
                    return;
                }
                com.google.common.util.concurrent.ListenableFuture listenableFutureZzb = new com.google.android.gms.ads.internal.util.zzc(context).zzb();
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Updating ad debug logging enablement.");
                com.google.android.gms.internal.ads.zzbzz.zza(listenableFutureZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (java.lang.Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to determine debug setting.", e);
            }
        }
    }
}
