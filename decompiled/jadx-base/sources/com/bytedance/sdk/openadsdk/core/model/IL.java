package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    public int IL;
    public int bX = 1;
    public java.lang.String bg;
    public java.util.ArrayList<java.lang.Integer> eqN;
    public com.bytedance.sdk.openadsdk.AdSlot zx;

    public java.lang.String bg() {
        return this.bg;
    }

    public void bg(java.lang.String str) {
        this.bg = str;
    }

    public int IL() {
        return this.IL;
    }

    public void bg(int i) {
        this.IL = i;
    }

    public int bX() {
        return this.bX;
    }

    public void IL(int i) {
        this.bX = i;
    }

    public com.bytedance.sdk.openadsdk.AdSlot eqN() {
        return this.zx;
    }

    public void bg(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        this.zx = adSlot;
    }

    public java.util.ArrayList<java.lang.Integer> zx() {
        return this.eqN;
    }

    public void bg(java.util.ArrayList<java.lang.Integer> arrayList) {
        this.eqN = arrayList;
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.IL il) {
        int iIL;
        if (il == null || il.eqN() == null || (iIL = il.IL()) >= 0 || iIL == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.yDt.bX.bg();
        com.bytedance.sdk.openadsdk.yDt.bX.bg("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.core.model.IL.1
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("from", com.bytedance.sdk.openadsdk.core.model.IL.this.bX());
                jSONObject.put("err_code", com.bytedance.sdk.openadsdk.core.model.IL.this.IL());
                jSONObject.put("server_res_str", com.bytedance.sdk.openadsdk.core.model.IL.this.bg());
                if (com.bytedance.sdk.openadsdk.core.model.IL.this.zx() != null && com.bytedance.sdk.openadsdk.core.model.IL.this.zx().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new org.json.JSONArray((java.util.Collection) com.bytedance.sdk.openadsdk.core.model.IL.this.zx()).toString());
                }
                java.lang.Object[] objArr = new java.lang.Object[2];
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("rd_client_custom_error").bg(com.bytedance.sdk.openadsdk.core.model.IL.this.eqN().getDurationSlotType()).IL(jSONObject.toString());
            }
        });
    }
}
