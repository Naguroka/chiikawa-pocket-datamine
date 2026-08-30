package com.bytedance.sdk.component.ldr.bg.eqN.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements com.bytedance.sdk.component.ldr.bg.eqN.bg {
    private com.bytedance.sdk.component.ldr.bg.eqN.bg.IL IL;
    private java.lang.String Kg;
    private int PX;
    private java.lang.String VB;
    private java.lang.String WR;
    private byte bX;
    protected org.json.JSONObject bg;
    private byte eo;
    private byte eqN;
    private long iR;
    private long ldr;
    private long zx;

    public bg(java.lang.String str, org.json.JSONObject jSONObject) {
        this.WR = str;
        this.bg = jSONObject;
    }

    public bg(java.lang.String str, com.bytedance.sdk.component.ldr.bg.eqN.bg.IL il) {
        this.WR = str;
        this.IL = il;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public com.bytedance.sdk.component.ldr.bg.eqN.bg.IL bg() {
        return this.IL;
    }

    private bg() {
    }

    public java.lang.String VB() {
        return this.VB;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public synchronized org.json.JSONObject iR() {
        com.bytedance.sdk.component.ldr.bg.eqN.bg.IL il;
        if (this.bg == null && (il = this.IL) != null) {
            this.bg = il.bg(VB());
        }
        return this.bg;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public void bg(org.json.JSONObject jSONObject) {
        this.bg = jSONObject;
    }

    public static com.bytedance.sdk.component.ldr.bg.eqN.bg bX(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            int iOptInt2 = jSONObject.optInt(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            com.bytedance.sdk.component.ldr.bg.eqN.bg.bg bgVar = new com.bytedance.sdk.component.ldr.bg.eqN.bg.bg();
            bgVar.bg((byte) iOptInt);
            bgVar.IL((byte) iOptInt2);
            bgVar.bg(jSONObject.optJSONObject(androidx.core.app.NotificationCompat.CATEGORY_EVENT));
            bgVar.bg(jSONObject.optString("localId"));
            bgVar.IL(jSONObject.optString("genTime"));
            bgVar.bg(jSONObject.optInt("channel"));
            return bgVar;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public void bX(byte b) {
        this.eo = b;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public byte IL() {
        return this.eo;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public java.lang.String bX() {
        return this.WR;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public byte eqN() {
        return this.bX;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public void bg(byte b) {
        this.bX = b;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public void bg(java.lang.String str) {
        this.WR = str;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public void IL(java.lang.String str) {
        this.Kg = str;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public void bg(long j) {
        this.zx = j;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public long Kg() {
        return this.zx;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public void IL(long j) {
        this.ldr = j;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public long WR() {
        return this.ldr;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public void bX(long j) {
        this.iR = j;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public int eo() {
        return this.PX;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public void bg(int i) {
        this.PX = i;
    }

    public java.lang.String PX() {
        return this.Kg;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public void IL(byte b) {
        this.eqN = b;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public byte zx() {
        return this.eqN;
    }

    @Override // com.bytedance.sdk.component.ldr.bg.eqN.bg
    public java.lang.String ldr() {
        if (android.text.TextUtils.isEmpty(this.WR)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("localId", this.WR);
            jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, iR());
            jSONObject.put("genTime", PX());
            jSONObject.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, (int) this.eqN);
            jSONObject.put("type", (int) this.bX);
            jSONObject.put("channel", this.PX);
        } catch (java.lang.Throwable unused) {
        }
        return jSONObject.toString();
    }
}
