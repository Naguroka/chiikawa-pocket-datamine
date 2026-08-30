package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u001f\u0010\u0004\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ironsource/g4;", "", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationTypes", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.String> mediationTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public g4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public g4(java.util.Map<java.lang.String, java.lang.String> mediationTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        this.mediationTypes = mediationTypes;
    }

    public /* synthetic */ g4(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.json.g4 a(com.json.g4 g4Var, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = g4Var.mediationTypes;
        }
        return g4Var.a(map);
    }

    public final com.json.g4 a(java.util.Map<java.lang.String, java.lang.String> mediationTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        return new com.json.g4(mediationTypes);
    }

    public final java.util.Map<java.lang.String, java.lang.String> a() {
        return this.mediationTypes;
    }

    public final java.util.Map<java.lang.String, java.lang.String> b() {
        return this.mediationTypes;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.json.g4) && kotlin.jvm.internal.Intrinsics.areEqual(this.mediationTypes, ((com.json.g4) other).mediationTypes);
    }

    public int hashCode() {
        return this.mediationTypes.hashCode();
    }

    public java.lang.String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.mediationTypes + ')';
    }
}
