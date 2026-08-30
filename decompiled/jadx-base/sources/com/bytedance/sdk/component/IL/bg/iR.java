package com.bytedance.sdk.component.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public final class iR {
    private static final char[] eqN = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final java.lang.String IL;
    private final java.util.List<java.lang.String> Kg;
    private final java.lang.String WR;
    final int bX;
    final java.lang.String bg;
    private final java.lang.String eo;
    private final java.util.List<java.lang.String> iR;
    private final java.lang.String ldr;
    private final java.lang.String zx;

    iR(com.bytedance.sdk.component.IL.bg.iR.bg bgVar) {
        this.bg = bgVar.bg;
        this.zx = bg(bgVar.IL, false);
        this.ldr = bg(bgVar.bX, false);
        this.IL = bgVar.eqN;
        this.bX = bgVar.bg();
        this.iR = bg(bgVar.ldr, false);
        this.Kg = bgVar.iR != null ? bg(bgVar.iR, true) : null;
        this.WR = bgVar.Kg != null ? bg(bgVar.Kg, false) : null;
        this.eo = bgVar.toString();
    }

    public java.net.URL bg() {
        try {
            return new java.net.URL(this.eo);
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public java.lang.String IL() {
        if (this.zx.isEmpty()) {
            return "";
        }
        int length = this.bg.length() + 3;
        java.lang.String str = this.eo;
        return this.eo.substring(length, com.bytedance.sdk.component.IL.bg.IL.WR.bg(str, length, str.length(), ":@"));
    }

    public java.lang.String bX() {
        if (this.ldr.isEmpty()) {
            return "";
        }
        return this.eo.substring(this.eo.indexOf(58, this.bg.length() + 3) + 1, this.eo.indexOf(64));
    }

    public static int bg(java.lang.String str) {
        if (str.equals(androidx.webkit.ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static void bg(java.lang.StringBuilder sb, java.util.List<java.lang.String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public java.util.List<java.lang.String> eqN() {
        int iIndexOf = this.eo.indexOf(47, this.bg.length() + 3);
        java.lang.String str = this.eo;
        int iBg = com.bytedance.sdk.component.IL.bg.IL.WR.bg(str, iIndexOf, str.length(), "?#");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (iIndexOf < iBg) {
            int i = iIndexOf + 1;
            int iBg2 = com.bytedance.sdk.component.IL.bg.IL.WR.bg(this.eo, i, iBg, '/');
            arrayList.add(this.eo.substring(i, iBg2));
            iIndexOf = iBg2;
        }
        return arrayList;
    }

    public java.lang.String zx() {
        if (this.Kg == null) {
            return null;
        }
        int iIndexOf = this.eo.indexOf(63) + 1;
        java.lang.String str = this.eo;
        return this.eo.substring(iIndexOf, com.bytedance.sdk.component.IL.bg.IL.WR.bg(str, iIndexOf, str.length(), '#'));
    }

    static void IL(java.lang.StringBuilder sb, java.util.List<java.lang.String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            java.lang.String str = list.get(i);
            java.lang.String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(kotlin.text.Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static java.util.List<java.lang.String> IL(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    public static com.bytedance.sdk.component.IL.bg.iR bX(java.lang.String str) {
        com.bytedance.sdk.component.IL.bg.iR.bg bgVar = new com.bytedance.sdk.component.IL.bg.iR.bg();
        if (bgVar.bg((com.bytedance.sdk.component.IL.bg.iR) null, str) == com.bytedance.sdk.component.IL.bg.iR.bg.EnumC0098bg.SUCCESS) {
            return bgVar.IL();
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.bytedance.sdk.component.IL.bg.iR) && ((com.bytedance.sdk.component.IL.bg.iR) obj).eo.equals(this.eo);
    }

    public int hashCode() {
        return this.eo.hashCode();
    }

    public java.lang.String toString() {
        return this.eo;
    }

    public static final class bg {
        java.lang.String Kg;
        java.lang.String bg;
        java.lang.String eqN;
        java.util.List<java.lang.String> iR;
        final java.util.List<java.lang.String> ldr;
        java.lang.String IL = "";
        java.lang.String bX = "";
        int zx = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.IL.bg.iR$bg$bg, reason: collision with other inner class name */
        enum EnumC0098bg {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public bg() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.ldr = arrayList;
            arrayList.add("");
        }

        public com.bytedance.sdk.component.IL.bg.iR.bg bg(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase(androidx.webkit.ProxyConfig.MATCH_HTTP)) {
                this.bg = androidx.webkit.ProxyConfig.MATCH_HTTP;
            } else if (str.equalsIgnoreCase("https")) {
                this.bg = "https";
            } else {
                throw new java.lang.IllegalArgumentException("unexpected scheme: ".concat(java.lang.String.valueOf(str)));
            }
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.iR.bg IL(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("host == null");
            }
            java.lang.String strZx = zx(str, 0, str.length());
            if (strZx == null) {
                throw new java.lang.IllegalArgumentException("unexpected host: ".concat(java.lang.String.valueOf(str)));
            }
            this.eqN = strZx;
            return this;
        }

        int bg() {
            int i = this.zx;
            return i != -1 ? i : com.bytedance.sdk.component.IL.bg.iR.bg(this.bg);
        }

        public com.bytedance.sdk.component.IL.bg.iR.bg bX(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("encodedPathSegments == null");
            }
            return bg(str, true);
        }

        private com.bytedance.sdk.component.IL.bg.iR.bg bg(java.lang.String str, boolean z) {
            int i = 0;
            do {
                int iBg = com.bytedance.sdk.component.IL.bg.IL.WR.bg(str, i, str.length(), "/\\");
                bg(str, i, iBg, iBg < str.length(), z);
                i = iBg + 1;
            } while (i <= str.length());
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.iR.bg eqN(java.lang.String str) {
            this.iR = str != null ? com.bytedance.sdk.component.IL.bg.iR.IL(com.bytedance.sdk.component.IL.bg.iR.bg(str, okhttp3.HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.iR.bg bg(java.lang.String str, java.lang.String str2) {
            if (str == null) {
                throw new java.lang.NullPointerException("encodedName == null");
            }
            if (this.iR == null) {
                this.iR = new java.util.ArrayList();
            }
            this.iR.add(com.bytedance.sdk.component.IL.bg.iR.bg(str, okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true));
            this.iR.add(str2 != null ? com.bytedance.sdk.component.IL.bg.iR.bg(str2, okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true) : null);
            return this;
        }

        public com.bytedance.sdk.component.IL.bg.iR IL() {
            if (this.bg == null) {
                throw new java.lang.IllegalStateException("scheme == null");
            }
            if (this.eqN == null) {
                throw new java.lang.IllegalStateException("host == null");
            }
            return new com.bytedance.sdk.component.IL.bg.iR(this);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.bg);
            sb.append("://");
            if (!this.IL.isEmpty() || !this.bX.isEmpty()) {
                sb.append(this.IL);
                if (!this.bX.isEmpty()) {
                    sb.append(':');
                    sb.append(this.bX);
                }
                sb.append('@');
            }
            if (this.eqN.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.eqN);
                sb.append(']');
            } else {
                sb.append(this.eqN);
            }
            int iBg = bg();
            if (iBg != com.bytedance.sdk.component.IL.bg.iR.bg(this.bg)) {
                sb.append(':');
                sb.append(iBg);
            }
            com.bytedance.sdk.component.IL.bg.iR.bg(sb, this.ldr);
            if (this.iR != null) {
                sb.append('?');
                com.bytedance.sdk.component.IL.bg.iR.IL(sb, this.iR);
            }
            if (this.Kg != null) {
                sb.append('#');
                sb.append(this.Kg);
            }
            return sb.toString();
        }

        com.bytedance.sdk.component.IL.bg.iR.bg.EnumC0098bg bg(com.bytedance.sdk.component.IL.bg.iR iRVar, java.lang.String str) {
            int iBg;
            int i;
            int iBg2 = com.bytedance.sdk.component.IL.bg.IL.WR.bg(str, 0, str.length());
            int iIL = com.bytedance.sdk.component.IL.bg.IL.WR.IL(str, iBg2, str.length());
            if (IL(str, iBg2, iIL) != -1) {
                if (str.regionMatches(true, iBg2, "https:", 0, 6)) {
                    this.bg = "https";
                    iBg2 += 6;
                } else if (str.regionMatches(true, iBg2, "http:", 0, 5)) {
                    this.bg = androidx.webkit.ProxyConfig.MATCH_HTTP;
                    iBg2 += 5;
                } else {
                    return com.bytedance.sdk.component.IL.bg.iR.bg.EnumC0098bg.UNSUPPORTED_SCHEME;
                }
            } else if (iRVar != null) {
                this.bg = iRVar.bg;
            } else {
                return com.bytedance.sdk.component.IL.bg.iR.bg.EnumC0098bg.MISSING_SCHEME;
            }
            int iBX = bX(str, iBg2, iIL);
            char c = '?';
            char c2 = '#';
            if (iBX >= 2 || iRVar == null || !iRVar.bg.equals(this.bg)) {
                boolean z = false;
                boolean z2 = false;
                int i2 = iBg2 + iBX;
                while (true) {
                    iBg = com.bytedance.sdk.component.IL.bg.IL.WR.bg(str, i2, iIL, "@/\\?#");
                    byte bCharAt = iBg != iIL ? str.charAt(iBg) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c2 || bCharAt == 47 || bCharAt == 92 || bCharAt == c) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z) {
                            int iBg3 = com.bytedance.sdk.component.IL.bg.IL.WR.bg(str, i2, iBg, ':');
                            i = iBg;
                            java.lang.String strBg = com.bytedance.sdk.component.IL.bg.iR.bg(str, i2, iBg3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strBg = this.IL + "%40" + strBg;
                            }
                            this.IL = strBg;
                            if (iBg3 != i) {
                                this.bX = com.bytedance.sdk.component.IL.bg.iR.bg(str, iBg3 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = iBg;
                            this.bX += "%40" + com.bytedance.sdk.component.IL.bg.iR.bg(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i2 = i + 1;
                        c = '?';
                        c2 = '#';
                    }
                }
                int iEqN = eqN(str, i2, iBg);
                int i3 = iEqN + 1;
                if (i3 < iBg) {
                    this.eqN = zx(str, i2, iEqN);
                    int iLdr = ldr(str, i3, iBg);
                    this.zx = iLdr;
                    if (iLdr == -1) {
                        return com.bytedance.sdk.component.IL.bg.iR.bg.EnumC0098bg.INVALID_PORT;
                    }
                } else {
                    this.eqN = zx(str, i2, iEqN);
                    this.zx = com.bytedance.sdk.component.IL.bg.iR.bg(this.bg);
                }
                if (this.eqN == null) {
                    return com.bytedance.sdk.component.IL.bg.iR.bg.EnumC0098bg.INVALID_HOST;
                }
                iBg2 = iBg;
            } else {
                this.IL = iRVar.IL();
                this.bX = iRVar.bX();
                this.eqN = iRVar.IL;
                this.zx = iRVar.bX;
                this.ldr.clear();
                this.ldr.addAll(iRVar.eqN());
                if (iBg2 == iIL || str.charAt(iBg2) == '#') {
                    eqN(iRVar.zx());
                }
            }
            int iBg4 = com.bytedance.sdk.component.IL.bg.IL.WR.bg(str, iBg2, iIL, "?#");
            bg(str, iBg2, iBg4);
            if (iBg4 < iIL && str.charAt(iBg4) == '?') {
                int iBg5 = com.bytedance.sdk.component.IL.bg.IL.WR.bg(str, iBg4, iIL, '#');
                this.iR = com.bytedance.sdk.component.IL.bg.iR.IL(com.bytedance.sdk.component.IL.bg.iR.bg(str, iBg4 + 1, iBg5, okhttp3.HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                iBg4 = iBg5;
            }
            if (iBg4 < iIL && str.charAt(iBg4) == '#') {
                this.Kg = com.bytedance.sdk.component.IL.bg.iR.bg(str, 1 + iBg4, iIL, "", true, false, false, false, null);
            }
            return com.bytedance.sdk.component.IL.bg.iR.bg.EnumC0098bg.SUCCESS;
        }

        private void bg(java.lang.String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.ldr.clear();
                this.ldr.add("");
                i++;
            } else {
                java.util.List<java.lang.String> list = this.ldr;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return;
                }
                i = com.bytedance.sdk.component.IL.bg.IL.WR.bg(str, i3, i2, "/\\");
                boolean z = i < i2;
                bg(str, i3, i, z, true);
                if (z) {
                    i++;
                }
            }
        }

        private void bg(java.lang.String str, int i, int i2, boolean z, boolean z2) {
            java.lang.String strBg = com.bytedance.sdk.component.IL.bg.iR.bg(str, i, i2, okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, true, null);
            if (zx(strBg)) {
                return;
            }
            if (ldr(strBg)) {
                bX();
                return;
            }
            java.util.List<java.lang.String> list = this.ldr;
            if (list.get(list.size() - 1).isEmpty()) {
                java.util.List<java.lang.String> list2 = this.ldr;
                list2.set(list2.size() - 1, strBg);
            } else {
                this.ldr.add(strBg);
            }
            if (z) {
                this.ldr.add("");
            }
        }

        private boolean zx(java.lang.String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean ldr(java.lang.String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void bX() {
            java.util.List<java.lang.String> list = this.ldr;
            if (list.remove(list.size() - 1).isEmpty() && !this.ldr.isEmpty()) {
                java.util.List<java.lang.String> list2 = this.ldr;
                list2.set(list2.size() - 1, "");
            } else {
                this.ldr.add("");
            }
        }

        private static int IL(java.lang.String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int bX(java.lang.String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private static int eqN(java.lang.String str, int i, int i2) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ':') {
                    return i;
                }
                if (cCharAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static java.lang.String zx(java.lang.String str, int i, int i2) {
            return com.bytedance.sdk.component.IL.bg.IL.WR.bg(com.bytedance.sdk.component.IL.bg.iR.bg(str, i, i2, false));
        }

        private static int ldr(java.lang.String str, int i, int i2) {
            try {
                int i3 = java.lang.Integer.parseInt(com.bytedance.sdk.component.IL.bg.iR.bg(str, i, i2, "", false, false, false, true, null));
                if (i3 <= 0 || i3 > 65535) {
                    return -1;
                }
                return i3;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
    }

    static java.lang.String bg(java.lang.String str, boolean z) {
        return bg(str, 0, str.length(), z);
    }

    private java.util.List<java.lang.String> bg(java.util.List<java.lang.String> list, boolean z) {
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            java.lang.String str = list.get(i);
            arrayList.add(str != null ? bg(str, z) : null);
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    static java.lang.String bg(java.lang.String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                com.bytedance.sdk.component.IL.bg.IL.bg bgVar = new com.bytedance.sdk.component.IL.bg.IL.bg();
                bgVar.bg(str, i, i3);
                bg(bgVar, str, i3, i2, z);
                return bgVar.bX();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    static void bg(com.bytedance.sdk.component.IL.bg.IL.bg bgVar, java.lang.String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iBg = com.bytedance.sdk.component.IL.bg.IL.WR.bg(str.charAt(i + 1));
                int iBg2 = com.bytedance.sdk.component.IL.bg.IL.WR.bg(str.charAt(i3));
                if (iBg != -1 && iBg2 != -1) {
                    bgVar.IL((iBg << 4) + iBg2);
                    i = i3;
                } else {
                    bgVar.bg(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z) {
                bgVar.IL(32);
            } else {
                bgVar.bg(iCodePointAt);
            }
            i += java.lang.Character.charCount(iCodePointAt);
        }
    }

    static boolean bg(java.lang.String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && com.bytedance.sdk.component.IL.bg.IL.WR.bg(str.charAt(i + 1)) != -1 && com.bytedance.sdk.component.IL.bg.IL.WR.bg(str.charAt(i3)) != -1;
    }

    static java.lang.String bg(java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || !z4)) {
                if (str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || bg(str, iCharCount, i2)))) && (iCodePointAt != 43 || !z3))) {
                    iCharCount += java.lang.Character.charCount(iCodePointAt);
                }
            }
            com.bytedance.sdk.component.IL.bg.IL.bg bgVar = new com.bytedance.sdk.component.IL.bg.IL.bg();
            bgVar.bg(str, i, iCharCount);
            bg(bgVar, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
            return bgVar.bX();
        }
        return str.substring(i, i2);
    }

    static void bg(com.bytedance.sdk.component.IL.bg.IL.bg bgVar, java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset) {
        com.bytedance.sdk.component.IL.bg.IL.bg bgVar2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    bgVar.bg(z ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z || (z2 && !bg(str, i, i2)))))) {
                    if (bgVar2 == null) {
                        bgVar2 = new com.bytedance.sdk.component.IL.bg.IL.bg();
                    }
                    if (charset == null || charset.equals(com.bytedance.sdk.component.IL.bg.IL.WR.bg)) {
                        bgVar2.bg(iCodePointAt);
                    } else {
                        bgVar2.bg(str, i, java.lang.Character.charCount(iCodePointAt) + i, charset);
                    }
                    while (!bgVar2.bg()) {
                        int iIL = bgVar2.IL() & 255;
                        bgVar.IL(37);
                        char[] cArr = eqN;
                        bgVar.IL((int) cArr[(iIL >> 4) & 15]);
                        bgVar.IL((int) cArr[iIL & 15]);
                    }
                } else {
                    bgVar.bg(iCodePointAt);
                }
            }
            i += java.lang.Character.charCount(iCodePointAt);
        }
    }

    static java.lang.String bg(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return bg(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
