package com.bykv.vk.openvk.bg.bg.IL.bX;

/* JADX INFO: loaded from: classes3.dex */
public final class bg {
    private static final android.os.Handler IL = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final java.nio.charset.Charset bg = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);

    public static void bg(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void bg(java.net.ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void bg(java.net.Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void bg(java.io.RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static boolean bg(java.lang.String str) {
        if (str != null) {
            return str.startsWith("http://") || str.startsWith("https://");
        }
        return false;
    }

    public static int IL(java.lang.String str) {
        return bg(str, 0);
    }

    public static int bg(java.lang.String str, int i) {
        if (android.text.TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return i;
        }
    }

    public static java.lang.String bg(com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg bgVar, int i) {
        int iBg;
        if (bgVar == null || !bgVar.IL()) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(bgVar.zx().toUpperCase()).append(' ').append(bgVar.bg()).append(' ').append(bgVar.ldr()).append("\r\n");
        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
            android.util.Log.i("TAG_PROXY_headers", bgVar.zx().toUpperCase() + " " + bgVar.bg() + " " + bgVar.ldr());
        }
        java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> listBg = bg(bgVar.bX());
        boolean z = true;
        if (listBg != null) {
            int size = listBg.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL il = listBg.get(i2);
                if (il != null) {
                    java.lang.String str = il.bg;
                    java.lang.String str2 = il.IL;
                    sb.append(str).append(": ").append(str2).append("\r\n");
                    if (com.google.common.net.HttpHeaders.CONTENT_RANGE.equalsIgnoreCase(str) || (com.google.common.net.HttpHeaders.ACCEPT_RANGES.equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z = false;
                    }
                }
            }
        }
        if (z && (iBg = bg(bgVar)) > 0) {
            sb.append("Content-Range: bytes ").append(java.lang.Math.max(i, 0)).append("-").append(iBg - 1).append("/").append(iBg).append("\r\n");
        }
        sb.append("Connection: close\r\n\r\n");
        java.lang.String string = sb.toString();
        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
            android.util.Log.i("TAG_PROXY_WRITE_TO_MP", string);
        }
        return string;
    }

    public static java.lang.String bg(int i, int i2) {
        java.lang.String strIL = IL(i, i2);
        if (strIL == null) {
            return null;
        }
        return "bytes=".concat(java.lang.String.valueOf(strIL));
    }

    public static java.lang.String IL(int i, int i2) {
        if (i >= 0 && i2 > 0) {
            return i + "-" + i2;
        }
        if (i > 0) {
            return i + "-";
        }
        if (i >= 0 || i2 <= 0) {
            return null;
        }
        return "-".concat(java.lang.String.valueOf(i2));
    }

    public static java.util.List<java.lang.String> bg(java.lang.String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            if (bg(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static java.lang.String bg(com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVar, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (i <= 0) {
            sb.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb.append("Accept-Ranges: bytes\r\nContent-Type: ");
        sb.append(bgVar.IL).append("\r\n");
        if (i <= 0) {
            sb.append("Content-Length: ").append(bgVar.bX).append("\r\n");
        } else {
            sb.append("Content-Range: bytes ").append(i).append("-").append(bgVar.bX - 1).append("/").append(bgVar.bX).append("\r\nContent-Length: ");
            sb.append(bgVar.bX - i).append("\r\n");
        }
        sb.append("Connection: close\r\n\r\n");
        java.lang.String string = sb.toString();
        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
            android.util.Log.i("TAG_PROXY_WRITE_TO_MP", string);
        }
        return string;
    }

    public static int bg() {
        return java.lang.Math.max(java.lang.Runtime.getRuntime().availableProcessors(), 1);
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.bg.bg.IL.bX.bg$1, reason: invalid class name */
    static class AnonymousClass1 implements java.io.FilenameFilter {
        private java.util.regex.Pattern bg = java.util.regex.Pattern.compile("^cpu[0-9]+$");

        AnonymousClass1() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            return this.bg.matcher(str).matches();
        }
    }

    public static int bg(com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg bgVar) {
        int iLastIndexOf;
        if (bgVar == null) {
            return -1;
        }
        if (bgVar.bg() == 200) {
            return bg(bgVar.bg(com.google.common.net.HttpHeaders.CONTENT_LENGTH, null), -1);
        }
        if (bgVar.bg() == 206) {
            java.lang.String strBg = bgVar.bg(com.google.common.net.HttpHeaders.CONTENT_RANGE, null);
            if (!android.text.TextUtils.isEmpty(strBg) && (iLastIndexOf = strBg.lastIndexOf("/")) >= 0 && iLastIndexOf < strBg.length() - 1) {
                return bg(strBg.substring(iLastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    public static java.lang.String bg(com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg bgVar, boolean z, boolean z2) {
        java.lang.String strBg;
        if (bgVar == null) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_Response", "response null");
            }
            return "response null";
        }
        if (!bgVar.IL()) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_Response", "response code: " + bgVar.bg());
            }
            return "response code: " + bgVar.bg();
        }
        java.lang.String strBg2 = bgVar.bg("Content-Type", null);
        if (!bX(strBg2)) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_Response", "Content-Type: ".concat(java.lang.String.valueOf(strBg2)));
            }
            return "Content-Type: ".concat(java.lang.String.valueOf(strBg2));
        }
        int iBg = bg(bgVar);
        if (iBg <= 0) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_Response", "Content-Length: ".concat(java.lang.String.valueOf(iBg)));
            }
            return "Content-Length: ".concat(java.lang.String.valueOf(iBg));
        }
        if (z && ((strBg = bgVar.bg(com.google.common.net.HttpHeaders.ACCEPT_RANGES, null)) == null || !strBg.contains("bytes"))) {
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_Response", "Accept-Ranges: ".concat(java.lang.String.valueOf(strBg)));
            }
            return "Accept-Ranges: ".concat(java.lang.String.valueOf(strBg));
        }
        if (!z2 || bgVar.eqN() != null) {
            return null;
        }
        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
            android.util.Log.e("TAG_PROXY_Response", "response body null");
        }
        return "response body null";
    }

    public static boolean bX(java.lang.String str) {
        if (str != null) {
            return str.startsWith("video/") || "application/octet-stream".equals(str) || "binary/octet-stream".equals(str);
        }
        return false;
    }

    public static boolean IL() {
        return java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread();
    }

    public static void bg(com.bytedance.sdk.component.Kg.Kg kg) {
        if (kg != null) {
            if (IL()) {
                com.bytedance.sdk.component.Kg.ldr.IL(kg);
                if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                    android.util.Log.e("TAG_PROXY_UTIL", "invoke in pool thread");
                    return;
                }
                return;
            }
            kg.run();
            if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
                android.util.Log.e("TAG_PROXY_UTIL", "invoke calling thread");
            }
        }
    }

    public static void bg(java.lang.Runnable runnable) {
        if (runnable != null) {
            if (IL()) {
                runnable.run();
            } else {
                IL.post(runnable);
            }
        }
    }

    public static java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> bg(java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL il = list.get(i);
                if (il != null) {
                    android.util.Log.i("TAG_PROXY_PRE_FILTER", il.bg + ": " + il.bg);
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL il2 : list) {
            if (com.google.common.net.HttpHeaders.HOST.equals(il2.bg) || com.google.common.net.HttpHeaders.KEEP_ALIVE.equals(il2.bg) || com.google.common.net.HttpHeaders.CONNECTION.equals(il2.bg) || "Proxy-Connection".equals(il2.bg)) {
                arrayList.add(il2);
            }
        }
        list.removeAll(arrayList);
        if (com.bykv.vk.openvk.bg.bg.IL.IL.zx.bX) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL il3 = list.get(i2);
                if (il3 != null) {
                    android.util.Log.i("TAG_PROXY_POST_FILTER", il3.bg + ": " + il3.IL);
                }
            }
        }
        return list;
    }

    public static java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> bg(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> setEntrySet = map.entrySet();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : setEntrySet) {
                    arrayList.add(new com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }

    public static com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bg(com.bykv.vk.openvk.bg.bg.IL.IL.zx.bg bgVar, com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX bXVar, java.lang.String str, int i) {
        java.lang.String strIL;
        java.lang.String str2;
        java.lang.String string;
        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVarBg = bXVar.bg(str, i);
        if (bgVarBg != null) {
            return bgVarBg;
        }
        int iBg = bg(bgVar);
        java.lang.String strBg = bgVar.bg("Content-Type", null);
        if (iBg <= 0 || android.text.TextUtils.isEmpty(strBg)) {
            return bgVarBg;
        }
        com.bykv.vk.openvk.bg.bg.IL.IL.zx.zx zxVarIR = bgVar.iR();
        if (zxVarIR != null) {
            str2 = zxVarIR.IL;
            strIL = IL(zxVarIR.zx);
        } else {
            strIL = "";
            str2 = strIL;
        }
        java.lang.String strIL2 = IL(bgVar.bX());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.REQUEST_URL, str2);
            jSONObject.put("requestHeaders", strIL);
            jSONObject.put("responseHeaders", strIL2);
            string = jSONObject.toString();
        } catch (java.lang.Throwable unused) {
            string = "";
        }
        com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg bgVar2 = new com.bykv.vk.openvk.bg.bg.IL.IL.IL.bg(str, strBg, iBg, i, string);
        bXVar.bg(bgVar2);
        return bgVar2;
    }

    public static java.lang.String IL(java.util.List<com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.bykv.vk.openvk.bg.bg.IL.IL.WR.IL il = list.get(0);
            if (il != null) {
                sb.append(il.bg).append(": ").append(il.IL).append("\r\n");
            }
        }
        return sb.toString();
    }

    public static java.lang.String IL(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            sb.append((java.lang.Object) entry.getKey()).append(": ").append((java.lang.Object) entry.getValue()).append("\r\n");
        }
        return sb.toString();
    }
}
