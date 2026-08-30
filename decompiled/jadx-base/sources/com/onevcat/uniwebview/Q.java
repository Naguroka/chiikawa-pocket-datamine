package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class Q extends android.widget.Toolbar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f3684a;
    public final android.widget.TextView b;
    public final android.widget.TextView c;
    public com.onevcat.uniwebview.S d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        setTitle("");
        setElevation(5.0f);
        setBackgroundColor(-1);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.Toolbar.LayoutParams layoutParams = new android.widget.Toolbar.LayoutParams(-2, -2);
        layoutParams.gravity = androidx.core.view.GravityCompat.END;
        linearLayout.setLayoutParams(layoutParams);
        android.widget.TextView textViewA = a("❮");
        this.b = textViewA;
        android.widget.TextView textViewA2 = a("❯");
        this.c = textViewA2;
        android.widget.TextView textViewA3 = a("Done");
        this.f3684a = textViewA3;
        a(false, false);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(24, 0, 24, 0);
        linearLayout.addView(textViewA, layoutParams2);
        linearLayout.addView(textViewA2, layoutParams2);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(48, 0, 24, 0);
        linearLayout.addView(textViewA3, layoutParams3);
        addView(linearLayout);
    }

    public final android.widget.TextView a(java.lang.String str) {
        final android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setText(str);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.onevcat.uniwebview.Q$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.onevcat.uniwebview.Q.a(this.f$0, textView, view);
            }
        });
        return textView;
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = 255;
        setTitleTextColor(android.graphics.Color.argb((int) (f4 * f5), (int) (f * f5), (int) (f2 * f5), (int) (f3 * f5)));
    }

    public final com.onevcat.uniwebview.S getDelegate() {
        return this.d;
    }

    public final void setDelegate(com.onevcat.uniwebview.S s) {
        this.d = s;
    }

    public final void setDoneButtonText(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        this.f3684a.setText(text);
    }

    public final void setGoBackButtonText(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        this.b.setText(text);
    }

    public final void setGoForwardButtonText(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        this.c.setText(text);
    }

    public final void setNavigationButtonsShow(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
        this.c.setVisibility(z ? 0 : 8);
    }

    public static final void a(com.onevcat.uniwebview.Q this$0, android.widget.TextView button, android.view.View view) {
        com.onevcat.uniwebview.S s;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "$button");
        if (kotlin.jvm.internal.Intrinsics.areEqual(button, this$0.f3684a)) {
            com.onevcat.uniwebview.S s2 = this$0.d;
            if (s2 != null) {
                com.onevcat.uniwebview.N n = (com.onevcat.uniwebview.N) s2;
                n.c.a(n.p.getName(), com.onevcat.uniwebview.d2.WebViewDone, "");
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(button, this$0.b)) {
            com.onevcat.uniwebview.S s3 = this$0.d;
            if (s3 != null) {
                ((com.onevcat.uniwebview.N) s3).p.b();
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(button, this$0.c) || (s = this$0.d) == null) {
            return;
        }
        com.onevcat.uniwebview.C1593w c1593w = ((com.onevcat.uniwebview.N) s).p;
        com.onevcat.uniwebview.C1593w c1593w2 = c1593w.d.i;
        if (c1593w2 != null) {
            if (c1593w2.canGoForward()) {
                c1593w2.goForward();
            }
        } else if (c1593w.canGoForward()) {
            c1593w.goForward();
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        float f5 = 255;
        setBackgroundColor(android.graphics.Color.argb((int) (f4 * f5), (int) (f * f5), (int) (f2 * f5), (int) (f3 * f5)));
    }

    public final void a(boolean z, boolean z2) {
        this.b.setEnabled(z);
        this.b.setAlpha(z ? 1.0f : 0.3f);
        this.c.setEnabled(z2);
        this.c.setAlpha(z2 ? 1.0f : 0.3f);
    }
}
