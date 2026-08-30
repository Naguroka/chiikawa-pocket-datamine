package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzot {
    static final com.google.common.collect.ImmutableList zza = com.google.common.collect.ImmutableList.of("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    static int zza(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (java.lang.ClassCastException unused) {
            return -1;
        }
    }

    static java.lang.String zzb(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (java.lang.ClassCastException unused) {
            return "";
        }
    }

    public static final java.util.Map zzc(com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        com.google.android.gms.internal.measurement.zzkl zzklVar = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.zzkm zzkmVar = (com.google.android.gms.internal.measurement.zzkm) immutableMap2.get(zzklVar);
        com.google.android.gms.internal.measurement.zzkl zzklVar2 = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.zzkm zzkmVar2 = (com.google.android.gms.internal.measurement.zzkm) immutableMap2.get(zzklVar2);
        com.google.android.gms.internal.measurement.zzkl zzklVar3 = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.zzkm zzkmVar3 = (com.google.android.gms.internal.measurement.zzkm) immutableMap2.get(zzklVar3);
        com.google.android.gms.internal.measurement.zzkl zzklVar4 = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.zzkm zzkmVar4 = (com.google.android.gms.internal.measurement.zzkm) immutableMap2.get(zzklVar4);
        return com.google.common.collect.ImmutableMap.builder().put("Version", "2").put("VendorConsent", true != z ? "0" : "1").put("VendorLegitimateInterest", true != z2 ? "0" : "1").put("gdprApplies", i3 != 1 ? "0" : "1").put("EnableAdvertiserConsentMode", i2 != 1 ? "0" : "1").put("PolicyVersion", java.lang.String.valueOf(i4)).put("CmpSdkID", java.lang.String.valueOf(i)).put("PurposeOneTreatment", i5 != 1 ? "0" : "1").put("PublisherCC", str).put("PublisherRestrictions1", java.lang.String.valueOf(zzkmVar != null ? zzkmVar.zza() : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions3", java.lang.String.valueOf(zzkmVar2 != null ? zzkmVar2.zza() : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions4", java.lang.String.valueOf(zzkmVar3 != null ? zzkmVar3.zza() : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions7", java.lang.String.valueOf(zzkmVar4 != null ? zzkmVar4.zza() : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED.zza())).putAll(com.google.common.collect.ImmutableMap.of("Purpose1", zzg(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2), "Purpose3", zzg(zzklVar2, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2), "Purpose4", zzg(zzklVar3, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2), "Purpose7", zzg(zzklVar4, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2))).putAll(com.google.common.collect.ImmutableMap.of("AuthorizePurpose1", (java.lang.String) (true != zzd(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2) ? "0" : "1"), "AuthorizePurpose3", (java.lang.String) (true != zzd(zzklVar2, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2) ? "0" : "1"), "AuthorizePurpose4", (java.lang.String) (true != zzd(zzklVar3, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2) ? "0" : "1"), "AuthorizePurpose7", true == zzd(zzklVar4, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2) ? "1" : "0", "PurposeDiagnostics", new java.lang.String(cArr))).buildOrThrow();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    /* JADX WARN: Code duplicated, block: B:51:0x013f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0162  */
    /* JADX WARN: Code duplicated, block: B:55:0x0185  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x0204  */
    static final boolean zzd(com.google.android.gms.internal.measurement.zzkl zzklVar, com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char c;
        int i12;
        com.google.android.gms.measurement.internal.zzos zzosVar;
        int iOrdinal;
        char c2;
        char c3;
        int iZze = zze(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2);
        if (iZze > 0) {
            i7 = i3;
            i6 = i2;
            if (i7 == 1) {
                if (i6 != 1) {
                    i7 = 1;
                } else {
                    i9 = 1;
                    i8 = 1;
                }
                if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i5, str, str2, str3, z, z2) == com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_NOT_ALLOWED) {
                    c3 = '3';
                    c2 = '2';
                } else {
                    if (zzklVar == com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                        i10 = i5;
                        i11 = 1;
                        if (i10 == 1) {
                            if (immutableSet.contains(str)) {
                                if (iZze > 0 && cArr[iZze] != '2') {
                                    cArr[iZze] = '1';
                                }
                                return true;
                            }
                            c = '2';
                            i12 = 1;
                        }
                        if (immutableMap.containsKey(zzklVar) || (zzosVar = (com.google.android.gms.measurement.internal.zzos) immutableMap.get(zzklVar)) == null) {
                            c3 = '0';
                            c2 = c;
                        } else {
                            iOrdinal = zzosVar.ordinal();
                            if (iOrdinal != 0) {
                                c2 = c;
                                if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) != com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                                    return zzh(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2);
                                }
                            } else if (iOrdinal != i11) {
                                c2 = c;
                                if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) != com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                    return zzi(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2);
                                }
                            } else {
                                if (iOrdinal != 2) {
                                    return zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) == com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzi(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) : zzh(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2);
                                }
                                if (iOrdinal == 3) {
                                    return zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) == com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzh(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) : zzi(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2);
                                }
                                c3 = '0';
                                c2 = c;
                            }
                            c3 = '8';
                        }
                    } else {
                        i10 = i5;
                        i11 = 1;
                    }
                    c = '2';
                    i12 = i10;
                    if (immutableMap.containsKey(zzklVar)) {
                        c3 = '0';
                        c2 = c;
                    } else {
                        iOrdinal = zzosVar.ordinal();
                        if (iOrdinal != 0) {
                            c2 = c;
                            if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) != com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                                return zzh(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2);
                            }
                        } else if (iOrdinal != i11) {
                            c2 = c;
                            if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) != com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                return zzi(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2);
                            }
                        } else {
                            if (iOrdinal != 2) {
                                if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) == com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                                }
                            }
                            if (iOrdinal == 3) {
                                if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) == com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                }
                            }
                            c3 = '0';
                            c2 = c;
                        }
                        c3 = '8';
                    }
                }
                if (iZze <= 0 && cArr[iZze] != c2) {
                    cArr[iZze] = c3;
                    return false;
                }
            }
            cArr[iZze] = '2';
        } else {
            i6 = i2;
            i7 = i3;
        }
        i8 = i7;
        i9 = i6;
        if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i5, str, str2, str3, z, z2) == com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c3 = '3';
            c2 = '2';
        } else {
            if (zzklVar == com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                i10 = i5;
                i11 = 1;
                if (i10 == 1) {
                    if (immutableSet.contains(str)) {
                        if (iZze > 0) {
                            cArr[iZze] = '1';
                        }
                        return true;
                    }
                    c = '2';
                    i12 = 1;
                }
                if (immutableMap.containsKey(zzklVar)) {
                    c3 = '0';
                    c2 = c;
                } else {
                    iOrdinal = zzosVar.ordinal();
                    if (iOrdinal != 0) {
                        c2 = c;
                        if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) != com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                            return zzh(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2);
                        }
                    } else if (iOrdinal != i11) {
                        c2 = c;
                        if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) != com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                            return zzi(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2);
                        }
                    } else {
                        if (iOrdinal != 2) {
                            if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) == com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                            }
                        }
                        if (iOrdinal == 3) {
                            if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) == com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                            }
                        }
                        c3 = '0';
                        c2 = c;
                    }
                    c3 = '8';
                }
            } else {
                i10 = i5;
                i11 = 1;
            }
            c = '2';
            i12 = i10;
            if (immutableMap.containsKey(zzklVar)) {
                c3 = '0';
                c2 = c;
            } else {
                iOrdinal = zzosVar.ordinal();
                if (iOrdinal != 0) {
                    c2 = c;
                    if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) != com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                        return zzh(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2);
                    }
                } else if (iOrdinal != i11) {
                    c2 = c;
                    if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) != com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return zzi(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2);
                    }
                } else {
                    if (iOrdinal != 2) {
                        if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) == com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                        }
                    }
                    if (iOrdinal == 3) {
                        if (zzf(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2) == com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        }
                    }
                    c3 = '0';
                    c2 = c;
                }
                c3 = '8';
            }
        }
        return iZze <= 0 ? false : false;
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzkl zzklVar, com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        if (zzklVar == com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzklVar == com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzklVar == com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzklVar == com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final com.google.android.gms.internal.measurement.zzkm zzf(com.google.android.gms.internal.measurement.zzkl zzklVar, com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        return (com.google.android.gms.internal.measurement.zzkm) immutableMap2.getOrDefault(zzklVar, com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED);
    }

    private static final java.lang.String zzg(com.google.android.gms.internal.measurement.zzkl zzklVar, com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        java.lang.String strValueOf = "0";
        java.lang.String strValueOf2 = (android.text.TextUtils.isEmpty(str2) || str2.length() < zzklVar.zza()) ? "0" : java.lang.String.valueOf(str2.charAt(zzklVar.zza() - 1));
        if (!android.text.TextUtils.isEmpty(str3) && str3.length() >= zzklVar.zza()) {
            strValueOf = java.lang.String.valueOf(str3.charAt(zzklVar.zza() - 1));
        }
        return java.lang.String.valueOf(strValueOf2).concat(java.lang.String.valueOf(strValueOf));
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzkl zzklVar, com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        char c;
        int iZze = zze(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2);
        if (!z) {
            c = '4';
        } else {
            if (str2.length() >= zzklVar.zza()) {
                char cCharAt = str2.charAt(zzklVar.zza() - 1);
                boolean z3 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '6' : '1';
                }
                return z3;
            }
            c = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c;
        }
        return false;
    }

    private static final boolean zzi(com.google.android.gms.internal.measurement.zzkl zzklVar, com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        char c;
        int iZze = zze(zzklVar, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2);
        if (!z2) {
            c = '5';
        } else {
            if (str3.length() >= zzklVar.zza()) {
                char cCharAt = str3.charAt(zzklVar.zza() - 1);
                boolean z3 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '7' : '1';
                }
                return z3;
            }
            c = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c;
        }
        return false;
    }
}
