package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class PathSegment {
    private final android.graphics.PointF mEnd;
    private final float mEndFraction;
    private final android.graphics.PointF mStart;
    private final float mStartFraction;

    public PathSegment(android.graphics.PointF pointF, float f, android.graphics.PointF pointF2, float f2) {
        this.mStart = (android.graphics.PointF) androidx.core.util.Preconditions.checkNotNull(pointF, "start == null");
        this.mStartFraction = f;
        this.mEnd = (android.graphics.PointF) androidx.core.util.Preconditions.checkNotNull(pointF2, "end == null");
        this.mEndFraction = f2;
    }

    public android.graphics.PointF getStart() {
        return this.mStart;
    }

    public float getStartFraction() {
        return this.mStartFraction;
    }

    public android.graphics.PointF getEnd() {
        return this.mEnd;
    }

    public float getEndFraction() {
        return this.mEndFraction;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.core.graphics.PathSegment)) {
            return false;
        }
        androidx.core.graphics.PathSegment pathSegment = (androidx.core.graphics.PathSegment) obj;
        return java.lang.Float.compare(this.mStartFraction, pathSegment.mStartFraction) == 0 && java.lang.Float.compare(this.mEndFraction, pathSegment.mEndFraction) == 0 && this.mStart.equals(pathSegment.mStart) && this.mEnd.equals(pathSegment.mEnd);
    }

    public int hashCode() {
        int iHashCode = this.mStart.hashCode() * 31;
        float f = this.mStartFraction;
        int iFloatToIntBits = (((iHashCode + (f != 0.0f ? java.lang.Float.floatToIntBits(f) : 0)) * 31) + this.mEnd.hashCode()) * 31;
        float f2 = this.mEndFraction;
        return iFloatToIntBits + (f2 != 0.0f ? java.lang.Float.floatToIntBits(f2) : 0);
    }

    public java.lang.String toString() {
        return "PathSegment{start=" + this.mStart + ", startFraction=" + this.mStartFraction + ", end=" + this.mEnd + ", endFraction=" + this.mEndFraction + '}';
    }
}
