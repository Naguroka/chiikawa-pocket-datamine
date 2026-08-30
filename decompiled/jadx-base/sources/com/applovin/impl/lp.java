package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class lp extends com.applovin.impl.ek {
    private final com.applovin.impl.ah o;
    private final boolean p;
    private final int q;
    private final int r;
    private final java.lang.String s;
    private final float t;
    private final int u;

    public lp(java.util.List list) {
        super("Tx3gDecoder");
        this.o = new com.applovin.impl.ah();
        int size = list.size();
        java.lang.String str = androidx.media3.common.C.SANS_SERIF_NAME;
        if (size == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.q = bArr[24];
            this.r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.s = "Serif".equals(com.applovin.impl.xp.a(bArr, 43, bArr.length - 43)) ? androidx.media3.common.C.SERIF_NAME : str;
            int i = bArr[25] * 20;
            this.u = i;
            boolean z = (bArr[0] & 32) != 0;
            this.p = z;
            if (z) {
                this.t = com.applovin.impl.xp.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.t = 0.85f;
                return;
            }
        }
        this.q = 0;
        this.r = -1;
        this.s = androidx.media3.common.C.SANS_SERIF_NAME;
        this.p = false;
        this.t = 0.85f;
        this.u = -1;
    }

    private void a(com.applovin.impl.ah ahVar, android.text.SpannableStringBuilder spannableStringBuilder) throws com.applovin.impl.pl {
        a(ahVar.a() >= 12);
        int iC = ahVar.C();
        int iC2 = ahVar.C();
        ahVar.g(2);
        int iW = ahVar.w();
        ahVar.g(1);
        int iJ = ahVar.j();
        if (iC2 > spannableStringBuilder.length()) {
            com.applovin.impl.oc.d("Tx3gDecoder", "Truncating styl end (" + iC2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iC2 = spannableStringBuilder.length();
        }
        if (iC >= iC2) {
            com.applovin.impl.oc.d("Tx3gDecoder", "Ignoring styl with start (" + iC + ") >= end (" + iC2 + ").");
            return;
        }
        int i = iC2;
        b(spannableStringBuilder, iW, this.q, iC, i, 0);
        a(spannableStringBuilder, iJ, this.r, iC, i, 0);
    }

    private static void b(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(0), i3, i4, i6);
        }
    }

    private static void a(boolean z) throws com.applovin.impl.pl {
        if (!z) {
            throw new com.applovin.impl.pl("Unexpected subtitle format.");
        }
    }

    private static void a(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void a(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, int i, int i2) {
        if (str != androidx.media3.common.C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(str), i, i2, 16711713);
        }
    }

    @Override // com.applovin.impl.ek
    protected com.applovin.impl.nl a(byte[] bArr, int i, boolean z) throws com.applovin.impl.pl {
        this.o.a(bArr, i);
        java.lang.String strA = a(this.o);
        if (strA.isEmpty()) {
            return com.applovin.impl.mp.b;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strA);
        b(spannableStringBuilder, this.q, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.r, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.s, 0, spannableStringBuilder.length());
        float fA = this.t;
        while (this.o.a() >= 8) {
            int iD = this.o.d();
            int iJ = this.o.j();
            int iJ2 = this.o.j();
            if (iJ2 == 1937013100) {
                a(this.o.a() >= 2);
                int iC = this.o.C();
                for (int i2 = 0; i2 < iC; i2++) {
                    a(this.o, spannableStringBuilder);
                }
            } else if (iJ2 == 1952608120 && this.p) {
                a(this.o.a() >= 2);
                fA = com.applovin.impl.xp.a(this.o.C() / this.u, 0.0f, 0.95f);
            }
            this.o.f(iD + iJ);
        }
        return new com.applovin.impl.mp(new com.applovin.impl.a5.b().a(spannableStringBuilder).a(fA, 0).a(0).a());
    }

    private static java.lang.String a(com.applovin.impl.ah ahVar) throws com.applovin.impl.pl {
        char cF;
        a(ahVar.a() >= 2);
        int iC = ahVar.C();
        if (iC == 0) {
            return "";
        }
        if (ahVar.a() >= 2 && ((cF = ahVar.f()) == 65279 || cF == 65534)) {
            return ahVar.a(iC, com.applovin.exoplayer2.common.base.Charsets.UTF_16);
        }
        return ahVar.a(iC, com.applovin.exoplayer2.common.base.Charsets.UTF_8);
    }
}
