package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class ip {
    private static com.applovin.impl.gp b(com.applovin.impl.gp gpVar, java.util.Map map) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.push(gpVar);
        while (!arrayDeque.isEmpty()) {
            com.applovin.impl.gp gpVar2 = (com.applovin.impl.gp) arrayDeque.pop();
            com.applovin.impl.jp jpVarA = a(gpVar2.f, gpVar2.c(), map);
            if (jpVarA != null && jpVarA.i() == 3) {
                return gpVar2;
            }
            for (int iA = gpVar2.a() - 1; iA >= 0; iA--) {
                arrayDeque.push(gpVar2.a(iA));
            }
        }
        return null;
    }

    public static void a(android.text.Spannable spannable, int i, int i2, com.applovin.impl.jp jpVar, com.applovin.impl.gp gpVar, java.util.Map map, int i3) {
        com.applovin.impl.gp gpVarB;
        com.applovin.impl.jp jpVarA;
        int i4;
        if (jpVar.k() != -1) {
            spannable.setSpan(new android.text.style.StyleSpan(jpVar.k()), i, i2, 33);
        }
        if (jpVar.q()) {
            spannable.setSpan(new android.text.style.StrikethroughSpan(), i, i2, 33);
        }
        if (jpVar.r()) {
            spannable.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
        }
        if (jpVar.p()) {
            com.applovin.impl.pk.a(spannable, new android.text.style.ForegroundColorSpan(jpVar.b()), i, i2, 33);
        }
        if (jpVar.o()) {
            com.applovin.impl.pk.a(spannable, new android.text.style.BackgroundColorSpan(jpVar.a()), i, i2, 33);
        }
        if (jpVar.c() != null) {
            com.applovin.impl.pk.a(spannable, new android.text.style.TypefaceSpan(jpVar.c()), i, i2, 33);
        }
        if (jpVar.n() != null) {
            com.applovin.impl.xn xnVar = (com.applovin.impl.xn) com.applovin.impl.b1.a(jpVar.n());
            int i5 = xnVar.f1514a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = xnVar.b;
            }
            int i6 = xnVar.c;
            if (i6 == -2) {
                i6 = 1;
            }
            com.applovin.impl.pk.a(spannable, new com.applovin.impl.yn(i5, i4, i6), i, i2, 33);
        }
        int i7 = jpVar.i();
        if (i7 == 2) {
            com.applovin.impl.gp gpVarA = a(gpVar, map);
            if (gpVarA != null && (gpVarB = b(gpVarA, map)) != null) {
                if (gpVarB.a() == 1 && gpVarB.a(0).b != null) {
                    java.lang.String str = (java.lang.String) com.applovin.impl.xp.a((java.lang.Object) gpVarB.a(0).b);
                    com.applovin.impl.jp jpVarA2 = a(gpVarB.f, gpVarB.c(), map);
                    int iH = jpVarA2 != null ? jpVarA2.h() : -1;
                    if (iH == -1 && (jpVarA = a(gpVarA.f, gpVarA.c(), map)) != null) {
                        iH = jpVarA.h();
                    }
                    spannable.setSpan(new com.applovin.impl.zi(str, iH), i, i2, 33);
                } else {
                    com.applovin.impl.oc.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (i7 == 3 || i7 == 4) {
            spannable.setSpan(new com.applovin.impl.n6(), i, i2, 33);
        }
        if (jpVar.m()) {
            com.applovin.impl.pk.a(spannable, new com.applovin.impl.oa(), i, i2, 33);
        }
        int iE = jpVar.e();
        if (iE == 1) {
            com.applovin.impl.pk.a(spannable, new android.text.style.AbsoluteSizeSpan((int) jpVar.d(), true), i, i2, 33);
        } else if (iE == 2) {
            com.applovin.impl.pk.a(spannable, new android.text.style.RelativeSizeSpan(jpVar.d()), i, i2, 33);
        } else {
            if (iE != 3) {
                return;
            }
            com.applovin.impl.pk.a(spannable, new android.text.style.RelativeSizeSpan(jpVar.d() / 100.0f), i, i2, 33);
        }
    }

    static java.lang.String a(java.lang.String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void a(android.text.SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static com.applovin.impl.gp a(com.applovin.impl.gp gpVar, java.util.Map map) {
        while (gpVar != null) {
            com.applovin.impl.jp jpVarA = a(gpVar.f, gpVar.c(), map);
            if (jpVarA != null && jpVarA.i() == 1) {
                return gpVar;
            }
            gpVar = gpVar.j;
        }
        return null;
    }

    public static com.applovin.impl.jp a(com.applovin.impl.jp jpVar, java.lang.String[] strArr, java.util.Map map) {
        int i = 0;
        if (jpVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (com.applovin.impl.jp) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                com.applovin.impl.jp jpVar2 = new com.applovin.impl.jp();
                int length = strArr.length;
                while (i < length) {
                    jpVar2.a((com.applovin.impl.jp) map.get(strArr[i]));
                    i++;
                }
                return jpVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return jpVar.a((com.applovin.impl.jp) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    jpVar.a((com.applovin.impl.jp) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return jpVar;
    }
}
