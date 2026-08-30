package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfvg implements java.io.Serializable, com.google.android.gms.internal.ads.zzfvf {
    final com.google.android.gms.internal.ads.zzfvf zza;
    volatile transient boolean zzb;

    @javax.annotation.CheckForNull
    transient java.lang.Object zzc;
    private final transient com.google.android.gms.internal.ads.zzfvm zzd = new com.google.android.gms.internal.ads.zzfvm();

    zzfvg(com.google.android.gms.internal.ads.zzfvf zzfvfVar) {
        this.zza = zzfvfVar;
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        if (this.zzb) {
            obj = "<supplier that returned " + java.lang.String.valueOf(this.zzc) + ">";
        } else {
            obj = this.zza;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final java.lang.Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                if (!this.zzb) {
                    java.lang.Object objZza = this.zza.zza();
                    this.zzc = objZza;
                    this.zzb = true;
                    return objZza;
                }
            }
        }
        return this.zzc;
    }
}
