package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaqd {
    protected static final java.util.Comparator zza = new com.google.android.gms.internal.ads.zzaqc();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.List zzc = new java.util.ArrayList(64);
    private int zzd = 0;

    public zzaqd(int i) {
    }

    private final synchronized void zzc() {
        while (this.zzd > 4096) {
            byte[] bArr = (byte[]) this.zzb.remove(0);
            this.zzc.remove(bArr);
            this.zzd -= bArr.length;
        }
    }

    public final synchronized void zza(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.zzb.add(bArr);
                int iBinarySearch = java.util.Collections.binarySearch(this.zzc, bArr, zza);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.zzc.add(iBinarySearch, bArr);
                this.zzd += length;
                zzc();
            }
        }
    }

    public final synchronized byte[] zzb(int i) {
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            byte[] bArr = (byte[]) this.zzc.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.zzd -= length;
                this.zzc.remove(i2);
                this.zzb.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
