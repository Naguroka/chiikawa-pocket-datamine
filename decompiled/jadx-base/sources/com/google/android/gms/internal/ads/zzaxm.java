package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxm extends com.google.android.gms.internal.ads.zzaxr {
    private static volatile java.lang.Long zzh;
    private static final java.lang.Object zzi = new java.lang.Object();

    public zzaxm(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", zzascVar, i, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (java.lang.Long) this.zze.invoke(null, new java.lang.Object[0]);
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzV(zzh.longValue());
        }
    }
}
