package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzd {
    private android.content.SharedPreferences zza;
    private android.content.SharedPreferences.Editor zzb;
    private final android.content.Context zzc;
    private final java.lang.Object zzd = new java.lang.Object();

    zzd(android.content.Context context) {
        this.zzc = context;
    }

    private final void zzk() {
        synchronized (this.zzd) {
            if (this.zza != null) {
                return;
            }
            android.content.SharedPreferences sharedPreferences = this.zzc.getSharedPreferences("query_info_shared_prefs", 0);
            this.zza = sharedPreferences;
            this.zzb = sharedPreferences.edit();
        }
    }

    public final int zza() {
        int i;
        zzk();
        synchronized (this.zzd) {
            i = this.zza.getInt("aav", -1);
        }
        return i;
    }

    public final int zzb() {
        int i;
        zzk();
        synchronized (this.zzd) {
            i = this.zza.getInt("vc", -1);
        }
        return i;
    }

    public final java.lang.String zzc(java.lang.String str) {
        java.lang.String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString(str, null);
            this.zzb.remove(str).commit();
        }
        return string;
    }

    public final java.lang.String zzd() {
        java.lang.String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString("dm", null);
        }
        return string;
    }

    public final java.lang.String zze() {
        java.lang.String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString("pn", null);
        }
        return string;
    }

    public final java.util.Map zzf() {
        java.util.HashMap map;
        zzk();
        synchronized (this.zzd) {
            java.util.Map<java.lang.String, ?> all = this.zza.getAll();
            map = new java.util.HashMap();
            for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
                if ((entry.getValue() instanceof java.lang.String) && !java.util.Objects.equals(entry.getKey(), "pn") && !java.util.Objects.equals(entry.getKey(), "vc") && !java.util.Objects.equals(entry.getKey(), "dm") && !java.util.Objects.equals(entry.getKey(), "aav")) {
                    map.put(entry.getKey(), (java.lang.String) entry.getValue());
                }
            }
        }
        return map;
    }

    public final void zzg() {
        zzk();
        synchronized (this.zzd) {
            this.zzb.clear().commit();
        }
    }

    public final void zzh(java.lang.String str, java.lang.String str2) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString(str, str2).commit();
        }
    }

    public final void zzi(java.lang.String str, int i, java.lang.String str2, int i2) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString("pn", str).putInt("vc", i).putString("dm", str2).putInt("aav", i2).commit();
        }
    }

    public final boolean zzj(java.lang.String str) {
        boolean zContains;
        zzk();
        synchronized (this.zzd) {
            zContains = this.zza.contains(str);
        }
        return zContains;
    }
}
