package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
public final class MaterialTextInputPicker<S> extends com.google.android.material.datepicker.PickerFragment<S> {
    private static final java.lang.String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final java.lang.String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    private static final java.lang.String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    private com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    private com.google.android.material.datepicker.DateSelector<S> dateSelector;
    private int themeResId;

    static <T> com.google.android.material.datepicker.MaterialTextInputPicker<T> newInstance(com.google.android.material.datepicker.DateSelector<T> dateSelector, int i, com.google.android.material.datepicker.CalendarConstraints calendarConstraints) {
        com.google.android.material.datepicker.MaterialTextInputPicker<T> materialTextInputPicker = new com.google.android.material.datepicker.MaterialTextInputPicker<>();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(THEME_RES_ID_KEY, i);
        bundle.putParcelable(DATE_SELECTOR_KEY, dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, calendarConstraints);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(THEME_RES_ID_KEY, this.themeResId);
        bundle.putParcelable(DATE_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, this.calendarConstraints);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt(THEME_RES_ID_KEY);
        this.dateSelector = (com.google.android.material.datepicker.DateSelector) bundle.getParcelable(DATE_SELECTOR_KEY);
        this.calendarConstraints = (com.google.android.material.datepicker.CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return this.dateSelector.onCreateTextInputView(layoutInflater.cloneInContext(new android.view.ContextThemeWrapper(getContext(), this.themeResId)), viewGroup, bundle, this.calendarConstraints, new com.google.android.material.datepicker.OnSelectionChangedListener<S>() { // from class: com.google.android.material.datepicker.MaterialTextInputPicker.1
            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public void onSelectionChanged(S s) {
                java.util.Iterator<com.google.android.material.datepicker.OnSelectionChangedListener<S>> it = com.google.android.material.datepicker.MaterialTextInputPicker.this.onSelectionChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onSelectionChanged(s);
                }
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public void onIncompleteSelectionChanged() {
                java.util.Iterator<com.google.android.material.datepicker.OnSelectionChangedListener<S>> it = com.google.android.material.datepicker.MaterialTextInputPicker.this.onSelectionChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onIncompleteSelectionChanged();
                }
            }
        });
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public com.google.android.material.datepicker.DateSelector<S> getDateSelector() {
        com.google.android.material.datepicker.DateSelector<S> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            return dateSelector;
        }
        throw new java.lang.IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }
}
