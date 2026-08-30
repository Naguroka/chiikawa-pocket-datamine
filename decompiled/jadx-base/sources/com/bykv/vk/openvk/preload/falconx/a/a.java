package com.bykv.vk.openvk.preload.falconx.a;

/* JADX INFO: compiled from: WebResourceUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.Class<? extends com.bykv.vk.openvk.preload.b.d<?, ?>>, com.bykv.vk.openvk.preload.b.b.b> f1706a = new java.util.HashMap();

    public static android.webkit.WebResourceResponse a(java.io.InputStream inputStream, java.util.Map<java.lang.String, java.lang.String> map) {
        if (inputStream == null) {
            return null;
        }
        try {
            java.lang.String strReplace = map.get("content-type");
            java.lang.String[] strArrSplit = new java.lang.String[0];
            if (android.text.TextUtils.isEmpty(strReplace)) {
                strReplace = map.get("Content-Type");
            }
            if (!android.text.TextUtils.isEmpty(strReplace) && strReplace != null) {
                strReplace = strReplace.replace(" ", "");
                strArrSplit = strReplace.split(";");
            }
            java.lang.String str = "";
            java.lang.String strSubstring = str;
            for (java.lang.String str2 : strArrSplit) {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    int iIndexOf = str2.indexOf(com.ironsource.y8.i.b);
                    if (iIndexOf == -1) {
                        str = str2;
                    } else if (str2.contains(com.json.zb.M)) {
                        strSubstring = str2.substring(iIndexOf + 1);
                    }
                }
            }
            if (strReplace != null ? strReplace.contains("font/ttf") : false) {
                return new android.webkit.WebResourceResponse(str, strSubstring, 200, "OK", map, inputStream);
            }
            android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse(str, strSubstring, inputStream);
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        } catch (java.lang.Throwable th) {
            android.util.Log.e("WebResourceUtils", "getResponseWithHeaders error", th);
            return null;
        }
    }

    public final void a(java.lang.Class<? extends com.bykv.vk.openvk.preload.b.d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        synchronized (this.f1706a) {
            com.bykv.vk.openvk.preload.b.b.b bVar = this.f1706a.get(cls);
            if (bVar == null) {
                bVar = new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[0]);
                this.f1706a.put(cls, bVar);
            }
            bVar.a(aVar);
        }
    }

    public final com.bykv.vk.openvk.preload.b.b.a a(java.lang.Class<? extends com.bykv.vk.openvk.preload.b.d<?, ?>> cls) {
        com.bykv.vk.openvk.preload.b.b.b bVar;
        synchronized (this.f1706a) {
            bVar = this.f1706a.get(cls);
        }
        return bVar;
    }

    public static <T> T a(T t) {
        t.getClass();
        return t;
    }

    public static void a(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static java.text.DateFormat a(int i, int i2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i != 3) {
                throw new java.lang.IllegalArgumentException("Unknown DateFormat style: ".concat(java.lang.String.valueOf(i)));
            }
            str = "M/d/yy";
        }
        java.lang.StringBuilder sbAppend = sb.append(str).append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalArgumentException("Unknown DateFormat style: ".concat(java.lang.String.valueOf(i2)));
            }
            str2 = "h:mm a";
        }
        return new java.text.SimpleDateFormat(sbAppend.append(str2).toString(), java.util.Locale.US);
    }

    public static com.bykv.vk.openvk.preload.a.h a(com.bykv.vk.openvk.preload.a.d.a aVar) throws com.bykv.vk.openvk.preload.a.l {
        boolean z;
        try {
            try {
                aVar.f();
                z = false;
                try {
                    return com.bykv.vk.openvk.preload.a.b.a.m.A.a(aVar);
                } catch (java.io.EOFException e) {
                    e = e;
                    if (z) {
                        return com.bykv.vk.openvk.preload.a.j.f1691a;
                    }
                    throw new com.bykv.vk.openvk.preload.a.o(e);
                }
            } catch (java.io.EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (com.bykv.vk.openvk.preload.a.d.d e3) {
            throw new com.bykv.vk.openvk.preload.a.o(e3);
        } catch (java.io.IOException e4) {
            throw new com.bykv.vk.openvk.preload.a.i(e4);
        } catch (java.lang.NumberFormatException e5) {
            throw new com.bykv.vk.openvk.preload.a.o(e5);
        }
    }

    public static void a(com.bykv.vk.openvk.preload.a.h hVar, com.bykv.vk.openvk.preload.a.d.c cVar) throws java.io.IOException {
        com.bykv.vk.openvk.preload.a.b.a.m.A.a(cVar, hVar);
    }
}
