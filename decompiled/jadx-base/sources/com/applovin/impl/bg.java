package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends com.applovin.impl.cc {
    private final com.applovin.impl.je n;
    private final android.content.Context o;

    @Override // com.applovin.impl.cc
    public int e() {
        return com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_disclosureButtonColor, this.o);
    }

    public java.lang.String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((java.lang.Object) this.c) + ", detailText=" + ((java.lang.Object) this.d) + ", network=" + this.n + "}";
    }

    public bg(com.applovin.impl.je jeVar, android.content.Context context) {
        super(com.applovin.impl.cc.c.DETAIL);
        this.n = jeVar;
        this.o = context;
        this.c = t();
        this.d = s();
    }

    public com.applovin.impl.je r() {
        return this.n;
    }

    @Override // com.applovin.impl.cc
    public boolean o() {
        return this.n.q() != com.applovin.impl.je.a.MISSING;
    }

    @Override // com.applovin.impl.cc
    public int h() {
        int iH = this.n.h();
        return iH > 0 ? iH : com.applovin.sdk.R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.cc
    public int d() {
        return o() ? com.applovin.sdk.R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    private android.text.SpannedString t() {
        return com.applovin.impl.sdk.utils.StringUtils.createSpannedString(this.n.g(), o() ? androidx.core.view.ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
    }

    private android.text.SpannedString s() {
        if (!o()) {
            return null;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) u());
        spannableStringBuilder.append((java.lang.CharSequence) new android.text.SpannableString("\n"));
        spannableStringBuilder.append((java.lang.CharSequence) q());
        if (this.n.q() == com.applovin.impl.je.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((java.lang.CharSequence) new android.text.SpannableString("\n"));
            spannableStringBuilder.append((java.lang.CharSequence) com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
        }
        return new android.text.SpannedString(spannableStringBuilder);
    }

    private android.text.SpannedString u() {
        if (this.n.E()) {
            if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(this.n.p())) {
                return com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSpannedString(this.n.A() ? "Retrieving SDK Version..." : "SDK Found", androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
            spannableStringBuilder.append((java.lang.CharSequence) com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSpannedString(this.n.p(), androidx.core.view.ViewCompat.MEASURED_STATE_MASK));
            return new android.text.SpannedString(spannableStringBuilder);
        }
        return com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
    }

    private android.text.SpannedString q() {
        if (this.n.A()) {
            if (!android.text.TextUtils.isEmpty(this.n.c())) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
                spannableStringBuilder.append((java.lang.CharSequence) com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSpannedString(this.n.c(), androidx.core.view.ViewCompat.MEASURED_STATE_MASK));
                if (this.n.B()) {
                    spannableStringBuilder.append((java.lang.CharSequence) com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSubSpannedString("  LATEST  ", android.graphics.Color.rgb(255, 127, 0)));
                    spannableStringBuilder.append((java.lang.CharSequence) com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSpannedString(this.n.k(), androidx.core.view.ViewCompat.MEASURED_STATE_MASK));
                }
                return new android.text.SpannedString(spannableStringBuilder);
            }
            return com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSpannedString("Adapter Found", androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        }
        return com.applovin.impl.sdk.utils.StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
    }
}
