package com.bytedance.sdk.openadsdk.core.PX.bX;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private final java.util.Map<com.bytedance.sdk.openadsdk.core.PX.bX.IL, java.lang.String> IL;
    private final java.util.List<java.lang.String> bg;

    public bX(java.util.List<java.lang.String> list) {
        this.bg = list;
        java.util.HashMap map = new java.util.HashMap();
        this.IL = map;
        map.put(com.bytedance.sdk.openadsdk.core.PX.bX.IL.CACHEBUSTING, IL());
    }

    public java.util.List<java.lang.String> bg() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String strReplaceAll : this.bg) {
            if (!android.text.TextUtils.isEmpty(strReplaceAll)) {
                for (com.bytedance.sdk.openadsdk.core.PX.bX.IL il : com.bytedance.sdk.openadsdk.core.PX.bX.IL.values()) {
                    java.lang.String str = this.IL.get(il);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = strReplaceAll.replaceAll("\\[" + il.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    public com.bytedance.sdk.openadsdk.core.PX.bX.bX bg(com.bytedance.sdk.openadsdk.core.PX.bg.bg bgVar) {
        if (bgVar != null) {
            this.IL.put(com.bytedance.sdk.openadsdk.core.PX.bX.IL.ERRORCODE, bgVar.bg());
        }
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.PX.bX.bX bg(long j) {
        if (j >= 0) {
            java.lang.String strIL = IL(j);
            if (!android.text.TextUtils.isEmpty(strIL)) {
                this.IL.put(com.bytedance.sdk.openadsdk.core.PX.bX.IL.CONTENTPLAYHEAD, strIL);
            }
        }
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.PX.bX.bX bg(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                str = java.net.URLEncoder.encode(str, com.adjust.sdk.Constants.ENCODING);
            } catch (java.lang.Throwable unused) {
            }
            this.IL.put(com.bytedance.sdk.openadsdk.core.PX.bX.IL.ASSETURI, str);
        }
        return this;
    }

    private java.lang.String IL() {
        return java.lang.String.format(java.util.Locale.US, "%08d", java.lang.Long.valueOf(java.lang.Math.round(java.lang.Math.random() * 1.0E8d)));
    }

    private java.lang.String IL(long j) {
        return java.lang.String.format(java.util.Locale.getDefault(), "%02d:%02d:%02d.%03d", java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toHours(j)), java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(j) % java.util.concurrent.TimeUnit.HOURS.toMinutes(1L)), java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j) % java.util.concurrent.TimeUnit.MINUTES.toSeconds(1L)), java.lang.Long.valueOf(j % 1000));
    }
}
