package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
final class a extends android.view.View implements com.applovin.exoplayer2.ui.SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f559a;
    private java.util.List b;
    private int c;
    private float d;
    private com.applovin.impl.x2 f;
    private float g;

    public a(android.content.Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        java.util.List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float fA = com.applovin.exoplayer2.ui.h.a(this.c, this.d, height, i);
        if (fA <= 0.0f) {
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            com.applovin.impl.a5 a5VarA = (com.applovin.impl.a5) list.get(i2);
            if (a5VarA.q != Integer.MIN_VALUE) {
                a5VarA = a(a5VarA);
            }
            com.applovin.impl.a5 a5Var = a5VarA;
            int i3 = paddingBottom;
            ((com.applovin.exoplayer2.ui.g) this.f559a.get(i2)).a(a5Var, this.f, fA, com.applovin.exoplayer2.ui.h.a(a5Var.o, a5Var.p, height, i), this.g, canvas, paddingLeft, paddingTop, width, i3);
            i2++;
            size = size;
            i = i;
            paddingBottom = i3;
            width = width;
        }
    }

    public a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f559a = new java.util.ArrayList();
        this.b = java.util.Collections.emptyList();
        this.c = 0;
        this.d = 0.0533f;
        this.f = com.applovin.impl.x2.g;
        this.g = 0.08f;
    }

    private static com.applovin.impl.a5 a(com.applovin.impl.a5 a5Var) {
        com.applovin.impl.a5.b bVarB = a5Var.a().b(-3.4028235E38f).b(Integer.MIN_VALUE).b((android.text.Layout.Alignment) null);
        if (a5Var.g == 0) {
            bVarB.a(1.0f - a5Var.f, 0);
        } else {
            bVarB.a((-a5Var.f) - 1.0f, 1);
        }
        int i = a5Var.h;
        if (i == 0) {
            bVarB.a(2);
        } else if (i == 2) {
            bVarB.a(0);
        }
        return bVarB.a();
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(java.util.List list, com.applovin.impl.x2 x2Var, float f, int i, float f2) {
        this.b = list;
        this.f = x2Var;
        this.d = f;
        this.c = i;
        this.g = f2;
        while (this.f559a.size() < list.size()) {
            this.f559a.add(new com.applovin.exoplayer2.ui.g(getContext()));
        }
        invalidate();
    }
}
