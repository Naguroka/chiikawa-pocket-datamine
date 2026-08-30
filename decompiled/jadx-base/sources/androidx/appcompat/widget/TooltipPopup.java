package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class TooltipPopup {
    private static final java.lang.String TAG = "TooltipPopup";
    private final android.view.View mContentView;
    private final android.content.Context mContext;
    private final android.view.WindowManager.LayoutParams mLayoutParams;
    private final android.widget.TextView mMessageView;
    private final int[] mTmpAnchorPos;
    private final int[] mTmpAppPos;
    private final android.graphics.Rect mTmpDisplayFrame;

    TooltipPopup(android.content.Context context) {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        this.mLayoutParams = layoutParams;
        this.mTmpDisplayFrame = new android.graphics.Rect();
        this.mTmpAnchorPos = new int[2];
        this.mTmpAppPos = new int[2];
        this.mContext = context;
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(androidx.appcompat.R.layout.abc_tooltip, (android.view.ViewGroup) null);
        this.mContentView = viewInflate;
        this.mMessageView = (android.widget.TextView) viewInflate.findViewById(androidx.appcompat.R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = androidx.appcompat.R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    void show(android.view.View view, int i, int i2, boolean z, java.lang.CharSequence charSequence) {
        if (isShowing()) {
            hide();
        }
        this.mMessageView.setText(charSequence);
        computePosition(view, i, i2, z, this.mLayoutParams);
        ((android.view.WindowManager) this.mContext.getSystemService("window")).addView(this.mContentView, this.mLayoutParams);
    }

    void hide() {
        if (isShowing()) {
            ((android.view.WindowManager) this.mContext.getSystemService("window")).removeView(this.mContentView);
        }
    }

    boolean isShowing() {
        return this.mContentView.getParent() != null;
    }

    private void computePosition(android.view.View view, int i, int i2, boolean z, android.view.WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.mContext.getResources().getDimensionPixelOffset(androidx.appcompat.R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.mContext.getResources().getDimensionPixelOffset(androidx.appcompat.R.dimen.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.mContext.getResources().getDimensionPixelOffset(z ? androidx.appcompat.R.dimen.tooltip_y_offset_touch : androidx.appcompat.R.dimen.tooltip_y_offset_non_touch);
        android.view.View appRootView = getAppRootView(view);
        if (appRootView == null) {
            android.util.Log.e(TAG, "Cannot find app view");
            return;
        }
        appRootView.getWindowVisibleDisplayFrame(this.mTmpDisplayFrame);
        if (this.mTmpDisplayFrame.left < 0 && this.mTmpDisplayFrame.top < 0) {
            android.content.res.Resources resources = this.mContext.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.mTmpDisplayFrame.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        appRootView.getLocationOnScreen(this.mTmpAppPos);
        view.getLocationOnScreen(this.mTmpAnchorPos);
        int[] iArr = this.mTmpAnchorPos;
        int i4 = iArr[0];
        int[] iArr2 = this.mTmpAppPos;
        int i5 = i4 - iArr2[0];
        iArr[0] = i5;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i5 + i) - (appRootView.getWidth() / 2);
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mContentView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.mContentView.getMeasuredHeight();
        int i6 = this.mTmpAnchorPos[1];
        int i7 = ((i3 + i6) - dimensionPixelOffset3) - measuredHeight;
        int i8 = i6 + height + dimensionPixelOffset3;
        if (z) {
            if (i7 >= 0) {
                layoutParams.y = i7;
                return;
            } else {
                layoutParams.y = i8;
                return;
            }
        }
        if (measuredHeight + i8 <= this.mTmpDisplayFrame.height()) {
            layoutParams.y = i8;
        } else {
            layoutParams.y = i7;
        }
    }

    private static android.view.View getAppRootView(android.view.View view) {
        android.view.View rootView = view.getRootView();
        android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof android.view.WindowManager.LayoutParams) && ((android.view.WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return ((android.app.Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
