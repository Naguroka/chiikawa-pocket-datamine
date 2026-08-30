package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzoq {
    private final java.util.Map zza;

    zzoq(java.util.Map map) {
        java.util.HashMap map2 = new java.util.HashMap();
        this.zza = map2;
        map2.putAll(map);
    }

    private final int zzf() {
        try {
            java.lang.String str = (java.lang.String) this.zza.get("PolicyVersion");
            if (android.text.TextUtils.isEmpty(str)) {
                return -1;
            }
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    private final android.os.Bundle zzg() {
        int iZzf;
        java.util.Map map = this.zza;
        if ("1".equals(map.get("GoogleConsent")) && (iZzf = zzf()) >= 0) {
            java.lang.String str = (java.lang.String) map.get("PurposeConsents");
            if (!android.text.TextUtils.isEmpty(str)) {
                android.os.Bundle bundle = new android.os.Bundle();
                if (str.length() > 0) {
                    bundle.putString(com.google.android.gms.measurement.internal.zzjw.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(com.google.android.gms.measurement.internal.zzjw.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iZzf >= 4) {
                    bundle.putString(com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA.zze, (str.charAt(0) == '1' && str.charAt(6) == '1') ? "granted" : "denied");
                }
                return bundle;
            }
        }
        return android.os.Bundle.EMPTY;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.measurement.internal.zzoq) {
            return zze().equalsIgnoreCase(((com.google.android.gms.measurement.internal.zzoq) obj).zze());
        }
        return false;
    }

    public final int hashCode() {
        return zze().hashCode();
    }

    public final java.lang.String toString() {
        return zze();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
    public final android.os.Bundle zza() {
        java.util.Map map;
        android.os.Bundle bundle;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.google.android.gms.measurement.internal.zzgg zzggVar = com.google.android.gms.measurement.internal.zzgi.zzbj;
        if (((java.lang.Boolean) zzggVar.zza(null)).booleanValue()) {
            java.util.Map map2 = this.zza;
            if ("1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
                if (((java.lang.Boolean) zzggVar.zza(null)).booleanValue()) {
                    return zzg();
                }
                map = this.zza;
                if (map.get("Version") == null) {
                    return zzg();
                }
                if (zzf() >= 0) {
                    bundle = new android.os.Bundle();
                    java.lang.String str4 = com.google.android.gms.measurement.internal.zzjw.AD_STORAGE.zze;
                    str = "denied";
                    if (true != java.util.Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str2 = "denied";
                    } else {
                        str2 = "granted";
                    }
                    bundle.putString(str4, str2);
                    java.lang.String str5 = com.google.android.gms.measurement.internal.zzjw.AD_PERSONALIZATION.zze;
                    if (java.util.Objects.equals(map.get("AuthorizePurpose3"), "1") || !java.util.Objects.equals(map.get("AuthorizePurpose4"), "1")) {
                        str3 = "denied";
                    } else {
                        str3 = "granted";
                    }
                    bundle.putString(str5, str3);
                    if (zzf() >= 4) {
                        java.lang.String str6 = com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA.zze;
                        if (java.util.Objects.equals(map.get("AuthorizePurpose1"), "1") && java.util.Objects.equals(map.get("AuthorizePurpose7"), "1")) {
                            str = "granted";
                        }
                        bundle.putString(str6, str);
                    }
                    return bundle;
                }
            }
        } else {
            java.util.Map map3 = this.zza;
            if ("1".equals(map3.get("GoogleConsent")) && "1".equals(map3.get("gdprApplies")) && "1".equals(map3.get("EnableAdvertiserConsentMode"))) {
                if (((java.lang.Boolean) zzggVar.zza(null)).booleanValue()) {
                    return zzg();
                }
                map = this.zza;
                if (map.get("Version") == null) {
                    return zzg();
                }
                if (zzf() >= 0) {
                    bundle = new android.os.Bundle();
                    java.lang.String str7 = com.google.android.gms.measurement.internal.zzjw.AD_STORAGE.zze;
                    str = "denied";
                    if (true != java.util.Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str2 = "denied";
                    } else {
                        str2 = "granted";
                    }
                    bundle.putString(str7, str2);
                    java.lang.String str8 = com.google.android.gms.measurement.internal.zzjw.AD_PERSONALIZATION.zze;
                    if (java.util.Objects.equals(map.get("AuthorizePurpose3"), "1")) {
                        str3 = "denied";
                    } else {
                        str3 = "denied";
                    }
                    bundle.putString(str8, str3);
                    if (zzf() >= 4) {
                        java.lang.String str9 = com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA.zze;
                        if (java.util.Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                            str = "granted";
                        }
                        bundle.putString(str9, str);
                    }
                    return bundle;
                }
            }
        }
        return android.os.Bundle.EMPTY;
    }

    public final java.lang.String zzb() {
        java.lang.String str = (java.lang.String) this.zza.get("PurposeDiagnostics");
        return android.text.TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final java.lang.String zzc(com.google.android.gms.measurement.internal.zzoq zzoqVar) {
        java.util.Map map = zzoqVar.zza;
        java.lang.String str = (map.isEmpty() || ((java.lang.String) map.get("Version")) != null) ? "0" : "1";
        android.os.Bundle bundleZza = zza();
        android.os.Bundle bundleZza2 = zzoqVar.zza();
        return str.concat(true != (bundleZza.size() != bundleZza2.size() || !java.util.Objects.equals(bundleZza.getString("ad_storage"), bundleZza2.getString("ad_storage")) || !java.util.Objects.equals(bundleZza.getString("ad_personalization"), bundleZza2.getString("ad_personalization")) || !java.util.Objects.equals(bundleZza.getString("ad_user_data"), bundleZza2.getString("ad_user_data"))) ? "0" : "1");
    }

    public final java.lang.String zzd() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("1");
        int i = -1;
        try {
            java.lang.String str = (java.lang.String) this.zza.get("CmpSdkID");
            if (!android.text.TextUtils.isEmpty(str)) {
                i = java.lang.Integer.parseInt(str);
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        if (i < 0 || i > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i & 63));
        }
        int iZzf = zzf();
        if (iZzf < 0 || iZzf > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iZzf));
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(true);
        java.util.Map map = this.zza;
        int i2 = (true != "1".equals(map.get("gdprApplies")) ? 0 : 2) | 4;
        if ("1".equals(map.get("EnableAdvertiserConsentMode"))) {
            i2 |= 8;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i2));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final java.lang.String zze() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.google.common.collect.ImmutableList immutableList = com.google.android.gms.measurement.internal.zzot.zza;
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            java.lang.String str = (java.lang.String) immutableList.get(i);
            java.util.Map map = this.zza;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append(com.ironsource.y8.i.b);
                sb.append((java.lang.String) map.get(str));
            }
        }
        return sb.toString();
    }
}
