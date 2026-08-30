package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class d0 extends android.app.Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.view.ViewGroup f699a;
    private com.applovin.sdk.AppLovinSdkUtils.Size b;
    private android.app.Activity c;
    private android.widget.RelativeLayout d;

    public d0(android.view.ViewGroup viewGroup, com.applovin.sdk.AppLovinSdkUtils.Size size, android.app.Activity activity) {
        super(activity, android.R.style.Theme.Translucent.NoTitleBar);
        this.f699a = viewGroup;
        this.b = size;
        this.c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.c, this.b.getWidth()), com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.c, this.b.getHeight()));
        layoutParams.addRule(13);
        this.f699a.setLayoutParams(layoutParams);
        int iDpToPx = com.applovin.sdk.AppLovinSdkUtils.dpToPx(this.c, 60);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        android.widget.ImageButton imageButton = new android.widget.ImageButton(this.c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.impl.d0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f$0.a(view);
            }
        });
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.c);
        this.d = relativeLayout;
        relativeLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.d.setBackgroundColor(Integer.MIN_VALUE);
        this.d.addView(imageButton);
        this.d.addView(this.f699a);
        this.d.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.impl.d0$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f$0.b(view);
            }
        });
        setContentView(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.view.View view) {
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.d.removeView(this.f699a);
        super.dismiss();
    }
}
