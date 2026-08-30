package com.bykv.vk.openvk.bg.bg.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
public class WR {
    public final java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> IL;
    public final com.bykv.vk.openvk.bg.bg.IL.IL.WR.bg bX;
    public final com.bykv.vk.openvk.bg.bg.IL.IL.WR.bX bg;

    public WR(com.bykv.vk.openvk.bg.bg.IL.IL.WR.bX bXVar, java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> list, com.bykv.vk.openvk.bg.bg.IL.IL.WR.bg bgVar) {
        this.bg = bXVar;
        this.IL = list;
        this.bX = bgVar;
    }

    public static com.bykv.vk.openvk.bg.bg.IL.IL.WR bg(java.io.InputStream inputStream) throws com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN, java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, com.bykv.vk.openvk.bg.bg.IL.bX.bg.bg));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.bykv.vk.openvk.bg.bg.IL.IL.WR.bX bXVarBg = null;
        while (true) {
            java.lang.String line = bufferedReader.readLine();
            if (android.text.TextUtils.isEmpty(line)) {
                break;
            }
            java.lang.String strTrim = line.trim();
            if (bXVarBg == null) {
                bXVarBg = com.bykv.vk.openvk.bg.bg.IL.IL.WR.bX.bg(strTrim);
            } else {
                arrayList.add(com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL.bg(strTrim));
            }
        }
        if (bXVarBg == null) {
            throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("request line is null");
        }
        return new com.bykv.vk.openvk.bg.bg.IL.IL.WR(bXVarBg, arrayList, com.bykv.vk.openvk.bg.bg.IL.IL.WR.bg.bg(bXVarBg, arrayList));
    }

    static final class bX {
        final java.lang.String IL;
        final java.lang.String bX;
        final java.lang.String bg;

        private bX(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.bg = str;
            this.IL = str2;
            this.bX = str3;
        }

        static com.bykv.vk.openvk.bg.bg.IL.IL.WR.bX bg(java.lang.String str) throws com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN {
            int iIndexOf = str.indexOf(32);
            if (iIndexOf == -1) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("request line format error, line: ".concat(java.lang.String.valueOf(str)));
            }
            int iLastIndexOf = str.lastIndexOf(32);
            if (iLastIndexOf <= iIndexOf) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("request line format error, line: ".concat(java.lang.String.valueOf(str)));
            }
            java.lang.String strTrim = str.substring(0, iIndexOf).trim();
            java.lang.String strTrim2 = str.substring(iIndexOf + 1, iLastIndexOf).trim();
            java.lang.String strTrim3 = str.substring(iLastIndexOf + 1).trim();
            if (strTrim.length() == 0 || strTrim2.length() == 0 || strTrim3.length() == 0) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("request line format error, line: ".concat(java.lang.String.valueOf(str)));
            }
            return new com.bykv.vk.openvk.bg.bg.IL.IL.WR.bX(strTrim, strTrim2, strTrim3);
        }

        public java.lang.String toString() {
            return "RequestLine{method='" + this.bg + "', path='" + this.IL + "', version='" + this.bX + "'}";
        }
    }

    public static final class IL {
        public final java.lang.String IL;
        public final java.lang.String bg;

        public IL(java.lang.String str, java.lang.String str2) {
            this.bg = str;
            this.IL = str2;
        }

        static com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL bg(java.lang.String str) throws com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf == -1) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("request header format error, header: ".concat(java.lang.String.valueOf(str)));
            }
            java.lang.String strTrim = str.substring(0, iIndexOf).trim();
            java.lang.String strTrim2 = str.substring(iIndexOf + 1).trim();
            if (strTrim.length() == 0 || strTrim2.length() == 0) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("request header format error, header: ".concat(java.lang.String.valueOf(str)));
            }
            return new com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL(strTrim, strTrim2);
        }

        public java.lang.String toString() {
            return "Header{name='" + this.bg + "', value='" + this.IL + "'}";
        }
    }

    static final class bg {
        final java.lang.String IL;
        final java.lang.String bX;
        final int bg;
        final int eqN;
        final java.util.List<java.lang.String> iR;
        final java.lang.String ldr;
        final int zx;

        private bg(int i, java.lang.String str, java.lang.String str2, int i2, int i3, java.lang.String str3, java.util.List<java.lang.String> list) {
            this.bg = i;
            this.IL = str;
            this.bX = str2;
            this.eqN = i2;
            this.zx = i3;
            this.ldr = str3;
            this.iR = list;
        }

        static com.bykv.vk.openvk.bg.bg.IL.IL.WR.bg bg(com.bykv.vk.openvk.bg.bg.IL.IL.WR.bX bXVar, java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> list) throws com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN {
            java.lang.String str;
            int i;
            int i2;
            int iIndexOf = bXVar.IL.indexOf("?");
            if (iIndexOf == -1) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("path format error, path: " + bXVar.IL);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str2 = null;
            java.lang.String strDecode = null;
            java.lang.String strDecode2 = null;
            int i3 = 0;
            for (java.lang.String str3 : bXVar.IL.substring(iIndexOf + 1).split(com.ironsource.y8.i.c)) {
                java.lang.String[] strArrSplit = str3.split(com.ironsource.y8.i.b);
                if (strArrSplit.length == 2) {
                    if ("rk".equals(strArrSplit[0])) {
                        strDecode = android.net.Uri.decode(strArrSplit[1]);
                    } else if ("k".equals(strArrSplit[0])) {
                        strDecode2 = android.net.Uri.decode(strArrSplit[1]);
                    } else if (strArrSplit[0].startsWith("u")) {
                        arrayList.add(android.net.Uri.decode(strArrSplit[1]));
                    } else if ("f".equals(strArrSplit[0]) && com.bykv.vk.openvk.bg.bg.IL.bX.bg.IL(strArrSplit[1]) == 1) {
                        i3 = 1;
                    }
                }
            }
            if (android.text.TextUtils.isEmpty(strDecode) || android.text.TextUtils.isEmpty(strDecode2)) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("rawKey or key is empty, path: " + bXVar.IL);
            }
            if (list != null) {
                i2 = 0;
                int i4 = 0;
                for (com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL il : list) {
                    if (il != null && com.google.common.net.HttpHeaders.RANGE.equalsIgnoreCase(il.bg)) {
                        int iIndexOf2 = il.IL.indexOf(com.ironsource.y8.i.b);
                        if (iIndexOf2 == -1) {
                            throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("Range format error, Range: " + il.IL);
                        }
                        if (!"bytes".equalsIgnoreCase(il.IL.substring(0, iIndexOf2).trim())) {
                            throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("Range format error, Range: " + il.IL);
                        }
                        java.lang.String strSubstring = il.IL.substring(iIndexOf2 + 1);
                        if (strSubstring.contains(",")) {
                            throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("Range format error, Range: " + il.IL);
                        }
                        int iIndexOf3 = strSubstring.indexOf("-");
                        if (iIndexOf3 == -1) {
                            throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("Range format error, Range: " + il.IL);
                        }
                        java.lang.String strTrim = strSubstring.substring(0, iIndexOf3).trim();
                        java.lang.String strTrim2 = strSubstring.substring(iIndexOf3 + 1).trim();
                        try {
                            if (strTrim.length() > 0) {
                                i2 = java.lang.Integer.parseInt(strTrim);
                            }
                            if (strTrim2.length() > 0 && i2 > (i4 = java.lang.Integer.parseInt(strTrim2))) {
                                throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("Range format error, Range: " + il.IL);
                            }
                            str2 = il.IL;
                        } catch (java.lang.NumberFormatException unused) {
                            throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("Range format error, Range: " + il.IL);
                        }
                    }
                }
                i = i4;
                str = str2;
            } else {
                str = null;
                i = 0;
                i2 = 0;
            }
            if (arrayList.isEmpty()) {
                throw new com.bykv.vk.openvk.bg.bg.IL.IL.WR.eqN("no url found: path: " + bXVar.IL);
            }
            return new com.bykv.vk.openvk.bg.bg.IL.IL.WR.bg(i3, strDecode, strDecode2, i2, i, str, arrayList);
        }

        public java.lang.String toString() {
            return "Extra{flag=" + this.bg + ", rawKey='" + this.IL + "', key='" + this.bX + "', from=" + this.eqN + ", to=" + this.zx + ", urls=" + this.iR + '}';
        }
    }

    static java.lang.String bg(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(512);
        java.lang.String strBg = null;
        do {
            if (strBg != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            strBg = bg(sb, str, str2, list);
        } while (strBg.length() > 3072);
        return strBg;
    }

    private static java.lang.String bg(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
        sb.delete(0, sb.length());
        sb.append("rk=").append(android.net.Uri.encode(str));
        sb.append("&k=").append(android.net.Uri.encode(str2));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("&u").append(i).append(com.ironsource.y8.i.b).append(android.net.Uri.encode(list.get(i)));
        }
        return sb.toString();
    }

    public java.lang.String toString() {
        return "Request{requestLine=" + this.bg + ", headers=" + this.IL + ", extra=" + this.bX + '}';
    }

    static final class eqN extends java.lang.Exception {
        eqN(java.lang.String str) {
            super(str);
        }
    }
}
