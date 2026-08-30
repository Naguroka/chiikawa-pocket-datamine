package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzegf implements com.google.android.gms.internal.ads.zzecw {
    private static android.os.Bundle zzd(android.os.Bundle bundle) {
        return bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        java.lang.String strOptString = zzfboVar.zzv.optString("pubid", "");
        com.google.android.gms.internal.ads.zzfcj zzfcjVar = zzfcaVar.zza.zza;
        com.google.android.gms.internal.ads.zzfch zzfchVar = new com.google.android.gms.internal.ads.zzfch();
        zzfchVar.zzq(zzfcjVar);
        zzfchVar.zzt(strOptString);
        android.os.Bundle bundleZzd = zzd(zzfcjVar.zzd.zzm);
        android.os.Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        java.lang.String strOptString2 = zzfboVar.zzv.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        java.lang.String strOptString3 = zzfboVar.zzv.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        java.util.Iterator<java.lang.String> itKeys = zzfboVar.zzD.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.String strOptString4 = zzfboVar.zzD.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcjVar.zzd;
        zzfchVar.zzH(new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, bundleZzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, bundleZzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz));
        com.google.android.gms.internal.ads.zzfcj zzfcjVarZzJ = zzfchVar.zzJ();
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.gms.internal.ads.zzfbr zzfbrVar = zzfcaVar.zzb.zzb;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putStringArrayList("nofill_urls", new java.util.ArrayList<>(zzfbrVar.zza));
        bundle2.putInt("refresh_interval", zzfbrVar.zzc);
        bundle2.putString("gws_query_id", zzfbrVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        com.google.android.gms.internal.ads.zzfcj zzfcjVar2 = zzfcaVar.zza.zza;
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putString("initial_ad_unit_id", zzfcjVar2.zzf);
        bundle3.putString("allocation_id", zzfboVar.zzw);
        bundle3.putString("ad_source_name", zzfboVar.zzF);
        bundle3.putStringArrayList("click_urls", new java.util.ArrayList<>(zzfboVar.zzc));
        bundle3.putStringArrayList("imp_urls", new java.util.ArrayList<>(zzfboVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new java.util.ArrayList<>(zzfboVar.zzp));
        bundle3.putStringArrayList("fill_urls", new java.util.ArrayList<>(zzfboVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new java.util.ArrayList<>(zzfboVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new java.util.ArrayList<>(zzfboVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new java.util.ArrayList<>(zzfboVar.zzi));
        bundle3.putString("transaction_id", zzfboVar.zzj);
        bundle3.putString("valid_from_timestamp", zzfboVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzfboVar.zzP);
        bundle3.putString("recursive_server_response_data", zzfboVar.zzao);
        bundle3.putBoolean("is_analytics_logging_enabled", zzfboVar.zzW);
        if (zzfboVar.zzl != null) {
            android.os.Bundle bundle4 = new android.os.Bundle();
            bundle4.putInt("rb_amount", zzfboVar.zzl.zzb);
            bundle4.putString("rb_type", zzfboVar.zzl.zza);
            bundle3.putParcelableArray("rewards", new android.os.Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzfcjVarZzJ, bundle, zzfboVar, zzfcaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        return !android.text.TextUtils.isEmpty(zzfboVar.zzv.optString("pubid", ""));
    }

    protected abstract com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfcj zzfcjVar, android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfca zzfcaVar);
}
