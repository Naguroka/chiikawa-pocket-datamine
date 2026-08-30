package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzauo {
    public static final java.lang.String zza(android.content.Context context, java.lang.String str, boolean z) {
        try {
            com.google.android.gms.internal.ads.zzatf zzatfVarZza = com.google.android.gms.internal.ads.zzatg.zza();
            zzatfVarZza.zzb(str);
            zzatfVarZza.zza("1.671910402");
            zzatfVarZza.zzc(context.getPackageName());
            zzatfVarZza.zzd(java.lang.System.currentTimeMillis() / 1000);
            try {
                zzatfVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                zzatfVarZza.zze(-1L);
            }
            com.google.android.gms.internal.ads.zzatm zzatmVarZza = com.google.android.gms.internal.ads.zzaty.zza(((com.google.android.gms.internal.ads.zzatg) zzatfVarZza.zzbr()).zzaV(), null);
            zzatmVarZza.zzd(5);
            zzatmVarZza.zzc(2);
            return android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.zzatn) zzatmVarZza.zzbr()).zzaV(), 11);
        } catch (java.io.UnsupportedEncodingException | java.security.GeneralSecurityException unused2) {
            return java.lang.Integer.toString(7);
        }
    }
}
