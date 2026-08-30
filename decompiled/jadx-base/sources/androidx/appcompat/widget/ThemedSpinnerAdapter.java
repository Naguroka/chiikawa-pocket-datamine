package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public interface ThemedSpinnerAdapter extends android.widget.SpinnerAdapter {
    android.content.res.Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(android.content.res.Resources.Theme theme);

    public static final class Helper {
        private final android.content.Context mContext;
        private android.view.LayoutInflater mDropDownInflater;
        private final android.view.LayoutInflater mInflater;

        public Helper(android.content.Context context) {
            this.mContext = context;
            this.mInflater = android.view.LayoutInflater.from(context);
        }

        public void setDropDownViewTheme(android.content.res.Resources.Theme theme) {
            if (theme == null) {
                this.mDropDownInflater = null;
            } else if (theme.equals(this.mContext.getTheme())) {
                this.mDropDownInflater = this.mInflater;
            } else {
                this.mDropDownInflater = android.view.LayoutInflater.from(new androidx.appcompat.view.ContextThemeWrapper(this.mContext, theme));
            }
        }

        public android.content.res.Resources.Theme getDropDownViewTheme() {
            android.view.LayoutInflater layoutInflater = this.mDropDownInflater;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public android.view.LayoutInflater getDropDownViewInflater() {
            android.view.LayoutInflater layoutInflater = this.mDropDownInflater;
            return layoutInflater != null ? layoutInflater : this.mInflater;
        }
    }
}
