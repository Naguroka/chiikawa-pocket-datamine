package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ironsource/q1;", "", "Lcom/ironsource/m1;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/unity3d/mediation/LevelPlayAdInfo;", "b", "adUnit", "adInfo", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/ironsource/m1;", "d", "()Lcom/ironsource/m1;", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "c", "()Lcom/unity3d/mediation/LevelPlayAdInfo;", "<init>", "(Lcom/ironsource/m1;Lcom/unity3d/mediation/LevelPlayAdInfo;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.m1 adUnit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.unity3d.mediation.LevelPlayAdInfo adInfo;

    public q1(com.json.m1 adUnit, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.adUnit = adUnit;
        this.adInfo = levelPlayAdInfo;
    }

    public /* synthetic */ q1(com.json.m1 m1Var, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(m1Var, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    public static /* synthetic */ com.json.q1 a(com.json.q1 q1Var, com.json.m1 m1Var, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            m1Var = q1Var.adUnit;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = q1Var.adInfo;
        }
        return q1Var.a(m1Var, levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.m1 getAdUnit() {
        return this.adUnit;
    }

    public final com.json.q1 a(com.json.m1 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new com.json.q1(adUnit, adInfo);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.unity3d.mediation.LevelPlayAdInfo getAdInfo() {
        return this.adInfo;
    }

    public final com.unity3d.mediation.LevelPlayAdInfo c() {
        return this.adInfo;
    }

    public final com.json.m1 d() {
        return this.adUnit;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.q1)) {
            return false;
        }
        com.json.q1 q1Var = (com.json.q1) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.adUnit, q1Var.adUnit) && kotlin.jvm.internal.Intrinsics.areEqual(this.adInfo, q1Var.adInfo);
    }

    public int hashCode() {
        int iHashCode = this.adUnit.hashCode() * 31;
        com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo = this.adInfo;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public java.lang.String toString() {
        return "AdUnitCallback(adUnit=" + this.adUnit + ", adInfo=" + this.adInfo + ')';
    }
}
