package androidx.core.view;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0015\u0010\u0010\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a3\u0010\u0013\u001a\u00020\u0014*\u00020\u00032!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\bø\u0001\u0000\u001aH\u0010\u0019\u001a\u00020\u0014*\u00020\u000326\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u001aH\u0086\bø\u0001\u0000\u001a\u0015\u0010\u001c\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\rH\u0086\u0002\u001a\r\u0010\u001d\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\r\u0010\u001e\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 *\u00020\u0003H\u0086\u0002\u001a\u0015\u0010!\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\"\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a\u0017\u0010#\u001a\u00020\u0014*\u00020$2\b\b\u0001\u0010\f\u001a\u00020\rH\u0086\b\u001a5\u0010%\u001a\u00020\u0014*\u00020$2\b\b\u0003\u0010&\u001a\u00020\r2\b\b\u0003\u0010'\u001a\u00020\r2\b\b\u0003\u0010(\u001a\u00020\r2\b\b\u0003\u0010)\u001a\u00020\rH\u0086\b\u001a5\u0010*\u001a\u00020\u0014*\u00020$2\b\b\u0003\u0010+\u001a\u00020\r2\b\b\u0003\u0010'\u001a\u00020\r2\b\b\u0003\u0010,\u001a\u00020\r2\b\b\u0003\u0010)\u001a\u00020\rH\u0087\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\t*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\r*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "descendants", "getDescendants", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Landroid/view/ViewGroup;)Lkotlin/ranges/IntRange;", "size", "", "getSize", "(Landroid/view/ViewGroup;)I", "contains", "", "view", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "plusAssign", "setMargins", "Landroid/view/ViewGroup$MarginLayoutParams;", "updateMargins", androidx.media3.extractor.text.ttml.TtmlNode.LEFT, "top", androidx.media3.extractor.text.ttml.TtmlNode.RIGHT, "bottom", "updateMarginsRelative", androidx.media3.extractor.text.ttml.TtmlNode.START, androidx.media3.extractor.text.ttml.TtmlNode.END, "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ViewGroupKt {
    public static final android.view.View get(android.view.ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        android.view.View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    public static final boolean contains(android.view.ViewGroup viewGroup, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void plusAssign(android.view.ViewGroup viewGroup, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        viewGroup.addView(view);
    }

    public static final void minusAssign(android.view.ViewGroup viewGroup, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        viewGroup.removeView(view);
    }

    public static final int getSize(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return viewGroup.getChildCount() != 0;
    }

    public static final void forEach(android.view.ViewGroup viewGroup, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            action.invoke(childAt);
        }
    }

    public static final void forEachIndexed(android.view.ViewGroup viewGroup, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.view.View, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            android.view.View childAt = viewGroup.getChildAt(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            action.invoke(numValueOf, childAt);
        }
    }

    public static final kotlin.ranges.IntRange getIndices(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return kotlin.ranges.RangesKt.until(0, viewGroup.getChildCount());
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewGroupKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ViewGroup.kt */
    @kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "hasNext", "", "next", "remove", "", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<android.view.View>, kotlin.jvm.internal.markers.KMutableIterator {
        final /* synthetic */ android.view.ViewGroup $this_iterator;
        private int index;

        AnonymousClass1(android.view.ViewGroup viewGroup) {
            this.$this_iterator = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.getChildCount();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public android.view.View next() {
            android.view.ViewGroup viewGroup = this.$this_iterator;
            int i = this.index;
            this.index = i + 1;
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new java.lang.IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            android.view.ViewGroup viewGroup = this.$this_iterator;
            int i = this.index - 1;
            this.index = i;
            viewGroup.removeViewAt(i);
        }
    }

    public static final java.util.Iterator<android.view.View> iterator(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return new androidx.core.view.ViewGroupKt.AnonymousClass1(viewGroup);
    }

    public static final kotlin.sequences.Sequence<android.view.View> getChildren(final android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return new kotlin.sequences.Sequence<android.view.View>() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // kotlin.sequences.Sequence
            public java.util.Iterator<android.view.View> iterator() {
                return androidx.core.view.ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    public static final kotlin.sequences.Sequence<android.view.View> getDescendants(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return kotlin.sequences.SequencesKt.sequence(new androidx.core.view.ViewGroupKt$descendants$1(viewGroup, null));
    }

    public static final void setMargins(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i, i, i);
    }

    public static /* synthetic */ void updateMargins$default(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static final void updateMargins(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static /* synthetic */ void updateMarginsRelative$default(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    public static final void updateMarginsRelative(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}
