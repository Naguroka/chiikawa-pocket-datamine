package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: JsonPrimitive.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends com.bykv.vk.openvk.preload.a.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f1693a;

    public m(java.lang.Boolean bool) {
        this.f1693a = com.bykv.vk.openvk.preload.falconx.a.a.a(bool);
    }

    public m(java.lang.Number number) {
        this.f1693a = com.bykv.vk.openvk.preload.falconx.a.a.a(number);
    }

    public m(java.lang.String str) {
        this.f1693a = com.bykv.vk.openvk.preload.falconx.a.a.a(str);
    }

    public final boolean g() {
        return this.f1693a instanceof java.lang.Boolean;
    }

    public final boolean h() {
        return this.f1693a instanceof java.lang.Number;
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final java.lang.Number a() {
        java.lang.Object obj = this.f1693a;
        return obj instanceof java.lang.String ? new com.bykv.vk.openvk.preload.a.b.f((java.lang.String) this.f1693a) : (java.lang.Number) obj;
    }

    public final boolean i() {
        return this.f1693a instanceof java.lang.String;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (this.f1693a == null) {
            return 31;
        }
        if (a(this)) {
            jDoubleToLongBits = a().longValue();
        } else {
            java.lang.Object obj = this.f1693a;
            if (obj instanceof java.lang.Number) {
                jDoubleToLongBits = java.lang.Double.doubleToLongBits(a().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.bykv.vk.openvk.preload.a.m mVar = (com.bykv.vk.openvk.preload.a.m) obj;
        if (this.f1693a == null) {
            return mVar.f1693a == null;
        }
        if (a(this) && a(mVar)) {
            return a().longValue() == mVar.a().longValue();
        }
        java.lang.Object obj2 = this.f1693a;
        if ((obj2 instanceof java.lang.Number) && (mVar.f1693a instanceof java.lang.Number)) {
            double dDoubleValue = a().doubleValue();
            double dDoubleValue2 = mVar.a().doubleValue();
            return dDoubleValue == dDoubleValue2 || (java.lang.Double.isNaN(dDoubleValue) && java.lang.Double.isNaN(dDoubleValue2));
        }
        return obj2.equals(mVar.f1693a);
    }

    private static boolean a(com.bykv.vk.openvk.preload.a.m mVar) {
        java.lang.Object obj = mVar.f1693a;
        if (!(obj instanceof java.lang.Number)) {
            return false;
        }
        java.lang.Number number = (java.lang.Number) obj;
        return (number instanceof java.math.BigInteger) || (number instanceof java.lang.Long) || (number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte);
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final boolean f() {
        java.lang.Object obj = this.f1693a;
        if (obj instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) obj).booleanValue();
        }
        return java.lang.Boolean.parseBoolean(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final java.lang.String b() {
        java.lang.Object obj = this.f1693a;
        if (obj instanceof java.lang.Number) {
            return a().toString();
        }
        if (obj instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) obj).toString();
        }
        return (java.lang.String) obj;
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final double c() {
        return this.f1693a instanceof java.lang.Number ? a().doubleValue() : java.lang.Double.parseDouble(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final long d() {
        return this.f1693a instanceof java.lang.Number ? a().longValue() : java.lang.Long.parseLong(b());
    }

    @Override // com.bykv.vk.openvk.preload.a.h
    public final int e() {
        return this.f1693a instanceof java.lang.Number ? a().intValue() : java.lang.Integer.parseInt(b());
    }
}
