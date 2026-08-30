package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class P9 extends android.widget.RelativeLayout {
    public final android.view.View A00;
    public final com.facebook.ads.redexgen.core.OV A01;

    public P9(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.view.View view) {
        super(c1199Zs);
        this.A00 = view;
        this.A01 = new com.facebook.ads.redexgen.core.OV(c1199Zs);
        com.facebook.ads.redexgen.core.M3.A0K(this.A01);
    }

    public final void A00(int i) {
        this.A00.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, i));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void A01(com.facebook.ads.redexgen.core.C0899Oa c0899Oa, boolean z) {
        this.A01.addView(this.A00, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(1);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (c0899Oa != null) {
            if (z) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                c0899Oa.setAlignment(3);
                layoutParams2.setMargins(com.facebook.ads.redexgen.core.AbstractC0907Oi.A07 / 2, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07 / 2, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07 / 2, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07 / 2);
                linearLayout.addView(c0899Oa, layoutParams2);
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                com.facebook.ads.redexgen.core.M3.A0S(linearLayout, gradientDrawable);
            } else {
                android.widget.RelativeLayout.LayoutParams insideLayoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                insideLayoutParams.addRule(3, this.A01.getId());
                insideLayoutParams.setMargins(0, com.facebook.ads.redexgen.core.AbstractC0907Oi.A07, 0, 0);
                c0899Oa.setAlignment(17);
                addView(c0899Oa, insideLayoutParams);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new android.widget.RelativeLayout.LayoutParams(-1, -2));
    }
}
