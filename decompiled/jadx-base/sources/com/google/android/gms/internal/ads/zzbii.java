package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbii implements com.google.android.gms.internal.ads.zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        java.lang.String str = (java.lang.String) map.get("action");
        if ("tick".equals(str)) {
            java.lang.String str2 = (java.lang.String) map.get("label");
            java.lang.String str3 = (java.lang.String) map.get("start_label");
            java.lang.String str4 = (java.lang.String) map.get(com.ironsource.aa.a.d);
            if (android.text.TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No label given for CSI tick.");
                return;
            }
            if (android.text.TextUtils.isEmpty(str4)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() + (java.lang.Long.parseLong(str4) - com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
                if (true == android.text.TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzcexVar.zzm().zzc(str2, str3, jElapsedRealtime);
                return;
            } catch (java.lang.NumberFormatException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            java.lang.String str5 = (java.lang.String) map.get("value");
            if (android.text.TextUtils.isEmpty(str5)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No value given for CSI experiment.");
                return;
            } else {
                zzcexVar.zzm().zza().zzd("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            java.lang.String str6 = (java.lang.String) map.get("name");
            java.lang.String str7 = (java.lang.String) map.get("value");
            if (android.text.TextUtils.isEmpty(str7)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No value given for CSI extra.");
            } else if (android.text.TextUtils.isEmpty(str6)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No name given for CSI extra.");
            } else {
                zzcexVar.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
