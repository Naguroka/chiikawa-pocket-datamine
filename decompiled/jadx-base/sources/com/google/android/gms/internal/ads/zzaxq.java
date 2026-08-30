package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxq {
    private final com.google.android.gms.internal.ads.zzawd zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.Class[] zze;
    private volatile java.lang.reflect.Method zzd = null;
    private final java.util.concurrent.CountDownLatch zzf = new java.util.concurrent.CountDownLatch(1);

    public zzaxq(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, java.lang.Class... clsArr) {
        this.zza = zzawdVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzawdVar.zzk().submit(new com.google.android.gms.internal.ads.zzaxp(this));
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzaxq zzaxqVar) {
        try {
            com.google.android.gms.internal.ads.zzawd zzawdVar = zzaxqVar.zza;
            java.lang.Class clsLoadClass = zzawdVar.zzi().loadClass(zzaxqVar.zzc(zzawdVar.zzu(), zzaxqVar.zzb));
            if (clsLoadClass != null) {
                zzaxqVar.zzd = clsLoadClass.getMethod(zzaxqVar.zzc(zzaxqVar.zza.zzu(), zzaxqVar.zzc), zzaxqVar.zze);
                java.lang.reflect.Method method = zzaxqVar.zzd;
            }
        } catch (com.google.android.gms.internal.ads.zzavh | java.io.UnsupportedEncodingException | java.lang.ClassNotFoundException | java.lang.NoSuchMethodException | java.lang.NullPointerException unused) {
        } finally {
            zzaxqVar.zzf.countDown();
        }
    }

    private final java.lang.String zzc(byte[] bArr, java.lang.String str) throws com.google.android.gms.internal.ads.zzavh, java.io.UnsupportedEncodingException {
        return new java.lang.String(this.zza.zze().zzb(bArr, str), com.adjust.sdk.Constants.ENCODING);
    }

    public final java.lang.reflect.Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, java.util.concurrent.TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (java.lang.InterruptedException unused) {
            return null;
        }
    }
}
