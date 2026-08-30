package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzguw {
    public static final com.google.android.gms.internal.ads.zzguw zza = new com.google.android.gms.internal.ads.zzguw(new com.google.android.gms.internal.ads.zzgux());
    public static final com.google.android.gms.internal.ads.zzguw zzb = new com.google.android.gms.internal.ads.zzguw(new com.google.android.gms.internal.ads.zzgvb());
    private final com.google.android.gms.internal.ads.zzguu zzc;

    static {
        new com.google.android.gms.internal.ads.zzguw(new com.google.android.gms.internal.ads.zzgvd());
        new com.google.android.gms.internal.ads.zzguw(new com.google.android.gms.internal.ads.zzgvc());
        new com.google.android.gms.internal.ads.zzguw(new com.google.android.gms.internal.ads.zzguy());
        new com.google.android.gms.internal.ads.zzguw(new com.google.android.gms.internal.ads.zzgva());
        new com.google.android.gms.internal.ads.zzguw(new com.google.android.gms.internal.ads.zzguz());
    }

    public zzguw(com.google.android.gms.internal.ads.zzgve zzgveVar) {
        com.google.android.gms.internal.ads.zzguv zzguvVar = null;
        this.zzc = !com.google.android.gms.internal.ads.zzgkt.zzb() ? "The Android Project".equals(java.lang.System.getProperty("java.vendor")) ? new com.google.android.gms.internal.ads.zzgur(zzgveVar, zzguvVar) : new com.google.android.gms.internal.ads.zzgus(zzgveVar, zzguvVar) : new com.google.android.gms.internal.ads.zzgut(zzgveVar, zzguvVar);
    }

    public static java.util.List zzb(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            java.security.Provider provider = java.security.Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final java.lang.Object zza(java.lang.String str) throws java.security.GeneralSecurityException {
        return this.zzc.zza(str);
    }
}
