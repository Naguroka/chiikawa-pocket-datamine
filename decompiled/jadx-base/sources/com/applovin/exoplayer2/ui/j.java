package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
final class j extends android.widget.FrameLayout implements com.applovin.exoplayer2.ui.SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.ui.a f570a;
    private final android.webkit.WebView b;
    private java.util.List c;
    private com.applovin.impl.x2 d;
    private float f;
    private int g;
    private float h;

    class a extends android.webkit.WebView {
        a(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f572a;

        static {
            int[] iArr = new int[android.text.Layout.Alignment.values().length];
            f572a = iArr;
            try {
                iArr[android.text.Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f572a[android.text.Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f572a[android.text.Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public j(android.content.Context context) {
        this(context, null);
    }

    private static int a(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    private static java.lang.String b(int i) {
        if (i != 1) {
            return i != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:26:0x0106  */
    /* JADX WARN: Code duplicated, block: B:29:0x0120  */
    /* JADX WARN: Code duplicated, block: B:30:0x0123  */
    /* JADX WARN: Code duplicated, block: B:33:0x013a  */
    /* JADX WARN: Code duplicated, block: B:35:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x013f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0148  */
    /* JADX WARN: Code duplicated, block: B:48:0x015a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0182  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x021f  */
    /* JADX WARN: Code duplicated, block: B:63:0x023f  */
    private void b() {
        java.lang.String strA;
        int iA;
        int i;
        float f;
        java.lang.String strA2;
        int i2;
        int i3;
        int i4;
        java.lang.String str;
        java.lang.String str2;
        int i5;
        java.lang.String str3;
        java.lang.String str4;
        int i6;
        com.applovin.exoplayer2.ui.f.b bVarA;
        java.util.Iterator it;
        com.applovin.exoplayer2.ui.f.b bVar;
        android.text.Layout.Alignment alignment;
        java.lang.String str5;
        boolean z;
        com.applovin.exoplayer2.ui.j jVar = this;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        float f2 = 1.2f;
        int i7 = 0;
        int i8 = 1;
        sb.append(com.applovin.impl.xp.a("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", com.applovin.exoplayer2.ui.c.a(jVar.d.f1484a), jVar.a(jVar.g, jVar.f), java.lang.Float.valueOf(1.2f), a(jVar.d)));
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.applovin.exoplayer2.ui.c.a("default_bg"), com.applovin.impl.xp.a("background-color:%s;", com.applovin.exoplayer2.ui.c.a(jVar.d.b)));
        int i9 = 0;
        while (i9 < jVar.c.size()) {
            com.applovin.impl.a5 a5Var = (com.applovin.impl.a5) jVar.c.get(i9);
            float f3 = a5Var.i;
            float f4 = f3 != -3.4028235E38f ? f3 * 100.0f : 50.0f;
            int iA2 = a(a5Var.j);
            float f5 = a5Var.f;
            if (f5 != -3.4028235E38f) {
                if (a5Var.g != i8) {
                    java.lang.Float fValueOf = java.lang.Float.valueOf(f5 * 100.0f);
                    java.lang.Object[] objArr = new java.lang.Object[i8];
                    objArr[i7] = fValueOf;
                    strA = com.applovin.impl.xp.a("%.2f%%", objArr);
                    iA = a5Var.q == i8 ? -a(a5Var.h) : a(a5Var.h);
                } else if (f5 >= 0.0f) {
                    java.lang.Float fValueOf2 = java.lang.Float.valueOf(f5 * f2);
                    java.lang.Object[] objArr2 = new java.lang.Object[i8];
                    objArr2[i7] = fValueOf2;
                    strA = com.applovin.impl.xp.a("%.2fem", objArr2);
                    iA = i7;
                    i = iA;
                } else {
                    java.lang.Float fValueOf3 = java.lang.Float.valueOf(((-f5) - 1.0f) * f2);
                    java.lang.Object[] objArr3 = new java.lang.Object[i8];
                    objArr3[i7] = fValueOf3;
                    strA = com.applovin.impl.xp.a("%.2fem", objArr3);
                    i = i8;
                    iA = i7;
                }
                f = a5Var.k;
                if (f != -3.4028235E38f) {
                    java.lang.Object[] objArr4 = new java.lang.Object[i8];
                    objArr4[i7] = java.lang.Float.valueOf(f * 100.0f);
                    strA2 = com.applovin.impl.xp.a("%.2f%%", objArr4);
                } else {
                    strA2 = "fit-content";
                }
                java.lang.String strA3 = a(a5Var.b);
                java.lang.String strB = b(a5Var.q);
                java.lang.String strA4 = jVar.a(a5Var.o, a5Var.p);
                if (a5Var.m) {
                    i2 = a5Var.n;
                } else {
                    i2 = jVar.d.c;
                }
                java.lang.String strA5 = com.applovin.exoplayer2.ui.c.a(i2);
                i3 = iA;
                i4 = a5Var.q;
                str = androidx.media3.extractor.text.ttml.TtmlNode.RIGHT;
                str2 = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
                if (i4 != 1) {
                    if (i != 0) {
                        str = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
                    }
                    str2 = "top";
                    i5 = 2;
                    str3 = str;
                } else if (i4 != 2) {
                    str3 = i != 0 ? "bottom" : "top";
                    i5 = 2;
                } else {
                    if (i == 0) {
                        str = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
                    }
                    str2 = "top";
                    i5 = 2;
                    str3 = str;
                }
                if (i4 != i5 || i4 == 1) {
                    str4 = "height";
                    i6 = i3;
                    i3 = iA2;
                } else {
                    str4 = "width";
                    i6 = iA2;
                }
                bVarA = com.applovin.exoplayer2.ui.f.a(a5Var.f580a, getContext().getResources().getDisplayMetrics().density);
                it = map.keySet().iterator();
                while (it.hasNext()) {
                    java.util.Iterator it2 = it;
                    java.lang.String str6 = (java.lang.String) it.next();
                    com.applovin.exoplayer2.ui.f.b bVar2 = bVarA;
                    str5 = (java.lang.String) map.put(str6, (java.lang.String) map.get(str6));
                    if (str5 != null || str5.equals(map.get(str6))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.applovin.impl.b1.b(z);
                    it = it2;
                    bVarA = bVar2;
                }
                bVar = bVarA;
                java.util.HashMap map2 = map;
                sb.append(com.applovin.impl.xp.a("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", java.lang.Integer.valueOf(i9), str2, java.lang.Float.valueOf(f4), str3, strA, str4, strA2, strA3, strB, strA4, strA5, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i3), a(a5Var))).append(com.applovin.impl.xp.a("<span class='%s'>", "default_bg"));
                alignment = a5Var.c;
                if (alignment != null) {
                    sb.append(com.applovin.impl.xp.a("<span style='display:inline-block; text-align:%s;'>", a(alignment))).append(bVar.f566a).append("</span>");
                } else {
                    sb.append(bVar.f566a);
                }
                sb.append("</span></div>");
                i9++;
                map = map2;
                i8 = 1;
                f2 = 1.2f;
                i7 = 0;
                jVar = this;
            } else {
                java.lang.Object[] objArr5 = new java.lang.Object[i8];
                objArr5[i7] = java.lang.Float.valueOf((1.0f - jVar.h) * 100.0f);
                strA = com.applovin.impl.xp.a("%.2f%%", objArr5);
                iA = -100;
            }
            i = i7;
            f = a5Var.k;
            if (f != -3.4028235E38f) {
                java.lang.Object[] objArr6 = new java.lang.Object[i8];
                objArr6[i7] = java.lang.Float.valueOf(f * 100.0f);
                strA2 = com.applovin.impl.xp.a("%.2f%%", objArr6);
            } else {
                strA2 = "fit-content";
            }
            java.lang.String strA6 = a(a5Var.b);
            java.lang.String strB2 = b(a5Var.q);
            java.lang.String strA7 = jVar.a(a5Var.o, a5Var.p);
            if (a5Var.m) {
                i2 = a5Var.n;
            } else {
                i2 = jVar.d.c;
            }
            java.lang.String strA8 = com.applovin.exoplayer2.ui.c.a(i2);
            i3 = iA;
            i4 = a5Var.q;
            str = androidx.media3.extractor.text.ttml.TtmlNode.RIGHT;
            str2 = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
            if (i4 != 1) {
                if (i != 0) {
                    str = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
                }
                str2 = "top";
                i5 = 2;
                str3 = str;
            } else if (i4 != 2) {
                if (i != 0) {
                }
                i5 = 2;
            } else {
                if (i == 0) {
                    str = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
                }
                str2 = "top";
                i5 = 2;
                str3 = str;
            }
            if (i4 != i5) {
                str4 = "height";
                i6 = i3;
                i3 = iA2;
            } else {
                str4 = "height";
                i6 = i3;
                i3 = iA2;
            }
            bVarA = com.applovin.exoplayer2.ui.f.a(a5Var.f580a, getContext().getResources().getDisplayMetrics().density);
            it = map.keySet().iterator();
            while (it.hasNext()) {
                java.util.Iterator it3 = it;
                java.lang.String str7 = (java.lang.String) it.next();
                com.applovin.exoplayer2.ui.f.b bVar3 = bVarA;
                str5 = (java.lang.String) map.put(str7, (java.lang.String) map.get(str7));
                if (str5 != null) {
                    z = true;
                } else {
                    z = true;
                }
                com.applovin.impl.b1.b(z);
                it = it3;
                bVarA = bVar3;
            }
            bVar = bVarA;
            java.util.HashMap map3 = map;
            sb.append(com.applovin.impl.xp.a("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", java.lang.Integer.valueOf(i9), str2, java.lang.Float.valueOf(f4), str3, strA, str4, strA2, strA6, strB2, strA7, strA8, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i3), a(a5Var))).append(com.applovin.impl.xp.a("<span class='%s'>", "default_bg"));
            alignment = a5Var.c;
            if (alignment != null) {
                sb.append(com.applovin.impl.xp.a("<span style='display:inline-block; text-align:%s;'>", a(alignment))).append(bVar.f566a).append("</span>");
            } else {
                sb.append(bVar.f566a);
            }
            sb.append("</span></div>");
            i9++;
            map = map3;
            i8 = 1;
            f2 = 1.2f;
            i7 = 0;
            jVar = this;
        }
        java.util.Map map4 = map;
        sb.append("</div></body></html>");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<html><head><style>");
        for (java.lang.String str8 : map4.keySet()) {
            sb2.append(str8).append("{").append((java.lang.String) map4.get(str8)).append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.b.loadData(android.util.Base64.encodeToString(sb.toString().getBytes(com.applovin.exoplayer2.common.base.Charsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        b();
    }

    public j(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = java.util.Collections.emptyList();
        this.d = com.applovin.impl.x2.g;
        this.f = 0.0533f;
        this.g = 0;
        this.h = 0.08f;
        com.applovin.exoplayer2.ui.a aVar = new com.applovin.exoplayer2.ui.a(context, attributeSet);
        this.f570a = aVar;
        com.applovin.exoplayer2.ui.j.a aVar2 = new com.applovin.exoplayer2.ui.j.a(context, attributeSet);
        this.b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }

    private static java.lang.String a(com.applovin.impl.x2 x2Var) {
        int i = x2Var.d;
        if (i == 1) {
            return com.applovin.impl.xp.a("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", com.applovin.exoplayer2.ui.c.a(x2Var.e));
        }
        if (i == 2) {
            return com.applovin.impl.xp.a("0.1em 0.12em 0.15em %s", com.applovin.exoplayer2.ui.c.a(x2Var.e));
        }
        if (i != 3) {
            return i != 4 ? "unset" : com.applovin.impl.xp.a("-0.05em -0.05em 0.15em %s", com.applovin.exoplayer2.ui.c.a(x2Var.e));
        }
        return com.applovin.impl.xp.a("0.06em 0.08em 0.15em %s", com.applovin.exoplayer2.ui.c.a(x2Var.e));
    }

    private static java.lang.String a(com.applovin.impl.a5 a5Var) {
        float f = a5Var.r;
        if (f == 0.0f) {
            return "";
        }
        int i = a5Var.q;
        return com.applovin.impl.xp.a("%s(%.2fdeg)", (i == 2 || i == 1) ? "skewY" : "skewX", java.lang.Float.valueOf(f));
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(java.util.List list, com.applovin.impl.x2 x2Var, float f, int i, float f2) {
        this.d = x2Var;
        this.f = f;
        this.g = i;
        this.h = f2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.applovin.impl.a5 a5Var = (com.applovin.impl.a5) list.get(i2);
            if (a5Var.d != null) {
                arrayList.add(a5Var);
            } else {
                arrayList2.add(a5Var);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            b();
        }
        this.f570a.a(arrayList, x2Var, f, i, f2);
        invalidate();
    }

    public void a() {
        this.b.destroy();
    }

    private java.lang.String a(int i, float f) {
        float fA = com.applovin.exoplayer2.ui.h.a(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fA == -3.4028235E38f ? "unset" : com.applovin.impl.xp.a("%.2fpx", java.lang.Float.valueOf(fA / getContext().getResources().getDisplayMetrics().density));
    }

    private static java.lang.String a(android.text.Layout.Alignment alignment) {
        if (alignment == null) {
            return androidx.media3.extractor.text.ttml.TtmlNode.CENTER;
        }
        int i = com.applovin.exoplayer2.ui.j.b.f572a[alignment.ordinal()];
        if (i != 1) {
            return i != 2 ? androidx.media3.extractor.text.ttml.TtmlNode.CENTER : androidx.media3.extractor.text.ttml.TtmlNode.END;
        }
        return androidx.media3.extractor.text.ttml.TtmlNode.START;
    }
}
