package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfvi implements com.google.android.gms.internal.ads.zzfvf {
    private static final com.google.android.gms.internal.ads.zzfvf zza = new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzfvh
        @Override // com.google.android.gms.internal.ads.zzfvf
        public final java.lang.Object zza() {
            throw new java.lang.IllegalStateException();
        }
    };
    private final com.google.android.gms.internal.ads.zzfvm zzb = new com.google.android.gms.internal.ads.zzfvm();
    private volatile com.google.android.gms.internal.ads.zzfvf zzc;

    @javax.annotation.CheckForNull
    private java.lang.Object zzd;

    zzfvi(com.google.android.gms.internal.ads.zzfvf zzfvfVar) {
        this.zzc = zzfvfVar;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.zzc;
        if (obj == zza) {
            obj = "<supplier that returned " + java.lang.String.valueOf(this.zzd) + ">";
        }
        return "Suppliers.memoize(" + java.lang.String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final java.lang.Object zza() {
        com.google.android.gms.internal.ads.zzfvf zzfvfVar = this.zzc;
        com.google.android.gms.internal.ads.zzfvf zzfvfVar2 = zza;
        if (zzfvfVar != zzfvfVar2) {
            synchronized (this.zzb) {
                if (this.zzc != zzfvfVar2) {
                    java.lang.Object objZza = this.zzc.zza();
                    this.zzd = objZza;
                    this.zzc = zzfvfVar2;
                    return objZza;
                }
            }
        }
        return this.zzd;
    }
}
