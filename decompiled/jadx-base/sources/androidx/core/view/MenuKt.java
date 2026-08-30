package androidx.core.view;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\u0002\u001a3\u0010\r\u001a\u00020\u000e*\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0010H\u0086\bø\u0001\u0000\u001aH\u0010\u0013\u001a\u00020\u000e*\u00020\u000326\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0014H\u0086\bø\u0001\u0000\u001a\u0015\u0010\u0016\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0086\n\u001a\r\u0010\u0017\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a*\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\u001b\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0086\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "Landroid/view/Menu;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/Sequence;", "size", "", "getSize", "(Landroid/view/Menu;)I", "contains", "", "item", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "removeItemAt", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MenuKt {
    public static final android.view.MenuItem get(android.view.Menu menu, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "<this>");
        android.view.MenuItem item = menu.getItem(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
        return item;
    }

    public static final boolean contains(android.view.Menu menu, android.view.MenuItem item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(menu.getItem(i), item)) {
                return true;
            }
        }
        return false;
    }

    public static final void minusAssign(android.view.Menu menu, android.view.MenuItem item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        menu.removeItem(item.getItemId());
    }

    public static final int getSize(android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "<this>");
        return menu.size();
    }

    public static final boolean isEmpty(android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "<this>");
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "<this>");
        return menu.size() != 0;
    }

    public static final void forEach(android.view.Menu menu, kotlin.jvm.functions.Function1<? super android.view.MenuItem, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = menu.getItem(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
            action.invoke(item);
        }
    }

    public static final void forEachIndexed(android.view.Menu menu, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.view.MenuItem, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            android.view.MenuItem item = menu.getItem(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
            action.invoke(numValueOf, item);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.MenuKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Menu.kt */
    @kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/view/MenuKt$iterator$1", "", "Landroid/view/MenuItem;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "hasNext", "", "next", "remove", "", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<android.view.MenuItem>, kotlin.jvm.internal.markers.KMutableIterator {
        final /* synthetic */ android.view.Menu $this_iterator;
        private int index;

        AnonymousClass1(android.view.Menu menu) {
            this.$this_iterator = menu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public android.view.MenuItem next() {
            android.view.Menu menu = this.$this_iterator;
            int i = this.index;
            this.index = i + 1;
            android.view.MenuItem item = menu.getItem(i);
            if (item != null) {
                return item;
            }
            throw new java.lang.IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            kotlin.Unit unit;
            android.view.Menu menu = this.$this_iterator;
            int i = this.index - 1;
            this.index = i;
            android.view.MenuItem item = menu.getItem(i);
            if (item != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
                menu.removeItem(item.getItemId());
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
        }
    }

    public static final java.util.Iterator<android.view.MenuItem> iterator(android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "<this>");
        return new androidx.core.view.MenuKt.AnonymousClass1(menu);
    }

    public static final void removeItemAt(android.view.Menu menu, int i) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "<this>");
        android.view.MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
    }

    public static final kotlin.sequences.Sequence<android.view.MenuItem> getChildren(final android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "<this>");
        return new kotlin.sequences.Sequence<android.view.MenuItem>() { // from class: androidx.core.view.MenuKt$children$1
            @Override // kotlin.sequences.Sequence
            public java.util.Iterator<android.view.MenuItem> iterator() {
                return androidx.core.view.MenuKt.iterator(menu);
            }
        };
    }
}
