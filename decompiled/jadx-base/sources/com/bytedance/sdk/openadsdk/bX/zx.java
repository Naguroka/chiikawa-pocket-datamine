package com.bytedance.sdk.openadsdk.bX;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.openadsdk.core.zx.zx implements android.view.View.OnClickListener, com.bytedance.sdk.openadsdk.bX.eo.bX {
    private final int Kg;
    private android.graphics.drawable.StateListDrawable iR;
    private com.bytedance.sdk.openadsdk.FilterWord ldr;
    private final com.bytedance.sdk.openadsdk.bX.eo zx;
    public static com.bytedance.sdk.openadsdk.FilterWord bg = new com.bytedance.sdk.openadsdk.FilterWord("100:1", "GOOD");
    public static com.bytedance.sdk.openadsdk.FilterWord IL = new com.bytedance.sdk.openadsdk.FilterWord("100:2", "NOT_BAD");
    public static com.bytedance.sdk.openadsdk.FilterWord bX = new com.bytedance.sdk.openadsdk.FilterWord("100:3", "BAD");
    public static java.util.List<com.bytedance.sdk.openadsdk.bX.zx> eqN = new java.util.ArrayList(3);

    public zx(android.content.Context context, int i, com.bytedance.sdk.openadsdk.bX.eo eoVar) {
        super(context);
        this.Kg = i;
        this.zx = eoVar;
        if (eoVar != null) {
            eoVar.bg(this);
        }
        bg(i);
        bg();
        IL();
        eqN.add(this);
    }

    private void bg(int i) {
        if (i == 1) {
            this.ldr = bg;
        } else if (i == 2) {
            this.ldr = IL;
        } else {
            if (i != 3) {
                return;
            }
            this.ldr = bX;
        }
    }

    private void bg() {
        if (this.iR == null) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setCornerRadius(com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 12.0f));
            gradientDrawable.setColor(android.graphics.Color.parseColor("#F8F8F8"));
            android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
            gradientDrawable2.setStroke(com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 2.0f), android.graphics.Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 12.0f));
            gradientDrawable2.setColor(android.graphics.Color.parseColor("#12FE2C55"));
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            this.iR = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, gradientDrawable2);
            this.iR.addState(new int[0], gradientDrawable);
        }
        setBackground(this.iR);
        setSelected(false);
        setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    private void IL() {
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(getContext());
        kg.setTextSize(this.zx.WR() ? 40 : 30);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 12.0f), 0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), this.zx.WR() ? 8.0f : 4.0f));
        addView(kg, layoutParams);
        com.bytedance.sdk.openadsdk.bX.bg bgVar = new com.bytedance.sdk.openadsdk.bX.bg(getContext());
        bgVar.setTextSize(this.zx.WR() ? 17 : 12);
        bgVar.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        bgVar.setMaxLines(1);
        bgVar.setSingleLine();
        bgVar.setGravity(17);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 12.0f));
        addView(bgVar, layoutParams2);
        int i = this.Kg;
        if (i == 1) {
            kg.setText("😍");
            bgVar.setText(com.bytedance.sdk.component.utils.Fy.bg(getContext(), "tt_good"));
        } else if (i == 2) {
            bgVar.setText(com.bytedance.sdk.component.utils.Fy.bg(getContext(), "tt_not_bad"));
            kg.setText("😐");
        } else {
            if (i != 3) {
                return;
            }
            bgVar.setText(com.bytedance.sdk.component.utils.Fy.bg(getContext(), "tt_bad"));
            kg.setText("😡");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (isSelected()) {
            this.zx.bg(com.bytedance.sdk.openadsdk.bX.eo.bg);
        } else {
            this.zx.bg(this.ldr);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.bX.eo.bX
    public void bg(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
        com.bytedance.sdk.openadsdk.FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.ldr) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
