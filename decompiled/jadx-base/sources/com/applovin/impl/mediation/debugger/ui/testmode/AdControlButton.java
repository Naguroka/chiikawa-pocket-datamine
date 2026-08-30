package com.applovin.impl.mediation.debugger.ui.testmode;

/* JADX INFO: loaded from: classes3.dex */
public class AdControlButton extends android.widget.RelativeLayout implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.drawable.GradientDrawable f1056a;
    private final android.widget.Button b;
    private final com.applovin.impl.o c;
    private com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b d;
    private com.applovin.mediation.MaxAdFormat f;
    private com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a g;

    public interface a {
        void onClick(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton adControlButton);
    }

    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(android.content.Context context) {
        this(context, null, 0);
    }

    private int a(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b bVar) {
        if (com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOAD == bVar) {
            return com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_brand_color, getContext());
        }
        return com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOADING == bVar ? com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_brand_color, getContext()) : com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    private java.lang.String b(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b bVar) {
        if (com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOAD == bVar) {
            return "Load";
        }
        return com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOADING == bVar ? "" : "Show";
    }

    private void c(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b bVar) {
        if (com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOADING == bVar) {
            setEnabled(false);
            this.c.a();
        } else {
            setEnabled(true);
            this.c.b();
        }
        this.b.setText(b(bVar));
        this.f1056a.setColor(a(bVar));
    }

    public com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b getControlState() {
        return this.d;
    }

    public com.applovin.mediation.MaxAdFormat getFormat() {
        return this.f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a aVar = this.g;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b bVar) {
        if (this.d != bVar) {
            c(bVar);
        }
        this.d = bVar;
    }

    public void setFormat(com.applovin.mediation.MaxAdFormat maxAdFormat) {
        this.f = maxAdFormat;
    }

    public void setOnClickListener(com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a aVar) {
        this.g = aVar;
    }

    public AdControlButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        this.f1056a = gradientDrawable;
        android.widget.Button button = new android.widget.Button(getContext());
        this.b = button;
        com.applovin.impl.o oVar = new com.applovin.impl.o(getContext(), 20, android.R.attr.progressBarStyleSmall);
        this.c = oVar;
        com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b bVar = com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.b.LOAD;
        this.d = bVar;
        setBackgroundColor(0);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        oVar.setColor(-1);
        addView(oVar, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.b.setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
