package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JO implements android.view.View.OnTouchListener {
    public static java.lang.String[] A01 = {"BENQAquhgvj7TT9", "G4ABWHEO8pFoECzre8aPRkd5RqzaS810", "PI8RZp2k0CYdM", "EmvTCi8E1ni5QktN6f", "uKZwthLDSYADW2ME8E7na2CL49A5zEt8", "f3ahGFeoLQ7BDTppBYhbDWzCsZGogVaH", "wyETLpONaJd07JaZyOo", "wX7oH8VfboeBvBElZn"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.WJ A00;

    public JO(com.facebook.ads.redexgen.core.WJ wj) {
        this.A00 = wj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.A00.A04 != null) {
            int action = motionEvent.getAction();
            java.lang.String[] strArr = A01;
            if (strArr[0].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[6] = "VIP8zqVOsYs7o10MZlA";
            if (action == 1) {
                this.A00.A04.A0o();
            }
        }
        return true;
    }
}
