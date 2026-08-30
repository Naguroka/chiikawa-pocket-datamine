package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
public final class MaterialDatePicker<S> extends androidx.fragment.app.DialogFragment {
    private static final java.lang.String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final java.lang.String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    public static final int INPUT_MODE_CALENDAR = 0;
    private static final java.lang.String INPUT_MODE_KEY = "INPUT_MODE_KEY";
    public static final int INPUT_MODE_TEXT = 1;
    private static final java.lang.String NEGATIVE_BUTTON_TEXT_KEY = "NEGATIVE_BUTTON_TEXT_KEY";
    private static final java.lang.String NEGATIVE_BUTTON_TEXT_RES_ID_KEY = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final java.lang.String OVERRIDE_THEME_RES_ID = "OVERRIDE_THEME_RES_ID";
    private static final java.lang.String POSITIVE_BUTTON_TEXT_KEY = "POSITIVE_BUTTON_TEXT_KEY";
    private static final java.lang.String POSITIVE_BUTTON_TEXT_RES_ID_KEY = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final java.lang.String TITLE_TEXT_KEY = "TITLE_TEXT_KEY";
    private static final java.lang.String TITLE_TEXT_RES_ID_KEY = "TITLE_TEXT_RES_ID_KEY";
    private com.google.android.material.shape.MaterialShapeDrawable background;
    private com.google.android.material.datepicker.MaterialCalendar<S> calendar;
    private com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    private android.widget.Button confirmButton;
    private com.google.android.material.datepicker.DateSelector<S> dateSelector;
    private boolean edgeToEdgeEnabled;
    private boolean fullscreen;
    private android.widget.TextView headerSelectionText;
    private com.google.android.material.internal.CheckableImageButton headerToggleButton;
    private int inputMode;
    private java.lang.CharSequence negativeButtonText;
    private int negativeButtonTextResId;
    private int overrideThemeResId;
    private com.google.android.material.datepicker.PickerFragment<S> pickerFragment;
    private java.lang.CharSequence positiveButtonText;
    private int positiveButtonTextResId;
    private java.lang.CharSequence titleText;
    private int titleTextResId;
    static final java.lang.Object CONFIRM_BUTTON_TAG = "CONFIRM_BUTTON_TAG";
    static final java.lang.Object CANCEL_BUTTON_TAG = "CANCEL_BUTTON_TAG";
    static final java.lang.Object TOGGLE_BUTTON_TAG = "TOGGLE_BUTTON_TAG";
    private final java.util.LinkedHashSet<com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S>> onPositiveButtonClickListeners = new java.util.LinkedHashSet<>();
    private final java.util.LinkedHashSet<android.view.View.OnClickListener> onNegativeButtonClickListeners = new java.util.LinkedHashSet<>();
    private final java.util.LinkedHashSet<android.content.DialogInterface.OnCancelListener> onCancelListeners = new java.util.LinkedHashSet<>();
    private final java.util.LinkedHashSet<android.content.DialogInterface.OnDismissListener> onDismissListeners = new java.util.LinkedHashSet<>();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InputMode {
    }

    public static long todayInUtcMilliseconds() {
        return com.google.android.material.datepicker.UtcDates.getTodayCalendar().getTimeInMillis();
    }

    public static long thisMonthInUtcMilliseconds() {
        return com.google.android.material.datepicker.Month.current().timeInMillis;
    }

    public java.lang.String getHeaderText() {
        return getDateSelector().getSelectionDisplayString(getContext());
    }

