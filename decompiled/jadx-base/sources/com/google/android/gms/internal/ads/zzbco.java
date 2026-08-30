package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbco {
    private final java.lang.String zza = (java.lang.String) com.google.android.gms.internal.ads.zzbef.zza.zze();
    private final java.util.Map zzb;
    private final android.content.Context zzc;
    private final java.lang.String zzd;

    public zzbco(android.content.Context context, java.lang.String str) {
        this.zzc = context;
        this.zzd = str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "gmob_sdk");
        linkedHashMap.put("v", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        linkedHashMap.put(com.json.ce.y, android.os.Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", android.os.Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzv.zzq();
        linkedHashMap.put(com.ironsource.y8.h.G, com.google.android.gms.ads.internal.util.zzs.zzs());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzv.zzq();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzF(context) ? "0" : "1");
        java.util.concurrent.Future futureZzb = com.google.android.gms.ads.internal.zzv.zzn().zzb(context);
        try {
            linkedHashMap.put("network_coarse", java.lang.Integer.toString(((com.google.android.gms.internal.ads.zzbvo) futureZzb.get()).zzj));
            linkedHashMap.put("network_fine", java.lang.Integer.toString(((com.google.android.gms.internal.ads.zzbvo) futureZzb.get()).zzk));
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzli)).booleanValue()) {
            java.util.Map map = this.zzb;
            com.google.android.gms.ads.internal.zzv.zzq();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzs.zzC(context) ? "1" : "0");
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjn)).booleanValue()) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzct)).booleanValue() || com.google.android.gms.internal.ads.zzfve.zzd(com.google.android.gms.ads.internal.zzv.zzp().zzn())) {
                return;
            }
            this.zzb.put(com.json.ce.E, com.google.android.gms.ads.internal.zzv.zzp().zzn());
        }
    }

    final android.content.Context zza() {
        return this.zzc;
    }

    final java.lang.String zzb() {
        return this.zzd;
    }

    final java.lang.String zzc() {
        return this.zza;
    }

    final java.util.Map zzd() {
        return this.zzb;
    }
}
