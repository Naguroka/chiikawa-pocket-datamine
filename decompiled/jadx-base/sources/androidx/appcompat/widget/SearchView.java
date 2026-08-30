package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.LinearLayoutCompat implements androidx.appcompat.view.CollapsibleActionView {
    static final boolean DBG = false;
    private static final java.lang.String IME_OPTION_NO_MICROPHONE = "nm";
    static final java.lang.String LOG_TAG = "SearchView";
    static final androidx.appcompat.widget.SearchView.PreQAutoCompleteTextViewReflector PRE_API_29_HIDDEN_METHOD_INVOKER;
    private android.os.Bundle mAppSearchData;
    private boolean mClearingFocus;
    final android.widget.ImageView mCloseButton;
    private final android.widget.ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final java.lang.CharSequence mDefaultQueryHint;
    private final android.view.View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final android.widget.ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private java.lang.CharSequence mOldQueryText;
    private final android.view.View.OnClickListener mOnClickListener;
    private androidx.appcompat.widget.SearchView.OnCloseListener mOnCloseListener;
    private final android.widget.TextView.OnEditorActionListener mOnEditorActionListener;
    private final android.widget.AdapterView.OnItemClickListener mOnItemClickListener;
    private final android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private androidx.appcompat.widget.SearchView.OnQueryTextListener mOnQueryChangeListener;
    android.view.View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private android.view.View.OnClickListener mOnSearchClickListener;
    private androidx.appcompat.widget.SearchView.OnSuggestionListener mOnSuggestionListener;
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> mOutsideDrawablesCache;
    private java.lang.CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private java.lang.Runnable mReleaseCursorRunnable;
    final android.widget.ImageView mSearchButton;
    private final android.view.View mSearchEditFrame;
    private final android.graphics.drawable.Drawable mSearchHintIcon;
    private final android.view.View mSearchPlate;
    final androidx.appcompat.widget.SearchView.SearchAutoComplete mSearchSrcTextView;
    private android.graphics.Rect mSearchSrcTextViewBounds;
    private android.graphics.Rect mSearchSrtTextViewBoundsExpanded;
    android.app.SearchableInfo mSearchable;
    private final android.view.View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    androidx.cursoradapter.widget.CursorAdapter mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    android.view.View.OnKeyListener mTextKeyListener;
    private android.text.TextWatcher mTextWatcher;
    private androidx.appcompat.widget.SearchView.UpdatableTouchDelegate mTouchDelegate;
    private final java.lang.Runnable mUpdateDrawableStateRunnable;
    private java.lang.CharSequence mUserQuery;
    private final android.content.Intent mVoiceAppSearchIntent;
    final android.widget.ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final android.content.Intent mVoiceWebSearchIntent;

    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean onQueryTextChange(java.lang.String str);

        boolean onQueryTextSubmit(java.lang.String str);
    }

    public interface OnSuggestionListener {
        boolean onSuggestionClick(int i);

        boolean onSuggestionSelect(int i);
    }

    static {
        PRE_API_29_HIDDEN_METHOD_INVOKER = android.os.Build.VERSION.SDK_INT < 29 ? new androidx.appcompat.widget.SearchView.PreQAutoCompleteTextViewReflector() : null;
    }

    public SearchView(android.content.Context context) {
        this(context, null);
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.searchViewStyle);
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSearchSrcTextViewBounds = new android.graphics.Rect();
        this.mSearchSrtTextViewBoundsExpanded = new android.graphics.Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = new java.lang.Runnable() { // from class: androidx.appcompat.widget.SearchView.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.appcompat.widget.SearchView.this.updateFocusedState();
            }
        };
        this.mReleaseCursorRunnable = new java.lang.Runnable() { // from class: androidx.appcompat.widget.SearchView.2
            @Override // java.lang.Runnable
            public void run() {
                if (androidx.appcompat.widget.SearchView.this.mSuggestionsAdapter instanceof androidx.appcompat.widget.SuggestionsAdapter) {
                    androidx.appcompat.widget.SearchView.this.mSuggestionsAdapter.changeCursor(null);
                }
            }
        };
        this.mOutsideDrawablesCache = new java.util.WeakHashMap<>();
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: androidx.appcompat.widget.SearchView.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (view == androidx.appcompat.widget.SearchView.this.mSearchButton) {
                    androidx.appcompat.widget.SearchView.this.onSearchClicked();
                    return;
                }
                if (view == androidx.appcompat.widget.SearchView.this.mCloseButton) {
                    androidx.appcompat.widget.SearchView.this.onCloseClicked();
                    return;
                }
                if (view == androidx.appcompat.widget.SearchView.this.mGoButton) {
                    androidx.appcompat.widget.SearchView.this.onSubmitQuery();
                } else if (view == androidx.appcompat.widget.SearchView.this.mVoiceButton) {
                    androidx.appcompat.widget.SearchView.this.onVoiceClicked();
                } else if (view == androidx.appcompat.widget.SearchView.this.mSearchSrcTextView) {
                    androidx.appcompat.widget.SearchView.this.forceSuggestionQuery();
                }
            }
        };
        this.mOnClickListener = onClickListener;
        this.mTextKeyListener = new android.view.View.OnKeyListener() { // from class: androidx.appcompat.widget.SearchView.6
            @Override // android.view.View.OnKeyListener
            public boolean onKey(android.view.View view, int i2, android.view.KeyEvent keyEvent) {
                if (androidx.appcompat.widget.SearchView.this.mSearchable == null) {
                    return false;
                }
                if (androidx.appcompat.widget.SearchView.this.mSearchSrcTextView.isPopupShowing() && androidx.appcompat.widget.SearchView.this.mSearchSrcTextView.getListSelection() != -1) {
                    return androidx.appcompat.widget.SearchView.this.onSuggestionsKey(view, i2, keyEvent);
                }
                if (androidx.appcompat.widget.SearchView.this.mSearchSrcTextView.isEmpty() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                    return false;
                }
                view.cancelLongPress();
                androidx.appcompat.widget.SearchView searchView = androidx.appcompat.widget.SearchView.this;
                searchView.launchQuerySearch(0, null, searchView.mSearchSrcTextView.getText().toString());
                return true;
            }
        };
        android.widget.TextView.OnEditorActionListener onEditorActionListener = new android.widget.TextView.OnEditorActionListener() { // from class: androidx.appcompat.widget.SearchView.7
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(android.widget.TextView textView, int i2, android.view.KeyEvent keyEvent) {
                androidx.appcompat.widget.SearchView.this.onSubmitQuery();
                return true;
            }
        };
        this.mOnEditorActionListener = onEditorActionListener;
        android.widget.AdapterView.OnItemClickListener onItemClickListener = new android.widget.AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.SearchView.8
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j) {
                androidx.appcompat.widget.SearchView.this.onItemClicked(i2, 0, null);
            }
        };
        this.mOnItemClickListener = onItemClickListener;
        android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = new android.widget.AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.SearchView.9
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j) {
                androidx.appcompat.widget.SearchView.this.onItemSelected(i2);
            }
        };
        this.mOnItemSelectedListener = onItemSelectedListener;
        this.mTextWatcher = new android.text.TextWatcher() { // from class: androidx.appcompat.widget.SearchView.10
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i2, int i3, int i4) {
                androidx.appcompat.widget.SearchView.this.onTextChanged(charSequence);
            }
        };
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.SearchView, i, 0);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.appcompat.R.styleable.SearchView, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        android.view.LayoutInflater.from(context).inflate(tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.SearchView_layout, androidx.appcompat.R.layout.abc_search_view), (android.view.ViewGroup) this, true);
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = (androidx.appcompat.widget.SearchView.SearchAutoComplete) findViewById(androidx.appcompat.R.id.search_src_text);
        this.mSearchSrcTextView = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.mSearchEditFrame = findViewById(androidx.appcompat.R.id.search_edit_frame);
        android.view.View viewFindViewById = findViewById(androidx.appcompat.R.id.search_plate);
        this.mSearchPlate = viewFindViewById;
        android.view.View viewFindViewById2 = findViewById(androidx.appcompat.R.id.submit_area);
        this.mSubmitArea = viewFindViewById2;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.search_button);
        this.mSearchButton = imageView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.search_go_btn);
        this.mGoButton = imageView2;
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.search_close_btn);
        this.mCloseButton = imageView3;
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.search_voice_btn);
        this.mVoiceButton = imageView4;
        android.widget.ImageView imageView5 = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.search_mag_icon);
        this.mCollapsedIcon = imageView5;
        androidx.core.view.ViewCompat.setBackground(viewFindViewById, tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_queryBackground));
        androidx.core.view.ViewCompat.setBackground(viewFindViewById2, tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_submitBackground));
        imageView.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_searchIcon));
        imageView2.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_goIcon));
        imageView3.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_closeIcon));
        imageView4.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_voiceIcon));
        imageView5.setImageDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_searchIcon));
        this.mSearchHintIcon = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_searchHintIcon);
        androidx.appcompat.widget.TooltipCompat.setTooltipText(imageView, getResources().getString(androidx.appcompat.R.string.abc_searchview_description_search));
        this.mSuggestionRowLayout = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.SearchView_suggestionRowLayout, androidx.appcompat.R.layout.abc_search_dropdown_item_icons_2line);
        this.mSuggestionCommitIconResId = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.SearchView_commitIcon, 0);
        imageView.setOnClickListener(onClickListener);
        imageView3.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        imageView4.setOnClickListener(onClickListener);
        searchAutoComplete.setOnClickListener(onClickListener);
        searchAutoComplete.addTextChangedListener(this.mTextWatcher);
        searchAutoComplete.setOnEditorActionListener(onEditorActionListener);
        searchAutoComplete.setOnItemClickListener(onItemClickListener);
        searchAutoComplete.setOnItemSelectedListener(onItemSelectedListener);
        searchAutoComplete.setOnKeyListener(this.mTextKeyListener);
        searchAutoComplete.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: androidx.appcompat.widget.SearchView.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(android.view.View view, boolean z) {
                if (androidx.appcompat.widget.SearchView.this.mOnQueryTextFocusChangeListener != null) {
                    androidx.appcompat.widget.SearchView.this.mOnQueryTextFocusChangeListener.onFocusChange(androidx.appcompat.widget.SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.mDefaultQueryHint = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.SearchView_defaultQueryHint);
        this.mQueryHint = tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.SearchView_queryHint);
        int i2 = tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.SearchView_android_imeOptions, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.SearchView_android_inputType, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.SearchView_android_focusable, true));
        tintTypedArrayObtainStyledAttributes.recycle();
        android.content.Intent intent = new android.content.Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        android.content.Intent intent2 = new android.content.Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent = intent2;
        intent2.addFlags(268435456);
        android.view.View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.mDropDownAnchor = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: androidx.appcompat.widget.SearchView.4
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(android.view.View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    androidx.appcompat.widget.SearchView.this.adjustDropDownSizeAndPosition();
                }
            });
        }
        updateViewsVisibility(this.mIconifiedByDefault);
        updateQueryHint();
    }

    int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    public void setSearchableInfo(android.app.SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        if (searchableInfo != null) {
            updateSearchAutoComplete();
            updateQueryHint();
        }
        boolean zHasVoiceSearch = hasVoiceSearch();
        this.mVoiceButtonEnabled = zHasVoiceSearch;
        if (zHasVoiceSearch) {
            this.mSearchSrcTextView.setPrivateImeOptions(IME_OPTION_NO_MICROPHONE);
        }
        updateViewsVisibility(isIconified());
    }

    public void setAppSearchData(android.os.Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, android.graphics.Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (!isIconified()) {
            boolean zRequestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
            if (zRequestFocus) {
                updateViewsVisibility(false);
            }
            return zRequestFocus;
        }
        return super.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mClearingFocus = false;
    }

    public void setOnQueryTextListener(androidx.appcompat.widget.SearchView.OnQueryTextListener onQueryTextListener) {
        this.mOnQueryChangeListener = onQueryTextListener;
    }

    public void setOnCloseListener(androidx.appcompat.widget.SearchView.OnCloseListener onCloseListener) {
        this.mOnCloseListener = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnSuggestionListener(androidx.appcompat.widget.SearchView.OnSuggestionListener onSuggestionListener) {
        this.mOnSuggestionListener = onSuggestionListener;
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public java.lang.CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public void setQuery(java.lang.CharSequence charSequence, boolean z) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.mUserQuery = charSequence;
        }
        if (!z || android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        onSubmitQuery();
    }

    public void setQueryHint(java.lang.CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    public java.lang.CharSequence getQueryHint() {
        java.lang.CharSequence charSequence = this.mQueryHint;
        if (charSequence != null) {
            return charSequence;
        }
        android.app.SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.mSearchable.getHintId());
        }
        return this.mDefaultQueryHint;
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.mIconifiedByDefault == z) {
            return;
        }
        this.mIconifiedByDefault = z;
        updateViewsVisibility(z);
        updateQueryHint();
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        updateViewsVisibility(isIconified());
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.mQueryRefinement = z;
        androidx.cursoradapter.widget.CursorAdapter cursorAdapter = this.mSuggestionsAdapter;
        if (cursorAdapter instanceof androidx.appcompat.widget.SuggestionsAdapter) {
            ((androidx.appcompat.widget.SuggestionsAdapter) cursorAdapter).setQueryRefinement(z ? 2 : 1);
        }
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public void setSuggestionsAdapter(androidx.cursoradapter.widget.CursorAdapter cursorAdapter) {
        this.mSuggestionsAdapter = cursorAdapter;
        this.mSearchSrcTextView.setAdapter(cursorAdapter);
    }

    public androidx.cursoradapter.widget.CursorAdapter getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.mMaxWidth;
            size = i4 > 0 ? java.lang.Math.min(i4, size) : java.lang.Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.mMaxWidth;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.mMaxWidth) > 0) {
            size = java.lang.Math.min(i3, size);
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = java.lang.Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            getChildBoundsWithinSearchView(this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
            this.mSearchSrtTextViewBoundsExpanded.set(this.mSearchSrcTextViewBounds.left, 0, this.mSearchSrcTextViewBounds.right, i4 - i2);
            androidx.appcompat.widget.SearchView.UpdatableTouchDelegate updatableTouchDelegate = this.mTouchDelegate;
            if (updatableTouchDelegate == null) {
                androidx.appcompat.widget.SearchView.UpdatableTouchDelegate updatableTouchDelegate2 = new androidx.appcompat.widget.SearchView.UpdatableTouchDelegate(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds, this.mSearchSrcTextView);
                this.mTouchDelegate = updatableTouchDelegate2;
                setTouchDelegate(updatableTouchDelegate2);
                return;
            }
            updatableTouchDelegate.setBounds(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
        }
    }

    private void getChildBoundsWithinSearchView(android.view.View view, android.graphics.Rect rect) {
        view.getLocationInWindow(this.mTemp);
        getLocationInWindow(this.mTemp2);
        int[] iArr = this.mTemp;
        int i = iArr[1];
        int[] iArr2 = this.mTemp2;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.abc_search_view_preferred_height);
    }

    private void updateViewsVisibility(boolean z) {
        this.mIconified = z;
        int i = z ? 0 : 8;
        boolean z2 = !android.text.TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(i);
        updateSubmitButton(z2);
        this.mSearchEditFrame.setVisibility(z ? 8 : 0);
        this.mCollapsedIcon.setVisibility((this.mCollapsedIcon.getDrawable() == null || this.mIconifiedByDefault) ? 8 : 0);
        updateCloseButton();
        updateVoiceButton(!z2);
        updateSubmitArea();
    }

    private boolean hasVoiceSearch() {
        android.content.Intent intent;
        android.app.SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
            intent = this.mVoiceWebSearchIntent;
        } else {
            intent = this.mSearchable.getVoiceSearchLaunchRecognizer() ? this.mVoiceAppSearchIntent : null;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    private boolean isSubmitAreaEnabled() {
        return (this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified();
    }

    private void updateSubmitButton(boolean z) {
        this.mGoButton.setVisibility((this.mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus() && (z || !this.mVoiceButtonEnabled)) ? 0 : 8);
    }

    private void updateSubmitArea() {
        this.mSubmitArea.setVisibility((isSubmitAreaEnabled() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) ? 0 : 8);
    }

    private void updateCloseButton() {
        boolean z = true;
        boolean z2 = !android.text.TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        if (!z2 && (!this.mIconifiedByDefault || this.mExpandedInActionView)) {
            z = false;
        }
        this.mCloseButton.setVisibility(z ? 0 : 8);
        android.graphics.drawable.Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private void postUpdateFocusedState() {
        post(this.mUpdateDrawableStateRunnable);
    }

    void updateFocusedState() {
        int[] iArr = this.mSearchSrcTextView.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        android.graphics.drawable.Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        android.graphics.drawable.Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    protected void onQueryRefine(java.lang.CharSequence charSequence) {
        setQuery(charSequence);
    }

    boolean onSuggestionsKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (this.mSearchable != null && this.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                this.mSearchSrcTextView.setSelection(i == 21 ? 0 : this.mSearchSrcTextView.length());
                this.mSearchSrcTextView.setListSelection(0);
                this.mSearchSrcTextView.clearListSelection();
                this.mSearchSrcTextView.ensureImeVisible();
                return true;
            }
            if (i == 19) {
                this.mSearchSrcTextView.getListSelection();
                return false;
            }
        }
        return false;
    }

    private java.lang.CharSequence getDecoratedHint(java.lang.CharSequence charSequence) {
        if (!this.mIconifiedByDefault || this.mSearchHintIcon == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.mSearchSrcTextView.getTextSize()) * 1.25d);
        this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new android.text.style.ImageSpan(this.mSearchHintIcon), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void updateQueryHint() {
        java.lang.CharSequence queryHint = getQueryHint();
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(getDecoratedHint(queryHint));
    }

    private void updateSearchAutoComplete() {
        this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
        this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
        int inputType = this.mSearchable.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.mSearchable.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.mSearchSrcTextView.setInputType(inputType);
        androidx.cursoradapter.widget.CursorAdapter cursorAdapter = this.mSuggestionsAdapter;
        if (cursorAdapter != null) {
            cursorAdapter.changeCursor(null);
        }
        if (this.mSearchable.getSuggestAuthority() != null) {
            androidx.appcompat.widget.SuggestionsAdapter suggestionsAdapter = new androidx.appcompat.widget.SuggestionsAdapter(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
            this.mSuggestionsAdapter = suggestionsAdapter;
            this.mSearchSrcTextView.setAdapter(suggestionsAdapter);
            ((androidx.appcompat.widget.SuggestionsAdapter) this.mSuggestionsAdapter).setQueryRefinement(this.mQueryRefinement ? 2 : 1);
        }
    }

    private void updateVoiceButton(boolean z) {
        int i = 8;
        if (this.mVoiceButtonEnabled && !isIconified() && z) {
            this.mGoButton.setVisibility(8);
            i = 0;
        }
        this.mVoiceButton.setVisibility(i);
    }

    void onTextChanged(java.lang.CharSequence charSequence) {
        android.text.Editable text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean z = !android.text.TextUtils.isEmpty(text);
        updateSubmitButton(z);
        updateVoiceButton(!z);
        updateCloseButton();
        updateSubmitArea();
        if (this.mOnQueryChangeListener != null && !android.text.TextUtils.equals(charSequence, this.mOldQueryText)) {
            this.mOnQueryChangeListener.onQueryTextChange(charSequence.toString());
        }
        this.mOldQueryText = charSequence.toString();
    }

    void onSubmitQuery() {
        android.text.Editable text = this.mSearchSrcTextView.getText();
        if (text == null || android.text.TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        androidx.appcompat.widget.SearchView.OnQueryTextListener onQueryTextListener = this.mOnQueryChangeListener;
        if (onQueryTextListener == null || !onQueryTextListener.onQueryTextSubmit(text.toString())) {
            if (this.mSearchable != null) {
                launchQuerySearch(0, null, text.toString());
            }
            this.mSearchSrcTextView.setImeVisibility(false);
            dismissSuggestions();
        }
    }

    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }

    void onCloseClicked() {
        if (android.text.TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            if (this.mIconifiedByDefault) {
                androidx.appcompat.widget.SearchView.OnCloseListener onCloseListener = this.mOnCloseListener;
                if (onCloseListener == null || !onCloseListener.onClose()) {
                    clearFocus();
                    updateViewsVisibility(true);
                    return;
                }
                return;
            }
            return;
        }
        this.mSearchSrcTextView.setText("");
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
    }

    void onSearchClicked() {
        updateViewsVisibility(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
        android.view.View.OnClickListener onClickListener = this.mOnSearchClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void onVoiceClicked() {
        android.app.SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, searchableInfo));
            }
        } catch (android.content.ActivityNotFoundException unused) {
            android.util.Log.w(LOG_TAG, "Could not find voice search activity");
        }
    }

    void onTextFocusChanged() {
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        postUpdateFocusedState();
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewExpanded() {
        if (this.mExpandedInActionView) {
            return;
        }
        this.mExpandedInActionView = true;
        int imeOptions = this.mSearchSrcTextView.getImeOptions();
        this.mCollapsedImeOptions = imeOptions;
        this.mSearchSrcTextView.setImeOptions(imeOptions | 33554432);
        this.mSearchSrcTextView.setText("");
        setIconified(false);
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.SearchView.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.widget.SearchView.SavedState>() { // from class: androidx.appcompat.widget.SearchView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public androidx.appcompat.widget.SearchView.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.appcompat.widget.SearchView.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.SearchView.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.appcompat.widget.SearchView.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public androidx.appcompat.widget.SearchView.SavedState[] newArray(int i) {
                return new androidx.appcompat.widget.SearchView.SavedState[i];
            }
        };
        boolean isIconified;

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isIconified = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(java.lang.Boolean.valueOf(this.isIconified));
        }

        public java.lang.String toString() {
            return "SearchView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " isIconified=" + this.isIconified + "}";
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.SearchView.SavedState savedState = new androidx.appcompat.widget.SearchView.SavedState(super.onSaveInstanceState());
        savedState.isIconified = isIconified();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.appcompat.widget.SearchView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.appcompat.widget.SearchView.SavedState savedState = (androidx.appcompat.widget.SearchView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        updateViewsVisibility(savedState.isIconified);
        requestLayout();
    }

    void adjustDropDownSizeAndPosition() {
        int i;
        if (this.mDropDownAnchor.getWidth() > 1) {
            android.content.res.Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            android.graphics.Rect rect = new android.graphics.Rect();
            boolean zIsLayoutRtl = androidx.appcompat.widget.ViewUtils.isLayoutRtl(this);
            int dimensionPixelSize = this.mIconifiedByDefault ? resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_dropdownitem_text_padding_left) : 0;
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            if (zIsLayoutRtl) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.mSearchSrcTextView.setDropDownHorizontalOffset(i);
            this.mSearchSrcTextView.setDropDownWidth((((this.mDropDownAnchor.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    boolean onItemClicked(int i, int i2, java.lang.String str) {
        androidx.appcompat.widget.SearchView.OnSuggestionListener onSuggestionListener = this.mOnSuggestionListener;
        if (onSuggestionListener != null && onSuggestionListener.onSuggestionClick(i)) {
            return false;
        }
        launchSuggestion(i, 0, null);
        this.mSearchSrcTextView.setImeVisibility(false);
        dismissSuggestions();
        return true;
    }

    boolean onItemSelected(int i) {
        androidx.appcompat.widget.SearchView.OnSuggestionListener onSuggestionListener = this.mOnSuggestionListener;
        if (onSuggestionListener != null && onSuggestionListener.onSuggestionSelect(i)) {
            return false;
        }
        rewriteQueryFromSuggestion(i);
        return true;
    }

    private void rewriteQueryFromSuggestion(int i) {
        android.text.Editable text = this.mSearchSrcTextView.getText();
        android.database.Cursor cursor = this.mSuggestionsAdapter.getCursor();
        if (cursor == null) {
            return;
        }
        if (cursor.moveToPosition(i)) {
            java.lang.CharSequence charSequenceConvertToString = this.mSuggestionsAdapter.convertToString(cursor);
            if (charSequenceConvertToString != null) {
                setQuery(charSequenceConvertToString);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    private boolean launchSuggestion(int i, int i2, java.lang.String str) {
        android.database.Cursor cursor = this.mSuggestionsAdapter.getCursor();
        if (cursor == null || !cursor.moveToPosition(i)) {
            return false;
        }
        launchIntent(createIntentFromSuggestion(cursor, i2, str));
        return true;
    }

    private void launchIntent(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (java.lang.RuntimeException e) {
            android.util.Log.e(LOG_TAG, "Failed launch activity: " + intent, e);
        }
    }

    private void setQuery(java.lang.CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(android.text.TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void launchQuerySearch(int i, java.lang.String str, java.lang.String str2) {
        getContext().startActivity(createIntent("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    private android.content.Intent createIntent(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        android.os.Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    private android.content.Intent createVoiceWebSearchIntent(android.content.Intent intent, android.app.SearchableInfo searchableInfo) {
        android.content.Intent intent2 = new android.content.Intent(intent);
        android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private android.content.Intent createVoiceAppSearchIntent(android.content.Intent intent, android.app.SearchableInfo searchableInfo) {
        android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = this.mAppSearchData;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        android.content.Intent intent3 = new android.content.Intent(intent);
        android.content.res.Resources resources = getResources();
        java.lang.String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        java.lang.String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        java.lang.String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private android.content.Intent createIntentFromSuggestion(android.database.Cursor cursor, int i, java.lang.String str) {
        int position;
        java.lang.String columnString;
        try {
            java.lang.String columnString2 = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(cursor, "suggest_intent_action");
            if (columnString2 == null) {
                columnString2 = this.mSearchable.getSuggestIntentAction();
            }
            if (columnString2 == null) {
                columnString2 = "android.intent.action.SEARCH";
            }
            java.lang.String str2 = columnString2;
            java.lang.String columnString3 = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(cursor, "suggest_intent_data");
            if (columnString3 == null) {
                columnString3 = this.mSearchable.getSuggestIntentData();
            }
            if (columnString3 != null && (columnString = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(cursor, "suggest_intent_data_id")) != null) {
                columnString3 = columnString3 + "/" + android.net.Uri.encode(columnString);
            }
            return createIntent(str2, columnString3 == null ? null : android.net.Uri.parse(columnString3), androidx.appcompat.widget.SuggestionsAdapter.getColumnString(cursor, "suggest_intent_extra_data"), androidx.appcompat.widget.SuggestionsAdapter.getColumnString(cursor, "suggest_intent_query"), i, str);
        } catch (java.lang.RuntimeException e) {
            try {
                position = cursor.getPosition();
            } catch (java.lang.RuntimeException unused) {
                position = -1;
            }
            android.util.Log.w(LOG_TAG, "Search suggestions cursor at row " + position + " returned exception.", e);
            return null;
        }
    }

    void forceSuggestionQuery() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.appcompat.widget.SearchView.Api29Impl.refreshAutoCompleteResults(this.mSearchSrcTextView);
            return;
        }
        androidx.appcompat.widget.SearchView.PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = PRE_API_29_HIDDEN_METHOD_INVOKER;
        preQAutoCompleteTextViewReflector.doBeforeTextChanged(this.mSearchSrcTextView);
        preQAutoCompleteTextViewReflector.doAfterTextChanged(this.mSearchSrcTextView);
    }

    static boolean isLandscapeMode(android.content.Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private static class UpdatableTouchDelegate extends android.view.TouchDelegate {
        private final android.graphics.Rect mActualBounds;
        private boolean mDelegateTargeted;
        private final android.view.View mDelegateView;
        private final int mSlop;
        private final android.graphics.Rect mSlopBounds;
        private final android.graphics.Rect mTargetBounds;

        public UpdatableTouchDelegate(android.graphics.Rect rect, android.graphics.Rect rect2, android.view.View view) {
            super(rect, view);
            this.mSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.mTargetBounds = new android.graphics.Rect();
            this.mSlopBounds = new android.graphics.Rect();
            this.mActualBounds = new android.graphics.Rect();
            setBounds(rect, rect2);
            this.mDelegateView = view;
        }

        public void setBounds(android.graphics.Rect rect, android.graphics.Rect rect2) {
            this.mTargetBounds.set(rect);
            this.mSlopBounds.set(rect);
            android.graphics.Rect rect3 = this.mSlopBounds;
            int i = this.mSlop;
            rect3.inset(-i, -i);
            this.mActualBounds.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003f  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.mDelegateTargeted;
                    if (z2 && !this.mSlopBounds.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else if (action != 3) {
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.mDelegateTargeted;
                    this.mDelegateTargeted = false;
                }
                z3 = z2;
                z = true;
            } else if (this.mTargetBounds.contains(x, y)) {
                this.mDelegateTargeted = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (z && !this.mActualBounds.contains(x, y)) {
                motionEvent.setLocation(this.mDelegateView.getWidth() / 2, this.mDelegateView.getHeight() / 2);
            } else {
                motionEvent.setLocation(x - this.mActualBounds.left, y - this.mActualBounds.top);
            }
            return this.mDelegateView.dispatchTouchEvent(motionEvent);
        }
    }

    public static class SearchAutoComplete extends androidx.appcompat.widget.AppCompatAutoCompleteTextView {
        private boolean mHasPendingShowSoftInputRequest;
        final java.lang.Runnable mRunShowSoftInputIfNecessary;
        private androidx.appcompat.widget.SearchView mSearchView;
        private int mThreshold;

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(java.lang.CharSequence charSequence) {
        }

        public SearchAutoComplete(android.content.Context context) {
            this(context, null);
        }

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet) {
            this(context, attributeSet, androidx.appcompat.R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.mRunShowSoftInputIfNecessary = new java.lang.Runnable() { // from class: androidx.appcompat.widget.SearchView.SearchAutoComplete.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.appcompat.widget.SearchView.SearchAutoComplete.this.showSoftInputIfNecessary();
                }
            };
            this.mThreshold = getThreshold();
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) android.util.TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        void setSearchView(androidx.appcompat.widget.SearchView searchView) {
            this.mSearchView = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.mThreshold = i;
        }

        boolean isEmpty() {
            return android.text.TextUtils.getTrimmedLength(getText()) == 0;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.mSearchView.hasFocus() && getVisibility() == 0) {
                this.mHasPendingShowSoftInputRequest = true;
                if (androidx.appcompat.widget.SearchView.isLandscapeMode(getContext())) {
                    ensureImeVisible();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.mSearchView.onTextFocusChanged();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.mThreshold <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, android.view.KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.mSearchView.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        private int getSearchViewTextMinWidthDp() {
            android.content.res.Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i >= 600) {
                return 192;
            }
            if (i < 640 || i2 < 480) {
                return org.objectweb.asm.Opcodes.IF_ICMPNE;
            }
            return 192;
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
            android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.mHasPendingShowSoftInputRequest) {
                removeCallbacks(this.mRunShowSoftInputIfNecessary);
                post(this.mRunShowSoftInputIfNecessary);
            }
            return inputConnectionOnCreateInputConnection;
        }

        void showSoftInputIfNecessary() {
            if (this.mHasPendingShowSoftInputRequest) {
                ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.mHasPendingShowSoftInputRequest = false;
            }
        }

        void setImeVisibility(boolean z) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.mHasPendingShowSoftInputRequest = false;
                removeCallbacks(this.mRunShowSoftInputIfNecessary);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.mHasPendingShowSoftInputRequest = false;
                    removeCallbacks(this.mRunShowSoftInputIfNecessary);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.mHasPendingShowSoftInputRequest = true;
            }
        }

        void ensureImeVisible() {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                androidx.appcompat.widget.SearchView.Api29Impl.setInputMethodMode(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            androidx.appcompat.widget.SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER.ensureImeVisible(this);
        }
    }

    private static class PreQAutoCompleteTextViewReflector {
        private java.lang.reflect.Method mDoAfterTextChanged;
        private java.lang.reflect.Method mDoBeforeTextChanged;
        private java.lang.reflect.Method mEnsureImeVisible;

        PreQAutoCompleteTextViewReflector() {
            this.mDoBeforeTextChanged = null;
            this.mDoAfterTextChanged = null;
            this.mEnsureImeVisible = null;
            preApi29Check();
            try {
                java.lang.reflect.Method declaredMethod = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new java.lang.Class[0]);
                this.mDoBeforeTextChanged = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            try {
                java.lang.reflect.Method declaredMethod2 = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new java.lang.Class[0]);
                this.mDoAfterTextChanged = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused2) {
            }
            try {
                java.lang.reflect.Method method = android.widget.AutoCompleteTextView.class.getMethod("ensureImeVisible", java.lang.Boolean.TYPE);
                this.mEnsureImeVisible = method;
                method.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused3) {
            }
        }

        void doBeforeTextChanged(android.widget.AutoCompleteTextView autoCompleteTextView) {
            preApi29Check();
            java.lang.reflect.Method method = this.mDoBeforeTextChanged;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new java.lang.Object[0]);
                } catch (java.lang.Exception unused) {
                }
            }
        }

        void doAfterTextChanged(android.widget.AutoCompleteTextView autoCompleteTextView) {
            preApi29Check();
            java.lang.reflect.Method method = this.mDoAfterTextChanged;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new java.lang.Object[0]);
                } catch (java.lang.Exception unused) {
                }
            }
        }

        void ensureImeVisible(android.widget.AutoCompleteTextView autoCompleteTextView) {
            preApi29Check();
            java.lang.reflect.Method method = this.mEnsureImeVisible;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, true);
                } catch (java.lang.Exception unused) {
                }
            }
        }

        private static void preApi29Check() {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                throw new java.lang.UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void setInputMethodMode(androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }

        static void refreshAutoCompleteResults(android.widget.AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }
    }
}
