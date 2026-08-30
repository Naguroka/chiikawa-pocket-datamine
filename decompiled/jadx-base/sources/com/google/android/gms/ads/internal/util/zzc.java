package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzc extends com.google.android.gms.ads.internal.util.zzb {
    private final android.content.Context zza;

    zzc(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = com.google.android.gms.ads.identifier.AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException | com.google.android.gms.common.GooglePlayServicesRepairableException | java.io.IOException | java.lang.IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to get isAdIdFakeForDebugLogging", e);
            isAdIdFakeForDebugLogging = false;
        }
        com.google.android.gms.ads.internal.util.client.zzl.zzj(isAdIdFakeForDebugLogging);
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Update ad debug logging enablement as " + isAdIdFakeForDebugLogging);
    }
}
