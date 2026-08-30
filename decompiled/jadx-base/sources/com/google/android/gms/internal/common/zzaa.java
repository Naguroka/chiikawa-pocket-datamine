package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaa {
    private final com.google.android.gms.internal.common.zzr zza;
    private final boolean zzb;
    private final com.google.android.gms.internal.common.zzw zzc;

    private zzaa(com.google.android.gms.internal.common.zzw zzwVar, boolean z, com.google.android.gms.internal.common.zzr zzrVar, int i) {
        this.zzc = zzwVar;
        this.zzb = z;
        this.zza = zzrVar;
    }

    public static com.google.android.gms.internal.common.zzaa zzc(com.google.android.gms.internal.common.zzr zzrVar) {
        return new com.google.android.gms.internal.common.zzaa(new com.google.android.gms.internal.common.zzw(zzrVar), false, com.google.android.gms.internal.common.zzq.zza, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Iterator zzh(java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.common.zzx(this, charSequence, this.zzc.zza);
    }

    public final com.google.android.gms.internal.common.zzaa zzb() {
        return new com.google.android.gms.internal.common.zzaa(this.zzc, true, this.zza, Integer.MAX_VALUE);
    }

    public final java.lang.Iterable zzd(java.lang.CharSequence charSequence) {
        return new com.google.android.gms.internal.common.zzy(this, charSequence);
    }

    public final java.util.List zzf(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.util.Iterator itZzh = zzh(charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (itZzh.hasNext()) {
            arrayList.add((java.lang.String) itZzh.next());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
