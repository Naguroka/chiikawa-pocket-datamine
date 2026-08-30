package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxg extends com.google.android.gms.internal.ads.zzaxr {
    public zzaxg(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", zzascVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        try {
            int i = 1;
            boolean zBooleanValue = ((java.lang.Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            com.google.android.gms.internal.ads.zzasc zzascVar = this.zzd;
            if (true == zBooleanValue) {
                i = 2;
            }
            zzascVar.zzaf(i);
        } catch (java.lang.reflect.InvocationTargetException unused) {
            this.zzd.zzaf(3);
        }
    }
}
