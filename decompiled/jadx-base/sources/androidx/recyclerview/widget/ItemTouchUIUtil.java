package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public interface ItemTouchUIUtil {
    void clearView(android.view.View view);

    void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, float f, float f2, int i, boolean z);

    void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, float f, float f2, int i, boolean z);

    void onSelected(android.view.View view);
}
