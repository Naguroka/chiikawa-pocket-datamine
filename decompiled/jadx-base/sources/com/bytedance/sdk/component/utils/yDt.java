package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class yDt {
    private static volatile com.bytedance.sdk.component.utils.yDt bX;
    private volatile boolean IL = false;
    private java.util.Map<java.lang.String, java.lang.String> bg;
    private android.content.Context eqN;

    public static java.lang.String bg(android.content.Context context, java.lang.String str) {
        if (str != null) {
            try {
                if (str.startsWith(androidx.webkit.ProxyConfig.MATCH_HTTP) && str.contains("?")) {
                    str = str.split("\\?")[0];
                    if (str.endsWith("/")) {
                        str = str.substring(0, str.length() - 1);
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return bg(context).bg(str);
    }

    static com.bytedance.sdk.component.utils.yDt bg(android.content.Context context) {
        if (bX == null) {
            synchronized (com.bytedance.sdk.component.utils.yDt.class) {
                if (bX == null) {
                    bX = new com.bytedance.sdk.component.utils.yDt(context);
                }
            }
        }
        return bX;
    }

    private yDt(android.content.Context context) {
        if (context != null && this.eqN == null) {
            this.eqN = context.getApplicationContext();
            bg();
        }
        this.eqN = context;
    }

    public final java.lang.String bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String strEqN = eqN(str);
        if (android.text.TextUtils.isEmpty(strEqN)) {
            return null;
        }
        return IL(strEqN);
    }

    private static java.lang.String IL(java.lang.String str) {
        java.lang.String strSubstring;
        int iIndexOf = str.indexOf(47);
        int iIndexOf2 = str.indexOf(59);
        if (iIndexOf < 0) {
            return null;
        }
        java.lang.String lowerCase = str.substring(0, iIndexOf).trim().toLowerCase(java.util.Locale.ENGLISH);
        if (!bX(lowerCase)) {
            return null;
        }
        int i = iIndexOf + 1;
        if (iIndexOf2 < 0) {
            strSubstring = str.substring(i);
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        java.lang.String lowerCase2 = strSubstring.trim().toLowerCase(java.util.Locale.ENGLISH);
        if (!bX(lowerCase2)) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(lowerCase.length() + lowerCase2.length() + 1);
        sb.append(lowerCase);
        sb.append('/');
        sb.append(lowerCase2);
        return sb.toString();
    }

    private static boolean bg(char c) {
        return c > ' ' && c < 127 && "()<>@,;:/[]?=\\\"".indexOf(c) < 0;
    }

    private static boolean bX(java.lang.String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!bg(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private java.lang.String eqN(java.lang.String str) {
        java.lang.String str2;
        java.lang.String strZx = zx(str);
        if (strZx.isEmpty()) {
            return null;
        }
        bg();
        java.util.Map<java.lang.String, java.lang.String> map = this.bg;
        if (map == null || map.isEmpty()) {
            return null;
        }
        do {
            str2 = this.bg.get(strZx);
            if (str2 == null) {
                strZx = zx(strZx);
            }
            if (str2 != null) {
                break;
            }
        } while (!strZx.isEmpty());
        return str2;
    }

    private static java.lang.String zx(java.lang.String str) {
        int iIndexOf;
        return (str == null || str.isEmpty() || (iIndexOf = str.indexOf(46)) < 0 || iIndexOf >= str.length() + (-1)) ? "" : str.substring(iIndexOf + 1);
    }

    private void bg() {
        if (this.eqN == null || this.IL) {
            return;
        }
        synchronized (this) {
            if (!this.IL) {
                java.util.List list = (java.util.List) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.util.List<java.lang.String>>() { // from class: com.bytedance.sdk.component.utils.yDt.1
                    @Override // java.security.PrivilegedAction
                    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
                    public java.util.List<java.lang.String> run() {
                        java.io.BufferedReader bufferedReader;
                        java.io.InputStream inputStream = null;
                        try {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.io.InputStream inputStreamOpen = com.bytedance.sdk.component.utils.yDt.this.eqN.getAssets().open("tt_mime_type.pro");
                            try {
                                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStreamOpen));
                                while (true) {
                                    try {
                                        java.lang.String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        if (!android.text.TextUtils.isEmpty(line)) {
                                            arrayList.add(line);
                                        }
                                    } catch (java.lang.Throwable unused) {
                                        inputStream = inputStreamOpen;
                                        try {
                                            return java.util.Collections.emptyList();
                                        } finally {
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (java.lang.Throwable unused2) {
                                                }
                                            }
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (java.lang.Throwable unused3) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (inputStreamOpen != null) {
                                    try {
                                        inputStreamOpen.close();
                                    } catch (java.lang.Throwable unused4) {
                                    }
                                }
                                try {
                                    bufferedReader.close();
                                } catch (java.lang.Throwable unused5) {
                                }
                                return arrayList;
                            } catch (java.lang.Throwable unused6) {
                                bufferedReader = null;
                            }
                        } catch (java.lang.Throwable unused7) {
                            bufferedReader = null;
                        }
                    }
                });
                this.bg = new java.util.HashMap(list.size());
                java.lang.String strSubstring = "";
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String str = strSubstring + ((java.lang.String) it.next());
                    if (str.endsWith("\\")) {
                        strSubstring = str.substring(0, str.length() - 1);
                    } else {
                        ldr(str);
                        strSubstring = "";
                    }
                }
                if (!strSubstring.isEmpty()) {
                    ldr(strSubstring);
                }
                this.IL = true;
            }
        }
    }

    private void ldr(java.lang.String str) {
        java.lang.String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return;
        }
        if (strTrim.charAt(0) == '#') {
            return;
        }
        java.lang.String strReplaceAll = strTrim.replaceAll("\\s*#.*", "");
        if (strReplaceAll.indexOf(61) > 0) {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\btype=(\"\\p{Graph}+?/\\p{Graph}+?\"|\\p{Graph}+/\\p{Graph}+\\b)").matcher(strReplaceAll);
            if (matcher.find()) {
                java.lang.String strSubstring = matcher.group().substring(5);
                if (strSubstring.charAt(0) == '\"') {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile("\\bexts=(\"[\\p{Graph}|\\p{Blank}]+?\"|\\p{Graph}+\\b)").matcher(strReplaceAll);
                if (matcher2.find()) {
                    java.lang.String strSubstring2 = matcher2.group().substring(5);
                    if (strSubstring2.charAt(0) == '\"') {
                        strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                    }
                    for (java.lang.String str2 : strSubstring2.split("[\\p{Blank}|\\p{Punct}]+")) {
                        bg(str2, strSubstring);
                    }
                    return;
                }
                return;
            }
            return;
        }
        java.lang.String[] strArrSplit = strReplaceAll.split("\\s+");
        for (int i = 1; i < strArrSplit.length; i++) {
            bg(strArrSplit[i], strArrSplit[0]);
        }
    }

    private void bg(java.lang.String str, java.lang.String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || this.bg.containsKey(str)) {
            return;
        }
        this.bg.put(str, str2);
    }
}
