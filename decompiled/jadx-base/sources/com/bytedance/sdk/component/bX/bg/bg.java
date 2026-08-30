package com.bytedance.sdk.component.bX.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    long IL;
    long Kg;
    long bX;
    long bg = android.os.SystemClock.elapsedRealtime();
    long eqN;
    long iR;
    long ldr;
    long zx;

    public void bg() {
        this.bX = android.os.SystemClock.elapsedRealtime();
    }

    public void IL() {
        this.eqN = android.os.SystemClock.elapsedRealtime();
    }

    public void bX() {
        this.zx = android.os.SystemClock.elapsedRealtime();
    }

    public long eqN() {
        return this.bg;
    }

    public void zx() {
        this.ldr = android.os.SystemClock.elapsedRealtime();
    }

    public long ldr() {
        return this.ldr;
    }

    public long iR() {
        return this.bX;
    }

    public long Kg() {
        return this.eqN;
    }

    public long WR() {
        return this.zx;
    }

    public long eo() {
        return this.iR;
    }

    public void VB() {
        this.iR = android.os.SystemClock.elapsedRealtime();
    }

    public long PX() {
        return this.Kg;
    }

    public void Ta() {
        this.Kg = android.os.SystemClock.elapsedRealtime();
    }

    public long yDt() {
        return this.IL;
    }

    public void Lq() {
        this.IL = android.os.SystemClock.elapsedRealtime();
    }

    public java.lang.String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.bg + ", asyncCallExecTs=" + this.IL + ", requestStartExecTs=" + this.bX + ", requestConnectStartTs=" + this.eqN + ", requestConnectFinishTs=" + this.zx + ", reqCallServerStartTs=" + this.iR + ", reqCallServerFinishTs=" + this.Kg + '}';
    }
}
