package com.five_corp.ad.internal.ad.custom_layout;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1807a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final java.lang.Integer g;
    public final java.lang.Integer h;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num, java.lang.Integer num2) {
        this.f1807a = str;
        this.b = str2;
        this.c = str3;
        if (i != 0) {
            this.d = i;
        } else {
            this.d = 1;
        }
        this.e = bool != null ? bool.booleanValue() : true;
        this.f = bool2 != null ? bool2.booleanValue() : false;
        this.g = num;
        this.h = num2;
    }

    public final java.lang.String toString() {
        return "CustomLayoutObjectText{text='" + this.f1807a + "', textColorArgb='" + this.b + "', backgroundColorArgb='" + this.c + "', gravity='" + com.five_corp.ad.internal.ad.custom_layout.m.b(this.d) + "', isRenderFrame='" + this.e + "', fontSize='" + this.g + "', tvsHackHorizontalSpace=" + this.h + '}';
    }
}
