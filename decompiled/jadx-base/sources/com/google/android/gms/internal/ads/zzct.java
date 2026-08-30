package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzct {
    public static void zza(android.text.Spannable spannable, float f, int i, int i2, int i3) {
        for (android.text.style.RelativeSizeSpan relativeSizeSpan : (android.text.style.RelativeSizeSpan[]) spannable.getSpans(i, i2, android.text.style.RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i && spannable.getSpanEnd(relativeSizeSpan) >= i2) {
                f *= relativeSizeSpan.getSizeChange();
            }
            zzc(spannable, relativeSizeSpan, i, i2, 33);
        }
        spannable.setSpan(new android.text.style.RelativeSizeSpan(f), i, i2, 33);
    }

    public static void zzb(android.text.Spannable spannable, java.lang.Object obj, int i, int i2, int i3) {
        for (java.lang.Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            zzc(spannable, obj2, i, i2, 33);
        }
        spannable.setSpan(obj, i, i2, 33);
    }

    private static void zzc(android.text.Spannable spannable, java.lang.Object obj, int i, int i2, int i3) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i2 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
