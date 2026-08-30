package com.bytedance.sdk.component.adexpress.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class eo {
    public static com.bytedance.sdk.component.adexpress.eqN.eo.bg bg(java.lang.String str) {
        com.bytedance.sdk.component.adexpress.eqN.eo.bg bgVar = com.bytedance.sdk.component.adexpress.eqN.eo.bg.IMAGE;
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                java.lang.String path = android.net.Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        bgVar = com.bytedance.sdk.component.adexpress.eqN.eo.bg.CSS;
                    } else if (path.endsWith(".js")) {
                        bgVar = com.bytedance.sdk.component.adexpress.eqN.eo.bg.JS;
                    } else if (path.endsWith(".jpg") || path.endsWith(".gif") || path.endsWith(".png") || path.endsWith(".jpeg") || path.endsWith(".webp") || path.endsWith(".bmp") || path.endsWith(".ico")) {
                        bgVar = com.bytedance.sdk.component.adexpress.eqN.eo.bg.IMAGE;
                    } else if (path.endsWith(".html")) {
                        bgVar = com.bytedance.sdk.component.adexpress.eqN.eo.bg.HTML;
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return bgVar;
    }

    public static boolean IL(java.lang.String str) {
        android.net.Uri uri;
        if (android.text.TextUtils.isEmpty(str) || (uri = android.net.Uri.parse(str)) == null) {
            return false;
        }
        java.lang.String path = uri.getPath();
        if (android.text.TextUtils.isEmpty(path)) {
            return false;
        }
        return path.endsWith(".gif");
    }

    public enum bg {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        private java.lang.String zx;

        bg(java.lang.String str) {
            this.zx = str;
        }

        public java.lang.String bg() {
            return this.zx;
        }
    }
}
