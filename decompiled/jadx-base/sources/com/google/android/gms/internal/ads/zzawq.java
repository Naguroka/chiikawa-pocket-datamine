package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawq extends com.google.android.gms.internal.ads.zzaxr {
    private static final com.google.android.gms.internal.ads.zzaxs zzh = new com.google.android.gms.internal.ads.zzaxs();
    private final android.content.Context zzi;

    public zzawq(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2, android.content.Context context) {
        super(zzawdVar, "dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", zzascVar, i, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        this.zzd.zzn(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        java.util.concurrent.atomic.AtomicReference atomicReferenceZza = zzh.zza(this.zzi.getPackageName());
        if (atomicReferenceZza.get() == null) {
            synchronized (atomicReferenceZza) {
                if (atomicReferenceZza.get() == null) {
                    atomicReferenceZza.set((java.lang.String) this.zze.invoke(null, this.zzi));
                }
            }
        }
        java.lang.String str = (java.lang.String) atomicReferenceZza.get();
        synchronized (this.zzd) {
            this.zzd.zzn(com.google.android.gms.internal.ads.zzatr.zza(str.getBytes(), true));
        }
    }
}
