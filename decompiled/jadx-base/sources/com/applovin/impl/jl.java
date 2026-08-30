package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class jl extends com.applovin.impl.ek {
    private static final java.util.regex.Pattern q = java.util.regex.Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final java.util.regex.Pattern r = java.util.regex.Pattern.compile("\\{\\\\.*?\\}");
    private final java.lang.StringBuilder o;
    private final java.util.ArrayList p;

    public jl() {
        super("SubripDecoder");
        this.o = new java.lang.StringBuilder();
        this.p = new java.util.ArrayList();
    }

    private static long a(java.util.regex.Matcher matcher, int i) {
        java.lang.String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? java.lang.Long.parseLong(strGroup) * 3600000 : 0L) + (java.lang.Long.parseLong((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(i + 2))) * 60000) + (java.lang.Long.parseLong((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(i + 3))) * 1000);
        java.lang.String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += java.lang.Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    static float b(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private java.lang.String a(java.lang.String str, java.util.ArrayList arrayList) {
        java.lang.String strTrim = str.trim();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strTrim);
        java.util.regex.Matcher matcher = r.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            java.lang.String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }

    @Override // com.applovin.impl.ek
    protected com.applovin.impl.nl a(byte[] bArr, int i, boolean z) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.applovin.impl.qc qcVar = new com.applovin.impl.qc();
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(bArr, i);
        while (true) {
            java.lang.String strL = ahVar.l();
            int i2 = 0;
            if (strL == null) {
                break;
            }
            if (strL.length() != 0) {
                try {
                    java.lang.Integer.parseInt(strL);
                    java.lang.String strL2 = ahVar.l();
                    if (strL2 == null) {
                        com.applovin.impl.oc.d("SubripDecoder", "Unexpected end");
                        break;
                    }
                    java.util.regex.Matcher matcher = q.matcher(strL2);
                    if (matcher.matches()) {
                        qcVar.a(a(matcher, 1));
                        qcVar.a(a(matcher, 6));
                        this.o.setLength(0);
                        this.p.clear();
                        for (java.lang.String strL3 = ahVar.l(); !android.text.TextUtils.isEmpty(strL3); strL3 = ahVar.l()) {
                            if (this.o.length() > 0) {
                                this.o.append("<br>");
                            }
                            this.o.append(a(strL3, this.p));
                        }
                        android.text.Spanned spannedFromHtml = android.text.Html.fromHtml(this.o.toString());
                        while (true) {
                            if (i2 >= this.p.size()) {
                                str = null;
                                break;
                            }
                            str = (java.lang.String) this.p.get(i2);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(a(spannedFromHtml, str));
                        arrayList.add(com.applovin.impl.a5.s);
                    } else {
                        com.applovin.impl.oc.d("SubripDecoder", "Skipping invalid timing: " + strL2);
                    }
                } catch (java.lang.NumberFormatException unused) {
                    com.applovin.impl.oc.d("SubripDecoder", "Skipping invalid index: " + strL);
                }
            }
        }
        return new com.applovin.impl.kl((com.applovin.impl.a5[]) arrayList.toArray(new com.applovin.impl.a5[0]), qcVar.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    private com.applovin.impl.a5 a(android.text.Spanned spanned, java.lang.String str) {
        byte b;
        byte b2;
        com.applovin.impl.a5.b bVarA = new com.applovin.impl.a5.b().a(spanned);
        if (str == null) {
            return bVarA.a();
        }
        switch (str) {
            case "{\an1}":
                b = 0;
                break;
            case "{\an2}":
                b = 6;
                break;
            case "{\an3}":
                b = 3;
                break;
            case "{\an4}":
                b = 1;
                break;
            case "{\an5}":
                b = 7;
                break;
            case "{\an6}":
                b = 4;
                break;
            case "{\an7}":
                b = 2;
                break;
            case "{\an8}":
                b = 8;
                break;
            case "{\an9}":
                b = 5;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1 || b == 2) {
            bVarA.b(0);
        } else if (b != 3 && b != 4 && b != 5) {
            bVarA.b(1);
        } else {
            bVarA.b(2);
        }
        switch (str) {
            case "{\an1}":
                b2 = 0;
                break;
            case "{\an2}":
                b2 = 1;
                break;
            case "{\an3}":
                b2 = 2;
                break;
            case "{\an4}":
                b2 = 6;
                break;
            case "{\an5}":
                b2 = 7;
                break;
            case "{\an6}":
                b2 = 8;
                break;
            case "{\an7}":
                b2 = 3;
                break;
            case "{\an8}":
                b2 = 4;
                break;
            case "{\an9}":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2) {
            bVarA.a(2);
        } else if (b2 != 3 && b2 != 4 && b2 != 5) {
            bVarA.a(1);
        } else {
            bVarA.a(0);
        }
        return bVarA.b(b(bVarA.d())).a(b(bVarA.c()), 0).a();
    }
}
