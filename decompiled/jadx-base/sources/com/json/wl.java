package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ironsource/wl;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", "revenue", "precision", "toString", "", "hashCode", "other", "", "equals", "D", "d", "()D", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "<init>", "(DLjava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class wl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final com.json.wl.Companion INSTANCE = new com.json.wl.Companion(null);
    public static final java.lang.String d = "revenue";
    public static final java.lang.String e = "precision";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final double revenue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String precision;

    /* JADX INFO: renamed from: com.ironsource.wl$a, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/wl$a;", "", "Lorg/json/JSONObject;", "json", "Lcom/ironsource/wl;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "LOAD_ARM_DATA_KEY_PRECISION", "Ljava/lang/String;", "LOAD_ARM_DATA_KEY_REVENUE", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.json.wl a(org.json.JSONObject json) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
            try {
                double d = json.getDouble("revenue");
                java.lang.String precision = json.getString("precision");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(precision, "precision");
                return new com.json.wl(d, precision);
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.rt.a(e);
                return null;
            }
        }
    }

    public wl(double d2, java.lang.String precision) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(precision, "precision");
        this.revenue = d2;
        this.precision = precision;
    }

    public static /* synthetic */ com.json.wl a(com.json.wl wlVar, double d2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d2 = wlVar.revenue;
        }
        if ((i & 2) != 0) {
            str = wlVar.precision;
        }
        return wlVar.a(d2, str);
    }

    @kotlin.jvm.JvmStatic
    public static final com.json.wl a(org.json.JSONObject jSONObject) {
        return INSTANCE.a(jSONObject);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getRevenue() {
        return this.revenue;
    }

    public final com.json.wl a(double revenue, java.lang.String precision) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(precision, "precision");
        return new com.json.wl(revenue, precision);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getPrecision() {
        return this.precision;
    }

    public final java.lang.String c() {
        return this.precision;
    }

    public final double d() {
        return this.revenue;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.wl)) {
            return false;
        }
        com.json.wl wlVar = (com.json.wl) other;
        return java.lang.Double.compare(this.revenue, wlVar.revenue) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.precision, wlVar.precision);
    }

    public int hashCode() {
        return (java.lang.Double.hashCode(this.revenue) * 31) + this.precision.hashCode();
    }

    public java.lang.String toString() {
        return "LoadArmData(revenue=" + this.revenue + ", precision=" + this.precision + ')';
    }
}
