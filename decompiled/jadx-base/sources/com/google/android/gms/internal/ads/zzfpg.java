package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfpg {
    private static final java.util.HashMap zza = new java.util.HashMap();
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzfph zzc;
    private final com.google.android.gms.internal.ads.zzfni zzd;
    private final com.google.android.gms.internal.ads.zzfnd zze;
    private com.google.android.gms.internal.ads.zzfov zzf;
    private final java.lang.Object zzg = new java.lang.Object();

    public zzfpg(android.content.Context context, com.google.android.gms.internal.ads.zzfph zzfphVar, com.google.android.gms.internal.ads.zzfni zzfniVar, com.google.android.gms.internal.ads.zzfnd zzfndVar) {
        this.zzb = context;
        this.zzc = zzfphVar;
        this.zzd = zzfniVar;
        this.zze = zzfndVar;
    }

    private final synchronized java.lang.Class zzd(com.google.android.gms.internal.ads.zzfow zzfowVar) throws com.google.android.gms.internal.ads.zzfpf {
        java.lang.String strZzk = zzfowVar.zza().zzk();
        java.util.HashMap map = zza;
        java.lang.Class cls = (java.lang.Class) map.get(strZzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfowVar.zzc())) {
                throw new com.google.android.gms.internal.ads.zzfpf(2026, "VM did not pass signature verification");
            }
            try {
                java.io.File fileZzb = zzfowVar.zzb();
                if (!fileZzb.exists()) {
                    fileZzb.mkdirs();
                }
                java.lang.Class clsLoadClass = new dalvik.system.DexClassLoader(zzfowVar.zzc().getAbsolutePath(), fileZzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strZzk, clsLoadClass);
                return clsLoadClass;
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalArgumentException | java.lang.SecurityException e) {
                throw new com.google.android.gms.internal.ads.zzfpf(2008, e);
            }
        } catch (java.security.GeneralSecurityException e2) {
            throw new com.google.android.gms.internal.ads.zzfpf(2026, e2);
        }
    }

    public final com.google.android.gms.internal.ads.zzfnl zza() {
        com.google.android.gms.internal.ads.zzfov zzfovVar;
        synchronized (this.zzg) {
            zzfovVar = this.zzf;
        }
        return zzfovVar;
    }

    public final com.google.android.gms.internal.ads.zzfow zzb() {
        synchronized (this.zzg) {
            com.google.android.gms.internal.ads.zzfov zzfovVar = this.zzf;
            if (zzfovVar == null) {
                return null;
            }
            return zzfovVar.zzf();
        }
    }

    public final boolean zzc(com.google.android.gms.internal.ads.zzfow zzfowVar) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            try {
                com.google.android.gms.internal.ads.zzfov zzfovVar = new com.google.android.gms.internal.ads.zzfov(zzd(zzfowVar).getDeclaredConstructor(android.content.Context.class, java.lang.String.class, byte[].class, java.lang.Object.class, android.os.Bundle.class, java.lang.Integer.TYPE).newInstance(this.zzb, "msa-r", zzfowVar.zze(), null, new android.os.Bundle(), 2), zzfowVar, this.zzc, this.zzd);
                if (!zzfovVar.zzh()) {
                    throw new com.google.android.gms.internal.ads.zzfpf(4000, "init failed");
                }
                int iZze = zzfovVar.zze();
                if (iZze != 0) {
                    throw new com.google.android.gms.internal.ads.zzfpf(4001, "ci: " + iZze);
                }
                synchronized (this.zzg) {
                    com.google.android.gms.internal.ads.zzfov zzfovVar2 = this.zzf;
                    if (zzfovVar2 != null) {
                        try {
                            zzfovVar2.zzg();
                        } catch (com.google.android.gms.internal.ads.zzfpf e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                        this.zzf = zzfovVar;
                    } else {
                        this.zzf = zzfovVar;
                    }
                    throw th;
                }
                this.zzd.zzd(3000, java.lang.System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (java.lang.Exception e2) {
                throw new com.google.android.gms.internal.ads.zzfpf(2004, e2);
            }
        } catch (com.google.android.gms.internal.ads.zzfpf e3) {
            this.zzd.zzc(e3.zza(), java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (java.lang.Exception e4) {
            this.zzd.zzc(4010, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }
}
