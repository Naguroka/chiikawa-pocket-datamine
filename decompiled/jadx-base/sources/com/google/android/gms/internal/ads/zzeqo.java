package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeqo implements com.google.android.gms.internal.ads.zzetr {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;

    zzeqo(android.content.Context context, com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        this.zza = context;
        this.zzb = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zzb.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeql
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeqm zzc() throws java.lang.Exception {
        android.os.Bundle bundle;
        com.google.android.gms.ads.internal.zzv.zzq();
        java.lang.String string = !((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfU)).booleanValue() ? "" : this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        java.lang.String string2 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfW)).booleanValue() ? this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        com.google.android.gms.ads.internal.zzv.zzq();
        android.content.Context context = this.zza;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfV)).booleanValue()) {
            android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new android.os.Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            java.lang.String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                java.lang.String str = strArr[i];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new com.google.android.gms.internal.ads.zzeqm(string, string2, bundle, null);
    }
}
