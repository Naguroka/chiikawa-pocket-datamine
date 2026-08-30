package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements androidx.appcompat.view.menu.MenuView.ItemView, android.widget.AbsListView.SelectionBoundsAdjuster {
    private static final java.lang.String TAG = "ListMenuItemView";
    private android.graphics.drawable.Drawable mBackground;
    private android.widget.CheckBox mCheckBox;
    private android.widget.LinearLayout mContent;
    private boolean mForceShowIcon;
    private android.widget.ImageView mGroupDivider;
    private boolean mHasListDivider;
    private android.widget.ImageView mIconView;
    private android.view.LayoutInflater mInflater;
    private androidx.appcompat.view.menu.MenuItemImpl mItemData;
    private boolean mPreserveIconSpacing;
    private android.widget.RadioButton mRadioButton;
    private android.widget.TextView mShortcutView;
    private android.graphics.drawable.Drawable mSubMenuArrow;
    private android.widget.ImageView mSubMenuArrowView;
    private int mTextAppearance;
    private android.content.Context mTextAppearanceContext;
    private android.widget.TextView mTitleView;

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, androidx.appcompat.R.styleable.MenuView, i, 0);
        this.mBackground = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.MenuView_android_itemBackground);
        this.mTextAppearance = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.MenuView_android_itemTextAppearance, -1);
        this.mPreserveIconSpacing = tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.MenuView_preserveIconSpacing, false);
        this.mTextAppearanceContext = context;
        this.mSubMenuArrow = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.MenuView_subMenuArrow);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, androidx.appcompat.R.attr.dropDownListViewStyle, 0);
        this.mHasListDivider = typedArrayObtainStyledAttributes.hasValue(0);
        tintTypedArrayObtainStyledAttributes.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        androidx.core.view.ViewCompat.setBackground(this, this.mBackground);
        android.widget.TextView textView = (android.widget.TextView) findViewById(androidx.appcompat.R.id.title);
        this.mTitleView = textView;
        int i = this.mTextAppearance;
        if (i != -1) {
            textView.setTextAppearance(this.mTextAppearanceContext, i);
        }
        this.mShortcutView = (android.widget.TextView) findViewById(androidx.appcompat.R.id.shortcut);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.submenuarrow);
        this.mSubMenuArrowView = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.mSubMenuArrow);
        }
        this.mGroupDivider = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.group_divider);
        this.mContent = (android.widget.LinearLayout) findViewById(androidx.appcompat.R.id.content);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, int i) {
        this.mItemData = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setTitle(menuItemImpl.getTitleForItemView(this));
        setCheckable(menuItemImpl.isCheckable());
        setShortcut(menuItemImpl.shouldShowShortcut(), menuItemImpl.getShortcut());
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.getContentDescription());
    }

    private void addContentView(android.view.View view) {
        addContentView(view, -1);
    }

    private void addContentView(android.view.View view, int i) {
        android.widget.LinearLayout linearLayout = this.mContent;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
        this.mPreserveIconSpacing = z;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(java.lang.CharSequence charSequence) {
        if (charSequence != null) {
            this.mTitleView.setText(charSequence);
            if (this.mTitleView.getVisibility() != 0) {
                this.mTitleView.setVisibility(0);
                return;
            }
            return;
        }
        if (this.mTitleView.getVisibility() != 8) {
            this.mTitleView.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
        return this.mItemData;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
        android.widget.CompoundButton compoundButton;
        android.widget.CompoundButton compoundButton2;
        if (!z && this.mRadioButton == null && this.mCheckBox == null) {
            return;
        }
        if (this.mItemData.isExclusiveCheckable()) {
            if (this.mRadioButton == null) {
                insertRadioButton();
            }
            compoundButton = this.mRadioButton;
            compoundButton2 = this.mCheckBox;
        } else {
            if (this.mCheckBox == null) {
                insertCheckBox();
            }
            compoundButton = this.mCheckBox;
            compoundButton2 = this.mRadioButton;
        }
        if (z) {
            compoundButton.setChecked(this.mItemData.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        android.widget.CheckBox checkBox = this.mCheckBox;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        android.widget.RadioButton radioButton = this.mRadioButton;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
        android.widget.CompoundButton compoundButton;
        if (this.mItemData.isExclusiveCheckable()) {
            if (this.mRadioButton == null) {
                insertRadioButton();
            }
            compoundButton = this.mRadioButton;
        } else {
            if (this.mCheckBox == null) {
                insertCheckBox();
            }
            compoundButton = this.mCheckBox;
        }
        compoundButton.setChecked(z);
    }

    private void setSubMenuArrowVisible(boolean z) {
        android.widget.ImageView imageView = this.mSubMenuArrowView;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c) {
        int i = (z && this.mItemData.shouldShowShortcut()) ? 0 : 8;
        if (i == 0) {
            this.mShortcutView.setText(this.mItemData.getShortcutLabel());
        }
        if (this.mShortcutView.getVisibility() != i) {
            this.mShortcutView.setVisibility(i);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        boolean z = this.mItemData.shouldShowIcon() || this.mForceShowIcon;
        if (z || this.mPreserveIconSpacing) {
            android.widget.ImageView imageView = this.mIconView;
            if (imageView == null && drawable == null && !this.mPreserveIconSpacing) {
                return;
            }
            if (imageView == null) {
                insertIconView();
            }
            if (drawable != null || this.mPreserveIconSpacing) {
                android.widget.ImageView imageView2 = this.mIconView;
                if (!z) {
                    drawable = null;
                }
                imageView2.setImageDrawable(drawable);
                if (this.mIconView.getVisibility() != 0) {
                    this.mIconView.setVisibility(0);
                    return;
                }
                return;
            }
            this.mIconView.setVisibility(8);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mIconView != null && this.mPreserveIconSpacing) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.mIconView.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    private void insertIconView() {
        android.widget.ImageView imageView = (android.widget.ImageView) getInflater().inflate(androidx.appcompat.R.layout.abc_list_menu_item_icon, (android.view.ViewGroup) this, false);
        this.mIconView = imageView;
        addContentView(imageView, 0);
    }

    private void insertRadioButton() {
        android.widget.RadioButton radioButton = (android.widget.RadioButton) getInflater().inflate(androidx.appcompat.R.layout.abc_list_menu_item_radio, (android.view.ViewGroup) this, false);
        this.mRadioButton = radioButton;
        addContentView(radioButton);
    }

    private void insertCheckBox() {
        android.widget.CheckBox checkBox = (android.widget.CheckBox) getInflater().inflate(androidx.appcompat.R.layout.abc_list_menu_item_checkbox, (android.view.ViewGroup) this, false);
        this.mCheckBox = checkBox;
        addContentView(checkBox);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return this.mForceShowIcon;
    }

    private android.view.LayoutInflater getInflater() {
        if (this.mInflater == null) {
            this.mInflater = android.view.LayoutInflater.from(getContext());
        }
        return this.mInflater;
    }

    public void setGroupDividerEnabled(boolean z) {
        android.widget.ImageView imageView = this.mGroupDivider;
        if (imageView != null) {
            imageView.setVisibility((this.mHasListDivider || !z) ? 8 : 0);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(android.graphics.Rect rect) {
        android.widget.ImageView imageView = this.mGroupDivider;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.mGroupDivider.getLayoutParams();
        rect.top += this.mGroupDivider.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }
}
