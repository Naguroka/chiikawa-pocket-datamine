package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1183Zc implements com.facebook.ads.redexgen.core.KO {
    @Override // com.facebook.ads.redexgen.core.KO
    public final void AFg(java.lang.Throwable th, java.lang.Object obj) {
        if (obj instanceof com.facebook.ads.redexgen.core.InterfaceC04957e) {
            com.facebook.ads.redexgen.core.C1199Zs adContext = ((com.facebook.ads.redexgen.core.InterfaceC04957e) obj).A6G();
            if (adContext != null) {
                adContext.A0P(th);
                return;
            }
            return;
        }
        if (!(obj instanceof android.view.View)) {
            return;
        }
        android.content.Context context = ((android.view.View) obj).getContext();
        if (!(context instanceof com.facebook.ads.redexgen.core.C1199Zs)) {
            return;
        }
        ((com.facebook.ads.redexgen.core.C1199Zs) context).A0P(th);
    }
}
