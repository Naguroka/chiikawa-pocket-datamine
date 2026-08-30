package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbcc {
    private final int zza;
    private final java.lang.String zzb;
    private final java.lang.Object zzc;
    private final java.lang.Object zzd;

    /* synthetic */ zzbcc(int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, com.google.android.gms.internal.ads.zzbcb zzbcbVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzbe.zza().zzd(this);
    }

    public static com.google.android.gms.internal.ads.zzbcc zzf(int i, java.lang.String str, float f, float f2) {
        return new com.google.android.gms.internal.ads.zzbbz(1, str, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
    }

    public static com.google.android.gms.internal.ads.zzbcc zzg(int i, java.lang.String str, int i2, int i3) {
        return new com.google.android.gms.internal.ads.zzbbx(1, str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
    }

    public static com.google.android.gms.internal.ads.zzbcc zzh(int i, java.lang.String str, long j, long j2) {
        return new com.google.android.gms.internal.ads.zzbby(1, str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2));
    }

    public static com.google.android.gms.internal.ads.zzbcc zzi(int i, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbca zzbcaVar = new com.google.android.gms.internal.ads.zzbca(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbe.zza().zzc(zzbcaVar);
        return zzbcaVar;
    }

    protected abstract java.lang.Object zza(org.json.JSONObject jSONObject);

    public abstract java.lang.Object zzb(android.os.Bundle bundle);

    protected abstract java.lang.Object zzc(android.content.SharedPreferences sharedPreferences);

    public abstract void zzd(android.content.SharedPreferences.Editor editor, java.lang.Object obj);

    public final int zze() {
        return this.zza;
    }

    public final java.lang.Object zzj() {
        return com.google.android.gms.ads.internal.client.zzbe.zzc().zza(this);
    }

    public final java.lang.Object zzk() {
        return com.google.android.gms.ads.internal.client.zzbe.zzc().zzf() ? this.zzd : this.zzc;
    }

    public final java.lang.String zzl() {
        return this.zzb;
    }
}
