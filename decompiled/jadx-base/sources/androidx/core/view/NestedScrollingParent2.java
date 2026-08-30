package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public interface NestedScrollingParent2 extends androidx.core.view.NestedScrollingParent {
    void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr, int i3);

    void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int i5);

    void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i, int i2);

    boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i, int i2);

    void onStopNestedScroll(android.view.View view, int i);
}
