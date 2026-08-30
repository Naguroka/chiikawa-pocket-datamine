package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class xk extends com.applovin.impl.ek {
    private static final java.util.regex.Pattern t = java.util.regex.Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean o;
    private final com.applovin.impl.yk p;
    private java.util.Map q;
    private float r;
    private float s;

    private static float b(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public xk(java.util.List list) {
        super("SsaDecoder");
        this.r = -3.4028235E38f;
        this.s = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.o = true;
            java.lang.String strA = com.applovin.impl.xp.a((byte[]) list.get(0));
            com.applovin.impl.b1.a(strA.startsWith("Format:"));
            this.p = (com.applovin.impl.yk) com.applovin.impl.b1.a(com.applovin.impl.yk.a(strA));
            a(new com.applovin.impl.ah((byte[]) list.get(1)));
            return;
        }
        this.o = false;
        this.p = null;
    }

    private void b(com.applovin.impl.ah ahVar) {
        while (true) {
            java.lang.String strL = ahVar.l();
            if (strL == null) {
                return;
            }
            if (ahVar.a() != 0 && ahVar.g() == 91) {
                return;
            }
            java.lang.String[] strArrSplit = strL.split(":");
            if (strArrSplit.length == 2) {
                java.lang.String lowerCase = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(strArrSplit[0].trim());
                lowerCase.hashCode();
                if (lowerCase.equals("playresx")) {
                    this.r = java.lang.Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.s = java.lang.Float.parseFloat(strArrSplit[1].trim());
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static android.text.Layout.Alignment e(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                com.applovin.impl.oc.d("SsaDecoder", "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return android.text.Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return android.text.Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private static int c(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                com.applovin.impl.oc.d("SsaDecoder", "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static java.util.Map c(com.applovin.impl.ah ahVar) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.applovin.impl.zk.a aVarA = null;
        while (true) {
            java.lang.String strL = ahVar.l();
            if (strL == null || (ahVar.a() != 0 && ahVar.g() == 91)) {
                break;
            }
            if (strL.startsWith("Format:")) {
                aVarA = com.applovin.impl.zk.a.a(strL);
            } else if (strL.startsWith("Style:")) {
                if (aVarA == null) {
                    com.applovin.impl.oc.d("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + strL);
                } else {
                    com.applovin.impl.zk zkVarA = com.applovin.impl.zk.a(strL, aVarA);
                    if (zkVarA != null) {
                        linkedHashMap.put(zkVarA.f1574a, zkVarA);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static int d(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                com.applovin.impl.oc.d("SsaDecoder", "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static int a(long j, java.util.List list, java.util.List list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((java.lang.Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((java.lang.Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, java.lang.Long.valueOf(j));
        list2.add(i, i == 0 ? new java.util.ArrayList() : new java.util.ArrayList((java.util.Collection) list2.get(i - 1)));
        return i;
    }

    private static com.applovin.impl.a5 a(java.lang.String str, com.applovin.impl.zk zkVar, com.applovin.impl.zk.b bVar, float f, float f2) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        com.applovin.impl.a5.b bVarA = new com.applovin.impl.a5.b().a(spannableString);
        if (zkVar != null) {
            if (zkVar.c != null) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(zkVar.c.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = zkVar.d;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                bVarA.b(f3 / f2, 1);
            }
            boolean z = zkVar.e;
            if (z && zkVar.f) {
                spannableString.setSpan(new android.text.style.StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
            } else if (zkVar.f) {
                spannableString.setSpan(new android.text.style.StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (zkVar.g) {
                spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (zkVar.h) {
                spannableString.setSpan(new android.text.style.StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = bVar.f1576a;
        if (i == -1) {
            i = zkVar != null ? zkVar.b : -1;
        }
        bVarA.b(e(i)).b(d(i)).a(c(i));
        android.graphics.PointF pointF = bVar.b;
        if (pointF != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
            bVarA.b(pointF.x / f);
            bVarA.a(bVar.b.y / f2, 0);
        } else {
            bVarA.b(b(bVarA.d()));
            bVarA.a(b(bVarA.c()), 0);
        }
        return bVarA.a();
    }

    @Override // com.applovin.impl.ek
    protected com.applovin.impl.nl a(byte[] bArr, int i, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(bArr, i);
        if (!this.o) {
            a(ahVar);
        }
        a(ahVar, arrayList, arrayList2);
        return new com.applovin.impl.al(arrayList, arrayList2);
    }

    private void a(java.lang.String str, com.applovin.impl.yk ykVar, java.util.List list, java.util.List list2) {
        int i;
        com.applovin.impl.b1.a(str.startsWith("Dialogue:"));
        java.lang.String[] strArrSplit = str.substring(9).split(",", ykVar.e);
        if (strArrSplit.length != ykVar.e) {
            com.applovin.impl.oc.d("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jA = a(strArrSplit[ykVar.f1546a]);
        if (jA == androidx.media3.common.C.TIME_UNSET) {
            com.applovin.impl.oc.d("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long jA2 = a(strArrSplit[ykVar.b]);
        if (jA2 == androidx.media3.common.C.TIME_UNSET) {
            com.applovin.impl.oc.d("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        java.util.Map map = this.q;
        com.applovin.impl.zk zkVar = (map == null || (i = ykVar.c) == -1) ? null : (com.applovin.impl.zk) map.get(strArrSplit[i].trim());
        java.lang.String str2 = strArrSplit[ykVar.d];
        com.applovin.impl.a5 a5VarA = a(com.applovin.impl.zk.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), zkVar, com.applovin.impl.zk.b.b(str2), this.r, this.s);
        int iA = a(jA2, list2, list);
        for (int iA2 = a(jA, list2, list); iA2 < iA; iA2++) {
            ((java.util.List) list.get(iA2)).add(a5VarA);
        }
    }

    private void a(com.applovin.impl.ah ahVar, java.util.List list, java.util.List list2) {
        com.applovin.impl.yk ykVarA = this.o ? this.p : null;
        while (true) {
            java.lang.String strL = ahVar.l();
            if (strL == null) {
                return;
            }
            if (strL.startsWith("Format:")) {
                ykVarA = com.applovin.impl.yk.a(strL);
            } else if (strL.startsWith("Dialogue:")) {
                if (ykVarA == null) {
                    com.applovin.impl.oc.d("SsaDecoder", "Skipping dialogue line before complete format: " + strL);
                } else {
                    a(strL, ykVarA, list, list2);
                }
            }
        }
    }

    private void a(com.applovin.impl.ah ahVar) {
        while (true) {
            java.lang.String strL = ahVar.l();
            if (strL == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strL)) {
                b(ahVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strL)) {
                this.q = c(ahVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(strL)) {
                com.applovin.impl.oc.c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strL)) {
                return;
            }
        }
    }

    private static long a(java.lang.String str) {
        java.util.regex.Matcher matcher = t.matcher(str.trim());
        return !matcher.matches() ? androidx.media3.common.C.TIME_UNSET : (java.lang.Long.parseLong((java.lang.String) com.applovin.impl.xp.a((java.lang.Object) matcher.group(1))) * 3600000000L) + (java.lang.Long.parseLong((java.lang.String) com.applovin.impl.xp.a((java.lang.Object) matcher.group(2))) * 60000000) + (java.lang.Long.parseLong((java.lang.String) com.applovin.impl.xp.a((java.lang.Object) matcher.group(3))) * 1000000) + (java.lang.Long.parseLong((java.lang.String) com.applovin.impl.xp.a((java.lang.Object) matcher.group(4))) * 10000);
    }
}
