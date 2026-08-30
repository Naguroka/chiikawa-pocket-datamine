package androidx.window.embedding;

/* JADX INFO: compiled from: SplitPlaceholderRule.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\bH\u0016J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0080\u0002¢\u0006\u0002\b\u0019R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitRule;", "filters", "", "Landroidx/window/embedding/ActivityFilter;", "placeholderIntent", "Landroid/content/Intent;", "minWidth", "", "minSmallestWidth", "splitRatio", "", "layoutDirection", "(Ljava/util/Set;Landroid/content/Intent;IIFI)V", "getFilters", "()Ljava/util/Set;", "getPlaceholderIntent", "()Landroid/content/Intent;", "equals", "", "other", "", "hashCode", "plus", "filter", "plus$window_release", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SplitPlaceholderRule extends androidx.window.embedding.SplitRule {
    private final java.util.Set<androidx.window.embedding.ActivityFilter> filters;
    private final android.content.Intent placeholderIntent;

    public /* synthetic */ SplitPlaceholderRule(java.util.Set set, android.content.Intent intent, int i, int i2, float f, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(set, intent, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0.5f : f, (i4 & 32) != 0 ? 3 : i3);
    }

    public final android.content.Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(java.util.Set<androidx.window.embedding.ActivityFilter> filters, android.content.Intent placeholderIntent, int i, int i2, float f, int i3) {
        super(i, i2, f, i3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filters, "filters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placeholderIntent, "placeholderIntent");
        this.placeholderIntent = placeholderIntent;
        this.filters = kotlin.collections.CollectionsKt.toSet(filters);
    }

    public final java.util.Set<androidx.window.embedding.ActivityFilter> getFilters() {
        return this.filters;
    }

    public final androidx.window.embedding.SplitPlaceholderRule plus$window_release(androidx.window.embedding.ActivityFilter filter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filter, "filter");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new androidx.window.embedding.SplitPlaceholderRule(kotlin.collections.CollectionsKt.toSet(linkedHashSet), this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.SplitPlaceholderRule) || !super.equals(other) || !super.equals(other)) {
            return false;
        }
        androidx.window.embedding.SplitPlaceholderRule splitPlaceholderRule = (androidx.window.embedding.SplitPlaceholderRule) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.filters, splitPlaceholderRule.filters) && kotlin.jvm.internal.Intrinsics.areEqual(this.placeholderIntent, splitPlaceholderRule.placeholderIntent);
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }
}
