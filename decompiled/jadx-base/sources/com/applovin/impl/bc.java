package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.widget.TextView f642a;
    public android.widget.TextView b;
    public android.widget.ImageView c;
    public android.widget.ImageView d;
    private com.applovin.impl.cc e;
    private int f;

    public int a() {
        return this.f;
    }

    public void a(int i) {
        this.f = i;
    }

    public com.applovin.impl.cc b() {
        return this.e;
    }

    public void a(com.applovin.impl.cc ccVar) {
        this.e = ccVar;
        this.f642a.setText(ccVar.k());
        this.f642a.setTextColor(ccVar.l());
        if (this.b != null) {
            if (!android.text.TextUtils.isEmpty(ccVar.f())) {
                this.b.setTypeface(null, 0);
                this.b.setVisibility(0);
                this.b.setText(ccVar.f());
                this.b.setTextColor(ccVar.g());
                if (ccVar.p()) {
                    this.b.setTypeface(null, 1);
                }
            } else {
                this.b.setVisibility(8);
            }
        }
        if (this.c != null) {
            if (ccVar.h() > 0) {
                this.c.setImageResource(ccVar.h());
                this.c.setColorFilter(ccVar.i());
                this.c.setVisibility(0);
            } else {
                this.c.setVisibility(8);
            }
        }
        if (this.d != null) {
            if (ccVar.d() > 0) {
                this.d.setImageResource(ccVar.d());
                this.d.setColorFilter(ccVar.e());
                this.d.setVisibility(0);
                return;
            }
            this.d.setVisibility(8);
        }
    }
}
