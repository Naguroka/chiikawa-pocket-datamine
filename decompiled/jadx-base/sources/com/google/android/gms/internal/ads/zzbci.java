package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbci implements com.google.android.gms.internal.ads.zzbfa {
    final /* synthetic */ android.content.SharedPreferences zza;

    zzbci(com.google.android.gms.internal.ads.zzbcj zzbcjVar, android.content.SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final java.lang.Boolean zza(java.lang.String str, boolean z) {
        try {
            return java.lang.Boolean.valueOf(this.zza.getBoolean(str, z));
        } catch (java.lang.ClassCastException unused) {
            return java.lang.Boolean.valueOf(this.zza.getString(str, java.lang.String.valueOf(z)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final java.lang.Double zzb(java.lang.String str, double d) {
        try {
            return java.lang.Double.valueOf(this.zza.getFloat(str, (float) d));
        } catch (java.lang.ClassCastException unused) {
            return java.lang.Double.valueOf(this.zza.getString(str, java.lang.String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final java.lang.Long zzc(java.lang.String str, long j) {
        try {
            return java.lang.Long.valueOf(this.zza.getLong(str, j));
        } catch (java.lang.ClassCastException unused) {
            return java.lang.Long.valueOf(this.zza.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final java.lang.String zzd(java.lang.String str, java.lang.String str2) {
        return this.zza.getString(str, str2);
    }
}
