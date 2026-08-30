package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public final class TimestampAdjustment implements androidx.media3.effect.GlEffect {
    private final androidx.media3.effect.TimestampAdjustment.TimestampMap timestampMap;

    public interface TimestampMap {
        void calculateOutputTimeUs(long j, androidx.media3.common.util.TimestampConsumer timestampConsumer);
    }

    public TimestampAdjustment(androidx.media3.effect.TimestampAdjustment.TimestampMap timestampMap) {
        this.timestampMap = timestampMap;
    }

    @Override // androidx.media3.effect.GlEffect
    public androidx.media3.effect.GlShaderProgram toGlShaderProgram(android.content.Context context, boolean z) {
        return new androidx.media3.effect.TimestampAdjustmentShaderProgram(this.timestampMap);
    }
}
