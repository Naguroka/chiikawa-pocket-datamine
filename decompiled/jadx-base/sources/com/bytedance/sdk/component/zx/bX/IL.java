package com.bytedance.sdk.component.zx.bX;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements com.bytedance.sdk.component.zx.Lq {
    private volatile com.bytedance.sdk.component.zx.bX.ldr bg;

    private IL() {
    }

    public static com.bytedance.sdk.component.zx.Lq bg(android.content.Context context, com.bytedance.sdk.component.zx.Ta ta) {
        com.bytedance.sdk.component.zx.bX.IL il = new com.bytedance.sdk.component.zx.bX.IL();
        il.IL(context, ta);
        return il;
    }

    private void IL(android.content.Context context, com.bytedance.sdk.component.zx.Ta ta) {
        if (this.bg != null) {
            android.util.Log.w("ImageLoader", "already init!");
        }
        if (ta == null) {
            ta = com.bytedance.sdk.component.zx.bX.zx.bg(context);
        }
        this.bg = new com.bytedance.sdk.component.zx.bX.ldr(context, ta);
    }

    @Override // com.bytedance.sdk.component.zx.Lq
    public com.bytedance.sdk.component.zx.eo bg(java.lang.String str) {
        return new com.bytedance.sdk.component.zx.bX.bX.IL(this.bg).bX(str);
    }

    @Override // com.bytedance.sdk.component.zx.Lq
    public java.io.InputStream bg(java.lang.String str, java.lang.String str2) {
        if (this.bg != null) {
            if (android.text.TextUtils.isEmpty(str2)) {
                if (android.text.TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = com.bytedance.sdk.component.zx.bX.bX.bX.bg(str);
            }
            java.util.Collection<com.bytedance.sdk.component.zx.Fy> collectionIL = this.bg.IL();
            if (collectionIL != null) {
                java.util.Iterator<com.bytedance.sdk.component.zx.Fy> it = collectionIL.iterator();
                while (it.hasNext()) {
                    byte[] bArrBg = it.next().bg(str2);
                    if (bArrBg != null) {
                        return new java.io.ByteArrayInputStream(bArrBg);
                    }
                }
            }
            java.util.Collection<com.bytedance.sdk.component.zx.bX> collectionBX = this.bg.bX();
            if (collectionBX != null) {
                java.util.Iterator<com.bytedance.sdk.component.zx.bX> it2 = collectionBX.iterator();
                while (it2.hasNext()) {
                    java.io.InputStream inputStreamBg = it2.next().bg(str2);
                    if (inputStreamBg != null) {
                        return inputStreamBg;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.zx.Lq
    public boolean bg(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.bg == null || android.text.TextUtils.isEmpty(str3)) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            if (android.text.TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = com.bytedance.sdk.component.zx.bX.bX.bX.bg(str);
        }
        com.bytedance.sdk.component.zx.bX bXVarBg = this.bg.bg(str3);
        if (bXVarBg != null) {
            return bXVarBg.IL(str2);
        }
        return false;
    }
}
