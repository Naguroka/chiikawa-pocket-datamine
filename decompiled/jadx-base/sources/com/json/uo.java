package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ironsource/uo;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/j8;", "b", "", "toString", "J", "timeInterval", "Lcom/ironsource/j8;", "unit", "<init>", "(JLcom/ironsource/j8;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long timeInterval;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.json.j8 unit;

    public uo(long j, com.json.j8 unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        this.timeInterval = j;
        this.unit = unit;
    }

    public /* synthetic */ uo(long j, com.json.j8 j8Var, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? com.json.j8.Second : j8Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getTimeInterval() {
        return this.timeInterval;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.json.j8 getUnit() {
        return this.unit;
    }

    public java.lang.String toString() {
        return "PacingCappingConfig(timeInterval=" + this.timeInterval + " unit=" + this.unit + ')';
    }
}
