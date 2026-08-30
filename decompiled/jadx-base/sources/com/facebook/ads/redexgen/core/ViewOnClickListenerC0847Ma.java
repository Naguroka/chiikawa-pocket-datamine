package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0847Ma implements android.view.View.OnClickListener {
    public static java.lang.String[] A01 = {"Z2hbS", "Ic9Plg2RHJALgAmeO078aNsKQGOal", "b0P4J", "qPaw7oHv0CzCeGcF5yFKpd54yMlUwCSF", "7gZAPHVUavlnb441EbFGztdAJQMZxuOt", "Mm2iJyxsEvC3", "o6m8JBk94F2OCejIYcL1MXv5hOBXGoqA", "4FWTxMbWeUMvWQb2hMO2cIzUW3drHp"};
    public final /* synthetic */ com.facebook.ads.internal.view.FullScreenAdToolbar A00;

    public ViewOnClickListenerC0847Ma(com.facebook.ads.internal.view.FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02 == null || !this.A00.A09.A06()) {
                return;
            }
            this.A00.A02.ABX();
        } catch (java.lang.Throwable th) {
            if (A01[4].charAt(1) == '3') {
                throw new java.lang.RuntimeException();
            }
            A01[4] = "5QsO86P0olwWLm0uuSyeI2U4VEnOIWE5";
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
