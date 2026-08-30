package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzadd {
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy(10);

    public final com.google.android.gms.internal.ads.zzay zza(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzage zzageVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzay zzayVarZza = null;
        int i = 0;
        while (true) {
            try {
                zzacoVar.zzh(this.zza.zzN(), 0, 10);
                this.zza.zzL(0);
                if (this.zza.zzo() != 4801587) {
                    break;
                }
                this.zza.zzM(3);
                int iZzl = this.zza.zzl();
                int i2 = iZzl + 10;
                if (zzayVarZza == null) {
                    byte[] bArr = new byte[i2];
                    java.lang.System.arraycopy(this.zza.zzN(), 0, bArr, 0, 10);
                    zzacoVar.zzh(bArr, 10, iZzl);
                    zzayVarZza = com.google.android.gms.internal.ads.zzagg.zza(bArr, i2, zzageVar, new com.google.android.gms.internal.ads.zzafi());
                } else {
                    zzacoVar.zzg(iZzl);
                }
                i += i2;
            } catch (java.io.EOFException unused) {
            }
        }
        zzacoVar.zzj();
        zzacoVar.zzg(i);
        return zzayVarZza;
    }
}
