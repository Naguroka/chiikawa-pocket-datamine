package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class tC {
    public static java.lang.String bg(android.content.Context context) {
        int iBg = com.bytedance.sdk.component.utils.rri.bg(context, 0L);
        if (iBg == 2) {
            return "2g";
        }
        if (iBg == 3) {
            return com.json.u8.f3464a;
        }
        if (iBg == 4) {
            return com.json.u8.b;
        }
        if (iBg != 5) {
            return iBg != 6 ? "mobile" : "5g";
        }
        return "4g";
    }
}
