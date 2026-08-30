package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.common.collect.ImmutableSet zzb = com.google.common.collect.ImmutableSet.of("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", com.google.firebase.analytics.FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    private static final com.google.common.collect.ImmutableList zzc = com.google.common.collect.ImmutableList.of("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final com.google.common.collect.ImmutableList zzd = com.google.common.collect.ImmutableList.of("auto", "app", "am");
    private static final com.google.common.collect.ImmutableList zze = com.google.common.collect.ImmutableList.of("_r", "_dbg");
    private static final com.google.common.collect.ImmutableList zzf = new com.google.common.collect.ImmutableList.Builder().add((java.lang.Object[]) com.google.android.gms.measurement.internal.zzka.zza).add((java.lang.Object[]) com.google.android.gms.measurement.internal.zzka.zzb).build();
    private static final com.google.common.collect.ImmutableList zzg = com.google.common.collect.ImmutableList.of("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        byte b;
        if (!com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2)) {
            return true;
        }
        if (!zzd(str) || bundle == null) {
            return false;
        }
        com.google.common.collect.ImmutableList immutableList = zze;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((java.lang.String) immutableList.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals(com.google.android.gms.measurement.AppMeasurement.FIAM_ORIGIN)) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("fdl")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("fcm")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzb(java.lang.String str, android.os.Bundle bundle) {
        if (zzc.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        com.google.common.collect.ImmutableList immutableList = zze;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((java.lang.String) immutableList.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzc(java.lang.String str) {
        return !zzb.contains(str);
    }

    public static boolean zzd(java.lang.String str) {
        return !zzd.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zze(java.lang.String str, java.lang.String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if (com.google.firebase.messaging.Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals("fcm") || str.equals(com.google.android.gms.measurement.AppMeasurement.FIAM_ORIGIN);
        }
        if (zzf.contains(str2)) {
            return false;
        }
        com.google.common.collect.ImmutableList immutableList = zzg;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zMatches = str2.matches((java.lang.String) immutableList.get(i));
            i++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }
}
