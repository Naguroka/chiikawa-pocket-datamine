package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzhax implements com.google.android.gms.internal.ads.zzgxx {
    static final com.google.android.gms.internal.ads.zzgxx zza = new com.google.android.gms.internal.ads.zzhax();

    private zzhax() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final boolean zza(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 1999) {
            switch (i) {
                case 1000:
                case 1001:
                case 1002:
                case 1003:
                case 1004:
                case 1005:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                case 1010:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
