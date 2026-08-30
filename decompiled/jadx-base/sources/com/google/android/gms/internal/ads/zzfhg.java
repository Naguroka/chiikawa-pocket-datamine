package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfhg {
    public static void zza(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar) {
        zzg(listenableFuture, zzfhhVar, zzfgwVar, false);
    }

    public static void zzb(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar) {
        zzg(listenableFuture, zzfhhVar, zzfgwVar, true);
    }

    public static void zzc(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzgch.zzr(com.google.android.gms.internal.ads.zzgby.zzu(listenableFuture), new com.google.android.gms.internal.ads.zzfhf(zzfhhVar, zzfgwVar), com.google.android.gms.internal.ads.zzbzw.zzg);
        }
    }

    public static void zzd(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfgw zzfgwVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzgch.zzr(com.google.android.gms.internal.ads.zzgby.zzu(listenableFuture), new com.google.android.gms.internal.ads.zzfhd(zzfgwVar), com.google.android.gms.internal.ads.zzbzw.zzg);
        }
    }

    public static boolean zze(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return java.util.regex.Pattern.matches((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziH), str);
    }

    public static int zzf(com.google.android.gms.internal.ads.zzfcj zzfcjVar) {
        int iZzf = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzf(zzfcjVar) - 1;
        return (iZzf == 0 || iZzf == 1) ? 7 : 23;
    }

    private static void zzg(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzfgw zzfgwVar, boolean z) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzgch.zzr(com.google.android.gms.internal.ads.zzgby.zzu(listenableFuture), new com.google.android.gms.internal.ads.zzfhe(zzfhhVar, zzfgwVar, z), com.google.android.gms.internal.ads.zzbzw.zzg);
        }
    }
}
