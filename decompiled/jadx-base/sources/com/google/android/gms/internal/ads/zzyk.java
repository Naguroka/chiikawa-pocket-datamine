package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzyk {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private com.google.android.gms.internal.ads.zzyd[] zzd = new com.google.android.gms.internal.ads.zzyd[100];

    public zzyk(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized com.google.android.gms.internal.ads.zzyd zzb() {
        com.google.android.gms.internal.ads.zzyd zzydVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            com.google.android.gms.internal.ads.zzyd[] zzydVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzydVar = zzydVarArr[i2];
            zzydVar.getClass();
            zzydVarArr[i2] = null;
        } else {
            zzydVar = new com.google.android.gms.internal.ads.zzyd(new byte[65536], 0);
            int i3 = this.zzb;
            com.google.android.gms.internal.ads.zzyd[] zzydVarArr2 = this.zzd;
            int length = zzydVarArr2.length;
            if (i3 > length) {
                this.zzd = (com.google.android.gms.internal.ads.zzyd[]) java.util.Arrays.copyOf(zzydVarArr2, length + length);
                return zzydVar;
            }
        }
        return zzydVar;
    }

    public final synchronized void zzc(com.google.android.gms.internal.ads.zzyd zzydVar) {
        com.google.android.gms.internal.ads.zzyd[] zzydVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzydVarArr[i] = zzydVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(com.google.android.gms.internal.ads.zzye zzyeVar) {
        while (zzyeVar != null) {
            com.google.android.gms.internal.ads.zzyd[] zzydVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzydVarArr[i] = zzyeVar.zzc();
            this.zzb--;
            zzyeVar = zzyeVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i = this.zza;
        int i2 = com.google.android.gms.internal.ads.zzei.zza;
        int iMax = java.lang.Math.max(0, ((i + 65535) / 65536) - this.zzb);
        int i3 = this.zzc;
        if (iMax >= i3) {
            return;
        }
        java.util.Arrays.fill(this.zzd, iMax, i3, (java.lang.Object) null);
        this.zzc = iMax;
    }
}
