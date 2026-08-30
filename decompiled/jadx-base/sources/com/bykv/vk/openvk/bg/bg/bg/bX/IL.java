package com.bykv.vk.openvk.bg.bg.bg.bX;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private int IL;
    private java.lang.String Kg;
    private int PX;
    private int Ta;
    private double VB;
    private java.lang.String WR;
    private long bX;
    private int bg;
    private java.lang.String eo;
    private double eqN;
    private java.lang.String iR;
    private java.lang.String ldr;
    private java.lang.String zx;
    private float yDt = -1.0f;
    private int Lq = 0;
    private int vb = 0;
    private int xxp = 0;
    private int VzQ = 0;
    private int tuV = 307200;
    private int Fy = 1;

    public int bg() {
        return this.PX;
    }

    public void bg(int i) {
        this.PX = i;
    }

    public int IL() {
        return this.bg;
    }

    public void IL(int i) {
        this.bg = i;
    }

    public int bX() {
        return this.IL;
    }

    public void bX(int i) {
        this.IL = i;
    }

    public int eqN() {
        return this.Ta;
    }

    public void eqN(int i) {
        this.Ta = i;
    }

    public long zx() {
        return this.bX;
    }

    public void bg(long j) {
        this.bX = j;
    }

    public double ldr() {
        return this.eqN;
    }

    public void bg(double d) {
        this.eqN = d;
    }

    public double iR() {
        return this.VB;
    }

    public float Kg() {
        return this.yDt;
    }

    public java.lang.String WR() {
        return this.zx;
    }

    public void bg(java.lang.String str) {
        this.zx = str;
    }

    public java.lang.String eo() {
        return this.ldr;
    }

    public void IL(java.lang.String str) {
        this.ldr = str;
    }

    public java.lang.String VB() {
        return this.iR;
    }

    public void bX(java.lang.String str) {
        this.iR = str;
    }

    public java.lang.String PX() {
        return this.Kg;
    }

    public void eqN(java.lang.String str) {
        this.Kg = str;
    }

    public java.lang.String Ta() {
        return this.WR;
    }

    public void zx(java.lang.String str) {
        this.WR = str;
    }

    public java.lang.String yDt() {
        if (android.text.TextUtils.isEmpty(this.eo)) {
            this.eo = com.bykv.vk.openvk.bg.bg.bg.iR.IL.bg(this.iR);
        }
        return this.eo;
    }

    public void ldr(java.lang.String str) {
        this.eo = str;
    }

    public int Lq() {
        if (this.tuV < 0) {
            this.tuV = 307200;
        }
        long j = this.tuV;
        long j2 = this.bX;
        if (j > j2) {
            this.tuV = (int) j2;
        }
        return this.tuV;
    }

    public void zx(int i) {
        this.tuV = i;
    }

    public int vb() {
        return this.xxp;
    }

    public void ldr(int i) {
        this.xxp = i;
    }

    public int xxp() {
        return this.VzQ;
    }

    public void iR(int i) {
        this.VzQ = i;
    }

    public org.json.JSONObject VzQ() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("cover_height", IL());
            jSONObject.put("cover_url", eo());
            jSONObject.put("cover_width", bX());
            jSONObject.put("endcard", PX());
            jSONObject.put("file_hash", yDt());
            jSONObject.put("resolution", WR());
            jSONObject.put("size", zx());
            jSONObject.put("video_duration", ldr());
            jSONObject.put("video_url", VB());
            jSONObject.put("playable_download_url", Ta());
            jSONObject.put("if_playable_loading_show", tuV());
            jSONObject.put("remove_loading_page_type", Fy());
            jSONObject.put("fallback_endcard_judge", bg());
            jSONObject.put("video_preload_size", Lq());
            jSONObject.put("reward_video_cached_type", vb());
            jSONObject.put("execute_cached_type", xxp());
            jSONObject.put("endcard_render", eqN());
            jSONObject.put("replay_time", tC());
            jSONObject.put("play_speed_ratio", Kg());
            if (iR() > 0.0d) {
                jSONObject.put(androidx.media3.extractor.text.ttml.TtmlNode.START, iR());
            }
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    public int tuV() {
        return this.Lq;
    }

    public void Kg(int i) {
        this.Lq = i;
    }

    public int Fy() {
        return this.vb;
    }

    public void WR(int i) {
        this.vb = i;
    }

    public boolean LZ() {
        return this.xxp == 0;
    }

    public void eo(int i) {
        this.Fy = java.lang.Math.min(4, java.lang.Math.max(1, i));
    }

    public int tC() {
        return this.Fy;
    }
}
