package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class P extends android.widget.RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected android.widget.Button f3886a;
    protected android.widget.EditText b;
    protected android.content.Context c;
    protected android.graphics.Rect d;
    protected android.graphics.Rect e;

    public P(android.content.Context context, android.widget.EditText editText) {
        super(context);
        this.b = editText;
        this.c = context;
        this.d = new android.graphics.Rect(16, 16, 16, 16);
        this.e = new android.graphics.Rect(0, 0, 0, 0);
        createUI();
        setBackgroundColor(-1);
    }

    protected void createUI() {
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        android.widget.Button button = new android.widget.Button(this.c);
        this.f3886a = button;
        button.setId(android.view.View.generateViewId());
        this.f3886a.setText(this.c.getResources().getIdentifier("ok", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, "android"));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(11);
        this.f3886a.setLayoutParams(layoutParams);
        this.f3886a.setBackgroundColor(0);
        addView(this.f3886a);
        this.b.setId(android.view.View.generateViewId());
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, this.f3886a.getId());
        this.b.setLayoutParams(layoutParams2);
        addView(this.b);
        android.graphics.Rect rect = this.d;
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.view.View
    public final void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f3886a.setOnClickListener(onClickListener);
    }
}
