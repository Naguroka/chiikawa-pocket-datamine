package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhu implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    final /* synthetic */ android.content.ServiceConnection zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhv zzc;

    zzhu(com.google.android.gms.measurement.internal.zzhv zzhvVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, android.content.ServiceConnection serviceConnection) {
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
        this.zzc = zzhvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzhv zzhvVar = this.zzc;
        java.lang.String str = zzhvVar.zzb;
        com.google.android.gms.measurement.internal.zzhw zzhwVar = zzhvVar.zza;
        com.google.android.gms.measurement.internal.zzio zzioVar = zzhwVar.zza;
        zzioVar.zzaX().zzg();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.ironsource.y8.h.V, str);
        android.os.Bundle bundle2 = null;
        try {
            android.os.Bundle bundleZze = this.zza.zze(bundle);
            if (bundleZze == null) {
                zzioVar.zzaW().zze().zza("Install Referrer Service returned a null response");
            } else {
                bundle2 = bundleZze;
            }
        } catch (java.lang.Exception e) {
            zzhwVar.zza.zzaW().zze().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        com.google.android.gms.measurement.internal.zzio zzioVar2 = zzhwVar.zza;
        zzioVar2.zzaX().zzg();
        com.google.android.gms.measurement.internal.zzio.zzP();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzioVar2.zzaW().zzk().zza("Service response is missing Install Referrer install timestamp");
            } else {
                java.lang.String string = bundle2.getString(com.adjust.sdk.Constants.INSTALL_REFERRER);
                if (string == null || string.isEmpty()) {
                    zzioVar2.zzaW().zze().zza("No referrer defined in Install Referrer response");
                } else {
                    zzioVar2.zzaW().zzj().zzb("InstallReferrer API result", string);
                    android.os.Bundle bundleZzu = zzioVar2.zzw().zzu(android.net.Uri.parse("?".concat(string)));
                    if (bundleZzu == null) {
                        zzioVar2.zzaW().zze().zza("No campaign params defined in Install Referrer result");
                    } else {
                        if (bundleZzu.containsKey("gclid") || bundleZzu.containsKey("gbraid")) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j2 > 0) {
                                bundleZzu.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzioVar2.zzm().zzd.zza()) {
                            zzioVar2.zzaW().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzioVar2.zzJ()) {
                            zzioVar2.zzm().zzd.zzb(j);
                            zzioVar2.zzaW().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleZzu.putString("_cis", "referrer API v2");
                            zzioVar2.zzq().zzQ("auto", com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleZzu, str);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(zzioVar2.zzaT(), this.zzb);
    }
}
