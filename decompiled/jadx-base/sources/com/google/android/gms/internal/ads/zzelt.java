package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzelt implements com.google.android.gms.internal.ads.zzetq {
    final com.google.android.gms.internal.ads.zzfcj zza;
    private final long zzb;

    public zzelt(com.google.android.gms.internal.ads.zzfcj zzfcjVar, long j) {
        this.zza = zzfcjVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zzb;
        com.google.android.gms.internal.ads.zzfcj zzfcjVar = this.zza;
        bundle.putString("slotname", zzfcjVar.zzf);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcjVar.zzd;
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i = zzmVar.zzg;
        com.google.android.gms.internal.ads.zzfcx.zze(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (zzmVar.zza >= 8) {
            int i2 = zzmVar.zzt;
            com.google.android.gms.internal.ads.zzfcx.zze(bundle, "tag_for_under_age_of_consent", i2, i2 != -1);
        }
        com.google.android.gms.internal.ads.zzfcx.zzc(bundle, "url", zzmVar.zzl);
        com.google.android.gms.internal.ads.zzfcx.zzd(bundle, "neighboring_content_urls", zzmVar.zzv);
        android.os.Bundle bundle2 = (android.os.Bundle) zzmVar.zzc.clone();
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhs)).split(",", -1)));
        for (java.lang.String str : zzmVar.zzc.keySet()) {
            if (!hashSet.contains(str)) {
                bundle2.remove(str);
            }
        }
        com.google.android.gms.internal.ads.zzfcx.zzb(bundle, "extras", bundle2);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcuv) obj).zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i = this.zza.zzo.zza;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.zzb);
        com.google.android.gms.internal.ads.zzfcx.zzg(bundle, "is_sdk_preload", true, zzmVar.zzb());
        com.google.android.gms.internal.ads.zzfcx.zzf(bundle, "cust_age", new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.US).format(new java.util.Date(zzmVar.zzb)), zzmVar.zzb != -1);
        com.google.android.gms.internal.ads.zzfcx.zzb(bundle, "extras", zzmVar.zzc);
        int i3 = zzmVar.zzd;
        com.google.android.gms.internal.ads.zzfcx.zze(bundle, "cust_gender", i3, i3 != -1);
        com.google.android.gms.internal.ads.zzfcx.zzd(bundle, "kw", zzmVar.zze);
        int i4 = zzmVar.zzg;
        com.google.android.gms.internal.ads.zzfcx.zze(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        com.google.android.gms.internal.ads.zzfcx.zze(bundle, "d_imp_hdr", 1, zzmVar.zza >= 2 && zzmVar.zzh);
        java.lang.String str = zzmVar.zzi;
        com.google.android.gms.internal.ads.zzfcx.zzf(bundle, "ppid", str, zzmVar.zza >= 2 && !android.text.TextUtils.isEmpty(str));
        android.location.Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong(com.json.ce.q, (long) latitude);
            bundle2.putLong(com.adjust.sdk.Constants.LONG, (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        com.google.android.gms.internal.ads.zzfcx.zzc(bundle, "url", zzmVar.zzl);
        com.google.android.gms.internal.ads.zzfcx.zzd(bundle, "neighboring_content_urls", zzmVar.zzv);
        com.google.android.gms.internal.ads.zzfcx.zzb(bundle, "custom_targeting", zzmVar.zzn);
        com.google.android.gms.internal.ads.zzfcx.zzd(bundle, "category_exclusions", zzmVar.zzo);
        com.google.android.gms.internal.ads.zzfcx.zzc(bundle, "request_agent", zzmVar.zzp);
        com.google.android.gms.internal.ads.zzfcx.zzc(bundle, "request_pkg", zzmVar.zzq);
        com.google.android.gms.internal.ads.zzfcx.zzg(bundle, "is_designed_for_families", zzmVar.zzr, zzmVar.zza >= 7);
        if (zzmVar.zza >= 8) {
            int i5 = zzmVar.zzt;
            com.google.android.gms.internal.ads.zzfcx.zze(bundle, "tag_for_under_age_of_consent", i5, i5 != -1);
            com.google.android.gms.internal.ads.zzfcx.zzc(bundle, "max_ad_content_rating", zzmVar.zzu);
        }
    }
}
