package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdrq {
    private final java.util.concurrent.ConcurrentHashMap zza;
    private final com.google.android.gms.internal.ads.zzbzq zzb;
    private final com.google.android.gms.internal.ads.zzfcj zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.ads.internal.zzk zzf;
    private final android.os.Bundle zzg = new android.os.Bundle();
    private final android.content.Context zzh;

    public zzdrq(android.content.Context context, com.google.android.gms.internal.ads.zzdsb zzdsbVar, com.google.android.gms.internal.ads.zzbzq zzbzqVar, com.google.android.gms.internal.ads.zzfcj zzfcjVar, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.zzk zzkVar) {
        android.app.ActivityManager.MemoryInfo memoryInfoZzc;
        java.lang.String str3;
        java.util.concurrent.ConcurrentHashMap concurrentHashMapZzc = zzdsbVar.zzc();
        this.zza = concurrentHashMapZzc;
        this.zzb = zzbzqVar;
        this.zzc = zzfcjVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzkVar;
        this.zzh = context;
        concurrentHashMapZzc.put(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, str2.toUpperCase(java.util.Locale.ROOT));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjs)).booleanValue()) {
            int iZzp = zzkVar.zzp();
            int i = iZzp - 1;
            if (iZzp == 0) {
                throw null;
            }
            if (i != 0) {
                str3 = i != 1 ? "na" : "2";
            } else {
                str3 = "1";
            }
            concurrentHashMapZzc.put("asv", str3);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue()) {
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            zzc("rt_f", java.lang.String.valueOf(runtime.freeMemory()));
            zzc("rt_m", java.lang.String.valueOf(runtime.maxMemory()));
            zzc("rt_t", java.lang.String.valueOf(runtime.totalMemory()));
            zzc("wv_c", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzv.zzp().zzb()));
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcp)).booleanValue() && (memoryInfoZzc = com.google.android.gms.ads.internal.util.client.zzf.zzc(context)) != null) {
                zzc("mem_avl", java.lang.String.valueOf(memoryInfoZzc.availMem));
                zzc("mem_tt", java.lang.String.valueOf(memoryInfoZzc.totalMem));
                zzc("low_m", true != memoryInfoZzc.lowMemory ? "0" : "1");
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgM)).booleanValue()) {
            int iZzf = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzf(zzfcjVar) - 1;
            if (iZzf == 0) {
                concurrentHashMapZzc.put("request_id", str);
                concurrentHashMapZzc.put("scar", "false");
                return;
            }
            if (iZzf == 1) {
                concurrentHashMapZzc.put("request_id", str);
                concurrentHashMapZzc.put("se", "query_g");
            } else if (iZzf == 2) {
                concurrentHashMapZzc.put("se", "r_adinfo");
            } else if (iZzf != 3) {
                concurrentHashMapZzc.put("se", "r_both");
            } else {
                concurrentHashMapZzc.put("se", "r_adstring");
            }
            concurrentHashMapZzc.put("scar", com.json.mediationsdk.metadata.a.g);
            zzc("ragent", zzfcjVar.zzd.zzp);
            zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfcjVar.zzd)));
        }
    }

    public final android.os.Bundle zza() {
        return this.zzg;
    }

    public final java.util.Map zzb() {
        return this.zza;
    }

    public final void zzc(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final void zzd(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        if (!zzfcaVar.zzb.zza.isEmpty()) {
            com.google.android.gms.internal.ads.zzfbo zzfboVar = (com.google.android.gms.internal.ads.zzfbo) zzfcaVar.zzb.zza.get(0);
            zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.internal.ads.zzfbo.zza(zzfboVar.zzb));
            if (zzfboVar.zzb == 6) {
                this.zza.put("as", true != this.zzb.zzm() ? "0" : "1");
            }
        }
        zzc("gqi", zzfcaVar.zzb.zzb.zzb);
    }

    public final void zze(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzc("network_coarse", java.lang.Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzc("network_fine", java.lang.Integer.toString(bundle.getInt("gnt")));
        }
    }
}