    static <S> com.google.android.material.datepicker.MaterialDatePicker<S> newInstance(com.google.android.material.datepicker.MaterialDatePicker.Builder<S> builder) {
        com.google.android.material.datepicker.MaterialDatePicker<S> materialDatePicker = new com.google.android.material.datepicker.MaterialDatePicker<>();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(OVERRIDE_THEME_RES_ID, builder.overrideThemeResId);
        bundle.putParcelable(DATE_SELECTOR_KEY, builder.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, builder.calendarConstraints);
        bundle.putInt(TITLE_TEXT_RES_ID_KEY, builder.titleTextResId);
        bundle.putCharSequence(TITLE_TEXT_KEY, builder.titleText);
        bundle.putInt(INPUT_MODE_KEY, builder.inputMode);
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_ID_KEY, builder.positiveButtonTextResId);
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_KEY, builder.positiveButtonText);
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_ID_KEY, builder.negativeButtonTextResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_KEY, builder.negativeButtonText);
        materialDatePicker.setArguments(bundle);
        return materialDatePicker;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(OVERRIDE_THEME_RES_ID, this.overrideThemeResId);
        bundle.putParcelable(DATE_SELECTOR_KEY, this.dateSelector);
        com.google.android.material.datepicker.CalendarConstraints.Builder builder = new com.google.android.material.datepicker.CalendarConstraints.Builder(this.calendarConstraints);
        if (this.calendar.getCurrentMonth() != null) {
            builder.setOpenAt(this.calendar.getCurrentMonth().timeInMillis);
        }
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, builder.build());
        bundle.putInt(TITLE_TEXT_RES_ID_KEY, this.titleTextResId);
        bundle.putCharSequence(TITLE_TEXT_KEY, this.titleText);
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_ID_KEY, this.positiveButtonTextResId);
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_KEY, this.positiveButtonText);
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_ID_KEY, this.negativeButtonTextResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_KEY, this.negativeButtonText);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.overrideThemeResId = bundle.getInt(OVERRIDE_THEME_RES_ID);
        this.dateSelector = (com.google.android.material.datepicker.DateSelector) bundle.getParcelable(DATE_SELECTOR_KEY);
        this.calendarConstraints = (com.google.android.material.datepicker.CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.titleTextResId = bundle.getInt(TITLE_TEXT_RES_ID_KEY);
        this.titleText = bundle.getCharSequence(TITLE_TEXT_KEY);
        this.inputMode = bundle.getInt(INPUT_MODE_KEY);
        this.positiveButtonTextResId = bundle.getInt(POSITIVE_BUTTON_TEXT_RES_ID_KEY);
        this.positiveButtonText = bundle.getCharSequence(POSITIVE_BUTTON_TEXT_KEY);
        this.negativeButtonTextResId = bundle.getInt(NEGATIVE_BUTTON_TEXT_RES_ID_KEY);
        this.negativeButtonText = bundle.getCharSequence(NEGATIVE_BUTTON_TEXT_KEY);
    }

    private int getThemeResId(android.content.Context context) {
        int i = this.overrideThemeResId;
        return i != 0 ? i : getDateSelector().getDefaultThemeResId(context);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialog = new android.app.Dialog(requireContext(), getThemeResId(requireContext()));
        android.content.Context context = dialog.getContext();
        this.fullscreen = isFullscreen(context);
        int iResolveOrThrow = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(context, com.google.android.material.R.attr.colorSurface, com.google.android.material.datepicker.MaterialDatePicker.class.getCanonicalName());
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = new com.google.android.material.shape.MaterialShapeDrawable(context, null, com.google.android.material.R.attr.materialCalendarStyle, com.google.android.material.R.style.Widget_MaterialComponents_MaterialCalendar);
        this.background = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        this.background.setFillColor(android.content.res.ColorStateList.valueOf(iResolveOrThrow));
        this.background.setElevation(androidx.core.view.ViewCompat.getElevation(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View viewInflate = layoutInflater.inflate(this.fullscreen ? com.google.android.material.R.layout.mtrl_picker_fullscreen : com.google.android.material.R.layout.mtrl_picker_dialog, viewGroup);
        android.content.Context context = viewInflate.getContext();
        if (this.fullscreen) {
            viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_frame).setLayoutParams(new android.widget.LinearLayout.LayoutParams(getPaddedPickerWidth(context), -2));
        } else {
            viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_main_pane).setLayoutParams(new android.widget.LinearLayout.LayoutParams(getPaddedPickerWidth(context), -1));
        }
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_header_selection_text);
        this.headerSelectionText = textView;
        androidx.core.view.ViewCompat.setAccessibilityLiveRegion(textView, 1);
        this.headerToggleButton = (com.google.android.material.internal.CheckableImageButton) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_header_toggle);
        android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_title_text);
        java.lang.CharSequence charSequence = this.titleText;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.titleTextResId);
        }
        initHeaderToggle(context);
        this.confirmButton = (android.widget.Button) viewInflate.findViewById(com.google.android.material.R.id.confirm_button);
        if (getDateSelector().isSelectionComplete()) {
            this.confirmButton.setEnabled(true);
        } else {
            this.confirmButton.setEnabled(false);
        }
        this.confirmButton.setTag(CONFIRM_BUTTON_TAG);
        java.lang.CharSequence charSequence2 = this.positiveButtonText;
        if (charSequence2 != null) {
            this.confirmButton.setText(charSequence2);
        } else {
            int i = this.positiveButtonTextResId;
            if (i != 0) {
                this.confirmButton.setText(i);
            }
        }
        this.confirmButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.Iterator it = com.google.android.material.datepicker.MaterialDatePicker.this.onPositiveButtonClickListeners.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener) it.next()).onPositiveButtonClick(com.google.android.material.datepicker.MaterialDatePicker.this.getSelection());
                }
                com.google.android.material.datepicker.MaterialDatePicker.this.dismiss();
            }
        });
        android.widget.Button button = (android.widget.Button) viewInflate.findViewById(com.google.android.material.R.id.cancel_button);
        button.setTag(CANCEL_BUTTON_TAG);
        java.lang.CharSequence charSequence3 = this.negativeButtonText;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.negativeButtonTextResId;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.Iterator it = com.google.android.material.datepicker.MaterialDatePicker.this.onNegativeButtonClickListeners.iterator();
                while (it.hasNext()) {
                    ((android.view.View.OnClickListener) it.next()).onClick(view);
                }
                com.google.android.material.datepicker.MaterialDatePicker.this.dismiss();
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.view.Window window = requireDialog().getWindow();
        if (this.fullscreen) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.background);
            enableEdgeToEdgeIfNeeded(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_dialog_background_inset);
            android.graphics.Rect rect = new android.graphics.Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) this.background, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new com.google.android.material.dialog.InsetDialogOnTouchListener(requireDialog(), rect));
        }
        startPickerFragment();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.pickerFragment.clearOnSelectionChangedListeners();
        super.onStop();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        java.util.Iterator<android.content.DialogInterface.OnCancelListener> it = this.onCancelListeners.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.util.Iterator<android.content.DialogInterface.OnDismissListener> it = this.onDismissListeners.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final S getSelection() {
        return getDateSelector().getSelection();
    }

    private void enableEdgeToEdgeIfNeeded(android.view.Window window) {
        if (this.edgeToEdgeEnabled) {
            return;
        }
        final android.view.View viewFindViewById = requireView().findViewById(com.google.android.material.R.id.fullscreen_header);
        com.google.android.material.internal.EdgeToEdgeUtils.applyEdgeToEdge(window, true, com.google.android.material.internal.ViewUtils.getBackgroundColor(viewFindViewById), null);
        final int paddingTop = viewFindViewById.getPaddingTop();
        final int i = viewFindViewById.getLayoutParams().height;
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                int i2 = windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars()).top;
                if (i >= 0) {
                    viewFindViewById.getLayoutParams().height = i + i2;
                    android.view.View view2 = viewFindViewById;
                    view2.setLayoutParams(view2.getLayoutParams());
                }
                android.view.View view3 = viewFindViewById;
                view3.setPadding(view3.getPaddingLeft(), paddingTop + i2, viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
                return windowInsetsCompat;
            }
        });
        this.edgeToEdgeEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHeader() {
        java.lang.String headerText = getHeaderText();
        this.headerSelectionText.setContentDescription(java.lang.String.format(getString(com.google.android.material.R.string.mtrl_picker_announce_current_selection), headerText));
        this.headerSelectionText.setText(headerText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPickerFragment() {
        com.google.android.material.datepicker.PickerFragment<S> pickerFragmentNewInstance;
        int themeResId = getThemeResId(requireContext());
        this.calendar = com.google.android.material.datepicker.MaterialCalendar.newInstance(getDateSelector(), themeResId, this.calendarConstraints);
        if (this.headerToggleButton.isChecked()) {
            pickerFragmentNewInstance = com.google.android.material.datepicker.MaterialTextInputPicker.newInstance(getDateSelector(), themeResId, this.calendarConstraints);
        } else {
            pickerFragmentNewInstance = this.calendar;
        }
        this.pickerFragment = pickerFragmentNewInstance;
        updateHeader();
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(com.google.android.material.R.id.mtrl_calendar_frame, this.pickerFragment);
        fragmentTransactionBeginTransaction.commitNow();
        this.pickerFragment.addOnSelectionChangedListener(new com.google.android.material.datepicker.OnSelectionChangedListener<S>() { // from class: com.google.android.material.datepicker.MaterialDatePicker.4
            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public void onSelectionChanged(S s) {
                com.google.android.material.datepicker.MaterialDatePicker.this.updateHeader();
                com.google.android.material.datepicker.MaterialDatePicker.this.confirmButton.setEnabled(com.google.android.material.datepicker.MaterialDatePicker.this.getDateSelector().isSelectionComplete());
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public void onIncompleteSelectionChanged() {
                com.google.android.material.datepicker.MaterialDatePicker.this.confirmButton.setEnabled(false);
            }
        });
    }

    private void initHeaderToggle(android.content.Context context) {
        this.headerToggleButton.setTag(TOGGLE_BUTTON_TAG);
        this.headerToggleButton.setImageDrawable(createHeaderToggleDrawable(context));
        this.headerToggleButton.setChecked(this.inputMode != 0);
        androidx.core.view.ViewCompat.setAccessibilityDelegate(this.headerToggleButton, null);
        updateToggleContentDescription(this.headerToggleButton);
        this.headerToggleButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.google.android.material.datepicker.MaterialDatePicker.this.confirmButton.setEnabled(com.google.android.material.datepicker.MaterialDatePicker.this.getDateSelector().isSelectionComplete());
                com.google.android.material.datepicker.MaterialDatePicker.this.headerToggleButton.toggle();
                com.google.android.material.datepicker.MaterialDatePicker materialDatePicker = com.google.android.material.datepicker.MaterialDatePicker.this;
                materialDatePicker.updateToggleContentDescription(materialDatePicker.headerToggleButton);
                com.google.android.material.datepicker.MaterialDatePicker.this.startPickerFragment();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateToggleContentDescription(com.google.android.material.internal.CheckableImageButton checkableImageButton) {
        java.lang.String string;
        if (this.headerToggleButton.isChecked()) {
            string = checkableImageButton.getContext().getString(com.google.android.material.R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(com.google.android.material.R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.headerToggleButton.setContentDescription(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.material.datepicker.DateSelector<S> getDateSelector() {
        if (this.dateSelector == null) {
            this.dateSelector = (com.google.android.material.datepicker.DateSelector) getArguments().getParcelable(DATE_SELECTOR_KEY);
        }
        return this.dateSelector;
    }

    private static android.graphics.drawable.Drawable createHeaderToggleDrawable(android.content.Context context) {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, androidx.appcompat.content.res.AppCompatResources.getDrawable(context, com.google.android.material.R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], androidx.appcompat.content.res.AppCompatResources.getDrawable(context, com.google.android.material.R.drawable.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    static boolean isFullscreen(android.content.Context context) {
        return readMaterialCalendarStyleBoolean(context, android.R.attr.windowFullscreen);
    }

    static boolean isNestedScrollable(android.content.Context context) {
        return readMaterialCalendarStyleBoolean(context, com.google.android.material.R.attr.nestedScrollable);
    }

    static boolean readMaterialCalendarStyleBoolean(android.content.Context context, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.MaterialAttributes.resolveOrThrow(context, com.google.android.material.R.attr.materialCalendarStyle, com.google.android.material.datepicker.MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    private static int getPaddedPickerWidth(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_content_padding);
        int i = com.google.android.material.datepicker.Month.current().daysInWeek;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    public boolean addOnPositiveButtonClickListener(com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
        return this.onPositiveButtonClickListeners.add(materialPickerOnPositiveButtonClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
        return this.onPositiveButtonClickListeners.remove(materialPickerOnPositiveButtonClickListener);
    }

    public void clearOnPositiveButtonClickListeners() {
        this.onPositiveButtonClickListeners.clear();
    }

    public boolean addOnNegativeButtonClickListener(android.view.View.OnClickListener onClickListener) {
        return this.onNegativeButtonClickListeners.add(onClickListener);
    }

    public boolean removeOnNegativeButtonClickListener(android.view.View.OnClickListener onClickListener) {
        return this.onNegativeButtonClickListeners.remove(onClickListener);
    }

    public void clearOnNegativeButtonClickListeners() {
        this.onNegativeButtonClickListeners.clear();
    }

    public boolean addOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
        return this.onCancelListeners.add(onCancelListener);
    }

    public boolean removeOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
        return this.onCancelListeners.remove(onCancelListener);
    }

    public void clearOnCancelListeners() {
        this.onCancelListeners.clear();
    }

    public boolean addOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        return this.onDismissListeners.add(onDismissListener);
    }

    public boolean removeOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        return this.onDismissListeners.remove(onDismissListener);
    }

    public void clearOnDismissListeners() {
        this.onDismissListeners.clear();
    }

    public static final class Builder<S> {
        com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
        final com.google.android.material.datepicker.DateSelector<S> dateSelector;
        int overrideThemeResId = 0;
        int titleTextResId = 0;
        java.lang.CharSequence titleText = null;
        int positiveButtonTextResId = 0;
        java.lang.CharSequence positiveButtonText = null;
        int negativeButtonTextResId = 0;
        java.lang.CharSequence negativeButtonText = null;
        S selection = null;
        int inputMode = 0;

        private Builder(com.google.android.material.datepicker.DateSelector<S> dateSelector) {
            this.dateSelector = dateSelector;
        }

        public static <S> com.google.android.material.datepicker.MaterialDatePicker.Builder<S> customDatePicker(com.google.android.material.datepicker.DateSelector<S> dateSelector) {
            return new com.google.android.material.datepicker.MaterialDatePicker.Builder<>(dateSelector);
        }

        public static com.google.android.material.datepicker.MaterialDatePicker.Builder<java.lang.Long> datePicker() {
            return new com.google.android.material.datepicker.MaterialDatePicker.Builder<>(new com.google.android.material.datepicker.SingleDateSelector());
        }

        public static com.google.android.material.datepicker.MaterialDatePicker.Builder<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> dateRangePicker() {
            return new com.google.android.material.datepicker.MaterialDatePicker.Builder<>(new com.google.android.material.datepicker.RangeDateSelector());
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setSelection(S s) {
            this.selection = s;
            return this;
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setTheme(int i) {
            this.overrideThemeResId = i;
            return this;
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setCalendarConstraints(com.google.android.material.datepicker.CalendarConstraints calendarConstraints) {
            this.calendarConstraints = calendarConstraints;
            return this;
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setTitleText(int i) {
            this.titleTextResId = i;
            this.titleText = null;
            return this;
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setTitleText(java.lang.CharSequence charSequence) {
            this.titleText = charSequence;
            this.titleTextResId = 0;
            return this;
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setPositiveButtonText(int i) {
            this.positiveButtonTextResId = i;
            this.positiveButtonText = null;
            return this;
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setPositiveButtonText(java.lang.CharSequence charSequence) {
            this.positiveButtonText = charSequence;
            this.positiveButtonTextResId = 0;
            return this;
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setNegativeButtonText(int i) {
            this.negativeButtonTextResId = i;
            this.negativeButtonText = null;
            return this;
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setNegativeButtonText(java.lang.CharSequence charSequence) {
            this.negativeButtonText = charSequence;
            this.negativeButtonTextResId = 0;
            return this;
        }

        public com.google.android.material.datepicker.MaterialDatePicker.Builder<S> setInputMode(int i) {
            this.inputMode = i;
            return this;
        }

        public com.google.android.material.datepicker.MaterialDatePicker<S> build() {
            if (this.calendarConstraints == null) {
                this.calendarConstraints = new com.google.android.material.datepicker.CalendarConstraints.Builder().build();
            }
            if (this.titleTextResId == 0) {
                this.titleTextResId = this.dateSelector.getDefaultTitleResId();
            }
            S s = this.selection;
            if (s != null) {
                this.dateSelector.setSelection(s);
            }
            if (this.calendarConstraints.getOpenAt() == null) {
                this.calendarConstraints.setOpenAt(createDefaultOpenAt());
            }
            return com.google.android.material.datepicker.MaterialDatePicker.newInstance(this);
        }

        private com.google.android.material.datepicker.Month createDefaultOpenAt() {
            if (!this.dateSelector.getSelectedDays().isEmpty()) {
                com.google.android.material.datepicker.Month monthCreate = com.google.android.material.datepicker.Month.create(this.dateSelector.getSelectedDays().iterator().next().longValue());
                if (monthInValidRange(monthCreate, this.calendarConstraints)) {
                    return monthCreate;
                }
            }
            com.google.android.material.datepicker.Month monthCurrent = com.google.android.material.datepicker.Month.current();
            return monthInValidRange(monthCurrent, this.calendarConstraints) ? monthCurrent : this.calendarConstraints.getStart();
        }

        private static boolean monthInValidRange(com.google.android.material.datepicker.Month month, com.google.android.material.datepicker.CalendarConstraints calendarConstraints) {
            return month.compareTo(calendarConstraints.getStart()) >= 0 && month.compareTo(calendarConstraints.getEnd()) <= 0;
        }
    }
}
