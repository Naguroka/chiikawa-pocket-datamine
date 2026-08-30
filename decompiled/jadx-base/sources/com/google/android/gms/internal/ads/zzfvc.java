package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfvc {
    private final com.google.android.gms.internal.ads.zzfvb zza;

    private zzfvc(com.google.android.gms.internal.ads.zzfvb zzfvbVar) {
        int i = com.google.android.gms.internal.ads.zzftx.zzb;
        this.zza = zzfvbVar;
    }

    public static com.google.android.gms.internal.ads.zzfvc zza(int i) {
        return new com.google.android.gms.internal.ads.zzfvc(new com.google.android.gms.internal.ads.zzfuy(4000));
    }

    public static com.google.android.gms.internal.ads.zzfvc zzb(com.google.android.gms.internal.ads.zzfty zzftyVar) {
        return new com.google.android.gms.internal.ads.zzfvc(new com.google.android.gms.internal.ads.zzfuu(zzftyVar));
    }

    public static com.google.android.gms.internal.ads.zzfvc zzc(java.util.regex.Pattern pattern) {
        com.google.android.gms.internal.ads.zzfue zzfueVar = new com.google.android.gms.internal.ads.zzfue(pattern);
        com.google.android.gms.internal.ads.zzfun.zzi(!((com.google.android.gms.internal.ads.zzfud) zzfueVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzfueVar);
        return new com.google.android.gms.internal.ads.zzfvc(new com.google.android.gms.internal.ads.zzfuw(zzfueVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Iterator zzg(java.lang.CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final java.lang.Iterable zzd(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        return new com.google.android.gms.internal.ads.zzfuz(this, charSequence);
    }

    public final java.util.List zzf(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.util.Iterator itZzg = zzg(charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (itZzg.hasNext()) {
            arrayList.add((java.lang.String) itZzg.next());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
