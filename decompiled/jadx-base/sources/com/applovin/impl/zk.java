package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1574a;
    public final int b;
    public final java.lang.Integer c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    private static boolean a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private zk(java.lang.String str, int i, java.lang.Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f1574a = str;
        this.b = i;
        this.c = num;
        this.d = f;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(java.lang.String str) {
        try {
            int i = java.lang.Integer.parseInt(str.trim());
            if (a(i)) {
                return i;
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        com.applovin.impl.oc.d("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static com.applovin.impl.zk a(java.lang.String str, com.applovin.impl.zk.a aVar) {
        com.applovin.impl.b1.a(str.startsWith("Style:"));
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i = aVar.i;
        if (length != i) {
            com.applovin.impl.oc.d("SsaStyle", com.applovin.impl.xp.a("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            java.lang.String strTrim = strArrSplit[aVar.f1575a].trim();
            int i2 = aVar.b;
            int iB = i2 != -1 ? b(strArrSplit[i2].trim()) : -1;
            int i3 = aVar.c;
            java.lang.Integer numD = i3 != -1 ? d(strArrSplit[i3].trim()) : null;
            int i4 = aVar.d;
            float fE = i4 != -1 ? e(strArrSplit[i4].trim()) : -3.4028235E38f;
            int i5 = aVar.e;
            boolean z = i5 != -1 && c(strArrSplit[i5].trim());
            int i6 = aVar.f;
            boolean z2 = i6 != -1 && c(strArrSplit[i6].trim());
            int i7 = aVar.g;
            boolean z3 = i7 != -1 && c(strArrSplit[i7].trim());
            int i8 = aVar.h;
            return new com.applovin.impl.zk(strTrim, iB, numD, fE, z, z2, z3, i8 != -1 && c(strArrSplit[i8].trim()));
        } catch (java.lang.RuntimeException e) {
            com.applovin.impl.oc.c("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    public static java.lang.Integer d(java.lang.String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = java.lang.Long.parseLong(str.substring(2), 16);
            } else {
                j = java.lang.Long.parseLong(str);
            }
            com.applovin.impl.b1.a(j <= androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE);
            return java.lang.Integer.valueOf(android.graphics.Color.argb(com.applovin.impl.tb.a(((j >> 24) & 255) ^ 255), com.applovin.impl.tb.a(j & 255), com.applovin.impl.tb.a((j >> 8) & 255), com.applovin.impl.tb.a((j >> 16) & 255)));
        } catch (java.lang.IllegalArgumentException e) {
            com.applovin.impl.oc.c("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float e(java.lang.String str) {
        try {
            return java.lang.Float.parseFloat(str);
        } catch (java.lang.NumberFormatException e) {
            com.applovin.impl.oc.c("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }

    private static boolean c(java.lang.String str) {
        try {
            int i = java.lang.Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (java.lang.NumberFormatException e) {
            com.applovin.impl.oc.c("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1575a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;

        private a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f1575a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
        }

        public static com.applovin.impl.zk.a a(java.lang.String str) {
            java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                java.lang.String lowerCase = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(strArrSplit[i9].trim());
                lowerCase.hashCode();
                lowerCase.hashCode();
                switch (lowerCase) {
                    case "italic":
                        i6 = i9;
                        break;
                    case "underline":
                        i7 = i9;
                        break;
                    case "strikeout":
                        i8 = i9;
                        break;
                    case "primarycolour":
                        i3 = i9;
                        break;
                    case "bold":
                        i5 = i9;
                        break;
                    case "name":
                        i = i9;
                        break;
                    case "fontsize":
                        i4 = i9;
                        break;
                    case "alignment":
                        i2 = i9;
                        break;
                }
            }
            if (i != -1) {
                return new com.applovin.impl.zk.a(i, i2, i3, i4, i5, i6, i7, i8, strArrSplit.length);
            }
            return null;
        }
    }

    static final class b {
        private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("\\{([^}]*)\\}");
        private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile(com.applovin.impl.xp.a("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final java.util.regex.Pattern e = java.util.regex.Pattern.compile(com.applovin.impl.xp.a("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final java.util.regex.Pattern f = java.util.regex.Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1576a;
        public final android.graphics.PointF b;

        private static int a(java.lang.String str) {
            java.util.regex.Matcher matcher = f.matcher(str);
            if (matcher.find()) {
                return com.applovin.impl.zk.b((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1)));
            }
            return -1;
        }

        private static android.graphics.PointF c(java.lang.String str) {
            java.lang.String strGroup;
            java.lang.String strGroup2;
            java.util.regex.Matcher matcher = d.matcher(str);
            java.util.regex.Matcher matcher2 = e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    com.applovin.impl.oc.c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new android.graphics.PointF(java.lang.Float.parseFloat(((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) strGroup)).trim()), java.lang.Float.parseFloat(((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) strGroup2)).trim()));
        }

        public static java.lang.String d(java.lang.String str) {
            return c.matcher(str).replaceAll("");
        }

        private b(int i, android.graphics.PointF pointF) {
            this.f1576a = i;
            this.b = pointF;
        }

        public static com.applovin.impl.zk.b b(java.lang.String str) {
            java.util.regex.Matcher matcher = c.matcher(str);
            android.graphics.PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                java.lang.String str2 = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1));
                try {
                    android.graphics.PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (java.lang.RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i = iA;
                    }
                } catch (java.lang.RuntimeException unused2) {
                }
            }
            return new com.applovin.impl.zk.b(i, pointF);
        }
    }
}
