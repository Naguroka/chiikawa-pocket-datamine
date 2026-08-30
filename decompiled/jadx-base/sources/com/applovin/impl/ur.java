package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ur {
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ah f1413a = new com.applovin.impl.ah();
    private final java.lang.StringBuilder b = new java.lang.StringBuilder();

    public java.util.List c(com.applovin.impl.ah ahVar) {
        this.b.setLength(0);
        int iD = ahVar.d();
        e(ahVar);
        this.f1413a.a(ahVar.c(), ahVar.d());
        this.f1413a.f(iD);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.lang.String strD = d(this.f1413a, this.b);
            if (strD == null || !"{".equals(b(this.f1413a, this.b))) {
                return arrayList;
            }
            com.applovin.impl.vr vrVar = new com.applovin.impl.vr();
            a(vrVar, strD);
            java.lang.String str = null;
            boolean z = false;
            while (!z) {
                int iD2 = this.f1413a.d();
                java.lang.String strB = b(this.f1413a, this.b);
                boolean z2 = strB == null || "}".equals(strB);
                if (!z2) {
                    this.f1413a.f(iD2);
                    a(this.f1413a, vrVar, this.b);
                }
                str = strB;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(vrVar);
            }
        }
    }

    private static java.lang.String c(com.applovin.impl.ah ahVar, java.lang.StringBuilder sb) {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        boolean z = false;
        while (!z) {
            int iD = ahVar.d();
            java.lang.String strB = b(ahVar, sb);
            if (strB == null) {
                return null;
            }
            if (!"}".equals(strB) && !";".equals(strB)) {
                sb2.append(strB);
            } else {
                ahVar.f(iD);
                z = true;
            }
        }
        return sb2.toString();
    }

    private static java.lang.String d(com.applovin.impl.ah ahVar, java.lang.StringBuilder sb) {
        f(ahVar);
        if (ahVar.a() < 5 || !"::cue".equals(ahVar.c(5))) {
            return null;
        }
        int iD = ahVar.d();
        java.lang.String strB = b(ahVar, sb);
        if (strB == null) {
            return null;
        }
        if ("{".equals(strB)) {
            ahVar.f(iD);
            return "";
        }
        java.lang.String strD = "(".equals(strB) ? d(ahVar) : null;
        if (")".equals(b(ahVar, sb))) {
            return strD;
        }
        return null;
    }

    static void f(com.applovin.impl.ah ahVar) {
        while (true) {
            for (boolean z = true; ahVar.a() > 0 && z; z = false) {
                if (!b(ahVar) && !a(ahVar)) {
                }
            }
            return;
        }
    }

    private static boolean b(com.applovin.impl.ah ahVar) {
        char cA = a(ahVar, ahVar.d());
        if (cA != '\t' && cA != '\n' && cA != '\f' && cA != '\r' && cA != ' ') {
            return false;
        }
        ahVar.g(1);
        return true;
    }

    static void e(com.applovin.impl.ah ahVar) {
        while (!android.text.TextUtils.isEmpty(ahVar.l())) {
        }
    }

    private static boolean a(com.applovin.impl.ah ahVar) {
        int iD = ahVar.d();
        int iE = ahVar.e();
        byte[] bArrC = ahVar.c();
        int i = iD + 2;
        if (i > iE) {
            return false;
        }
        int i2 = iD + 1;
        if (bArrC[iD] != 47 || bArrC[i2] != 42) {
            return false;
        }
        while (true) {
            int i3 = i + 1;
            if (i3 < iE) {
                if (((char) bArrC[i]) == '*' && ((char) bArrC[i3]) == '/') {
                    i += 2;
                    iE = i;
                } else {
                    i = i3;
                }
            } else {
                ahVar.g(iE - ahVar.d());
                return true;
            }
        }
    }

    private static java.lang.String d(com.applovin.impl.ah ahVar) {
        int iD = ahVar.d();
        int iE = ahVar.e();
        boolean z = false;
        while (iD < iE && !z) {
            int i = iD + 1;
            z = ((char) ahVar.c()[iD]) == ')';
            iD = i;
        }
        return ahVar.c((iD - 1) - ahVar.d()).trim();
    }

    static java.lang.String b(com.applovin.impl.ah ahVar, java.lang.StringBuilder sb) {
        f(ahVar);
        if (ahVar.a() == 0) {
            return null;
        }
        java.lang.String strA = a(ahVar, sb);
        return !"".equals(strA) ? strA : "" + ((char) ahVar.w());
    }

    private static java.lang.String a(com.applovin.impl.ah ahVar, java.lang.StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iD = ahVar.d();
        int iE = ahVar.e();
        while (iD < iE && !z) {
            char c2 = (char) ahVar.c()[iD];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                iD++;
                sb.append(c2);
            }
        }
        ahVar.g(iD - ahVar.d());
        return sb.toString();
    }

    private static void a(com.applovin.impl.ah ahVar, com.applovin.impl.vr vrVar, java.lang.StringBuilder sb) {
        f(ahVar);
        java.lang.String strA = a(ahVar, sb);
        if (!"".equals(strA) && ":".equals(b(ahVar, sb))) {
            f(ahVar);
            java.lang.String strC = c(ahVar, sb);
            if (strC == null || "".equals(strC)) {
                return;
            }
            int iD = ahVar.d();
            java.lang.String strB = b(ahVar, sb);
            if (!";".equals(strB)) {
                if (!"}".equals(strB)) {
                    return;
                } else {
                    ahVar.f(iD);
                }
            }
            if ("color".equals(strA)) {
                vrVar.b(com.applovin.impl.s3.a(strC));
                return;
            }
            if ("background-color".equals(strA)) {
                vrVar.a(com.applovin.impl.s3.a(strC));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(strA)) {
                if ("over".equals(strC)) {
                    vrVar.d(1);
                    return;
                } else {
                    if ("under".equals(strC)) {
                        vrVar.d(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strA)) {
                if (!androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL.equals(strC) && !strC.startsWith("digits")) {
                    z = false;
                }
                vrVar.b(z);
                return;
            }
            if ("text-decoration".equals(strA)) {
                if (androidx.media3.extractor.text.ttml.TtmlNode.UNDERLINE.equals(strC)) {
                    vrVar.d(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strA)) {
                vrVar.a(strC);
                return;
            }
            if ("font-weight".equals(strA)) {
                if (androidx.media3.extractor.text.ttml.TtmlNode.BOLD.equals(strC)) {
                    vrVar.a(true);
                }
            } else if ("font-style".equals(strA)) {
                if (androidx.media3.extractor.text.ttml.TtmlNode.ITALIC.equals(strC)) {
                    vrVar.c(true);
                }
            } else if ("font-size".equals(strA)) {
                a(strC, vrVar);
            }
        }
    }

    private static char a(com.applovin.impl.ah ahVar, int i) {
        return (char) ahVar.c()[i];
    }

    private static void a(java.lang.String str, com.applovin.impl.vr vrVar) {
        java.util.regex.Matcher matcher = d.matcher(com.applovin.exoplayer2.common.base.Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            com.applovin.impl.oc.d("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        java.lang.String str2 = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(2));
        str2.hashCode();
        str2.hashCode();
        switch (str2) {
            case "%":
                vrVar.c(3);
                break;
            case "em":
                vrVar.c(2);
                break;
            case "px":
                vrVar.c(1);
                break;
            default:
                throw new java.lang.IllegalStateException();
        }
        vrVar.a(java.lang.Float.parseFloat((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1))));
    }

    private void a(com.applovin.impl.vr vrVar, java.lang.String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            java.util.regex.Matcher matcher = c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                vrVar.d((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        java.lang.String[] strArrA = com.applovin.impl.xp.a(str, "\\.");
        java.lang.String str2 = strArrA[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            vrVar.c(str2.substring(0, iIndexOf2));
            vrVar.b(str2.substring(iIndexOf2 + 1));
        } else {
            vrVar.c(str2);
        }
        if (strArrA.length > 1) {
            vrVar.a((java.lang.String[]) com.applovin.impl.xp.a(strArrA, 1, strArrA.length));
        }
    }
}
