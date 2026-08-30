package com.google.android.gms.ads.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzb {
    private final android.content.Context zza;
    private boolean zzb;
    private final com.google.android.gms.internal.ads.zzbxu zzc;
    private final com.google.android.gms.internal.ads.zzbus zzd = new com.google.android.gms.internal.ads.zzbus(false, java.util.Collections.emptyList());

    public zzb(android.content.Context context, com.google.android.gms.internal.ads.zzbxu zzbxuVar, com.google.android.gms.internal.ads.zzbus zzbusVar) {
        this.zza = context;
        this.zzc = zzbxuVar;
    }

    private final boolean zzd() {
        com.google.android.gms.internal.ads.zzbxu zzbxuVar = this.zzc;
        return (zzbxuVar != null && zzbxuVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(java.lang.String str) {
        java.util.List<java.lang.String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            com.google.android.gms.internal.ads.zzbxu zzbxuVar = this.zzc;
            if (zzbxuVar != null) {
                zzbxuVar.zzd(str, null, 3);
                return;
            }
            com.google.android.gms.internal.ads.zzbus zzbusVar = this.zzd;
            if (!zzbusVar.zza || (list = zzbusVar.zzb) == null) {
                return;
            }
            for (java.lang.String str2 : list) {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    java.lang.String strReplace = str2.replace("{NAVIGATION_URL}", android.net.Uri.encode(str));
                    android.content.Context context = this.zza;
                    com.google.android.gms.ads.internal.zzv.zzq();
                    com.google.android.gms.ads.internal.util.zzs.zzM(context, "", strReplace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
