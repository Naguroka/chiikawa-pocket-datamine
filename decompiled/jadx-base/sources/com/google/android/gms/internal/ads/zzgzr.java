package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgzr {
    private final java.util.ArrayDeque zza = new java.util.ArrayDeque();

    private zzgzr() {
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgwj zza(com.google.android.gms.internal.ads.zzgzr zzgzrVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgwj zzgwjVar2) {
        zzgzrVar.zzb(zzgwjVar);
        zzgzrVar.zzb(zzgwjVar2);
        com.google.android.gms.internal.ads.zzgwj zzgzuVar = (com.google.android.gms.internal.ads.zzgwj) zzgzrVar.zza.pop();
        while (!zzgzrVar.zza.isEmpty()) {
            zzgzuVar = new com.google.android.gms.internal.ads.zzgzu((com.google.android.gms.internal.ads.zzgwj) zzgzrVar.zza.pop(), zzgzuVar);
        }
        return zzgzuVar;
    }

    private final void zzb(com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        com.google.android.gms.internal.ads.zzgzt zzgztVar;
        if (!zzgwjVar.zzh()) {
            if (!(zzgwjVar instanceof com.google.android.gms.internal.ads.zzgzu)) {
                throw new java.lang.IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzgwjVar.getClass()))));
            }
            com.google.android.gms.internal.ads.zzgzu zzgzuVar = (com.google.android.gms.internal.ads.zzgzu) zzgwjVar;
            zzb(zzgzuVar.zzd);
            zzb(zzgzuVar.zze);
            return;
        }
        int iZzc = zzc(zzgwjVar.zzd());
        java.util.ArrayDeque arrayDeque = this.zza;
        int iZzc2 = com.google.android.gms.internal.ads.zzgzu.zzc(iZzc + 1);
        if (arrayDeque.isEmpty() || ((com.google.android.gms.internal.ads.zzgwj) this.zza.peek()).zzd() >= iZzc2) {
            this.zza.push(zzgwjVar);
            return;
        }
        int iZzc3 = com.google.android.gms.internal.ads.zzgzu.zzc(iZzc);
        com.google.android.gms.internal.ads.zzgwj zzgzuVar2 = (com.google.android.gms.internal.ads.zzgwj) this.zza.pop();
        while (true) {
            zzgztVar = null;
            if (this.zza.isEmpty() || ((com.google.android.gms.internal.ads.zzgwj) this.zza.peek()).zzd() >= iZzc3) {
                break;
            } else {
                zzgzuVar2 = new com.google.android.gms.internal.ads.zzgzu((com.google.android.gms.internal.ads.zzgwj) this.zza.pop(), zzgzuVar2);
            }
        }
        com.google.android.gms.internal.ads.zzgzu zzgzuVar3 = new com.google.android.gms.internal.ads.zzgzu(zzgzuVar2, zzgwjVar);
        while (!this.zza.isEmpty()) {
            int iZzc4 = zzc(zzgzuVar3.zzd()) + 1;
            java.util.ArrayDeque arrayDeque2 = this.zza;
            if (((com.google.android.gms.internal.ads.zzgwj) arrayDeque2.peek()).zzd() >= com.google.android.gms.internal.ads.zzgzu.zzc(iZzc4)) {
                break;
            } else {
                zzgzuVar3 = new com.google.android.gms.internal.ads.zzgzu((com.google.android.gms.internal.ads.zzgwj) this.zza.pop(), zzgzuVar3);
            }
        }
        this.zza.push(zzgzuVar3);
    }

    private static final int zzc(int i) {
        int iBinarySearch = java.util.Arrays.binarySearch(com.google.android.gms.internal.ads.zzgzu.zza, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* synthetic */ zzgzr(com.google.android.gms.internal.ads.zzgzt zzgztVar) {
    }
}
