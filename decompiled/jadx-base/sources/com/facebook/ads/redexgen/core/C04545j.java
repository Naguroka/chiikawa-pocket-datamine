package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04545j {
    public final com.facebook.ads.AudienceNetworkActivity A00;
    public final com.facebook.ads.redexgen.core.C1199Zs A01;

    public C04545j(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.AudienceNetworkActivity audienceNetworkActivity) {
        this.A01 = c1199Zs;
        this.A00 = audienceNetworkActivity;
    }

    private int A00() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.Window window = this.A00.getWindow();
        if (window == null) {
            return 2;
        }
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.top < 200 && rect.left < 200) {
            return 1;
        }
        return 0;
    }

    public final void A01() {
        if ((this.A01.A0G().A01() || com.facebook.ads.redexgen.core.C0762Im.A1v(this.A01)) && android.os.Build.VERSION.SDK_INT >= 24) {
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.5i
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A02();
                }
            }, 1000L);
        }
    }

    public final /* synthetic */ void A02() {
        if (this.A00.isInMultiWindowMode()) {
            this.A01.A0E().AAW(A00());
        }
    }
}
