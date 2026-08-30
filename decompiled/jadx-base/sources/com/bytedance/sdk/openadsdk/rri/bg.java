package com.bytedance.sdk.openadsdk.rri;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    private static int bg(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5 && i != 15) {
                        return -1;
                    }
                }
            }
        }
        return i2;
    }

    public static java.util.List<java.lang.String> bg(java.util.List<java.lang.String> list, boolean z) {
        java.lang.String strBg = com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        if (list == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                next = next.replace("{TS}", java.lang.String.valueOf(jCurrentTimeMillis)).replace("__TS__", java.lang.String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !android.text.TextUtils.isEmpty(strBg)) {
                next = next.replace("{UID}", strBg).replace("__UID__", strBg);
            }
            if (z) {
                next = bg(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static java.lang.String bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", java.lang.String.valueOf(new java.security.SecureRandom().nextLong())).replace("[ss_timestamp]", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TrackAdUrlUtils", e.getMessage());
            return str;
        }
    }

    public static java.util.List<java.lang.String> bg(java.util.List<java.lang.String> list, boolean z, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        java.lang.String strBg = com.bytedance.sdk.openadsdk.core.PX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        if (list == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                next = next.replace("{TS}", java.lang.String.valueOf(jCurrentTimeMillis)).replace("__TS__", java.lang.String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !android.text.TextUtils.isEmpty(strBg)) {
                next = next.replace("{UID}", strBg).replace("__UID__", strBg);
            }
            if (next.contains("__CID__") && tuv != null && !android.text.TextUtils.isEmpty(tuv.Ys())) {
                next = next.replace("__CID__", tuv.Ys());
            }
            if (next.contains("__CTYPE__") && tuv != null) {
                next = next.replace("__CTYPE__", java.lang.String.valueOf(bg(tuv.bOf())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg.bg().IL());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", java.net.URLEncoder.encode(com.bytedance.sdk.openadsdk.utils.ayS.bX()));
            }
            if (z) {
                next = bg(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
