package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaa {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    public static com.google.android.gms.internal.ads.zzfhm zza(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        java.lang.String string = bundle.getString("query_info_type");
        if (android.text.TextUtils.isEmpty(string)) {
            return com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string) {
            case "requester_type_0":
                return com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_ADMOB;
            case "requester_type_1":
                return com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case "requester_type_2":
                return com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_GBID;
            case "requester_type_3":
                return com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_GOLDENEYE;
            case "requester_type_4":
                return com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_YAVIN;
            case "requester_type_5":
                return com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_UNITY;
            case "requester_type_6":
                return com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_PAW;
            case "requester_type_7":
                return com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_GUILDER;
            case "requester_type_8":
                return com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return com.google.android.gms.internal.ads.zzfhm.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    public static java.lang.String zzb(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return com.google.firebase.ktx.BuildConfig.VERSION_NAME;
        }
        switch (str) {
            case "requester_type_0":
                return "0";
            case "requester_type_1":
                return "1";
            case "requester_type_2":
                return "2";
            case "requester_type_3":
                return androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D;
            case "requester_type_4":
                return "4";
            case "requester_type_5":
                return "5";
            case "requester_type_6":
                return "6";
            case "requester_type_7":
                return com.json.Cdo.e;
            case "requester_type_8":
                return "8";
            default:
                return str;
        }
    }

    public static java.lang.String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        android.os.Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? com.google.firebase.ktx.BuildConfig.VERSION_NAME : bundle.getString("query_info_type");
    }

    public static void zzd(final com.google.android.gms.internal.ads.zzdsb zzdsbVar, com.google.android.gms.internal.ads.zzdrq zzdrqVar, final java.lang.String str, final android.util.Pair... pairArr) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgM)).booleanValue()) {
            final com.google.android.gms.internal.ads.zzdrq zzdrqVar2 = null;
            com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable(zzdrqVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
                public final /* synthetic */ java.lang.String zzb;
                public final /* synthetic */ android.util.Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zze(this.zza, null, this.zzb, this.zzc);
                }
            });
        }
    }

    static void zze(com.google.android.gms.internal.ads.zzdsb zzdsbVar, com.google.android.gms.internal.ads.zzdrq zzdrqVar, java.lang.String str, android.util.Pair... pairArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMapZzc = zzdsbVar.zzc();
        zzg(concurrentHashMapZzc, "action", str);
        for (android.util.Pair pair : pairArr) {
            zzg(concurrentHashMapZzc, (java.lang.String) pair.first, (java.lang.String) pair.second);
        }
        zzdsbVar.zzg(concurrentHashMapZzc);
    }

    public static int zzf(com.google.android.gms.internal.ads.zzfcj zzfcjVar) {
        if (zzfcjVar.zzr) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcjVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzg(java.util.Map map, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
