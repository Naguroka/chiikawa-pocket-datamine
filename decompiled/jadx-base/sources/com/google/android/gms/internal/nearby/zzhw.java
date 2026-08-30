package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhw {
    static java.util.HashMap<java.lang.String, java.lang.String> zze;
    private static java.lang.Object zzl;
    private static boolean zzm;
    public static final android.net.Uri zza = android.net.Uri.parse("content://com.google.android.gsf.gservices");
    public static final android.net.Uri zzb = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final java.util.regex.Pattern zzd = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final java.util.concurrent.atomic.AtomicBoolean zzk = new java.util.concurrent.atomic.AtomicBoolean();
    static final java.util.HashMap<java.lang.String, java.lang.Boolean> zzf = new java.util.HashMap<>();
    static final java.util.HashMap<java.lang.String, java.lang.Integer> zzg = new java.util.HashMap<>();
    static final java.util.HashMap<java.lang.String, java.lang.Long> zzh = new java.util.HashMap<>();
    static final java.util.HashMap<java.lang.String, java.lang.Float> zzi = new java.util.HashMap<>();
    static final java.lang.String[] zzj = new java.lang.String[0];

    public static boolean zza(android.content.ContentResolver contentResolver, java.lang.String str, boolean z) {
        java.lang.Object obj;
        java.lang.String str2;
        java.lang.Boolean bool;
        synchronized (com.google.android.gms.internal.nearby.zzhw.class) {
            zzc(contentResolver);
            obj = zzl;
        }
        java.util.HashMap<java.lang.String, java.lang.Boolean> map = zzf;
        boolean z2 = true;
        java.lang.Boolean bool2 = true;
        synchronized (com.google.android.gms.internal.nearby.zzhw.class) {
            str2 = null;
            if (map.containsKey("gms:nearby:requires_gms_check")) {
                bool = map.get("gms:nearby:requires_gms_check");
                if (bool == null) {
                    bool = bool2;
                }
            } else {
                bool = null;
            }
        }
        java.lang.Boolean bool3 = bool;
        if (bool3 != null) {
            return bool3.booleanValue();
        }
        synchronized (com.google.android.gms.internal.nearby.zzhw.class) {
            zzc(contentResolver);
            java.lang.Object obj2 = zzl;
            if (zze.containsKey("gms:nearby:requires_gms_check")) {
                java.lang.String str3 = zze.get("gms:nearby:requires_gms_check");
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                int length = zzj.length;
                android.database.Cursor cursorQuery = contentResolver.query(zza, null, null, new java.lang.String[]{"gms:nearby:requires_gms_check"}, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            java.lang.String string = cursorQuery.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            zzd(obj2, "gms:nearby:requires_gms_check", string);
                            if (string != null) {
                                str2 = string;
                            }
                        } else {
                            zzd(obj2, "gms:nearby:requires_gms_check", null);
                        }
                        cursorQuery.close();
                    } catch (java.lang.Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
            }
        }
        if (str2 == null || str2.equals("")) {
            bool2 = bool3;
        } else if (!zzc.matcher(str2).matches()) {
            if (zzd.matcher(str2).matches()) {
                z2 = false;
                bool2 = false;
            } else {
                android.util.Log.w("Gservices", "attempt to read gservices key gms:nearby:requires_gms_check (value \"" + str2 + "\") as boolean");
                bool2 = bool3;
            }
        }
        synchronized (com.google.android.gms.internal.nearby.zzhw.class) {
            if (obj == zzl) {
                map.put("gms:nearby:requires_gms_check", bool2);
                zze.remove("gms:nearby:requires_gms_check");
            }
        }
        return z2;
    }

    private static void zzc(android.content.ContentResolver contentResolver) {
        if (zze == null) {
            zzk.set(false);
            zze = new java.util.HashMap<>();
            zzl = new java.lang.Object();
            zzm = false;
            contentResolver.registerContentObserver(zza, true, new com.google.android.gms.internal.nearby.zzhv(null));
            return;
        }
        if (zzk.getAndSet(false)) {
            zze.clear();
            zzf.clear();
            zzg.clear();
            zzh.clear();
            zzi.clear();
            zzl = new java.lang.Object();
            zzm = false;
        }
    }

    private static void zzd(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.nearby.zzhw.class) {
            if (obj == zzl) {
                zze.put("gms:nearby:requires_gms_check", str2);
            }
        }
    }
}
