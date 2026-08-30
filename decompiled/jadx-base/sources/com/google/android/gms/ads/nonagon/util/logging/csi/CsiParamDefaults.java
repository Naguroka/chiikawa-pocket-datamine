package com.google.android.gms.ads.nonagon.util.logging.csi;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class CsiParamDefaults {
    private final android.content.Context zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    public CsiParamDefaults(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(java.util.Map<java.lang.String, java.lang.String> map) {
        map.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "gmob_sdk");
        map.put("v", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        map.put(com.json.ce.y, android.os.Build.VERSION.RELEASE);
        map.put("api_v", android.os.Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzv.zzq();
        map.put(com.ironsource.y8.h.G, com.google.android.gms.ads.internal.util.zzs.zzs());
        map.put("app", this.zzb);
        com.google.android.gms.ads.internal.zzv.zzq();
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzF(this.zza) ? "0" : "1");
        com.google.android.gms.internal.ads.zzbcc zzbccVar = com.google.android.gms.internal.ads.zzbcl.zza;
        java.util.List listZzb = com.google.android.gms.ads.internal.client.zzbe.zza().zzb();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgI)).booleanValue()) {
            listZzb.addAll(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzd());
        }
        map.put("e", android.text.TextUtils.join(",", listZzb));
        map.put("sdkVersion", this.zzc);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzli)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzs.zzC(this.zza) ? "1" : "0");
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjn)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzct)).booleanValue()) {
                map.put(com.json.ce.E, com.google.android.gms.internal.ads.zzfve.zzc(com.google.android.gms.ads.internal.zzv.zzp().zzn()));
            }
        }
    }
}
