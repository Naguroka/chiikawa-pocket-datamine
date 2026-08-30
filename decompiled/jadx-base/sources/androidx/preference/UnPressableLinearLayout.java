package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class UnPressableLinearLayout extends android.widget.LinearLayout {
    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z) {
    }

    public UnPressableLinearLayout(android.content.Context context) {
        this(context, null);
    }

    public UnPressableLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
