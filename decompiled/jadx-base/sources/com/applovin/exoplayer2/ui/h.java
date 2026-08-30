package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
abstract class h {
    public static float a(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static void a(com.applovin.impl.a5.b bVar) {
        bVar.b();
        if (bVar.e() instanceof android.text.Spanned) {
            if (!(bVar.e() instanceof android.text.Spannable)) {
                bVar.a(android.text.SpannableString.valueOf(bVar.e()));
            }
            a((android.text.Spannable) com.applovin.impl.b1.a(bVar.e()), new com.applovin.exoplayer2.common.base.Predicate() { // from class: com.applovin.exoplayer2.ui.h$$ExternalSyntheticLambda1
                @Override // com.applovin.exoplayer2.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return com.applovin.exoplayer2.ui.h.a(obj);
                }
            });
        }
        b(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(java.lang.Object obj) {
        return !(obj instanceof com.applovin.impl.zb);
    }

    private static void a(android.text.Spannable spannable, com.applovin.exoplayer2.common.base.Predicate predicate) {
        for (java.lang.Object obj : spannable.getSpans(0, spannable.length(), java.lang.Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static void b(com.applovin.impl.a5.b bVar) {
        bVar.b(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.e() instanceof android.text.Spanned) {
            if (!(bVar.e() instanceof android.text.Spannable)) {
                bVar.a(android.text.SpannableString.valueOf(bVar.e()));
            }
            a((android.text.Spannable) com.applovin.impl.b1.a(bVar.e()), new com.applovin.exoplayer2.common.base.Predicate() { // from class: com.applovin.exoplayer2.ui.h$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return com.applovin.exoplayer2.ui.h.b(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(java.lang.Object obj) {
        return (obj instanceof android.text.style.AbsoluteSizeSpan) || (obj instanceof android.text.style.RelativeSizeSpan);
    }
}
