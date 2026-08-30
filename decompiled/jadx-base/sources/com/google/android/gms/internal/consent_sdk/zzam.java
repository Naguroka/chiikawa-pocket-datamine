package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzam {
    static final com.google.android.gms.internal.consent_sdk.zzdb zza = com.google.android.gms.internal.consent_sdk.zzdb.zzj(com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY, "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    private final android.app.Application zzb;
    private final android.content.SharedPreferences zzc;
    private final java.util.Set zzd;

    zzam(android.app.Application application) {
        this.zzb = application;
        android.content.SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzc = sharedPreferences;
        this.zzd = new java.util.HashSet(sharedPreferences.getStringSet("written_values", java.util.Collections.emptySet()));
    }

    public final int zza() {
        return this.zzc.getInt("consent_status", 0);
    }

    public final com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus zzb() {
        return com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.valueOf(this.zzc.getString("privacy_options_requirement_status", com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN.name()));
    }

    public final java.util.Map zzc() {
        java.lang.String string;
        java.util.Set<java.lang.String> stringSet = this.zzc.getStringSet("stored_info", com.google.android.gms.internal.consent_sdk.zzdb.zzi());
        if (stringSet.isEmpty()) {
            stringSet = zza;
        }
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str : stringSet) {
            android.app.Application application = this.zzb;
            com.google.android.gms.internal.consent_sdk.zzcj zzcjVarZza = com.google.android.gms.internal.consent_sdk.zzcl.zza(application, str);
            if (zzcjVarZza == null) {
                android.util.Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(java.lang.String.valueOf(str)));
            } else {
                java.lang.Object obj = application.getSharedPreferences(zzcjVarZza.zza, 0).getAll().get(zzcjVarZza.zzb);
                if (obj == null) {
                    android.util.Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(java.lang.String.valueOf(str)));
                } else {
                    if (obj instanceof java.lang.Boolean) {
                        string = true != ((java.lang.Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof java.lang.Number) {
                        string = obj.toString();
                    } else if (obj instanceof java.lang.String) {
                        string = (java.lang.String) obj;
                    } else {
                        android.util.Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(java.lang.String.valueOf(str)));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public final java.util.Set zzd() {
        return this.zzd;
    }

    public final void zze() {
        com.google.android.gms.internal.consent_sdk.zzcl.zzb(this.zzb, this.zzd);
        this.zzd.clear();
        this.zzc.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").apply();
    }

    public final void zzf() {
        this.zzc.edit().putStringSet("written_values", this.zzd).apply();
    }

    public final void zzg(int i) {
        this.zzc.edit().putInt("consent_status", i).apply();
    }

    public final void zzh(boolean z) {
        this.zzc.edit().putBoolean("is_pub_misconfigured", z).apply();
    }

    public final void zzi(com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus) {
        this.zzc.edit().putString("privacy_options_requirement_status", privacyOptionsRequirementStatus.name()).apply();
    }

    public final void zzj(java.util.Set set) {
        this.zzc.edit().putStringSet("stored_info", set).apply();
    }

    public final boolean zzk() {
        return this.zzc.getBoolean("is_pub_misconfigured", false);
    }
}
