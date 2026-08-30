package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class PreferenceViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.graphics.drawable.Drawable mBackground;
    private final android.util.SparseArray<android.view.View> mCachedViews;
    private boolean mDividerAllowedAbove;
    private boolean mDividerAllowedBelow;
    private android.content.res.ColorStateList mTitleTextColors;

    PreferenceViewHolder(android.view.View view) {
        super(view);
        android.util.SparseArray<android.view.View> sparseArray = new android.util.SparseArray<>(4);
        this.mCachedViews = sparseArray;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        sparseArray.put(android.R.id.title, textView);
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        sparseArray.put(androidx.preference.R.id.icon_frame, view.findViewById(androidx.preference.R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.mBackground = view.getBackground();
        if (textView != null) {
            this.mTitleTextColors = textView.getTextColors();
        }
    }

    public static androidx.preference.PreferenceViewHolder createInstanceForTests(android.view.View view) {
        return new androidx.preference.PreferenceViewHolder(view);
    }

    public android.view.View findViewById(int i) {
        android.view.View view = this.mCachedViews.get(i);
        if (view != null) {
            return view;
        }
        android.view.View viewFindViewById = this.itemView.findViewById(i);
        if (viewFindViewById != null) {
            this.mCachedViews.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }

    public boolean isDividerAllowedAbove() {
        return this.mDividerAllowedAbove;
    }

    public void setDividerAllowedAbove(boolean z) {
        this.mDividerAllowedAbove = z;
    }

    public boolean isDividerAllowedBelow() {
        return this.mDividerAllowedBelow;
    }

    public void setDividerAllowedBelow(boolean z) {
        this.mDividerAllowedBelow = z;
    }

    void resetState() {
        if (this.itemView.getBackground() != this.mBackground) {
            androidx.core.view.ViewCompat.setBackground(this.itemView, this.mBackground);
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(android.R.id.title);
        if (textView == null || this.mTitleTextColors == null || textView.getTextColors().equals(this.mTitleTextColors)) {
            return;
        }
        textView.setTextColor(this.mTitleTextColors);
    }
}
