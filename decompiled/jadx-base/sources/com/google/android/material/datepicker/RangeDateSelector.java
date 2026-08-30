package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
public class RangeDateSelector implements com.google.android.material.datepicker.DateSelector<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.RangeDateSelector> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.datepicker.RangeDateSelector>() { // from class: com.google.android.material.datepicker.RangeDateSelector.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.RangeDateSelector createFromParcel(android.os.Parcel parcel) {
            com.google.android.material.datepicker.RangeDateSelector rangeDateSelector = new com.google.android.material.datepicker.RangeDateSelector();
            rangeDateSelector.selectedStartItem = (java.lang.Long) parcel.readValue(java.lang.Long.class.getClassLoader());
            rangeDateSelector.selectedEndItem = (java.lang.Long) parcel.readValue(java.lang.Long.class.getClassLoader());
            return rangeDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.RangeDateSelector[] newArray(int i) {
            return new com.google.android.material.datepicker.RangeDateSelector[i];
        }
    };
    private java.lang.String invalidRangeStartError;
    private final java.lang.String invalidRangeEndError = " ";
    private java.lang.Long selectedStartItem = null;
    private java.lang.Long selectedEndItem = null;
    private java.lang.Long proposedTextStart = null;
    private java.lang.Long proposedTextEnd = null;

    private boolean isValidRange(long j, long j2) {
        return j <= j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
        java.lang.Long l = this.selectedStartItem;
        if (l == null) {
            this.selectedStartItem = java.lang.Long.valueOf(j);
        } else if (this.selectedEndItem == null && isValidRange(l.longValue(), j)) {
            this.selectedEndItem = java.lang.Long.valueOf(j);
        } else {
            this.selectedEndItem = null;
            this.selectedStartItem = java.lang.Long.valueOf(j);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        java.lang.Long l = this.selectedStartItem;
        return (l == null || this.selectedEndItem == null || !isValidRange(l.longValue(), this.selectedEndItem.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(androidx.core.util.Pair<java.lang.Long, java.lang.Long> pair) {
        if (pair.first != null && pair.second != null) {
            androidx.core.util.Preconditions.checkArgument(isValidRange(pair.first.longValue(), pair.second.longValue()));
        }
        this.selectedStartItem = pair.first == null ? null : java.lang.Long.valueOf(com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(pair.first.longValue()));
        this.selectedEndItem = pair.second != null ? java.lang.Long.valueOf(com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(pair.second.longValue())) : null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    public androidx.core.util.Pair<java.lang.Long, java.lang.Long> getSelection() {
        return new androidx.core.util.Pair<>(this.selectedStartItem, this.selectedEndItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges() {
        if (this.selectedStartItem == null || this.selectedEndItem == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new androidx.core.util.Pair(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.util.Collection<java.lang.Long> getSelectedDays() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Long l = this.selectedStartItem;
        if (l != null) {
            arrayList.add(l);
        }
        java.lang.Long l2 = this.selectedEndItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(android.content.Context context) {
        int i;
        android.content.res.Resources resources = context.getResources();
        android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (java.lang.Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i = com.google.android.material.R.attr.materialCalendarTheme;
        } else {
            i = com.google.android.material.R.attr.materialCalendarFullscreenTheme;
        }
        return com.google.android.material.resources.MaterialAttributes.resolveOrThrow(context, i, com.google.android.material.datepicker.MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public java.lang.String getSelectionDisplayString(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        java.lang.Long l = this.selectedStartItem;
        if (l == null && this.selectedEndItem == null) {
            return resources.getString(com.google.android.material.R.string.mtrl_picker_range_header_unselected);
        }
        java.lang.Long l2 = this.selectedEndItem;
        if (l2 == null) {
            return resources.getString(com.google.android.material.R.string.mtrl_picker_range_header_only_start_selected, com.google.android.material.datepicker.DateStrings.getDateString(this.selectedStartItem.longValue()));
        }
        if (l == null) {
            return resources.getString(com.google.android.material.R.string.mtrl_picker_range_header_only_end_selected, com.google.android.material.datepicker.DateStrings.getDateString(this.selectedEndItem.longValue()));
        }
        androidx.core.util.Pair<java.lang.String, java.lang.String> dateRangeString = com.google.android.material.datepicker.DateStrings.getDateRangeString(l, l2);
        return resources.getString(com.google.android.material.R.string.mtrl_picker_range_header_selected, dateRangeString.first, dateRangeString.second);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return com.google.android.material.R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public android.view.View onCreateTextInputView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle, com.google.android.material.datepicker.CalendarConstraints calendarConstraints, final com.google.android.material.datepicker.OnSelectionChangedListener<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> onSelectionChangedListener) {
        android.view.View viewInflate = layoutInflater.inflate(com.google.android.material.R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        final com.google.android.material.textfield.TextInputLayout textInputLayout = (com.google.android.material.textfield.TextInputLayout) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_text_input_range_start);
        final com.google.android.material.textfield.TextInputLayout textInputLayout2 = (com.google.android.material.textfield.TextInputLayout) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_text_input_range_end);
        android.widget.EditText editText = textInputLayout.getEditText();
        android.widget.EditText editText2 = textInputLayout2.getEditText();
        if (com.google.android.material.internal.ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.invalidRangeStartError = viewInflate.getResources().getString(com.google.android.material.R.string.mtrl_picker_invalid_range);
        java.text.SimpleDateFormat textInputFormat = com.google.android.material.datepicker.UtcDates.getTextInputFormat();
        java.lang.Long l = this.selectedStartItem;
        if (l != null) {
            editText.setText(textInputFormat.format(l));
            this.proposedTextStart = this.selectedStartItem;
        }
        java.lang.Long l2 = this.selectedEndItem;
        if (l2 != null) {
            editText2.setText(textInputFormat.format(l2));
            this.proposedTextEnd = this.selectedEndItem;
        }
        java.lang.String textInputHint = com.google.android.material.datepicker.UtcDates.getTextInputHint(viewInflate.getResources(), textInputFormat);
        textInputLayout.setPlaceholderText(textInputHint);
        textInputLayout2.setPlaceholderText(textInputHint);
        editText.addTextChangedListener(new com.google.android.material.datepicker.DateFormatTextWatcher(textInputHint, textInputFormat, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void onValidDate(java.lang.Long l3) {
                com.google.android.material.datepicker.RangeDateSelector.this.proposedTextStart = l3;
                com.google.android.material.datepicker.RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void onInvalidDate() {
                com.google.android.material.datepicker.RangeDateSelector.this.proposedTextStart = null;
                com.google.android.material.datepicker.RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        editText2.addTextChangedListener(new com.google.android.material.datepicker.DateFormatTextWatcher(textInputHint, textInputFormat, textInputLayout2, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.2
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void onValidDate(java.lang.Long l3) {
                com.google.android.material.datepicker.RangeDateSelector.this.proposedTextEnd = l3;
                com.google.android.material.datepicker.RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            void onInvalidDate() {
                com.google.android.material.datepicker.RangeDateSelector.this.proposedTextEnd = null;
                com.google.android.material.datepicker.RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        com.google.android.material.datepicker.DateSelector.showKeyboardWithAutoHideBehavior(editText, editText2);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateIfValidTextProposal(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.textfield.TextInputLayout textInputLayout2, com.google.android.material.datepicker.OnSelectionChangedListener<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> onSelectionChangedListener) {
        java.lang.Long l = this.proposedTextStart;
        if (l == null || this.proposedTextEnd == null) {
            clearInvalidRange(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        } else if (isValidRange(l.longValue(), this.proposedTextEnd.longValue())) {
            this.selectedStartItem = this.proposedTextStart;
            this.selectedEndItem = this.proposedTextEnd;
            onSelectionChangedListener.onSelectionChanged(getSelection());
        } else {
            setInvalidRange(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        }
    }

    private void clearInvalidRange(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.textfield.TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.invalidRangeStartError.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    private void setInvalidRange(com.google.android.material.textfield.TextInputLayout textInputLayout, com.google.android.material.textfield.TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.invalidRangeStartError);
        textInputLayout2.setError(" ");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }
}
