package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzegp {
    final java.lang.String zza;
    final java.lang.String zzb;
    int zzc;
    long zzd;
    final java.lang.Integer zze;

    zzegp(java.lang.String str, java.lang.String str2, int i, long j, java.lang.Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = j;
        this.zze = num;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza + "." + this.zzc + "." + this.zzd;
        if (!android.text.TextUtils.isEmpty(this.zzb)) {
            str = str + "." + this.zzb;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbK)).booleanValue() || this.zze == null || android.text.TextUtils.isEmpty(this.zzb)) {
            return str;
        }
        return str + "." + this.zze;
    }
}
