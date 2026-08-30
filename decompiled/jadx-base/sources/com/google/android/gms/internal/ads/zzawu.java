package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzawu extends com.google.android.gms.internal.ads.zzaxr {
    private final long zzh;

    public zzawu(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, long j, int i, int i2) {
        super(zzawdVar, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", zzascVar, i, 25);
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        long jLongValue = ((java.lang.Long) this.zze.invoke(null, new java.lang.Object[0])).longValue();
        synchronized (this.zzd) {
            this.zzd.zzt(jLongValue);
            long j = this.zzh;
            if (j != 0) {
                this.zzd.zzT(jLongValue - j);
                this.zzd.zzU(this.zzh);
            }
        }
    }
}
