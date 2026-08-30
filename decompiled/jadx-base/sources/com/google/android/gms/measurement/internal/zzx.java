package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzx {
    private final com.google.android.gms.measurement.internal.zzio zza;

    public zzx(com.google.android.gms.measurement.internal.zzio zzioVar) {
        this.zza = zzioVar;
    }

    final void zza(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String string;
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zza;
        zzioVar.zzaX().zzg();
        if (zzioVar.zzJ()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.path(str);
            for (java.lang.String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        zzioVar.zzm().zzr.zzb(string);
        zzioVar.zzm().zzs.zzb(zzioVar.zzaU().currentTimeMillis());
    }

    final void zzb() {
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zza;
        zzioVar.zzaX().zzg();
        if (zzd()) {
            if (zze()) {
                zzioVar.zzm().zzr.zzb(null);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                zzioVar.zzq().zzR("auto", "_cmpx", bundle);
            } else {
                java.lang.String strZza = zzioVar.zzm().zzr.zza();
                if (android.text.TextUtils.isEmpty(strZza)) {
                    zzioVar.zzaW().zzh().zza("Cache still valid but referrer not found");
                } else {
                    long jZza = zzioVar.zzm().zzs.zza() / 3600000;
                    android.net.Uri uri = android.net.Uri.parse(strZza);
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    android.util.Pair pair = new android.util.Pair(uri.getPath(), bundle2);
                    for (java.lang.String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((android.os.Bundle) pair.second).putLong("_cc", (jZza - 1) * 3600000);
                    zzioVar.zzq().zzR(pair.first == null ? "app" : (java.lang.String) pair.first, com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, (android.os.Bundle) pair.second);
                }
                zzioVar.zzm().zzr.zzb(null);
            }
            zzioVar.zzm().zzs.zzb(0L);
        }
    }

    final void zzc() {
        if (zzd() && zze()) {
            this.zza.zzm().zzr.zzb(null);
        }
    }

    final boolean zzd() {
        return this.zza.zzm().zzs.zza() > 0;
    }

    final boolean zze() {
        if (!zzd()) {
            return false;
        }
        com.google.android.gms.measurement.internal.zzio zzioVar = this.zza;
        return zzioVar.zzaU().currentTimeMillis() - zzioVar.zzm().zzs.zza() > zzioVar.zzf().zzk(null, com.google.android.gms.measurement.internal.zzgi.zzai);
    }
}
