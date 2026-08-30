package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class PN {
    public static com.facebook.ads.redexgen.core.BP A00(final com.facebook.ads.redexgen.core.C0911Om c0911Om, int i, final java.lang.String str, final com.facebook.ads.redexgen.core.TV tv) {
        if (i == 1) {
            return new com.facebook.ads.redexgen.core.BP(c0911Om, str, tv) { // from class: com.facebook.ads.redexgen.X.3Q
                public static final int A00 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 20.0f);
                public static final int A01 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);

                @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
                public final boolean A01() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.core.BP
                public final void A1A(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
                    com.facebook.ads.redexgen.core.C0899Oa titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
                    android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(c1199Zs);
                    com.facebook.ads.redexgen.core.M3.A0S(linearLayout, new android.graphics.drawable.ColorDrawable(-1));
                    android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(A01, A01, A01, A01);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new com.facebook.ads.redexgen.core.BP(c0911Om, str, tv) { // from class: com.facebook.ads.redexgen.X.3b
            public static final int A00 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);

            @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
            public final boolean A00() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.core.BP, com.facebook.ads.redexgen.core.AbstractC0907Oi
            public final boolean A0C() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.core.BP
            public final void A1A(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
                com.facebook.ads.redexgen.core.C0899Oa titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                android.widget.RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                titleDescContainer.setPadding(A00, A00, A00, A00);
                com.facebook.ads.redexgen.core.M3.A0R(titleDescContainer, getAdContextWrapper());
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
