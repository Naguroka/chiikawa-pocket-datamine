package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxe extends com.google.android.gms.internal.ads.zzaxr {
    private static volatile java.lang.String zzh;
    private static final java.lang.Object zzi = new java.lang.Object();

    public zzaxe(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", zzascVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        this.zzd.zzB(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (java.lang.String) this.zze.invoke(null, new java.lang.Object[0]);
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzB(zzh);
        }
    }
}
