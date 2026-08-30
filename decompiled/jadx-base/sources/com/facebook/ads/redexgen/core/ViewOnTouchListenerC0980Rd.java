package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0980Rd implements android.view.View.OnTouchListener {
    public static java.lang.String[] A01 = {"Bd4iK263MdiqVEckgiEcXaEaZ4uIweBG", "Jp1QSGfkJ8Z9zXekFuJltl48GgKydEoc", "fEEbeUwQeH7COVlxXKNmLl1Z50afP2Mj", "r02s0ULWktGw0R0gNTqzpE9xc", "EB9Y4EIWcixhOmounHH1kGqbNZmcFzXh", "JuYgfl", "oFT1QXZER3M49OH4cjLW2BEWWzLsdZXt", "I5"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.LW A00;

    public ViewOnTouchListenerC0980Rd(com.facebook.ads.redexgen.core.LW lw) {
        this.A00 = lw;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (!this.A00.A0G && this.A00.A0A != null) {
            int action = motionEvent.getAction();
            if (A01[7].length() != 2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[0] = "zVWiAAuOepyWFcYkLQ4ZoGrmpQGPeEmc";
            strArr[1] = "wkRU6nfkZfVncc0k3MPDpaJGMcStJhoI";
            if (action == 1) {
                if (this.A00.A0A.isShowing()) {
                    this.A00.A0A.hide();
                } else {
                    this.A00.A0A.show();
                }
            }
        }
        return true;
    }
}
