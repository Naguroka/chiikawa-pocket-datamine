package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class AlertController {
    android.widget.ListAdapter mAdapter;
    private int mAlertDialogLayout;
    private final int mButtonIconDimen;
    android.widget.Button mButtonNegative;
    private android.graphics.drawable.Drawable mButtonNegativeIcon;
    android.os.Message mButtonNegativeMessage;
    private java.lang.CharSequence mButtonNegativeText;
    android.widget.Button mButtonNeutral;
    private android.graphics.drawable.Drawable mButtonNeutralIcon;
    android.os.Message mButtonNeutralMessage;
    private java.lang.CharSequence mButtonNeutralText;
    private int mButtonPanelSideLayout;
    android.widget.Button mButtonPositive;
    private android.graphics.drawable.Drawable mButtonPositiveIcon;
    android.os.Message mButtonPositiveMessage;
    private java.lang.CharSequence mButtonPositiveText;
    private final android.content.Context mContext;
    private android.view.View mCustomTitleView;
    final androidx.appcompat.app.AppCompatDialog mDialog;
    android.os.Handler mHandler;
    private android.graphics.drawable.Drawable mIcon;
    private android.widget.ImageView mIconView;
    int mListItemLayout;
    int mListLayout;
    android.widget.ListView mListView;
    private java.lang.CharSequence mMessage;
    private android.widget.TextView mMessageView;
    int mMultiChoiceItemLayout;
    androidx.core.widget.NestedScrollView mScrollView;
    private boolean mShowTitle;
    int mSingleChoiceItemLayout;
    private java.lang.CharSequence mTitle;
    private android.widget.TextView mTitleView;
    private android.view.View mView;
    private int mViewLayoutResId;
    private int mViewSpacingBottom;
    private int mViewSpacingLeft;
    private int mViewSpacingRight;
    private int mViewSpacingTop;
    private final android.view.Window mWindow;
    private boolean mViewSpacingSpecified = false;
    private int mIconId = 0;
    int mCheckedItem = -1;
    private int mButtonPanelLayoutHint = 0;
    private final android.view.View.OnClickListener mButtonHandler = new android.view.View.OnClickListener() { // from class: androidx.appcompat.app.AlertController.1
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            android.os.Message messageObtain;
            if (view == androidx.appcompat.app.AlertController.this.mButtonPositive && androidx.appcompat.app.AlertController.this.mButtonPositiveMessage != null) {
                messageObtain = android.os.Message.obtain(androidx.appcompat.app.AlertController.this.mButtonPositiveMessage);
            } else if (view == androidx.appcompat.app.AlertController.this.mButtonNegative && androidx.appcompat.app.AlertController.this.mButtonNegativeMessage != null) {
                messageObtain = android.os.Message.obtain(androidx.appcompat.app.AlertController.this.mButtonNegativeMessage);
            } else {
                messageObtain = (view != androidx.appcompat.app.AlertController.this.mButtonNeutral || androidx.appcompat.app.AlertController.this.mButtonNeutralMessage == null) ? null : android.os.Message.obtain(androidx.appcompat.app.AlertController.this.mButtonNeutralMessage);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            androidx.appcompat.app.AlertController.this.mHandler.obtainMessage(1, androidx.appcompat.app.AlertController.this.mDialog).sendToTarget();
        }
    };

    private static final class ButtonHandler extends android.os.Handler {
        private static final int MSG_DISMISS_DIALOG = 1;
        private java.lang.ref.WeakReference<android.content.DialogInterface> mDialog;

        public ButtonHandler(android.content.DialogInterface dialogInterface) {
            this.mDialog = new java.lang.ref.WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((android.content.DialogInterface.OnClickListener) message.obj).onClick(this.mDialog.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((android.content.DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static boolean shouldCenterSingleButton(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public AlertController(android.content.Context context, androidx.appcompat.app.AppCompatDialog appCompatDialog, android.view.Window window) {
        this.mContext = context;
        this.mDialog = appCompatDialog;
        this.mWindow = window;
        this.mHandler = new androidx.appcompat.app.AlertController.ButtonHandler(appCompatDialog);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, androidx.appcompat.R.styleable.AlertDialog, androidx.appcompat.R.attr.alertDialogStyle, 0);
        this.mAlertDialogLayout = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_android_layout, 0);
        this.mButtonPanelSideLayout = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.mListLayout = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_listLayout, 0);
        this.mMultiChoiceItemLayout = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.mSingleChoiceItemLayout = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.mListItemLayout = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_listItemLayout, 0);
        this.mShowTitle = typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AlertDialog_showTitle, true);
        this.mButtonIconDimen = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        appCompatDialog.supportRequestWindowFeature(1);
    }

    static boolean canTextInput(android.view.View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return false;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (canTextInput(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public void installContent() {
        this.mDialog.setContentView(selectContentView());
        setupView();
    }

    private int selectContentView() {
        int i = this.mButtonPanelSideLayout;
        if (i == 0) {
            return this.mAlertDialogLayout;
        }
        return this.mButtonPanelLayoutHint == 1 ? i : this.mAlertDialogLayout;
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.mTitle = charSequence;
        android.widget.TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setCustomTitle(android.view.View view) {
        this.mCustomTitleView = view;
    }

    public void setMessage(java.lang.CharSequence charSequence) {
        this.mMessage = charSequence;
        android.widget.TextView textView = this.mMessageView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setView(int i) {
        this.mView = null;
        this.mViewLayoutResId = i;
        this.mViewSpacingSpecified = false;
    }

    public void setView(android.view.View view) {
        this.mView = view;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = false;
    }

    public void setView(android.view.View view, int i, int i2, int i3, int i4) {
        this.mView = view;
        this.mViewLayoutResId = 0;
        this.mViewSpacingSpecified = true;
        this.mViewSpacingLeft = i;
        this.mViewSpacingTop = i2;
        this.mViewSpacingRight = i3;
        this.mViewSpacingBottom = i4;
    }

    public void setButtonPanelLayoutHint(int i) {
        this.mButtonPanelLayoutHint = i;
    }

    public void setButton(int i, java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener, android.os.Message message, android.graphics.drawable.Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.mHandler.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.mButtonNeutralText = charSequence;
            this.mButtonNeutralMessage = message;
            this.mButtonNeutralIcon = drawable;
        } else if (i == -2) {
            this.mButtonNegativeText = charSequence;
            this.mButtonNegativeMessage = message;
            this.mButtonNegativeIcon = drawable;
        } else {
            if (i == -1) {
                this.mButtonPositiveText = charSequence;
                this.mButtonPositiveMessage = message;
                this.mButtonPositiveIcon = drawable;
                return;
            }
            throw new java.lang.IllegalArgumentException("Button does not exist");
        }
    }

    public void setIcon(int i) {
        this.mIcon = null;
        this.mIconId = i;
        android.widget.ImageView imageView = this.mIconView;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.mIconView.setImageResource(this.mIconId);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.mIcon = drawable;
        this.mIconId = 0;
        android.widget.ImageView imageView = this.mIconView;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.mIconView.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public int getIconAttributeResId(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.mContext.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public android.widget.ListView getListView() {
        return this.mListView;
    }

    public android.widget.Button getButton(int i) {
        if (i == -3) {
            return this.mButtonNeutral;
        }
        if (i == -2) {
            return this.mButtonNegative;
        }
        if (i != -1) {
            return null;
        }
        return this.mButtonPositive;
    }

    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.mScrollView;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    public boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.mScrollView;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    private android.view.ViewGroup resolvePanel(android.view.View view, android.view.View view2) {
        if (view == null) {
            if (view2 instanceof android.view.ViewStub) {
                view2 = ((android.view.ViewStub) view2).inflate();
            }
            return (android.view.ViewGroup) view2;
        }
        if (view2 != null) {
            android.view.ViewParent parent = view2.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof android.view.ViewStub) {
            view = ((android.view.ViewStub) view).inflate();
        }
        return (android.view.ViewGroup) view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setupView() {
        android.view.View viewFindViewById;
        android.widget.ListAdapter listAdapter;
        android.view.View viewFindViewById2;
        android.view.View viewFindViewById3 = this.mWindow.findViewById(androidx.appcompat.R.id.parentPanel);
        android.view.View viewFindViewById4 = viewFindViewById3.findViewById(androidx.appcompat.R.id.topPanel);
        android.view.View viewFindViewById5 = viewFindViewById3.findViewById(androidx.appcompat.R.id.contentPanel);
        android.view.View viewFindViewById6 = viewFindViewById3.findViewById(androidx.appcompat.R.id.buttonPanel);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById3.findViewById(androidx.appcompat.R.id.customPanel);
        setupCustomContent(viewGroup);
        android.view.View viewFindViewById7 = viewGroup.findViewById(androidx.appcompat.R.id.topPanel);
        android.view.View viewFindViewById8 = viewGroup.findViewById(androidx.appcompat.R.id.contentPanel);
        android.view.View viewFindViewById9 = viewGroup.findViewById(androidx.appcompat.R.id.buttonPanel);
        android.view.ViewGroup viewGroupResolvePanel = resolvePanel(viewFindViewById7, viewFindViewById4);
        android.view.ViewGroup viewGroupResolvePanel2 = resolvePanel(viewFindViewById8, viewFindViewById5);
        android.view.ViewGroup viewGroupResolvePanel3 = resolvePanel(viewFindViewById9, viewFindViewById6);
        setupContent(viewGroupResolvePanel2);
        setupButtons(viewGroupResolvePanel3);
        setupTitle(viewGroupResolvePanel);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (viewGroupResolvePanel == null || viewGroupResolvePanel.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (viewGroupResolvePanel3 == null || viewGroupResolvePanel3.getVisibility() == 8) ? false : true;
        if (!z3 && viewGroupResolvePanel2 != null && (viewFindViewById2 = viewGroupResolvePanel2.findViewById(androidx.appcompat.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z2 != 0) {
            androidx.core.widget.NestedScrollView nestedScrollView = this.mScrollView;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            android.view.View viewFindViewById10 = (this.mMessage == null && this.mListView == null) ? null : viewGroupResolvePanel.findViewById(androidx.appcompat.R.id.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupResolvePanel2 != null && (viewFindViewById = viewGroupResolvePanel2.findViewById(androidx.appcompat.R.id.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        android.widget.ListView listView = this.mListView;
        if (listView instanceof androidx.appcompat.app.AlertController.RecycleListView) {
            ((androidx.appcompat.app.AlertController.RecycleListView) listView).setHasDecor(z2, z3);
        }
        if (!z) {
            android.view.View view = this.mListView;
            if (view == null) {
                view = this.mScrollView;
            }
            if (view != null) {
                setScrollIndicators(viewGroupResolvePanel2, view, z2 | (z3 ? 2 : 0), 3);
            }
        }
        android.widget.ListView listView2 = this.mListView;
        if (listView2 == null || (listAdapter = this.mAdapter) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i = this.mCheckedItem;
        if (i > -1) {
            listView2.setItemChecked(i, true);
            listView2.setSelection(i);
        }
    }

    private void setScrollIndicators(android.view.ViewGroup viewGroup, android.view.View view, int i, int i2) {
        android.view.View viewFindViewById = this.mWindow.findViewById(androidx.appcompat.R.id.scrollIndicatorUp);
        android.view.View viewFindViewById2 = this.mWindow.findViewById(androidx.appcompat.R.id.scrollIndicatorDown);
        androidx.core.view.ViewCompat.setScrollIndicators(view, i, i2);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$2, reason: invalid class name */
    class AnonymousClass2 implements androidx.core.widget.NestedScrollView.OnScrollChangeListener {
        final /* synthetic */ android.view.View val$bottom;
        final /* synthetic */ android.view.View val$top;

        AnonymousClass2(android.view.View view, android.view.View view2) {
            this.val$top = view;
            this.val$bottom = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(androidx.core.widget.NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            androidx.appcompat.app.AlertController.manageScrollIndicators(nestedScrollView, this.val$top, this.val$bottom);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$3, reason: invalid class name */
    class AnonymousClass3 implements java.lang.Runnable {
        final /* synthetic */ android.view.View val$bottom;
        final /* synthetic */ android.view.View val$top;

        AnonymousClass3(android.view.View view, android.view.View view2) {
            this.val$top = view;
            this.val$bottom = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.app.AlertController.manageScrollIndicators(androidx.appcompat.app.AlertController.this.mScrollView, this.val$top, this.val$bottom);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$4, reason: invalid class name */
    class AnonymousClass4 implements android.widget.AbsListView.OnScrollListener {
        final /* synthetic */ android.view.View val$bottom;
        final /* synthetic */ android.view.View val$top;

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView absListView, int i) {
        }

        AnonymousClass4(android.view.View view, android.view.View view2) {
            this.val$top = view;
            this.val$bottom = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView absListView, int i, int i2, int i3) {
            androidx.appcompat.app.AlertController.manageScrollIndicators(absListView, this.val$top, this.val$bottom);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$5, reason: invalid class name */
    class AnonymousClass5 implements java.lang.Runnable {
        final /* synthetic */ android.view.View val$bottom;
        final /* synthetic */ android.view.View val$top;

        AnonymousClass5(android.view.View view, android.view.View view2) {
            this.val$top = view;
            this.val$bottom = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.app.AlertController.manageScrollIndicators(androidx.appcompat.app.AlertController.this.mListView, this.val$top, this.val$bottom);
        }
    }

    private void setupCustomContent(android.view.ViewGroup viewGroup) {
        android.view.View viewInflate = this.mView;
        if (viewInflate == null) {
            viewInflate = this.mViewLayoutResId != 0 ? android.view.LayoutInflater.from(this.mContext).inflate(this.mViewLayoutResId, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !canTextInput(viewInflate)) {
            this.mWindow.setFlags(131072, 131072);
        }
        if (z) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.mWindow.findViewById(androidx.appcompat.R.id.custom);
            frameLayout.addView(viewInflate, new android.view.ViewGroup.LayoutParams(-1, -1));
            if (this.mViewSpacingSpecified) {
                frameLayout.setPadding(this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
            }
            if (this.mListView != null) {
                ((androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void setupTitle(android.view.ViewGroup viewGroup) {
        if (this.mCustomTitleView != null) {
            viewGroup.addView(this.mCustomTitleView, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
            this.mWindow.findViewById(androidx.appcompat.R.id.title_template).setVisibility(8);
            return;
        }
        this.mIconView = (android.widget.ImageView) this.mWindow.findViewById(android.R.id.icon);
        if ((!android.text.TextUtils.isEmpty(this.mTitle)) && this.mShowTitle) {
            android.widget.TextView textView = (android.widget.TextView) this.mWindow.findViewById(androidx.appcompat.R.id.alertTitle);
            this.mTitleView = textView;
            textView.setText(this.mTitle);
            int i = this.mIconId;
            if (i != 0) {
                this.mIconView.setImageResource(i);
                return;
            }
            android.graphics.drawable.Drawable drawable = this.mIcon;
            if (drawable != null) {
                this.mIconView.setImageDrawable(drawable);
                return;
            } else {
                this.mTitleView.setPadding(this.mIconView.getPaddingLeft(), this.mIconView.getPaddingTop(), this.mIconView.getPaddingRight(), this.mIconView.getPaddingBottom());
                this.mIconView.setVisibility(8);
                return;
            }
        }
        this.mWindow.findViewById(androidx.appcompat.R.id.title_template).setVisibility(8);
        this.mIconView.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    private void setupContent(android.view.ViewGroup viewGroup) {
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) this.mWindow.findViewById(androidx.appcompat.R.id.scrollView);
        this.mScrollView = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.mScrollView.setNestedScrollingEnabled(false);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(android.R.id.message);
        this.mMessageView = textView;
        if (textView == null) {
            return;
        }
        java.lang.CharSequence charSequence = this.mMessage;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.mScrollView.removeView(this.mMessageView);
        if (this.mListView != null) {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.mScrollView.getParent();
            int iIndexOfChild = viewGroup2.indexOfChild(this.mScrollView);
            viewGroup2.removeViewAt(iIndexOfChild);
            viewGroup2.addView(this.mListView, iIndexOfChild, new android.view.ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    static void manageScrollIndicators(android.view.View view, android.view.View view2, android.view.View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private void setupButtons(android.view.ViewGroup viewGroup) {
        int i;
        android.widget.Button button = (android.widget.Button) viewGroup.findViewById(android.R.id.button1);
        this.mButtonPositive = button;
        button.setOnClickListener(this.mButtonHandler);
        if (android.text.TextUtils.isEmpty(this.mButtonPositiveText) && this.mButtonPositiveIcon == null) {
            this.mButtonPositive.setVisibility(8);
            i = 0;
        } else {
            this.mButtonPositive.setText(this.mButtonPositiveText);
            android.graphics.drawable.Drawable drawable = this.mButtonPositiveIcon;
            if (drawable != null) {
                int i2 = this.mButtonIconDimen;
                drawable.setBounds(0, 0, i2, i2);
                this.mButtonPositive.setCompoundDrawables(this.mButtonPositiveIcon, null, null, null);
            }
            this.mButtonPositive.setVisibility(0);
            i = 1;
        }
        android.widget.Button button2 = (android.widget.Button) viewGroup.findViewById(android.R.id.button2);
        this.mButtonNegative = button2;
        button2.setOnClickListener(this.mButtonHandler);
        if (android.text.TextUtils.isEmpty(this.mButtonNegativeText) && this.mButtonNegativeIcon == null) {
            this.mButtonNegative.setVisibility(8);
        } else {
            this.mButtonNegative.setText(this.mButtonNegativeText);
            android.graphics.drawable.Drawable drawable2 = this.mButtonNegativeIcon;
            if (drawable2 != null) {
                int i3 = this.mButtonIconDimen;
                drawable2.setBounds(0, 0, i3, i3);
                this.mButtonNegative.setCompoundDrawables(this.mButtonNegativeIcon, null, null, null);
            }
            this.mButtonNegative.setVisibility(0);
            i |= 2;
        }
        android.widget.Button button3 = (android.widget.Button) viewGroup.findViewById(android.R.id.button3);
        this.mButtonNeutral = button3;
        button3.setOnClickListener(this.mButtonHandler);
        if (android.text.TextUtils.isEmpty(this.mButtonNeutralText) && this.mButtonNeutralIcon == null) {
            this.mButtonNeutral.setVisibility(8);
        } else {
            this.mButtonNeutral.setText(this.mButtonNeutralText);
            android.graphics.drawable.Drawable drawable3 = this.mButtonNeutralIcon;
            if (drawable3 != null) {
                int i4 = this.mButtonIconDimen;
                drawable3.setBounds(0, 0, i4, i4);
                this.mButtonNeutral.setCompoundDrawables(this.mButtonNeutralIcon, null, null, null);
            }
            this.mButtonNeutral.setVisibility(0);
            i |= 4;
        }
        if (shouldCenterSingleButton(this.mContext)) {
            if (i == 1) {
                centerButton(this.mButtonPositive);
            } else if (i == 2) {
                centerButton(this.mButtonNegative);
            } else if (i == 4) {
                centerButton(this.mButtonNeutral);
            }
        }
        if (i != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void centerButton(android.widget.Button button) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static class RecycleListView extends android.widget.ListView {
        private final int mPaddingBottomNoButtons;
        private final int mPaddingTopNoTitle;

        public RecycleListView(android.content.Context context) {
            this(context, null);
        }

        public RecycleListView(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.RecycleListView);
            this.mPaddingBottomNoButtons = typedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.mPaddingTopNoTitle = typedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.mPaddingTopNoTitle, getPaddingRight(), z2 ? getPaddingBottom() : this.mPaddingBottomNoButtons);
        }
    }

    public static class AlertParams {
        public android.widget.ListAdapter mAdapter;
        public boolean[] mCheckedItems;
        public final android.content.Context mContext;
        public android.database.Cursor mCursor;
        public android.view.View mCustomTitleView;
        public boolean mForceInverseBackground;
        public android.graphics.drawable.Drawable mIcon;
        public final android.view.LayoutInflater mInflater;
        public java.lang.String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public java.lang.CharSequence[] mItems;
        public java.lang.String mLabelColumn;
        public java.lang.CharSequence mMessage;
        public android.graphics.drawable.Drawable mNegativeButtonIcon;
        public android.content.DialogInterface.OnClickListener mNegativeButtonListener;
        public java.lang.CharSequence mNegativeButtonText;
        public android.graphics.drawable.Drawable mNeutralButtonIcon;
        public android.content.DialogInterface.OnClickListener mNeutralButtonListener;
        public java.lang.CharSequence mNeutralButtonText;
        public android.content.DialogInterface.OnCancelListener mOnCancelListener;
        public android.content.DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public android.content.DialogInterface.OnClickListener mOnClickListener;
        public android.content.DialogInterface.OnDismissListener mOnDismissListener;
        public android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public android.content.DialogInterface.OnKeyListener mOnKeyListener;
        public androidx.appcompat.app.AlertController.AlertParams.OnPrepareListViewListener mOnPrepareListViewListener;
        public android.graphics.drawable.Drawable mPositiveButtonIcon;
        public android.content.DialogInterface.OnClickListener mPositiveButtonListener;
        public java.lang.CharSequence mPositiveButtonText;
        public java.lang.CharSequence mTitle;
        public android.view.View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public int mViewSpacingTop;
        public int mIconId = 0;
        public int mIconAttrId = 0;
        public boolean mViewSpacingSpecified = false;
        public int mCheckedItem = -1;
        public boolean mRecycleOnMeasure = true;
        public boolean mCancelable = true;

        public interface OnPrepareListViewListener {
            void onPrepareListView(android.widget.ListView listView);
        }

        public AlertParams(android.content.Context context) {
            this.mContext = context;
            this.mInflater = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void apply(androidx.appcompat.app.AlertController alertController) {
            android.view.View view = this.mCustomTitleView;
            if (view != null) {
                alertController.setCustomTitle(view);
            } else {
                java.lang.CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    alertController.setTitle(charSequence);
                }
                android.graphics.drawable.Drawable drawable = this.mIcon;
                if (drawable != null) {
                    alertController.setIcon(drawable);
                }
                int i = this.mIconId;
                if (i != 0) {
                    alertController.setIcon(i);
                }
                int i2 = this.mIconAttrId;
                if (i2 != 0) {
                    alertController.setIcon(alertController.getIconAttributeResId(i2));
                }
            }
            java.lang.CharSequence charSequence2 = this.mMessage;
            if (charSequence2 != null) {
                alertController.setMessage(charSequence2);
            }
            java.lang.CharSequence charSequence3 = this.mPositiveButtonText;
            if (charSequence3 != null || this.mPositiveButtonIcon != null) {
                alertController.setButton(-1, charSequence3, this.mPositiveButtonListener, null, this.mPositiveButtonIcon);
            }
            java.lang.CharSequence charSequence4 = this.mNegativeButtonText;
            if (charSequence4 != null || this.mNegativeButtonIcon != null) {
                alertController.setButton(-2, charSequence4, this.mNegativeButtonListener, null, this.mNegativeButtonIcon);
            }
            java.lang.CharSequence charSequence5 = this.mNeutralButtonText;
            if (charSequence5 != null || this.mNeutralButtonIcon != null) {
                alertController.setButton(-3, charSequence5, this.mNeutralButtonListener, null, this.mNeutralButtonIcon);
            }
            if (this.mItems != null || this.mCursor != null || this.mAdapter != null) {
                createListView(alertController);
            }
            android.view.View view2 = this.mView;
            if (view2 != null) {
                if (this.mViewSpacingSpecified) {
                    alertController.setView(view2, this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
                    return;
                } else {
                    alertController.setView(view2);
                    return;
                }
            }
            int i3 = this.mViewLayoutResId;
            if (i3 != 0) {
                alertController.setView(i3);
            }
        }

        private void createListView(final androidx.appcompat.app.AlertController alertController) {
            int i;
            android.widget.ListAdapter checkedItemAdapter;
            final androidx.appcompat.app.AlertController.RecycleListView recycleListView = (androidx.appcompat.app.AlertController.RecycleListView) this.mInflater.inflate(alertController.mListLayout, (android.view.ViewGroup) null);
            if (this.mIsMultiChoice) {
                if (this.mCursor == null) {
                    checkedItemAdapter = new android.widget.ArrayAdapter<java.lang.CharSequence>(this.mContext, alertController.mMultiChoiceItemLayout, android.R.id.text1, this.mItems) { // from class: androidx.appcompat.app.AlertController.AlertParams.1
                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public android.view.View getView(int i2, android.view.View view, android.view.ViewGroup viewGroup) {
                            android.view.View view2 = super.getView(i2, view, viewGroup);
                            if (androidx.appcompat.app.AlertController.AlertParams.this.mCheckedItems != null && androidx.appcompat.app.AlertController.AlertParams.this.mCheckedItems[i2]) {
                                recycleListView.setItemChecked(i2, true);
                            }
                            return view2;
                        }
                    };
                } else {
                    checkedItemAdapter = new android.widget.CursorAdapter(this.mContext, this.mCursor, false) { // from class: androidx.appcompat.app.AlertController.AlertParams.2
                        private final int mIsCheckedIndex;
                        private final int mLabelIndex;

                        {
                            android.database.Cursor cursor = getCursor();
                            this.mLabelIndex = cursor.getColumnIndexOrThrow(androidx.appcompat.app.AlertController.AlertParams.this.mLabelColumn);
                            this.mIsCheckedIndex = cursor.getColumnIndexOrThrow(androidx.appcompat.app.AlertController.AlertParams.this.mIsCheckedColumn);
                        }

                        @Override // android.widget.CursorAdapter
                        public void bindView(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
                            ((android.widget.CheckedTextView) view.findViewById(android.R.id.text1)).setText(cursor.getString(this.mLabelIndex));
                            recycleListView.setItemChecked(cursor.getPosition(), cursor.getInt(this.mIsCheckedIndex) == 1);
                        }

                        @Override // android.widget.CursorAdapter
                        public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
                            return androidx.appcompat.app.AlertController.AlertParams.this.mInflater.inflate(alertController.mMultiChoiceItemLayout, viewGroup, false);
                        }
                    };
                }
            } else {
                if (this.mIsSingleChoice) {
                    i = alertController.mSingleChoiceItemLayout;
                } else {
                    i = alertController.mListItemLayout;
                }
                int i2 = i;
                if (this.mCursor != null) {
                    checkedItemAdapter = new android.widget.SimpleCursorAdapter(this.mContext, i2, this.mCursor, new java.lang.String[]{this.mLabelColumn}, new int[]{android.R.id.text1});
                } else {
                    checkedItemAdapter = this.mAdapter;
                    if (checkedItemAdapter == null) {
                        checkedItemAdapter = new androidx.appcompat.app.AlertController.CheckedItemAdapter(this.mContext, i2, android.R.id.text1, this.mItems);
                    }
                }
            }
            androidx.appcompat.app.AlertController.AlertParams.OnPrepareListViewListener onPrepareListViewListener = this.mOnPrepareListViewListener;
            if (onPrepareListViewListener != null) {
                onPrepareListViewListener.onPrepareListView(recycleListView);
            }
            alertController.mAdapter = checkedItemAdapter;
            alertController.mCheckedItem = this.mCheckedItem;
            if (this.mOnClickListener != null) {
                recycleListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.3
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i3, long j) {
                        androidx.appcompat.app.AlertController.AlertParams.this.mOnClickListener.onClick(alertController.mDialog, i3);
                        if (androidx.appcompat.app.AlertController.AlertParams.this.mIsSingleChoice) {
                            return;
                        }
                        alertController.mDialog.dismiss();
                    }
                });
            } else if (this.mOnCheckboxClickListener != null) {
                recycleListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.4
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i3, long j) {
                        if (androidx.appcompat.app.AlertController.AlertParams.this.mCheckedItems != null) {
                            androidx.appcompat.app.AlertController.AlertParams.this.mCheckedItems[i3] = recycleListView.isItemChecked(i3);
                        }
                        androidx.appcompat.app.AlertController.AlertParams.this.mOnCheckboxClickListener.onClick(alertController.mDialog, i3, recycleListView.isItemChecked(i3));
                    }
                });
            }
            android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.mOnItemSelectedListener;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.mIsSingleChoice) {
                recycleListView.setChoiceMode(1);
            } else if (this.mIsMultiChoice) {
                recycleListView.setChoiceMode(2);
            }
            alertController.mListView = recycleListView;
        }
    }

    private static class CheckedItemAdapter extends android.widget.ArrayAdapter<java.lang.CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        public CheckedItemAdapter(android.content.Context context, int i, int i2, java.lang.CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }
    }
}
