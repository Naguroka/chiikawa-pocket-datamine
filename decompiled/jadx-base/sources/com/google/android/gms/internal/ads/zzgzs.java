package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgzs implements java.util.Iterator {
    private final java.util.ArrayDeque zza;
    private com.google.android.gms.internal.ads.zzgwf zzb;

    /* synthetic */ zzgzs(com.google.android.gms.internal.ads.zzgwj zzgwjVar, com.google.android.gms.internal.ads.zzgzt zzgztVar) {
        if (!(zzgwjVar instanceof com.google.android.gms.internal.ads.zzgzu)) {
            this.zza = null;
            this.zzb = (com.google.android.gms.internal.ads.zzgwf) zzgwjVar;
            return;
        }
        com.google.android.gms.internal.ads.zzgzu zzgzuVar = (com.google.android.gms.internal.ads.zzgzu) zzgwjVar;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(zzgzuVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzgzuVar);
        this.zzb = zzb(zzgzuVar.zzd);
    }

    private final com.google.android.gms.internal.ads.zzgwf zzb(com.google.android.gms.internal.ads.zzgwj zzgwjVar) {
        while (zzgwjVar instanceof com.google.android.gms.internal.ads.zzgzu) {
            com.google.android.gms.internal.ads.zzgzu zzgzuVar = (com.google.android.gms.internal.ads.zzgzu) zzgwjVar;
            this.zza.push(zzgzuVar);
            zzgwjVar = zzgzuVar.zzd;
        }
        return (com.google.android.gms.internal.ads.zzgwf) zzgwjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzgwf next() {
        com.google.android.gms.internal.ads.zzgwf zzgwfVarZzb;
        com.google.android.gms.internal.ads.zzgwf zzgwfVar = this.zzb;
        if (zzgwfVar == null) {
            throw new java.util.NoSuchElementException();
        }
        do {
            java.util.ArrayDeque arrayDeque = this.zza;
            zzgwfVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgwfVarZzb = zzb(((com.google.android.gms.internal.ads.zzgzu) this.zza.pop()).zze);
        } while (zzgwfVarZzb.zzd() == 0);
        this.zzb = zzgwfVarZzb;
        return zzgwfVar;
    }
}
