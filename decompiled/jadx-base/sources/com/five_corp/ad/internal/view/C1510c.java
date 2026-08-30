package com.five_corp.ad.internal.view;

/* JADX INFO: renamed from: com.five_corp.ad.internal.view.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1510c extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.view.InterfaceC1508a f2094a;
    public final com.five_corp.ad.internal.view.InterfaceC1509b b;

    public C1510c(android.content.Context context, java.util.ArrayList arrayList, com.five_corp.ad.internal.view.InterfaceC1508a interfaceC1508a, com.five_corp.ad.internal.view.InterfaceC1509b interfaceC1509b) {
        super(context);
        this.f2094a = interfaceC1508a;
        this.b = interfaceC1509b;
        a(context, arrayList);
    }

    public final void a(android.content.Context context, java.util.ArrayList arrayList) {
        setOrientation(1);
        int iA = this.f2094a.a(8);
        setPadding(iA, iA, iA, iA);
        setBackgroundColor(-1);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final android.util.Pair pair = (android.util.Pair) it.next();
            java.lang.String str = (java.lang.String) pair.first;
            android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.five_corp.ad.internal.view.c$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ((java.lang.Runnable) pair.second).run();
                }
            };
            android.widget.TextView textView = new android.widget.TextView(context);
            int iA2 = this.f2094a.a(8);
            int iA3 = this.f2094a.a(16);
            textView.setPadding(iA3, iA2, iA3, iA2);
            textView.setText(str);
            textView.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            textView.setGravity(17);
            textView.setOnClickListener(onClickListener);
            textView.setClickable(true);
            textView.setFocusable(true);
            android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RectShape());
            shapeDrawable.getPaint().setColor(-1);
            textView.setBackground(new android.graphics.drawable.RippleDrawable(android.content.res.ColorStateList.valueOf(-3355444), shapeDrawable, null));
            addView(textView);
        }
        android.view.View view = new android.view.View(context);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, this.f2094a.a(5)));
        addView(view);
        java.lang.String string = context.getString(android.R.string.cancel);
        android.view.View.OnClickListener onClickListener2 = new android.view.View.OnClickListener() { // from class: com.five_corp.ad.internal.view.c$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                this.f$0.a(view2);
            }
        };
        android.widget.Button button = new android.widget.Button(context);
        button.setText(string);
        button.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        button.setOnClickListener(onClickListener2);
        button.setStateListAnimator(null);
        button.setElevation(0.0f);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(this.f2094a.a(8));
        gradientDrawable.setStroke(this.f2094a.a(2), -3355444);
        button.setBackground(new android.graphics.drawable.RippleDrawable(android.content.res.ColorStateList.valueOf(-3355444), gradientDrawable, null));
        addView(button);
    }

    public final /* synthetic */ void a(android.view.View view) {
        this.b.a();
    }
}
