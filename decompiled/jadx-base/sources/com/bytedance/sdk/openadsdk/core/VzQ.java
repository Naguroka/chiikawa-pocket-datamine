package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class VzQ {
    private static volatile com.bytedance.sdk.openadsdk.core.Fy<com.bytedance.sdk.openadsdk.eqN.bg> IL = null;
    private static int bX = -1;
    private static volatile android.content.Context bg;

    public static android.content.Context bg() {
        if (bg == null) {
            IL(null);
        }
        return bg;
    }

    public static android.content.Context bg(android.content.Context context) {
        if (context == null) {
            context = bg();
        }
        if (context instanceof android.app.Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static void IL(android.content.Context context) {
        if (bg == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.VzQ.class) {
                if (bg == null) {
                    if (context != null) {
                        bg = context;
                        android.content.Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            bg = applicationContext;
                        }
                        return;
                    }
                    try {
                        android.app.Application applicationBg = com.bytedance.sdk.openadsdk.core.VzQ.bg.bg();
                        if (applicationBg != null) {
                            bg = applicationBg;
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
        }
    }

    public static int IL() {
        android.content.Context contextBg;
        if (bX < 0 && (contextBg = bg()) != null) {
            bX = android.view.ViewConfiguration.get(contextBg).getScaledTouchSlop();
        }
        return bX;
    }

    public static com.bytedance.sdk.openadsdk.core.Fy<com.bytedance.sdk.openadsdk.eqN.bg> bX() {
        if (IL == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.VzQ.class) {
                if (IL == null) {
                    IL = new com.bytedance.sdk.openadsdk.core.LZ(bg);
                }
            }
        }
        return IL;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.ldr eqN() {
        return com.bytedance.sdk.openadsdk.core.settings.xxp.zU();
    }

    public static com.bytedance.sdk.openadsdk.yDt.bX.IL zx() {
        if (!com.bytedance.sdk.openadsdk.core.settings.PX.bg()) {
            return com.bytedance.sdk.openadsdk.yDt.bX.bX.bg();
        }
        return com.bytedance.sdk.openadsdk.eqN.bg.eqN.bg();
    }

    private static class bg {
        private static volatile android.app.Application bg;

        public static android.app.Application bg() {
            return bg;
        }

        static {
            try {
                java.lang.Object objIL = IL();
                bg = (android.app.Application) objIL.getClass().getMethod("getApplication", new java.lang.Class[0]).invoke(objIL, new java.lang.Object[0]);
                com.bytedance.sdk.component.utils.PX.bg("MyApplication", "application get success");
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("MyApplication", "application get failed", th);
            }
        }

        private static java.lang.Object IL() {
            try {
                java.lang.reflect.Method method = java.lang.Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new java.lang.Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new java.lang.Object[0]);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }
}
