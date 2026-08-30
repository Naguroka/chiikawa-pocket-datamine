package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0981Re implements android.view.View.OnTouchListener {
    public static java.lang.String[] A01 = {"9YpvPFzq4gA4ILum2PFw7tT2EwcxI8wV", "F47KlILUbWaCosO0", "IjRysyutmgGRdQsMt2txP2GECpx3k3Q1", "ciBLF0rumq0WEGUsEh07nHxU", "yDOgyb3x0PSD2bFM5iTRFbbFTymIPux3", "Sxy6px61nfjJHTffPjDZVR3ZYpa4rtVn", "5GXF5D2qooFEcnp1hk94nU2dqySkSdML", "AxzUGf"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.LW A00;

    public ViewOnTouchListenerC0981Re(com.facebook.ads.redexgen.core.LW lw) {
        this.A00 = lw;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (!this.A00.A0G && this.A00.A0A != null && motionEvent.getAction() == 1) {
            boolean zIsShowing = this.A00.A0A.isShowing();
            if (A01[4].charAt(17) != 'i') {
                throw new java.lang.RuntimeException();
            }
            A01[3] = "HYvtDEBsv2VZCb1XBIl4ljHb";
            if (zIsShowing) {
                this.A00.A0A.hide();
            } else {
                this.A00.A0A.show();
            }
        }
        return true;
    }
}
