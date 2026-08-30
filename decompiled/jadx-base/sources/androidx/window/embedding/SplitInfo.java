package androidx.window.embedding;

/* JADX INFO: compiled from: SplitInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J\u0013\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Landroidx/window/embedding/SplitInfo;", "", "primaryActivityStack", "Landroidx/window/embedding/ActivityStack;", "secondaryActivityStack", "splitRatio", "", "(Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/ActivityStack;F)V", "getPrimaryActivityStack", "()Landroidx/window/embedding/ActivityStack;", "getSecondaryActivityStack", "getSplitRatio", "()F", "contains", "", "activity", "Landroid/app/Activity;", "equals", "other", "hashCode", "", "toString", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SplitInfo {
    private final androidx.window.embedding.ActivityStack primaryActivityStack;
    private final androidx.window.embedding.ActivityStack secondaryActivityStack;
    private final float splitRatio;

    public SplitInfo(androidx.window.embedding.ActivityStack primaryActivityStack, androidx.window.embedding.ActivityStack secondaryActivityStack, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryActivityStack, "primaryActivityStack");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryActivityStack, "secondaryActivityStack");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitRatio = f;
    }

    public final androidx.window.embedding.ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    public final androidx.window.embedding.ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public final boolean contains(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        return this.primaryActivityStack.contains(activity) || this.secondaryActivityStack.contains(activity);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.SplitInfo)) {
            return false;
        }
        androidx.window.embedding.SplitInfo splitInfo = (androidx.window.embedding.SplitInfo) other;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.primaryActivityStack, splitInfo.primaryActivityStack) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryActivityStack, splitInfo.secondaryActivityStack)) {
            return (this.splitRatio > splitInfo.splitRatio ? 1 : (this.splitRatio == splitInfo.splitRatio ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((this.primaryActivityStack.hashCode() * 31) + this.secondaryActivityStack.hashCode()) * 31) + java.lang.Float.hashCode(this.splitRatio);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitInfo:{");
        sb.append("primaryActivityStack=" + getPrimaryActivityStack() + ',');
        sb.append("secondaryActivityStack=" + getSecondaryActivityStack() + ',');
        sb.append("splitRatio=" + getSplitRatio() + '}');
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
