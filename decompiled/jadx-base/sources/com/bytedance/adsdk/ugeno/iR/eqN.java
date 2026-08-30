package com.bytedance.adsdk.ugeno.iR;

/* JADX INFO: loaded from: classes3.dex */
public final class eqN {
    private static android.content.res.Resources IL;
    private static android.content.Context bX;
    private static java.lang.String bg;

    public static void bg(java.lang.String str) {
        bg = str;
    }

    private static java.lang.String bg(android.content.Context context) {
        if (bg == null) {
            bg = context.getPackageName();
        }
        return bg;
    }

    private static int bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (IL == null) {
            IL = context.getResources();
        }
        return IL.getIdentifier(str, str2, bg(context));
    }

    public static int bg(android.content.Context context, java.lang.String str) {
        return bg(context, str, "drawable");
    }
}
