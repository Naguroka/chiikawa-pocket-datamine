package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzerg implements com.google.android.gms.internal.ads.zzetr {
    private final android.content.Context zza;
    private final android.content.Intent zzb;

    zzerg(android.content.Context context, android.content.Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmG)).booleanValue()) {
            return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzerh(null));
        }
        boolean z = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z = true;
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzerh(java.lang.Boolean.valueOf(z)));
    }
}
