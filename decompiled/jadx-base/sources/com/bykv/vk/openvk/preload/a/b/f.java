package com.bykv.vk.openvk.preload.a.b;

/* JADX INFO: compiled from: LazilyParsedNumber.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends java.lang.Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1668a;

    public f(java.lang.String str) {
        this.f1668a = str;
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return java.lang.Integer.parseInt(this.f1668a);
            } catch (java.lang.NumberFormatException unused) {
                return (int) java.lang.Long.parseLong(this.f1668a);
            }
        } catch (java.lang.NumberFormatException unused2) {
            return new java.math.BigDecimal(this.f1668a).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return java.lang.Long.parseLong(this.f1668a);
        } catch (java.lang.NumberFormatException unused) {
            return new java.math.BigDecimal(this.f1668a).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return java.lang.Float.parseFloat(this.f1668a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return java.lang.Double.parseDouble(this.f1668a);
    }

    public final java.lang.String toString() {
        return this.f1668a;
    }

    public final int hashCode() {
        return this.f1668a.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.bykv.vk.openvk.preload.a.b.f)) {
            return false;
        }
        java.lang.String str = this.f1668a;
        java.lang.String str2 = ((com.bykv.vk.openvk.preload.a.b.f) obj).f1668a;
        return str == str2 || str.equals(str2);
    }
}
