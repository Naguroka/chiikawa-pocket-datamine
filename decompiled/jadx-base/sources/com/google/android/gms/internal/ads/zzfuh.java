package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfuh {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzfug zzb;
    private com.google.android.gms.internal.ads.zzfug zzc;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        com.google.android.gms.internal.ads.zzfug zzfugVar = this.zzb.zzb;
        java.lang.String str = "";
        while (zzfugVar != null) {
            java.lang.Object obj = zzfugVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                java.lang.String strDeepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                sb.append((java.lang.CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzfugVar = zzfugVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final com.google.android.gms.internal.ads.zzfuh zza(@javax.annotation.CheckForNull java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfug zzfugVar = new com.google.android.gms.internal.ads.zzfug();
        this.zzc.zzb = zzfugVar;
        this.zzc = zzfugVar;
        zzfugVar.zza = obj;
        return this;
    }

    /* synthetic */ zzfuh(java.lang.String str, com.google.android.gms.internal.ads.zzfui zzfuiVar) {
        com.google.android.gms.internal.ads.zzfug zzfugVar = new com.google.android.gms.internal.ads.zzfug();
        this.zzb = zzfugVar;
        this.zzc = zzfugVar;
        str.getClass();
        this.zza = str;
    }
}
