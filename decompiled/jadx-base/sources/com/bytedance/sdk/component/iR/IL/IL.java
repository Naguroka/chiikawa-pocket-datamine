package com.bytedance.sdk.component.iR.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.sdk.component.iR.IL.bX {
    private java.util.Map<java.lang.String, java.lang.String> PX;
    private boolean VB;
    private com.bytedance.sdk.component.IL.bg.bg eo;
    public static final com.bytedance.sdk.component.IL.bg.bg bg = new com.bytedance.sdk.component.IL.bg.bg.C0097bg().bg().IL();
    public static final com.bytedance.sdk.component.IL.bg.bg IL = new com.bytedance.sdk.component.IL.bg.bg.C0097bg().IL();

    public IL(com.bytedance.sdk.component.IL.bg.VB vb) {
        super(vb);
        this.eo = bg;
        this.VB = false;
        this.PX = new java.util.HashMap();
    }

    public void bg(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return;
        }
        this.PX.put(str, str2);
    }

    public void bg(boolean z) {
        this.VB = z;
    }

    public void bg(final com.bytedance.sdk.component.iR.bg.bg bgVar) {
        try {
            com.bytedance.sdk.component.IL.bg.Ta.bg bgVar2 = new com.bytedance.sdk.component.IL.bg.Ta.bg();
            if (this.VB) {
                bgVar2.IL(this.Kg);
            } else {
                com.bytedance.sdk.component.IL.bg.iR.bg bgVar3 = new com.bytedance.sdk.component.IL.bg.iR.bg();
                android.net.Uri uri = android.net.Uri.parse(this.Kg);
                bgVar3.bg(uri.getScheme());
                bgVar3.IL(uri.getHost());
                java.lang.String encodedPath = uri.getEncodedPath();
                if (!android.text.TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    bgVar3.bX(encodedPath);
                }
                java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (java.lang.String str : queryParameterNames) {
                        this.PX.put(str, uri.getQueryParameter(str));
                    }
                }
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.PX.entrySet()) {
                    java.lang.String key = entry.getKey();
                    java.lang.String value = entry.getValue();
                    if (!android.text.TextUtils.isEmpty(key)) {
                        java.lang.String strEncode = java.net.URLEncoder.encode(key, com.adjust.sdk.Constants.ENCODING);
                        if (value == null) {
                            value = "";
                        }
                        bgVar3.bg(strEncode, java.net.URLEncoder.encode(value, com.adjust.sdk.Constants.ENCODING));
                    }
                }
                bgVar2.bg(bgVar3.IL());
            }
            bg(bgVar2);
            bgVar2.bg(this.eo);
            bgVar2.bg((java.lang.Object) bX());
            if (!android.text.TextUtils.isEmpty(this.zx)) {
                bgVar2.bg(this.zx);
            }
            if (this.ldr > 0) {
                bgVar2.bg(this.ldr);
            }
            this.bX.bg(bgVar2.bg().IL()).bg(new com.bytedance.sdk.component.IL.bg.bX() { // from class: com.bytedance.sdk.component.iR.IL.IL.1
                @Override // com.bytedance.sdk.component.IL.bg.bX
                public void bg(com.bytedance.sdk.component.IL.bg.IL il, java.io.IOException iOException) {
                    com.bytedance.sdk.component.iR.bg.bg bgVar4 = bgVar;
                    if (bgVar4 != null) {
                        bgVar4.bg(com.bytedance.sdk.component.iR.IL.IL.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.IL.bg.bX
                public void bg(com.bytedance.sdk.component.IL.bg.IL il, com.bytedance.sdk.component.IL.bg.Lq lq) throws java.io.IOException {
                    if (bgVar != null) {
                        java.util.HashMap map = new java.util.HashMap();
                        if (lq != null) {
                            com.bytedance.sdk.component.IL.bg.ldr ldrVarIR = lq.iR();
                            if (ldrVarIR != null) {
                                for (int i = 0; i < ldrVarIR.bg(); i++) {
                                    map.put(ldrVarIR.bg(i), ldrVarIR.IL(i));
                                }
                            }
                            com.bytedance.sdk.component.IL.bg.xxp xxpVarLdr = lq.ldr();
                            bgVar.bg(com.bytedance.sdk.component.iR.IL.IL.this, new com.bytedance.sdk.component.iR.IL(lq.eqN(), lq.bX(), lq.zx(), map, xxpVarLdr == null ? "" : xxpVarLdr.IL(), lq.IL(), lq.bg()));
                        }
                    }
                }
            });
        } catch (java.lang.Throwable th) {
            if (bgVar != null) {
                bgVar.bg(this, new java.io.IOException(th.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.iR.IL bg() {
        try {
            com.bytedance.sdk.component.IL.bg.Ta.bg bgVar = new com.bytedance.sdk.component.IL.bg.Ta.bg();
            java.lang.String strIL = "";
            if (this.VB) {
                bgVar.IL(this.Kg);
            } else {
                com.bytedance.sdk.component.IL.bg.iR.bg bgVar2 = new com.bytedance.sdk.component.IL.bg.iR.bg();
                android.net.Uri uri = android.net.Uri.parse(this.Kg);
                bgVar2.bg(uri.getScheme());
                bgVar2.IL(uri.getHost());
                java.lang.String encodedPath = uri.getEncodedPath();
                if (!android.text.TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    bgVar2.bX(encodedPath);
                }
                java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (java.lang.String str : queryParameterNames) {
                        this.PX.put(str, uri.getQueryParameter(str));
                    }
                }
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.PX.entrySet()) {
                    java.lang.String key = entry.getKey();
                    java.lang.String value = entry.getValue();
                    if (!android.text.TextUtils.isEmpty(key)) {
                        java.lang.String strEncode = java.net.URLEncoder.encode(key, com.adjust.sdk.Constants.ENCODING);
                        if (value == null) {
                            value = "";
                        }
                        bgVar2.bg(strEncode, java.net.URLEncoder.encode(value, com.adjust.sdk.Constants.ENCODING));
                    }
                }
                bgVar.bg(bgVar2.IL());
            }
            bg(bgVar);
            bgVar.bg(this.eo);
            bgVar.bg((java.lang.Object) bX());
            com.bytedance.sdk.component.IL.bg.Lq lqIL = this.bX.bg(bgVar.bg().IL()).IL();
            if (lqIL == null) {
                return null;
            }
            java.util.HashMap map = new java.util.HashMap();
            com.bytedance.sdk.component.IL.bg.ldr ldrVarIR = lqIL.iR();
            if (ldrVarIR != null) {
                for (int i = 0; i < ldrVarIR.bg(); i++) {
                    map.put(ldrVarIR.bg(i), ldrVarIR.IL(i));
                }
            }
            com.bytedance.sdk.component.IL.bg.xxp xxpVarLdr = lqIL.ldr();
            if (xxpVarLdr != null) {
                strIL = xxpVarLdr.IL();
            }
            return new com.bytedance.sdk.component.iR.IL(lqIL.eqN(), lqIL.bX(), lqIL.zx(), map, strIL, lqIL.IL(), lqIL.bg());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
