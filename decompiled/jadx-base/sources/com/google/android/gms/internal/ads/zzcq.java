package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcq {
    private static final java.lang.String zza = java.lang.Integer.toString(0, 36);
    private static final java.lang.String zzb = java.lang.Integer.toString(1, 36);
    private static final java.lang.String zzc = java.lang.Integer.toString(2, 36);
    private static final java.lang.String zzd = java.lang.Integer.toString(3, 36);
    private static final java.lang.String zze = java.lang.Integer.toString(4, 36);

    public static java.util.ArrayList zza(android.text.Spanned spanned) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.internal.ads.zzcs zzcsVar : (com.google.android.gms.internal.ads.zzcs[]) spanned.getSpans(0, spanned.length(), com.google.android.gms.internal.ads.zzcs.class)) {
            arrayList.add(zzb(spanned, zzcsVar, 1, zzcsVar.zza()));
        }
        for (com.google.android.gms.internal.ads.zzcu zzcuVar : (com.google.android.gms.internal.ads.zzcu[]) spanned.getSpans(0, spanned.length(), com.google.android.gms.internal.ads.zzcu.class)) {
            arrayList.add(zzb(spanned, zzcuVar, 2, zzcuVar.zza()));
        }
        for (com.google.android.gms.internal.ads.zzcr zzcrVar : (com.google.android.gms.internal.ads.zzcr[]) spanned.getSpans(0, spanned.length(), com.google.android.gms.internal.ads.zzcr.class)) {
            arrayList.add(zzb(spanned, zzcrVar, 3, null));
        }
        for (com.google.android.gms.internal.ads.zzcv zzcvVar : (com.google.android.gms.internal.ads.zzcv[]) spanned.getSpans(0, spanned.length(), com.google.android.gms.internal.ads.zzcv.class)) {
            arrayList.add(zzb(spanned, zzcvVar, 4, zzcvVar.zza()));
        }
        return arrayList;
    }

    private static android.os.Bundle zzb(android.text.Spanned spanned, java.lang.Object obj, int i, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt(zza, spanned.getSpanStart(obj));
        bundle2.putInt(zzb, spanned.getSpanEnd(obj));
        bundle2.putInt(zzc, spanned.getSpanFlags(obj));
        bundle2.putInt(zzd, i);
        if (bundle != null) {
            bundle2.putBundle(zze, bundle);
        }
        return bundle2;
    }
}
