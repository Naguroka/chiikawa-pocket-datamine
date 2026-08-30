package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzam {
    public final android.net.Uri zza;
    public final java.lang.String zzb;
    public final com.google.android.gms.internal.ads.zzaj zzc;
    public final com.google.android.gms.internal.ads.zzae zzd;
    public final java.util.List zze;
    public final java.lang.String zzf;
    public final com.google.android.gms.internal.ads.zzfxn zzg;
    public final java.lang.Object zzh;
    public final long zzi;

    static {
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
        java.lang.Integer.toString(6, 36);
        java.lang.Integer.toString(7, 36);
    }

    /* synthetic */ zzam(android.net.Uri uri, java.lang.String str, com.google.android.gms.internal.ads.zzaj zzajVar, com.google.android.gms.internal.ads.zzae zzaeVar, java.util.List list, java.lang.String str2, com.google.android.gms.internal.ads.zzfxn zzfxnVar, java.lang.Object obj, long j, com.google.android.gms.internal.ads.zzaq zzaqVar) {
        this.zza = uri;
        int i = com.google.android.gms.internal.ads.zzbb.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfxnVar;
        com.google.android.gms.internal.ads.zzfxk zzfxkVar = new com.google.android.gms.internal.ads.zzfxk();
        if (zzfxnVar.size() > 0) {
            throw null;
        }
        zzfxkVar.zzi();
        this.zzh = null;
        this.zzi = androidx.media3.common.C.TIME_UNSET;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzam)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzam zzamVar = (com.google.android.gms.internal.ads.zzam) obj;
        if (this.zza.equals(zzamVar.zza)) {
            java.lang.String str = zzamVar.zzb;
            if (java.util.Objects.equals(null, null)) {
                com.google.android.gms.internal.ads.zzaj zzajVar = zzamVar.zzc;
                if (java.util.Objects.equals(null, null)) {
                    com.google.android.gms.internal.ads.zzae zzaeVar = zzamVar.zzd;
                    if (java.util.Objects.equals(null, null) && this.zze.equals(zzamVar.zze)) {
                        java.lang.String str2 = zzamVar.zzf;
                        if (java.util.Objects.equals(null, null) && this.zzg.equals(zzamVar.zzg)) {
                            java.lang.Object obj2 = zzamVar.zzh;
                            if (java.util.Objects.equals(null, null)) {
                                java.lang.Long lValueOf = java.lang.Long.valueOf(androidx.media3.common.C.TIME_UNSET);
                                long j = zzamVar.zzi;
                                if (java.util.Objects.equals(lValueOf, lValueOf)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) ((((long) (((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31)) * 31) + androidx.media3.common.C.TIME_UNSET);
    }
}
