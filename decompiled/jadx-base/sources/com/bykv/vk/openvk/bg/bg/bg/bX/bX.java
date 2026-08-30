package com.bykv.vk.openvk.bg.bg.bg.bX;

/* JADX INFO: loaded from: classes3.dex */
public class bX implements java.io.Serializable {
    public int IL;
    private long Lq;
    private int PX;
    private int Ta;
    private java.lang.String VB;
    private int VzQ;
    public java.lang.String bg;
    public int eqN;
    private java.lang.String iR;
    private com.bykv.vk.openvk.bg.bg.bg.bX.IL ldr;
    private int tuV;
    private boolean vb;
    private boolean xxp;
    private java.lang.String yDt;
    private com.bykv.vk.openvk.bg.bg.bg.bX.IL zx;
    private int Kg = 204800;
    private int WR = 0;
    private int eo = 0;
    public final java.util.HashMap<java.lang.String, java.lang.Object> bX = new java.util.HashMap<>();
    private int Fy = 10000;
    private int LZ = 10000;
    private int tC = 10000;
    private int rri = 0;
    private org.json.JSONObject kMt = new org.json.JSONObject();

    public bX(java.lang.String str, com.bykv.vk.openvk.bg.bg.bg.bX.IL il, com.bykv.vk.openvk.bg.bg.bg.bX.IL il2, int i, int i2) {
        this.VzQ = 0;
        this.tuV = 0;
        this.iR = str;
        this.zx = il;
        this.ldr = il2;
        this.VzQ = i;
        this.tuV = i2;
    }

    public int bg() {
        return this.kMt.optInt("pitaya_cache_size", 0);
    }

    public java.lang.String IL() {
        return this.iR;
    }

    public void bg(java.lang.String str) {
        this.iR = str;
    }

    public int bX() {
        if (VB()) {
            return this.ldr.Lq();
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.IL il = this.zx;
        if (il != null) {
            return il.Lq();
        }
        return 0;
    }

    public boolean eqN() {
        return this.xxp;
    }

    public void IL(java.lang.String str) {
        this.VB = str;
    }

    public int zx() {
        return this.PX;
    }

    public void bg(int i) {
        this.PX = i;
    }

    public int ldr() {
        return this.Ta;
    }

    public void IL(int i) {
        this.Ta = i;
    }

    public void bX(java.lang.String str) {
        this.yDt = str;
    }

    public long iR() {
        return this.Lq;
    }

    public void bg(long j) {
        this.Lq = j;
    }

    public boolean Kg() {
        return this.vb;
    }

    public void bg(boolean z) {
        this.vb = z;
    }

    public long WR() {
        if (VB()) {
            return this.ldr.zx();
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.IL il = this.zx;
        if (il != null) {
            return il.zx();
        }
        return 0L;
    }

    public boolean eo() {
        if (VB()) {
            return this.ldr.LZ();
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.IL il = this.zx;
        if (il != null) {
            return il.LZ();
        }
        return true;
    }

    public void eqN(java.lang.String str) {
        this.bg = str;
    }

    public void bX(int i) {
        this.IL = i;
    }

    public boolean VB() {
        com.bykv.vk.openvk.bg.bg.bg.bX.IL il;
        if (this.tuV == 1 && (il = this.ldr) != null && !android.text.TextUtils.isEmpty(il.VB())) {
            if (com.bykv.vk.openvk.bg.bg.bg.bX.ldr() == 2) {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
            } else if (this.VzQ == 1) {
                return true;
            }
        }
        return false;
    }

    public float PX() {
        if (VB()) {
            return this.ldr.Kg();
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.IL il = this.zx;
        if (il != null) {
            return il.Kg();
        }
        return -1.0f;
    }

    public java.lang.String Ta() {
        if (VB()) {
            return this.ldr.VB();
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.IL il = this.zx;
        if (il != null) {
            return il.VB();
        }
        return null;
    }

    public java.lang.String yDt() {
        if (VB()) {
            return this.ldr.yDt();
        }
        com.bykv.vk.openvk.bg.bg.bg.bX.IL il = this.zx;
        if (il != null) {
            return il.yDt();
        }
        return null;
    }

    public int Lq() {
        return this.VzQ;
    }

    public synchronized void bg(java.lang.String str, java.lang.Object obj) {
        this.bX.put(str, obj);
    }

    public synchronized java.lang.Object zx(java.lang.String str) {
        return this.bX.get(str);
    }

    public int vb() {
        return this.Fy;
    }

    public void eqN(int i) {
        this.Fy = i;
    }

    public int xxp() {
        return this.LZ;
    }

    public void zx(int i) {
        this.LZ = i;
    }

    public int VzQ() {
        return this.tC;
    }

    public void ldr(int i) {
        this.tC = i;
    }

    public int tuV() {
        return this.rri;
    }

    public void iR(int i) {
        this.rri = i;
    }

    public com.bykv.vk.openvk.bg.bg.bg.bX.IL Fy() {
        return this.zx;
    }

    public com.bykv.vk.openvk.bg.bg.bg.bX.IL LZ() {
        return this.ldr;
    }
}
