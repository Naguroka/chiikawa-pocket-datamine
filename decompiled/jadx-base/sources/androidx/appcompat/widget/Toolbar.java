package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup implements androidx.core.view.MenuHost {
    private static final java.lang.String TAG = "Toolbar";
    private androidx.appcompat.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private android.window.OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private android.window.OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    android.widget.ImageButton mCollapseButtonView;
    private java.lang.CharSequence mCollapseDescription;
    private android.graphics.drawable.Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private androidx.appcompat.widget.RtlSpacingHelper mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    android.view.View mExpandedActionView;
    private androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private int mGravity;
    private final java.util.ArrayList<android.view.View> mHiddenViews;
    private android.widget.ImageView mLogoView;
    private int mMaxButtonHeight;
    androidx.appcompat.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
    final androidx.core.view.MenuHostHelper mMenuHostHelper;
    androidx.appcompat.widget.ActionMenuView mMenuView;
    private final androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private android.widget.ImageButton mNavButtonView;
    androidx.appcompat.widget.Toolbar.OnMenuItemClickListener mOnMenuItemClickListener;
    private androidx.appcompat.widget.ActionMenuPresenter mOuterActionMenuPresenter;
    private android.content.Context mPopupContext;
    private int mPopupTheme;
    private java.util.ArrayList<android.view.MenuItem> mProvidedMenuItems;
    private final java.lang.Runnable mShowOverflowMenuRunnable;
    private java.lang.CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private android.content.res.ColorStateList mSubtitleTextColor;
    private android.widget.TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final java.util.ArrayList<android.view.View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private java.lang.CharSequence mTitleText;
    private int mTitleTextAppearance;
    private android.content.res.ColorStateList mTitleTextColor;
    private android.widget.TextView mTitleTextView;
    private androidx.appcompat.widget.ToolbarWidgetWrapper mWrapper;

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(android.view.MenuItem menuItem);
    }

    public Toolbar(android.content.Context context) {
        this(context, null);
    }

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.toolbarStyle);
    }

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new java.util.ArrayList<>();
        this.mHiddenViews = new java.util.ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new androidx.core.view.MenuHostHelper(new java.lang.Runnable() { // from class: androidx.appcompat.widget.Toolbar$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.invalidateMenu();
            }
        });
        this.mProvidedMenuItems = new java.util.ArrayList<>();
        this.mMenuViewItemClickListener = new androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener() { // from class: androidx.appcompat.widget.Toolbar.1
            @Override // androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener
            public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                if (androidx.appcompat.widget.Toolbar.this.mMenuHostHelper.onMenuItemSelected(menuItem)) {
                    return true;
                }
                if (androidx.appcompat.widget.Toolbar.this.mOnMenuItemClickListener != null) {
                    return androidx.appcompat.widget.Toolbar.this.mOnMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        this.mShowOverflowMenuRunnable = new java.lang.Runnable() { // from class: androidx.appcompat.widget.Toolbar.2
            @Override // java.lang.Runnable
            public void run() {
                androidx.appcompat.widget.Toolbar.this.showOverflowMenu();
            }
        };
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, androidx.appcompat.R.styleable.Toolbar, i, 0);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.appcompat.R.styleable.Toolbar, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        this.mTitleTextAppearance = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Toolbar_titleTextAppearance, 0);
        this.mSubtitleTextAppearance = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.mGravity = tintTypedArrayObtainStyledAttributes.getInteger(androidx.appcompat.R.styleable.Toolbar_android_gravity, this.mGravity);
        this.mButtonGravity = tintTypedArrayObtainStyledAttributes.getInteger(androidx.appcompat.R.styleable.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_titleMargin, 0);
        dimensionPixelOffset = tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.Toolbar_titleMargins) ? tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        int dimensionPixelOffset2 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset5;
        }
        this.mMaxButtonHeight = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.Toolbar_contentInsetRight, 0);
        ensureContentInsets();
        this.mContentInsets.setAbsolute(dimensionPixelSize, dimensionPixelSize2);
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            this.mContentInsets.setRelative(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.mContentInsetStartWithNavigation = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.mCollapseIcon = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.Toolbar_collapseIcon);
        this.mCollapseDescription = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.Toolbar_collapseContentDescription);
        java.lang.CharSequence text = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.Toolbar_title);
        if (!android.text.TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        java.lang.CharSequence text2 = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.Toolbar_subtitle);
        if (!android.text.TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Toolbar_popupTheme, 0));
        android.graphics.drawable.Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.Toolbar_navigationIcon);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        java.lang.CharSequence text3 = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.Toolbar_navigationContentDescription);
        if (!android.text.TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        android.graphics.drawable.Drawable drawable2 = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.Toolbar_logo);
        if (drawable2 != null) {
            setLogo(drawable2);
        }
        java.lang.CharSequence text4 = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.Toolbar_logoDescription);
        if (!android.text.TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.Toolbar_titleTextColor)) {
            setTitleTextColor(tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.Toolbar_titleTextColor));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.Toolbar_subtitleTextColor));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.Toolbar_menu)) {
            inflateMenu(tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Toolbar_menu, 0));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.mBackInvokedCallbackEnabled != z) {
            this.mBackInvokedCallbackEnabled = z;
            updateBackInvokedCallbackState();
        }
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new android.view.ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        ensureContentInsets();
        this.mContentInsets.setDirection(i == 1);
    }

    public void setLogo(int i) {
        setLogo(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public boolean canShowOverflowMenu() {
        androidx.appcompat.widget.ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.isOverflowReserved();
    }

    public boolean isOverflowMenuShowing() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowing();
    }

    public boolean isOverflowMenuShowPending() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowPending();
    }

    public boolean showOverflowMenu() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.showOverflowMenu();
    }

    public boolean hideOverflowMenu() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.hideOverflowMenu();
    }

    public void setMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.widget.ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        androidx.appcompat.view.menu.MenuBuilder menuBuilderPeekMenu = this.mMenuView.peekMenu();
        if (menuBuilderPeekMenu == menuBuilder) {
            return;
        }
        if (menuBuilderPeekMenu != null) {
            menuBuilderPeekMenu.removeMenuPresenter(this.mOuterActionMenuPresenter);
            menuBuilderPeekMenu.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter();
        }
        actionMenuPresenter.setExpandedActionViewsExclusive(true);
        if (menuBuilder != null) {
            menuBuilder.addMenuPresenter(actionMenuPresenter, this.mPopupContext);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            actionMenuPresenter.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            actionMenuPresenter.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(actionMenuPresenter);
        this.mOuterActionMenuPresenter = actionMenuPresenter;
        updateBackInvokedCallbackState();
    }

    public void dismissPopupMenus() {
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.dismissPopupMenus();
        }
    }

    public boolean isTitleTruncated() {
        android.text.Layout layout;
        android.widget.TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    public void setLogo(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            android.widget.ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        android.widget.ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public android.graphics.drawable.Drawable getLogo() {
        android.widget.ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        android.widget.ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public java.lang.CharSequence getLogoDescription() {
        android.widget.ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new androidx.appcompat.widget.AppCompatImageView(getContext());
        }
    }

    public boolean hasExpandedActionView() {
        androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        return (expandedActionViewMenuPresenter == null || expandedActionViewMenuPresenter.mCurrentExpandedItem == null) ? false : true;
    }

    public void collapseActionView() {
        androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.mCurrentExpandedItem;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    public java.lang.CharSequence getTitle() {
        return this.mTitleText;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                android.content.Context context = getContext();
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                android.content.res.ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else {
            android.widget.TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        android.widget.TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                android.content.Context context = getContext();
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                android.content.res.ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else {
            android.widget.TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        android.widget.TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setTitleTextAppearance(android.content.Context context, int i) {
        this.mTitleTextAppearance = i;
        android.widget.TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextAppearance(android.content.Context context, int i) {
        this.mSubtitleTextAppearance = i;
        android.widget.TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(android.content.res.ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        android.widget.TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(android.content.res.ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(android.content.res.ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        android.widget.TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public java.lang.CharSequence getNavigationContentDescription() {
        android.widget.ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        android.widget.ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            androidx.appcompat.widget.TooltipCompat.setTooltipText(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            android.widget.ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        android.widget.ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
        android.widget.ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public java.lang.CharSequence getCollapseContentDescription() {
        android.widget.ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        android.widget.ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public android.graphics.drawable.Drawable getCollapseIcon() {
        android.widget.ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i));
    }

    public void setCollapseIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            android.widget.ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public android.view.Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.peekMenu() == null) {
            androidx.appcompat.view.menu.MenuBuilder menuBuilder = (androidx.appcompat.view.menu.MenuBuilder) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            androidx.appcompat.widget.ActionMenuView actionMenuView = new androidx.appcompat.widget.ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.setMenuCallbacks(this.mActionMenuPresenterCallback, new androidx.appcompat.view.menu.MenuBuilder.Callback() { // from class: androidx.appcompat.widget.Toolbar.3
                @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
                public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.MenuItem menuItem) {
                    return androidx.appcompat.widget.Toolbar.this.mMenuBuilderCallback != null && androidx.appcompat.widget.Toolbar.this.mMenuBuilderCallback.onMenuItemSelected(menuBuilder, menuItem);
                }

                @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
                public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
                    if (!androidx.appcompat.widget.Toolbar.this.mMenuView.isOverflowMenuShowing()) {
                        androidx.appcompat.widget.Toolbar.this.mMenuHostHelper.onPrepareMenu(menuBuilder);
                    }
                    if (androidx.appcompat.widget.Toolbar.this.mMenuBuilderCallback != null) {
                        androidx.appcompat.widget.Toolbar.this.mMenuBuilderCallback.onMenuModeChange(menuBuilder);
                    }
                }
            });
            androidx.appcompat.widget.Toolbar.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | androidx.core.view.GravityCompat.END;
            this.mMenuView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private android.view.MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.SupportMenuInflater(getContext());
    }

    public void inflateMenu(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setContentInsetsRelative(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.setRelative(i, i2);
    }

    public int getContentInsetStart() {
        androidx.appcompat.widget.RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.getStart();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        androidx.appcompat.widget.RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.getEnd();
        }
        return 0;
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.setAbsolute(i, i2);
    }

    public int getContentInsetLeft() {
        androidx.appcompat.widget.RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.getLeft();
        }
        return 0;
    }

    public int getContentInsetRight() {
        androidx.appcompat.widget.RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.getRight();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return java.lang.Math.max(getContentInsetStart(), java.lang.Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.MenuBuilder menuBuilderPeekMenu;
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        if ((actionMenuView == null || (menuBuilderPeekMenu = actionMenuView.peekMenu()) == null || !menuBuilderPeekMenu.hasVisibleItems()) ? false : true) {
            return java.lang.Math.max(getContentInsetEnd(), java.lang.Math.max(this.mContentInsetEndWithActions, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (androidx.core.view.ViewCompat.getLayoutDirection(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (androidx.core.view.ViewCompat.getLayoutDirection(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new androidx.appcompat.widget.AppCompatImageButton(getContext(), null, androidx.appcompat.R.attr.toolbarNavigationButtonStyle);
            androidx.appcompat.widget.Toolbar.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | androidx.core.view.GravityCompat.START;
            this.mNavButtonView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
        }
    }

    android.view.View getNavButtonView() {
        return this.mNavButtonView;
    }

    void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            androidx.appcompat.widget.AppCompatImageButton appCompatImageButton = new androidx.appcompat.widget.AppCompatImageButton(getContext(), null, androidx.appcompat.R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            androidx.appcompat.widget.Toolbar.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | androidx.core.view.GravityCompat.START;
            layoutParamsGenerateDefaultLayoutParams.mViewType = 2;
            this.mCollapseButtonView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.appcompat.widget.Toolbar.4
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    androidx.appcompat.widget.Toolbar.this.collapseActionView();
                }
            });
        }
    }

    private void addSystemView(android.view.View view, boolean z) {
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParamsGenerateLayoutParams;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParamsGenerateLayoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            layoutParamsGenerateLayoutParams = generateLayoutParams(layoutParams);
        } else {
            layoutParamsGenerateLayoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) layoutParams;
        }
        layoutParamsGenerateLayoutParams.mViewType = 1;
        if (z && this.mExpandedActionView != null) {
            view.setLayoutParams(layoutParamsGenerateLayoutParams);
            this.mHiddenViews.add(view);
        } else {
            addView(view, layoutParamsGenerateLayoutParams);
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.Toolbar.SavedState savedState = new androidx.appcompat.widget.Toolbar.SavedState(super.onSaveInstanceState());
        androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        if (expandedActionViewMenuPresenter != null && expandedActionViewMenuPresenter.mCurrentExpandedItem != null) {
            savedState.expandedMenuItemId = this.mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
        }
        savedState.isOverflowOpen = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.MenuItem menuItemFindItem;
        if (!(parcelable instanceof androidx.appcompat.widget.Toolbar.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.appcompat.widget.Toolbar.SavedState savedState = (androidx.appcompat.widget.Toolbar.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.MenuBuilder menuBuilderPeekMenu = actionMenuView != null ? actionMenuView.peekMenu() : null;
        if (savedState.expandedMenuItemId != 0 && this.mExpandedMenuPresenter != null && menuBuilderPeekMenu != null && (menuItemFindItem = menuBuilderPeekMenu.findItem(savedState.expandedMenuItemId)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.isOverflowOpen) {
            postShowOverflowMenu();
        }
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    private void measureChildConstrained(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = android.view.View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = java.lang.Math.min(android.view.View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int measureChildCollapseMargins(android.view.View view, int i, int i2, int i3, int i4, int[] iArr) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = java.lang.Math.max(0, i5) + java.lang.Math.max(0, i6);
        iArr[0] = java.lang.Math.max(0, -i5);
        iArr[1] = java.lang.Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.mTempMargins;
        boolean zIsLayoutRtl = androidx.appcompat.widget.ViewUtils.isLayoutRtl(this);
        int i3 = !zIsLayoutRtl ? 1 : 0;
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            iMax = java.lang.Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            iMax = java.lang.Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + java.lang.Math.max(currentContentInsetStart, measuredWidth);
        iArr[zIsLayoutRtl ? 1 : 0] = java.lang.Math.max(0, currentContentInsetStart - measuredWidth);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i, iMax3, i2, 0, this.mMaxButtonHeight);
            measuredWidth2 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            iMax = java.lang.Math.max(iMax, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + java.lang.Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i3] = java.lang.Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (shouldLayout(this.mExpandedActionView)) {
            iMax4 += measureChildCollapseMargins(this.mExpandedActionView, i, iMax4, i2, 0, iArr);
            iMax = java.lang.Math.max(iMax, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            iMax4 += measureChildCollapseMargins(this.mLogoView, i, iMax4, i2, 0, iArr);
            iMax = java.lang.Math.max(iMax, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            android.view.View childAt = getChildAt(i4);
            if (((androidx.appcompat.widget.Toolbar.LayoutParams) childAt.getLayoutParams()).mViewType == 0 && shouldLayout(childAt)) {
                iMax4 += measureChildCollapseMargins(childAt, i, iMax4, i2, 0, iArr);
                iMax = java.lang.Math.max(iMax, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i6 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i, iMax4 + i6, i2, i5, iArr);
            int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            iMax2 = java.lang.Math.max(iMax2, measureChildCollapseMargins(this.mSubtitleTextView, i, iMax4 + i6, i2, measuredHeight + i5, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), shouldCollapse() ? 0 : android.view.View.resolveSizeAndState(java.lang.Math.max(java.lang.Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028c  */
    /* JADX WARN: Code duplicated, block: B:104:0x029f A[LOOP:0: B:103:0x029d->B:104:0x029f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x02c1 A[LOOP:1: B:106:0x02bf->B:107:0x02c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fa A[LOOP:2: B:115:0x02f8->B:116:0x02fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:49:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x012d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    /* JADX WARN: Code duplicated, block: B:57:0x0147  */
    /* JADX WARN: Code duplicated, block: B:59:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:70:0x017b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0182  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x019b  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x021c  */
    /* JADX WARN: Code duplicated, block: B:89:0x021f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0228  */
    /* JADX WARN: Code duplicated, block: B:92:0x022c  */
    /* JADX WARN: Code duplicated, block: B:95:0x023f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0262  */
    /* JADX WARN: Code duplicated, block: B:98:0x0265  */
    /* JADX WARN: Code duplicated, block: B:99:0x0289  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iLayoutChildLeft;
        int iLayoutChildRight;
        int iMax;
        int iMin;
        boolean zShouldLayout;
        boolean zShouldLayout2;
        int measuredHeight;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams;
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams2;
        boolean z2;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int size;
        int i15;
        int i16;
        int size2;
        int i17;
        int i18;
        int i19;
        int size3;
        boolean z3 = androidx.core.view.ViewCompat.getLayoutDirection(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i20 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = androidx.core.view.ViewCompat.getMinimumHeight(this);
        int iMin2 = minimumHeight >= 0 ? java.lang.Math.min(minimumHeight, i4 - i2) : 0;
        if (shouldLayout(this.mNavButtonView)) {
            if (z3) {
                iLayoutChildRight = layoutChildRight(this.mNavButtonView, i20, iArr, iMin2);
                iLayoutChildLeft = paddingLeft;
            } else {
                iLayoutChildLeft = layoutChildLeft(this.mNavButtonView, paddingLeft, iArr, iMin2);
            }
            if (shouldLayout(this.mCollapseButtonView)) {
                if (z3) {
                    iLayoutChildRight = layoutChildRight(this.mCollapseButtonView, iLayoutChildRight, iArr, iMin2);
                } else {
                    iLayoutChildLeft = layoutChildLeft(this.mCollapseButtonView, iLayoutChildLeft, iArr, iMin2);
                }
            }
            if (shouldLayout(this.mMenuView)) {
                if (z3) {
                    iLayoutChildLeft = layoutChildLeft(this.mMenuView, iLayoutChildLeft, iArr, iMin2);
                } else {
                    iLayoutChildRight = layoutChildRight(this.mMenuView, iLayoutChildRight, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = java.lang.Math.max(0, currentContentInsetLeft - iLayoutChildLeft);
            iArr[1] = java.lang.Math.max(0, currentContentInsetRight - (i20 - iLayoutChildRight));
            iMax = java.lang.Math.max(iLayoutChildLeft, currentContentInsetLeft);
            iMin = java.lang.Math.min(iLayoutChildRight, i20 - currentContentInsetRight);
            if (shouldLayout(this.mExpandedActionView)) {
                if (z3) {
                    iMin = layoutChildRight(this.mExpandedActionView, iMin, iArr, iMin2);
                } else {
                    iMax = layoutChildLeft(this.mExpandedActionView, iMax, iArr, iMin2);
                }
            }
            if (shouldLayout(this.mLogoView)) {
                if (z3) {
                    iMin = layoutChildRight(this.mLogoView, iMin, iArr, iMin2);
                } else {
                    iMax = layoutChildLeft(this.mLogoView, iMax, iArr, iMin2);
                }
            }
            zShouldLayout = shouldLayout(this.mTitleTextView);
            zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
            if (zShouldLayout) {
                androidx.appcompat.widget.Toolbar.LayoutParams layoutParams3 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTitleTextView.getLayoutParams();
                measuredHeight = layoutParams3.topMargin + this.mTitleTextView.getMeasuredHeight() + layoutParams3.bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zShouldLayout2) {
                androidx.appcompat.widget.Toolbar.LayoutParams layoutParams4 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mSubtitleTextView.getLayoutParams();
                measuredHeight += layoutParams4.topMargin + this.mSubtitleTextView.getMeasuredHeight() + layoutParams4.bottomMargin;
            }
            if (!zShouldLayout || zShouldLayout2) {
                if (zShouldLayout) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.mSubtitleTextView;
                }
                if (zShouldLayout2) {
                    textView2 = this.mSubtitleTextView;
                } else {
                    textView2 = this.mTitleTextView;
                }
                layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) textView.getLayoutParams();
                layoutParams2 = (androidx.appcompat.widget.Toolbar.LayoutParams) textView2.getLayoutParams();
                z2 = (!zShouldLayout && this.mTitleTextView.getMeasuredWidth() > 0) || (zShouldLayout2 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                i5 = this.mGravity & 112;
                i6 = paddingLeft;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + layoutParams.topMargin + this.mTitleMarginTop;
                } else if (i5 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    if (iMax2 < layoutParams.topMargin + this.mTitleMarginTop) {
                        iMax2 = layoutParams.topMargin + this.mTitleMarginTop;
                    } else {
                        i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        if (i14 < layoutParams.bottomMargin + this.mTitleMarginBottom) {
                            iMax2 = java.lang.Math.max(0, iMax2 - ((layoutParams2.bottomMargin + this.mTitleMarginBottom) - i14));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - layoutParams2.bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.mTitleMarginStart;
                    } else {
                        i11 = 0;
                    }
                    int i21 = i11 - iArr[1];
                    iMin -= java.lang.Math.max(0, i21);
                    iArr[1] = java.lang.Math.max(0, -i21);
                    if (zShouldLayout) {
                        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams5 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTitleTextView.getLayoutParams();
                        int measuredWidth = iMin - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + layoutParams5.bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zShouldLayout2) {
                        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams6 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mSubtitleTextView.getLayoutParams();
                        int i22 = paddingTop + layoutParams6.topMargin;
                        this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i22, iMin, this.mSubtitleTextView.getMeasuredHeight() + i22);
                        i13 = iMin - this.mTitleMarginEnd;
                        int i23 = layoutParams6.bottomMargin;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = java.lang.Math.min(i12, i13);
                    }
                } else {
                    if (z2) {
                        i8 = this.mTitleMarginStart;
                        i7 = 0;
                    } else {
                        i7 = 0;
                        i8 = 0;
                    }
                    int i24 = i8 - iArr[i7];
                    iMax += java.lang.Math.max(i7, i24);
                    iArr[i7] = java.lang.Math.max(i7, -i24);
                    if (zShouldLayout) {
                        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams7 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTitleTextView.getLayoutParams();
                        int measuredWidth2 = this.mTitleTextView.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i9 = measuredWidth2 + this.mTitleMarginEnd;
                        paddingTop = measuredHeight3 + layoutParams7.bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zShouldLayout2) {
                        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams8 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mSubtitleTextView.getLayoutParams();
                        int i25 = paddingTop + layoutParams8.topMargin;
                        int measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                        this.mSubtitleTextView.layout(iMax, i25, measuredWidth3, this.mSubtitleTextView.getMeasuredHeight() + i25);
                        i10 = measuredWidth3 + this.mTitleMarginEnd;
                        int i26 = layoutParams8.bottomMargin;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = java.lang.Math.max(i9, i10);
                    }
                }
                addCustomViewsWithGravity(this.mTempViews, 3);
                size = this.mTempViews.size();
                for (i15 = i7; i15 < size; i15++) {
                    iMax = layoutChildLeft(this.mTempViews.get(i15), iMax, iArr, iMin2);
                }
                i16 = iMin2;
                addCustomViewsWithGravity(this.mTempViews, 5);
                size2 = this.mTempViews.size();
                for (i17 = i7; i17 < size2; i17++) {
                    iMin = layoutChildRight(this.mTempViews.get(i17), iMin, iArr, i16);
                }
                addCustomViewsWithGravity(this.mTempViews, 1);
                int viewListMeasuredWidth = getViewListMeasuredWidth(this.mTempViews, iArr);
                i18 = (i6 + (((width - i6) - paddingRight) / 2)) - (viewListMeasuredWidth / 2);
                i19 = viewListMeasuredWidth + i18;
                if (i18 >= iMax) {
                    if (i19 > iMin) {
                        iMax = i18 - (i19 - iMin);
                    } else {
                        iMax = i18;
                    }
                }
                size3 = this.mTempViews.size();
                while (i7 < size3) {
                    iMax = layoutChildLeft(this.mTempViews.get(i7), iMax, iArr, i16);
                    i7++;
                }
                this.mTempViews.clear();
            }
            i6 = paddingLeft;
            iMin2 = iMin2;
            i7 = 0;
            addCustomViewsWithGravity(this.mTempViews, 3);
            size = this.mTempViews.size();
            while (i15 < size) {
                iMax = layoutChildLeft(this.mTempViews.get(i15), iMax, iArr, iMin2);
            }
            i16 = iMin2;
            addCustomViewsWithGravity(this.mTempViews, 5);
            size2 = this.mTempViews.size();
            while (i17 < size2) {
                iMin = layoutChildRight(this.mTempViews.get(i17), iMin, iArr, i16);
            }
            addCustomViewsWithGravity(this.mTempViews, 1);
            int viewListMeasuredWidth2 = getViewListMeasuredWidth(this.mTempViews, iArr);
            i18 = (i6 + (((width - i6) - paddingRight) / 2)) - (viewListMeasuredWidth2 / 2);
            i19 = viewListMeasuredWidth2 + i18;
            if (i18 >= iMax) {
                if (i19 > iMin) {
                    iMax = i18 - (i19 - iMin);
                } else {
                    iMax = i18;
                }
            }
            size3 = this.mTempViews.size();
            while (i7 < size3) {
                iMax = layoutChildLeft(this.mTempViews.get(i7), iMax, iArr, i16);
                i7++;
            }
            this.mTempViews.clear();
        }
        iLayoutChildLeft = paddingLeft;
        iLayoutChildRight = i20;
        if (shouldLayout(this.mCollapseButtonView)) {
            if (z3) {
                iLayoutChildRight = layoutChildRight(this.mCollapseButtonView, iLayoutChildRight, iArr, iMin2);
            } else {
                iLayoutChildLeft = layoutChildLeft(this.mCollapseButtonView, iLayoutChildLeft, iArr, iMin2);
            }
        }
        if (shouldLayout(this.mMenuView)) {
            if (z3) {
                iLayoutChildLeft = layoutChildLeft(this.mMenuView, iLayoutChildLeft, iArr, iMin2);
            } else {
                iLayoutChildRight = layoutChildRight(this.mMenuView, iLayoutChildRight, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = java.lang.Math.max(0, currentContentInsetLeft2 - iLayoutChildLeft);
        iArr[1] = java.lang.Math.max(0, currentContentInsetRight2 - (i20 - iLayoutChildRight));
        iMax = java.lang.Math.max(iLayoutChildLeft, currentContentInsetLeft2);
        iMin = java.lang.Math.min(iLayoutChildRight, i20 - currentContentInsetRight2);
        if (shouldLayout(this.mExpandedActionView)) {
            if (z3) {
                iMin = layoutChildRight(this.mExpandedActionView, iMin, iArr, iMin2);
            } else {
                iMax = layoutChildLeft(this.mExpandedActionView, iMax, iArr, iMin2);
            }
        }
        if (shouldLayout(this.mLogoView)) {
            if (z3) {
                iMin = layoutChildRight(this.mLogoView, iMin, iArr, iMin2);
            } else {
                iMax = layoutChildLeft(this.mLogoView, iMax, iArr, iMin2);
            }
        }
        zShouldLayout = shouldLayout(this.mTitleTextView);
        zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
        if (zShouldLayout) {
            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams9 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTitleTextView.getLayoutParams();
            measuredHeight = layoutParams9.topMargin + this.mTitleTextView.getMeasuredHeight() + layoutParams9.bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zShouldLayout2) {
            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams10 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mSubtitleTextView.getLayoutParams();
            measuredHeight += layoutParams10.topMargin + this.mSubtitleTextView.getMeasuredHeight() + layoutParams10.bottomMargin;
        }
        if (zShouldLayout) {
            if (zShouldLayout) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zShouldLayout2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) textView.getLayoutParams();
            layoutParams2 = (androidx.appcompat.widget.Toolbar.LayoutParams) textView2.getLayoutParams();
            if (zShouldLayout) {
            }
            i5 = this.mGravity & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + layoutParams.topMargin + this.mTitleMarginTop;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                if (iMax2 < layoutParams.topMargin + this.mTitleMarginTop) {
                    iMax2 = layoutParams.topMargin + this.mTitleMarginTop;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    if (i14 < layoutParams.bottomMargin + this.mTitleMarginBottom) {
                        iMax2 = java.lang.Math.max(0, iMax2 - ((layoutParams2.bottomMargin + this.mTitleMarginBottom) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - layoutParams2.bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i11 = this.mTitleMarginStart;
                } else {
                    i11 = 0;
                }
                int i27 = i11 - iArr[1];
                iMin -= java.lang.Math.max(0, i27);
                iArr[1] = java.lang.Math.max(0, -i27);
                if (zShouldLayout) {
                    androidx.appcompat.widget.Toolbar.LayoutParams layoutParams11 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTitleTextView.getLayoutParams();
                    int measuredWidth4 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight4 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth4 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight4 + layoutParams11.bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zShouldLayout2) {
                    androidx.appcompat.widget.Toolbar.LayoutParams layoutParams12 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mSubtitleTextView.getLayoutParams();
                    int i28 = paddingTop + layoutParams12.topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i28, iMin, this.mSubtitleTextView.getMeasuredHeight() + i28);
                    i13 = iMin - this.mTitleMarginEnd;
                    int i29 = layoutParams12.bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = java.lang.Math.min(i12, i13);
                }
                i7 = 0;
            } else {
                if (z2) {
                    i8 = this.mTitleMarginStart;
                    i7 = 0;
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                int i210 = i8 - iArr[i7];
                iMax += java.lang.Math.max(i7, i210);
                iArr[i7] = java.lang.Math.max(i7, -i210);
                if (zShouldLayout) {
                    androidx.appcompat.widget.Toolbar.LayoutParams layoutParams13 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTitleTextView.getLayoutParams();
                    int measuredWidth5 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i9 = measuredWidth5 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight5 + layoutParams13.bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zShouldLayout2) {
                    androidx.appcompat.widget.Toolbar.LayoutParams layoutParams14 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mSubtitleTextView.getLayoutParams();
                    int i211 = paddingTop + layoutParams14.topMargin;
                    int measuredWidth6 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                    this.mSubtitleTextView.layout(iMax, i211, measuredWidth6, this.mSubtitleTextView.getMeasuredHeight() + i211);
                    i10 = measuredWidth6 + this.mTitleMarginEnd;
                    int i212 = layoutParams14.bottomMargin;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = java.lang.Math.max(i9, i10);
                }
            }
        } else {
            if (zShouldLayout) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zShouldLayout2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) textView.getLayoutParams();
            layoutParams2 = (androidx.appcompat.widget.Toolbar.LayoutParams) textView2.getLayoutParams();
            if (zShouldLayout) {
            }
            i5 = this.mGravity & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + layoutParams.topMargin + this.mTitleMarginTop;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                if (iMax2 < layoutParams.topMargin + this.mTitleMarginTop) {
                    iMax2 = layoutParams.topMargin + this.mTitleMarginTop;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    if (i14 < layoutParams.bottomMargin + this.mTitleMarginBottom) {
                        iMax2 = java.lang.Math.max(0, iMax2 - ((layoutParams2.bottomMargin + this.mTitleMarginBottom) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - layoutParams2.bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i11 = this.mTitleMarginStart;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= java.lang.Math.max(0, i213);
                iArr[1] = java.lang.Math.max(0, -i213);
                if (zShouldLayout) {
                    androidx.appcompat.widget.Toolbar.LayoutParams layoutParams15 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTitleTextView.getLayoutParams();
                    int measuredWidth7 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight6 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth7 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight6 + layoutParams15.bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zShouldLayout2) {
                    androidx.appcompat.widget.Toolbar.LayoutParams layoutParams16 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mSubtitleTextView.getLayoutParams();
                    int i214 = paddingTop + layoutParams16.topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i214, iMin, this.mSubtitleTextView.getMeasuredHeight() + i214);
                    i13 = iMin - this.mTitleMarginEnd;
                    int i215 = layoutParams16.bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = java.lang.Math.min(i12, i13);
                }
                i7 = 0;
            } else {
                if (z2) {
                    i8 = this.mTitleMarginStart;
                    i7 = 0;
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                int i216 = i8 - iArr[i7];
                iMax += java.lang.Math.max(i7, i216);
                iArr[i7] = java.lang.Math.max(i7, -i216);
                if (zShouldLayout) {
                    androidx.appcompat.widget.Toolbar.LayoutParams layoutParams17 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mTitleTextView.getLayoutParams();
                    int measuredWidth8 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i9 = measuredWidth8 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight7 + layoutParams17.bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zShouldLayout2) {
                    androidx.appcompat.widget.Toolbar.LayoutParams layoutParams18 = (androidx.appcompat.widget.Toolbar.LayoutParams) this.mSubtitleTextView.getLayoutParams();
                    int i217 = paddingTop + layoutParams18.topMargin;
                    int measuredWidth9 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                    this.mSubtitleTextView.layout(iMax, i217, measuredWidth9, this.mSubtitleTextView.getMeasuredHeight() + i217);
                    i10 = measuredWidth9 + this.mTitleMarginEnd;
                    int i218 = layoutParams18.bottomMargin;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = java.lang.Math.max(i9, i10);
                }
            }
        }
        addCustomViewsWithGravity(this.mTempViews, 3);
        size = this.mTempViews.size();
        while (i15 < size) {
            iMax = layoutChildLeft(this.mTempViews.get(i15), iMax, iArr, iMin2);
        }
        i16 = iMin2;
        addCustomViewsWithGravity(this.mTempViews, 5);
        size2 = this.mTempViews.size();
        while (i17 < size2) {
            iMin = layoutChildRight(this.mTempViews.get(i17), iMin, iArr, i16);
        }
        addCustomViewsWithGravity(this.mTempViews, 1);
        int viewListMeasuredWidth3 = getViewListMeasuredWidth(this.mTempViews, iArr);
        i18 = (i6 + (((width - i6) - paddingRight) / 2)) - (viewListMeasuredWidth3 / 2);
        i19 = viewListMeasuredWidth3 + i18;
        if (i18 >= iMax) {
            if (i19 > iMin) {
                iMax = i18 - (i19 - iMin);
            } else {
                iMax = i18;
            }
        }
        size3 = this.mTempViews.size();
        while (i7 < size3) {
            iMax = layoutChildLeft(this.mTempViews.get(i7), iMax, iArr, i16);
            i7++;
        }
        this.mTempViews.clear();
    }

    private int getViewListMeasuredWidth(java.util.List<android.view.View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            android.view.View view = list.get(i3);
            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
            int i4 = layoutParams.leftMargin - i;
            int i5 = layoutParams.rightMargin - i2;
            int iMax = java.lang.Math.max(0, i4);
            int iMax2 = java.lang.Math.max(0, i5);
            int iMax3 = java.lang.Math.max(0, -i4);
            int iMax4 = java.lang.Math.max(0, -i5);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    private int layoutChildLeft(android.view.View view, int i, int[] iArr, int i2) {
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int iMax = i + java.lang.Math.max(0, i3);
        iArr[0] = java.lang.Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, childTop, iMax + measuredWidth, view.getMeasuredHeight() + childTop);
        return iMax + measuredWidth + layoutParams.rightMargin;
    }

    private int layoutChildRight(android.view.View view, int i, int[] iArr, int i2) {
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int iMax = i - java.lang.Math.max(0, i3);
        iArr[1] = java.lang.Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, childTop, iMax, view.getMeasuredHeight() + childTop);
        return iMax - (measuredWidth + layoutParams.leftMargin);
    }

    private int getChildTop(android.view.View view, int i) {
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(layoutParams.gravity);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i2;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < layoutParams.topMargin) {
            iMax = layoutParams.topMargin;
        } else {
            int i3 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i3 < layoutParams.bottomMargin) {
                iMax = java.lang.Math.max(0, iMax - (layoutParams.bottomMargin - i3));
            }
        }
        return paddingTop + iMax;
    }

    private int getChildVerticalGravity(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & 112;
    }

    private void addCustomViewsWithGravity(java.util.List<android.view.View> list, int i) {
        boolean z = androidx.core.view.ViewCompat.getLayoutDirection(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i, androidx.core.view.ViewCompat.getLayoutDirection(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mViewType == 0 && shouldLayout(childAt) && getChildHorizontalGravity(layoutParams.gravity) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            android.view.View childAt2 = getChildAt(i3);
            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams2 = (androidx.appcompat.widget.Toolbar.LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.mViewType == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(layoutParams2.gravity) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private int getChildHorizontalGravity(int i) {
        int layoutDirection = androidx.core.view.ViewCompat.getLayoutDirection(this);
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private boolean shouldLayout(android.view.View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private int getHorizontalMargins(android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + androidx.core.view.MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
    }

    private int getVerticalMargins(android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.Toolbar.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.Toolbar.LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.Toolbar.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof androidx.appcompat.widget.Toolbar.LayoutParams) {
            return new androidx.appcompat.widget.Toolbar.LayoutParams((androidx.appcompat.widget.Toolbar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.ActionBar.LayoutParams) {
            return new androidx.appcompat.widget.Toolbar.LayoutParams((androidx.appcompat.app.ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.appcompat.widget.Toolbar.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.appcompat.widget.Toolbar.LayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams() {
        return new androidx.appcompat.widget.Toolbar.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof androidx.appcompat.widget.Toolbar.LayoutParams);
    }

    public androidx.appcompat.widget.DecorToolbar getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new androidx.appcompat.widget.ToolbarWidgetWrapper(this, true);
        }
        return this.mWrapper;
    }

    void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            if (((androidx.appcompat.widget.Toolbar.LayoutParams) childAt.getLayoutParams()).mViewType != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    private boolean isChildOrHidden(android.view.View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback callback, androidx.appcompat.view.menu.MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(callback, callback2);
        }
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new androidx.appcompat.widget.RtlSpacingHelper();
        }
    }

    final android.widget.TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    final android.widget.TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    androidx.appcompat.widget.ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    android.content.Context getPopupContext() {
        return this.mPopupContext;
    }

    private java.util.ArrayList<android.view.MenuItem> getCurrentMenuItems() {
        java.util.ArrayList<android.view.MenuItem> arrayList = new java.util.ArrayList<>();
        android.view.Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private void onCreateMenu() {
        android.view.Menu menu = getMenu();
        java.util.ArrayList<android.view.MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.onCreateMenu(menu, getMenuInflater());
        java.util.ArrayList<android.view.MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider menuProvider) {
        this.mMenuHostHelper.addMenuProvider(menuProvider);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider menuProvider, androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider menuProvider, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner, state);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(androidx.core.view.MenuProvider menuProvider) {
        this.mMenuHostHelper.removeMenuProvider(menuProvider);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        java.util.Iterator<android.view.MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        onCreateMenu();
    }

    void updateBackInvokedCallbackState() {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = androidx.appcompat.widget.Toolbar.Api33Impl.findOnBackInvokedDispatcher(this);
            boolean z = hasExpandedActionView() && onBackInvokedDispatcherFindOnBackInvokedDispatcher != null && androidx.core.view.ViewCompat.isAttachedToWindow(this) && this.mBackInvokedCallbackEnabled;
            if (z && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = androidx.appcompat.widget.Toolbar.Api33Impl.newOnBackInvokedCallback(new java.lang.Runnable() { // from class: androidx.appcompat.widget.Toolbar$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.collapseActionView();
                        }
                    });
                }
                androidx.appcompat.widget.Toolbar.Api33Impl.tryRegisterOnBackInvokedCallback(onBackInvokedDispatcherFindOnBackInvokedDispatcher, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherFindOnBackInvokedDispatcher;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            androidx.appcompat.widget.Toolbar.Api33Impl.tryUnregisterOnBackInvokedCallback(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    public static class LayoutParams extends androidx.appcompat.app.ActionBar.LayoutParams {
        static final int CUSTOM = 0;
        static final int EXPANDED = 2;
        static final int SYSTEM = 1;
        int mViewType;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mViewType = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mViewType = 0;
            this.gravity = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.mViewType = 0;
            this.gravity = i3;
        }

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(androidx.appcompat.widget.Toolbar.LayoutParams layoutParams) {
            super((androidx.appcompat.app.ActionBar.LayoutParams) layoutParams);
            this.mViewType = 0;
            this.mViewType = layoutParams.mViewType;
        }

        public LayoutParams(androidx.appcompat.app.ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.mViewType = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mViewType = 0;
            copyMarginsFromCompat(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mViewType = 0;
        }

        void copyMarginsFromCompat(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.Toolbar.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.widget.Toolbar.SavedState>() { // from class: androidx.appcompat.widget.Toolbar.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.appcompat.widget.Toolbar.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.appcompat.widget.Toolbar.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.Toolbar.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.appcompat.widget.Toolbar.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.Toolbar.SavedState[] newArray(int i) {
                return new androidx.appcompat.widget.Toolbar.SavedState[i];
            }
        };
        int expandedMenuItemId;
        boolean isOverflowOpen;

        public SavedState(android.os.Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.expandedMenuItemId = parcel.readInt();
            this.isOverflowOpen = parcel.readInt() != 0;
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.expandedMenuItemId);
            parcel.writeInt(this.isOverflowOpen ? 1 : 0);
        }
    }

    private class ExpandedActionViewMenuPresenter implements androidx.appcompat.view.menu.MenuPresenter {
        androidx.appcompat.view.menu.MenuItemImpl mCurrentExpandedItem;
        androidx.appcompat.view.menu.MenuBuilder mMenu;

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public android.os.Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder subMenuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        }

        ExpandedActionViewMenuPresenter() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void initForMenu(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl;
            androidx.appcompat.view.menu.MenuBuilder menuBuilder2 = this.mMenu;
            if (menuBuilder2 != null && (menuItemImpl = this.mCurrentExpandedItem) != null) {
                menuBuilder2.collapseItemActionView(menuItemImpl);
            }
            this.mMenu = menuBuilder;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void updateMenuView(boolean z) {
            if (this.mCurrentExpandedItem != null) {
                androidx.appcompat.view.menu.MenuBuilder menuBuilder = this.mMenu;
                boolean z2 = false;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    for (int i = 0; i < size; i++) {
                        if (this.mMenu.getItem(i) == this.mCurrentExpandedItem) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                collapseItemActionView(this.mMenu, this.mCurrentExpandedItem);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
            androidx.appcompat.widget.Toolbar.this.ensureCollapseButtonView();
            android.view.ViewParent parent = androidx.appcompat.widget.Toolbar.this.mCollapseButtonView.getParent();
            androidx.appcompat.widget.Toolbar toolbar = androidx.appcompat.widget.Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                androidx.appcompat.widget.Toolbar toolbar2 = androidx.appcompat.widget.Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            androidx.appcompat.widget.Toolbar.this.mExpandedActionView = menuItemImpl.getActionView();
            this.mCurrentExpandedItem = menuItemImpl;
            android.view.ViewParent parent2 = androidx.appcompat.widget.Toolbar.this.mExpandedActionView.getParent();
            androidx.appcompat.widget.Toolbar toolbar3 = androidx.appcompat.widget.Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                androidx.appcompat.widget.Toolbar.LayoutParams layoutParamsGenerateDefaultLayoutParams = androidx.appcompat.widget.Toolbar.this.generateDefaultLayoutParams();
                layoutParamsGenerateDefaultLayoutParams.gravity = (androidx.appcompat.widget.Toolbar.this.mButtonGravity & 112) | androidx.core.view.GravityCompat.START;
                layoutParamsGenerateDefaultLayoutParams.mViewType = 2;
                androidx.appcompat.widget.Toolbar.this.mExpandedActionView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
                androidx.appcompat.widget.Toolbar toolbar4 = androidx.appcompat.widget.Toolbar.this;
                toolbar4.addView(toolbar4.mExpandedActionView);
            }
            androidx.appcompat.widget.Toolbar.this.removeChildrenForExpandedActionView();
            androidx.appcompat.widget.Toolbar.this.requestLayout();
            menuItemImpl.setActionViewExpanded(true);
            if (androidx.appcompat.widget.Toolbar.this.mExpandedActionView instanceof androidx.appcompat.view.CollapsibleActionView) {
                ((androidx.appcompat.view.CollapsibleActionView) androidx.appcompat.widget.Toolbar.this.mExpandedActionView).onActionViewExpanded();
            }
            androidx.appcompat.widget.Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder menuBuilder, androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
            if (androidx.appcompat.widget.Toolbar.this.mExpandedActionView instanceof androidx.appcompat.view.CollapsibleActionView) {
                ((androidx.appcompat.view.CollapsibleActionView) androidx.appcompat.widget.Toolbar.this.mExpandedActionView).onActionViewCollapsed();
            }
            androidx.appcompat.widget.Toolbar toolbar = androidx.appcompat.widget.Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            androidx.appcompat.widget.Toolbar toolbar2 = androidx.appcompat.widget.Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            androidx.appcompat.widget.Toolbar.this.mExpandedActionView = null;
            androidx.appcompat.widget.Toolbar.this.addChildrenForExpandedActionView();
            this.mCurrentExpandedItem = null;
            androidx.appcompat.widget.Toolbar.this.requestLayout();
            menuItemImpl.setActionViewExpanded(false);
            androidx.appcompat.widget.Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static void tryRegisterOnBackInvokedCallback(java.lang.Object obj, java.lang.Object obj2) {
            ((android.window.OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (android.window.OnBackInvokedCallback) obj2);
        }

        static void tryUnregisterOnBackInvokedCallback(java.lang.Object obj, java.lang.Object obj2) {
            ((android.window.OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((android.window.OnBackInvokedCallback) obj2);
        }

        static android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcher(android.view.View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static android.window.OnBackInvokedCallback newOnBackInvokedCallback(final java.lang.Runnable runnable) {
            java.util.Objects.requireNonNull(runnable);
            return new android.window.OnBackInvokedCallback() { // from class: androidx.appcompat.widget.Toolbar$Api33Impl$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }
    }
}
