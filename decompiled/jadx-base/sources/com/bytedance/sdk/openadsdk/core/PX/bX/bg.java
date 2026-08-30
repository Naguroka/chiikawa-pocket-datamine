package com.bytedance.sdk.openadsdk.core.PX.bX;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    public static final java.util.Set<java.lang.String> bg = new java.util.HashSet<java.lang.String>() { // from class: com.bytedance.sdk.openadsdk.core.PX.bX.bg.1
        {
            add(androidx.media3.common.MimeTypes.IMAGE_JPEG);
            add(androidx.media3.common.MimeTypes.IMAGE_PNG);
            add(androidx.media3.common.MimeTypes.IMAGE_BMP);
            add("image/gif");
            add("image/jpg");
        }
    };
    public static java.util.Set<java.lang.String> IL = new java.util.HashSet<java.lang.String>() { // from class: com.bytedance.sdk.openadsdk.core.PX.bX.bg.2
        {
            add("application/x-javascript");
        }
    };

    public enum IL {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.PX.bX.bg$bg, reason: collision with other inner class name */
    public enum EnumC0137bg {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public static android.graphics.Point bg(android.content.Context context, int i, int i2, com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL il) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        }
        android.graphics.Point point = new android.graphics.Point(i, i2);
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, i);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, i2);
        if (iBX <= width && iBX2 <= height) {
            return point;
        }
        android.graphics.Point point2 = new android.graphics.Point();
        if (com.bytedance.sdk.openadsdk.core.PX.bX.bg.IL.HTML_RESOURCE == il) {
            point2.x = java.lang.Math.min(width, iBX);
            point2.y = java.lang.Math.min(height, iBX2);
        } else {
            float f = iBX;
            float f2 = f / width;
            float f3 = iBX2;
            float f4 = f3 / height;
            if (f2 >= f4) {
                point2.x = width;
                point2.y = (int) (f3 / f2);
            } else {
                point2.x = (int) (f / f4);
                point2.y = height;
            }
        }
        if (point2.x < 0 || point2.y < 0) {
            return point;
        }
        point2.x = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(context, point2.x);
        point2.y = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(context, point2.y);
        return point2;
    }
}
