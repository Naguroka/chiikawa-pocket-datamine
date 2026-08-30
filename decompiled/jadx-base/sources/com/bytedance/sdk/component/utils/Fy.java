package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public final class Fy {
    private static java.lang.String IL = null;
    private static android.content.res.Resources bX = null;
    private static android.content.Context bg = null;
    private static java.lang.String eqN = null;
    private static boolean ldr = false;
    private static boolean zx = false;

    public static void bg(android.content.Context context) {
        bg = context;
    }

    public static void bg(java.lang.String str) {
        eqN = str;
    }

    private static java.lang.String eqN(android.content.Context context) {
        if (eqN == null) {
            eqN = context.getPackageName();
        }
        return eqN;
    }

    private static int bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
        int identifier = IL(context).getIdentifier(str, str2, eqN(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!zx) {
            bX(context);
            return IL(context).getIdentifier(str, str2, eqN(context));
        }
        return context.getResources().getIdentifier(str, str2, eqN(context));
    }

    public static java.lang.String bg(android.content.Context context, java.lang.String str) {
        return IL(context).getString(IL(context, str));
    }

    public static int IL(android.content.Context context, java.lang.String str) {
        return bg(context, str, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING);
    }

    public static android.graphics.drawable.Drawable bX(android.content.Context context, java.lang.String str) {
        try {
            return IL(context).getDrawable(eqN(context, str));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static int eqN(android.content.Context context, java.lang.String str) {
        try {
            return bg(context, str, "drawable");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public static int zx(android.content.Context context, java.lang.String str) {
        return bg(context, str, "id");
    }

    public static int ldr(android.content.Context context, java.lang.String str) {
        return bg(context, str, androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE);
    }

    public static int iR(android.content.Context context, java.lang.String str) {
        return IL(context).getColor(Kg(context, str));
    }

    public static int Kg(android.content.Context context, java.lang.String str) {
        return bg(context, str, "color");
    }

    public static int WR(android.content.Context context, java.lang.String str) {
        return bg(context, str, "anim");
    }

    public static android.content.res.Resources IL(android.content.Context context) {
        android.content.res.Resources resources = bX;
        if (resources == null) {
            resources = null;
        }
        android.content.Context context2 = bg;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static synchronized void bX(android.content.Context context) {
        try {
            if (android.text.TextUtils.isEmpty(IL)) {
                return;
            }
            android.content.res.Resources resources = context.getResources();
            bX = new android.content.res.Resources(IL(resources.getAssets(), IL + "/apk/base-1.apk"), resources.getDisplayMetrics(), resources.getConfiguration());
            eqN = context.getPackageName();
            zx = true;
        } catch (java.lang.Throwable th) {
            android.util.Log.e("ResourceHelp", "makePluginResources failed", th);
        }
    }

    private static android.content.res.AssetManager IL(android.content.res.AssetManager assetManager, java.lang.String str) {
        android.content.res.AssetManager assetManager2;
        try {
            if (assetManager.getClass().getName().equals("android.content.res.BaiduAssetManager")) {
                assetManager2 = (android.content.res.AssetManager) java.lang.Class.forName("android.content.res.BaiduAssetManager").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } else {
                assetManager2 = (android.content.res.AssetManager) android.content.res.AssetManager.class.newInstance();
            }
            bg(assetManager2, str);
            assetManager = assetManager2;
        } catch (java.lang.Exception unused) {
            bg(assetManager, str);
        }
        try {
            com.bytedance.sdk.component.utils.Ja.bg(assetManager, "ensureStringBlocks", new java.lang.Object[0]);
        } catch (java.lang.Exception unused2) {
        }
        return assetManager;
    }

    public static boolean bg(android.content.res.AssetManager assetManager, java.lang.String str) {
        java.lang.reflect.Method methodBg = com.bytedance.sdk.component.utils.Ja.bg((java.lang.Class<?>) android.content.res.AssetManager.class, "addAssetPath", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class});
        if (methodBg == null) {
            methodBg = com.bytedance.sdk.component.utils.Ja.bg((java.lang.Class<?>) android.content.res.AssetManager.class, "addAssetPath", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class});
        }
        if (methodBg != null) {
            int i = 3;
            while (true) {
                int i2 = i - 1;
                if (i < 0) {
                    break;
                }
                try {
                    if (((java.lang.Integer) methodBg.invoke(assetManager, str)).intValue() != 0) {
                        return true;
                    }
                    i = i2;
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return false;
    }
}
