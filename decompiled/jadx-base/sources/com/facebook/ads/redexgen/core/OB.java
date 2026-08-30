package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class OB {
    public static void A00(android.view.View view, boolean z, android.view.View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            com.facebook.ads.redexgen.core.OA oa = new com.facebook.ads.redexgen.core.OA(onClickListener);
            view.setOnClickListener(oa);
            view.setOnTouchListener(new com.facebook.ads.redexgen.core.O9(oa));
        }
    }
}
