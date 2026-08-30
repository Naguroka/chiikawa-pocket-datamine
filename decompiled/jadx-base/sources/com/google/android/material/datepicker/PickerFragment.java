package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes5.dex */
abstract class PickerFragment<S> extends androidx.fragment.app.Fragment {
    protected final java.util.LinkedHashSet<com.google.android.material.datepicker.OnSelectionChangedListener<S>> onSelectionChangedListeners = new java.util.LinkedHashSet<>();

    abstract com.google.android.material.datepicker.DateSelector<S> getDateSelector();

    PickerFragment() {
    }

    boolean addOnSelectionChangedListener(com.google.android.material.datepicker.OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.onSelectionChangedListeners.add(onSelectionChangedListener);
    }

    boolean removeOnSelectionChangedListener(com.google.android.material.datepicker.OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.onSelectionChangedListeners.remove(onSelectionChangedListener);
    }

    void clearOnSelectionChangedListeners() {
        this.onSelectionChangedListeners.clear();
    }
}
