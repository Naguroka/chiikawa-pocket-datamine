package com.bytedance.sdk.component.iR.IL;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bX {
    protected com.bytedance.sdk.component.IL.bg.VB bX;
    int ldr;
    java.lang.String zx;
    protected java.lang.String eqN = null;
    protected final java.util.Map<java.lang.String, java.lang.String> iR = new java.util.HashMap();
    protected java.lang.String Kg = null;
    protected boolean WR = false;

    public void bg(java.lang.String str) {
        this.zx = str;
    }

    public void bg(int i) {
        this.ldr = i;
    }

    public bX(com.bytedance.sdk.component.IL.bg.VB vb) {
        this.bX = vb;
        try {
            bX(java.util.UUID.randomUUID().toString());
        } catch (java.lang.Throwable th) {
            th.getMessage();
        }
    }

    public void IL(java.lang.String str) {
        this.Kg = str;
    }

    public void IL(java.lang.String str, java.lang.String str2) {
        this.iR.put(str, str2);
    }

    public void eqN(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                this.iR.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void bX(java.lang.String str) {
        this.eqN = str;
    }

    public java.lang.String bX() {
        return this.eqN;
    }

    public void IL() {
        com.bytedance.sdk.component.IL.bg.VB vb;
        if (this.eqN == null || (vb = this.bX) == null) {
            return;
        }
        com.bytedance.sdk.component.IL.bg.eqN eqnBg = vb.bg();
        synchronized (eqnBg) {
            for (com.bytedance.sdk.component.IL.bg.IL il : eqnBg.bX()) {
                if (this.eqN.equals(il.bg().bg())) {
                    il.bX();
                }
            }
            for (com.bytedance.sdk.component.IL.bg.IL il2 : eqnBg.eqN()) {
                if (this.eqN.equals(il2.bg().bg())) {
                    il2.bX();
                }
            }
        }
    }

    protected void bg(com.bytedance.sdk.component.IL.bg.Ta.bg bgVar) {
        if (bgVar != null && this.iR.size() > 0) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.iR.entrySet()) {
                java.lang.String key = entry.getKey();
                if (!android.text.TextUtils.isEmpty(key)) {
                    java.lang.String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    bgVar.IL(key, value);
                }
            }
        }
    }
}
