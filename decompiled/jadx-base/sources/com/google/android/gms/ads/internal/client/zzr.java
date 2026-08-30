package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzr {
    public static final com.google.android.gms.ads.internal.client.zzr zza = new com.google.android.gms.ads.internal.client.zzr();

    protected zzr() {
    }

    public final com.google.android.gms.ads.internal.client.zzm zza(android.content.Context context, com.google.android.gms.ads.internal.client.zzei zzeiVar) {
        java.lang.String strZzq;
        java.lang.String strZzk = zzeiVar.zzk();
        java.util.Set setZzp = zzeiVar.zzp();
        java.util.List listUnmodifiableList = !setZzp.isEmpty() ? java.util.Collections.unmodifiableList(new java.util.ArrayList(setZzp)) : null;
        boolean zZzs = zzeiVar.zzs(context);
        android.os.Bundle bundleZzf = zzeiVar.zzf(com.google.ads.mediation.admob.AdMobAdapter.class);
        java.lang.String strZzl = zzeiVar.zzl();
        com.google.android.gms.ads.search.SearchAdRequest searchAdRequestZzi = zzeiVar.zzi();
        com.google.android.gms.ads.internal.client.zzfx zzfxVar = searchAdRequestZzi != null ? new com.google.android.gms.ads.internal.client.zzfx(searchAdRequestZzi) : null;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            java.lang.String packageName = applicationContext.getPackageName();
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            strZzq = com.google.android.gms.ads.internal.util.client.zzf.zzq(java.lang.Thread.currentThread().getStackTrace(), packageName);
        } else {
            strZzq = null;
        }
        boolean zZzr = zzeiVar.zzr();
        com.google.android.gms.ads.RequestConfiguration requestConfigurationZzc = com.google.android.gms.ads.internal.client.zzex.zzf().zzc();
        return new com.google.android.gms.ads.internal.client.zzm(8, -1L, bundleZzf, -1, listUnmodifiableList, zZzs, java.lang.Math.max(zzeiVar.zzb(), requestConfigurationZzc.getTagForChildDirectedTreatment()), false, strZzl, zzfxVar, null, strZzk, zzeiVar.zzg(), zzeiVar.zze(), java.util.Collections.unmodifiableList(new java.util.ArrayList(zzeiVar.zzo())), zzeiVar.zzm(), strZzq, zZzr, null, requestConfigurationZzc.getTagForUnderAgeOfConsent(), (java.lang.String) java.util.Collections.max(java.util.Arrays.asList(null, requestConfigurationZzc.getMaxAdContentRating()), new java.util.Comparator() { // from class: com.google.android.gms.ads.internal.client.zzp
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.android.gms.ads.RequestConfiguration.zza.indexOf((java.lang.String) obj) - com.google.android.gms.ads.RequestConfiguration.zza.indexOf((java.lang.String) obj2);
            }
        }), zzeiVar.zzn(), zzeiVar.zza(), zzeiVar.zzj(), requestConfigurationZzc.getPublisherPrivacyPersonalizationState().getValue(), zzeiVar.zzc());
    }
}
