package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class u6 extends com.applovin.impl.cc {
    private final com.applovin.impl.v6 n;
    private final android.content.Context o;

    private android.text.SpannedString q() {
        return new android.text.SpannedString("Displayed " + com.applovin.impl.yp.a(this.n.b(), true));
    }

    private android.text.SpannedString r() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) this.n.c());
        spannableStringBuilder.append((java.lang.CharSequence) " - ");
        spannableStringBuilder.append((java.lang.CharSequence) this.n.d());
        return new android.text.SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.cc
    public int e() {
        return com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_disclosureButtonColor, this.o);
    }

    @Override // com.applovin.impl.cc
    public boolean o() {
        return true;
    }

    public u6(com.applovin.impl.v6 v6Var, android.content.Context context) {
        super(com.applovin.impl.cc.c.DETAIL);
        this.n = v6Var;
        this.o = context;
        this.c = r();
        this.d = q();
    }

    @Override // com.applovin.impl.cc
    public int d() {
        return o() ? com.applovin.sdk.R.drawable.applovin_ic_disclosure_arrow : super.h();
    }
}
