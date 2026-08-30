package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class SeekBarPreference extends androidx.preference.Preference {
    private static final java.lang.String TAG = "SeekBarPreference";
    boolean mAdjustable;
    private int mMax;
    int mMin;
    android.widget.SeekBar mSeekBar;
    private final android.widget.SeekBar.OnSeekBarChangeListener mSeekBarChangeListener;
    private int mSeekBarIncrement;
    private final android.view.View.OnKeyListener mSeekBarKeyListener;
    int mSeekBarValue;
    private android.widget.TextView mSeekBarValueTextView;
    private boolean mShowSeekBarValue;
    boolean mTrackingTouch;
    boolean mUpdatesContinuously;

    public SeekBarPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mSeekBarChangeListener = new android.widget.SeekBar.OnSeekBarChangeListener() { // from class: androidx.preference.SeekBarPreference.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(android.widget.SeekBar seekBar, int i3, boolean z) {
                if (z && (androidx.preference.SeekBarPreference.this.mUpdatesContinuously || !androidx.preference.SeekBarPreference.this.mTrackingTouch)) {
                    androidx.preference.SeekBarPreference.this.syncValueInternal(seekBar);
                } else {
                    androidx.preference.SeekBarPreference seekBarPreference = androidx.preference.SeekBarPreference.this;
                    seekBarPreference.updateLabelValue(i3 + seekBarPreference.mMin);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
                androidx.preference.SeekBarPreference.this.mTrackingTouch = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
                androidx.preference.SeekBarPreference.this.mTrackingTouch = false;
                if (seekBar.getProgress() + androidx.preference.SeekBarPreference.this.mMin != androidx.preference.SeekBarPreference.this.mSeekBarValue) {
                    androidx.preference.SeekBarPreference.this.syncValueInternal(seekBar);
                }
            }
        };
        this.mSeekBarKeyListener = new android.view.View.OnKeyListener() { // from class: androidx.preference.SeekBarPreference.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(android.view.View view, int i3, android.view.KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                if ((!androidx.preference.SeekBarPreference.this.mAdjustable && (i3 == 21 || i3 == 22)) || i3 == 23 || i3 == 66) {
                    return false;
                }
                if (androidx.preference.SeekBarPreference.this.mSeekBar == null) {
                    android.util.Log.e(androidx.preference.SeekBarPreference.TAG, "SeekBar view is null and hence cannot be adjusted.");
                    return false;
                }
                return androidx.preference.SeekBarPreference.this.mSeekBar.onKeyDown(i3, keyEvent);
            }
        };
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.SeekBarPreference, i, i2);
        this.mMin = typedArrayObtainStyledAttributes.getInt(androidx.preference.R.styleable.SeekBarPreference_min, 0);
        setMax(typedArrayObtainStyledAttributes.getInt(androidx.preference.R.styleable.SeekBarPreference_android_max, 100));
        setSeekBarIncrement(typedArrayObtainStyledAttributes.getInt(androidx.preference.R.styleable.SeekBarPreference_seekBarIncrement, 0));
        this.mAdjustable = typedArrayObtainStyledAttributes.getBoolean(androidx.preference.R.styleable.SeekBarPreference_adjustable, true);
        this.mShowSeekBarValue = typedArrayObtainStyledAttributes.getBoolean(androidx.preference.R.styleable.SeekBarPreference_showSeekBarValue, false);
        this.mUpdatesContinuously = typedArrayObtainStyledAttributes.getBoolean(androidx.preference.R.styleable.SeekBarPreference_updatesContinuously, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public SeekBarPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.preference.R.attr.seekBarPreferenceStyle);
    }

    public SeekBarPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        preferenceViewHolder.itemView.setOnKeyListener(this.mSeekBarKeyListener);
        this.mSeekBar = (android.widget.SeekBar) preferenceViewHolder.findViewById(androidx.preference.R.id.seekbar);
        android.widget.TextView textView = (android.widget.TextView) preferenceViewHolder.findViewById(androidx.preference.R.id.seekbar_value);
        this.mSeekBarValueTextView = textView;
        if (this.mShowSeekBarValue) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.mSeekBarValueTextView = null;
        }
        android.widget.SeekBar seekBar = this.mSeekBar;
        if (seekBar == null) {
            android.util.Log.e(TAG, "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.mSeekBarChangeListener);
        this.mSeekBar.setMax(this.mMax - this.mMin);
        int i = this.mSeekBarIncrement;
        if (i != 0) {
            this.mSeekBar.setKeyProgressIncrement(i);
        } else {
            this.mSeekBarIncrement = this.mSeekBar.getKeyProgressIncrement();
        }
        this.mSeekBar.setProgress(this.mSeekBarValue - this.mMin);
        updateLabelValue(this.mSeekBarValue);
        this.mSeekBar.setEnabled(isEnabled());
    }

    @Override // androidx.preference.Preference
    protected void onSetInitialValue(java.lang.Object obj) {
        if (obj == null) {
            obj = 0;
        }
        setValue(getPersistedInt(((java.lang.Integer) obj).intValue()));
    }

    @Override // androidx.preference.Preference
    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray typedArray, int i) {
        return java.lang.Integer.valueOf(typedArray.getInt(i, 0));
    }

    public int getMin() {
        return this.mMin;
    }

    public void setMin(int i) {
        int i2 = this.mMax;
        if (i > i2) {
            i = i2;
        }
        if (i != this.mMin) {
            this.mMin = i;
            notifyChanged();
        }
    }

    public final int getSeekBarIncrement() {
        return this.mSeekBarIncrement;
    }

    public final void setSeekBarIncrement(int i) {
        if (i != this.mSeekBarIncrement) {
            this.mSeekBarIncrement = java.lang.Math.min(this.mMax - this.mMin, java.lang.Math.abs(i));
            notifyChanged();
        }
    }

    public int getMax() {
        return this.mMax;
    }

    public final void setMax(int i) {
        int i2 = this.mMin;
        if (i < i2) {
            i = i2;
        }
        if (i != this.mMax) {
            this.mMax = i;
            notifyChanged();
        }
    }

    public boolean isAdjustable() {
        return this.mAdjustable;
    }

    public void setAdjustable(boolean z) {
        this.mAdjustable = z;
    }

    public boolean getUpdatesContinuously() {
        return this.mUpdatesContinuously;
    }

    public void setUpdatesContinuously(boolean z) {
        this.mUpdatesContinuously = z;
    }

    public boolean getShowSeekBarValue() {
        return this.mShowSeekBarValue;
    }

    public void setShowSeekBarValue(boolean z) {
        this.mShowSeekBarValue = z;
        notifyChanged();
    }

    private void setValueInternal(int i, boolean z) {
        int i2 = this.mMin;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.mMax;
        if (i > i3) {
            i = i3;
        }
        if (i != this.mSeekBarValue) {
            this.mSeekBarValue = i;
            updateLabelValue(i);
            persistInt(i);
            if (z) {
                notifyChanged();
            }
        }
    }

    public int getValue() {
        return this.mSeekBarValue;
    }

    public void setValue(int i) {
        setValueInternal(i, true);
    }

    void syncValueInternal(android.widget.SeekBar seekBar) {
        int progress = this.mMin + seekBar.getProgress();
        if (progress != this.mSeekBarValue) {
            if (callChangeListener(java.lang.Integer.valueOf(progress))) {
                setValueInternal(progress, false);
            } else {
                seekBar.setProgress(this.mSeekBarValue - this.mMin);
                updateLabelValue(this.mSeekBarValue);
            }
        }
    }

    void updateLabelValue(int i) {
        android.widget.TextView textView = this.mSeekBarValueTextView;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(i));
        }
    }

    @Override // androidx.preference.Preference
    protected android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return parcelableOnSaveInstanceState;
        }
        androidx.preference.SeekBarPreference.SavedState savedState = new androidx.preference.SeekBarPreference.SavedState(parcelableOnSaveInstanceState);
        savedState.mSeekBarValue = this.mSeekBarValue;
        savedState.mMin = this.mMin;
        savedState.mMax = this.mMax;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.SeekBarPreference.SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.preference.SeekBarPreference.SavedState savedState = (androidx.preference.SeekBarPreference.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mSeekBarValue = savedState.mSeekBarValue;
        this.mMin = savedState.mMin;
        this.mMax = savedState.mMax;
        notifyChanged();
    }

    private static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.SeekBarPreference.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.SeekBarPreference.SavedState>() { // from class: androidx.preference.SeekBarPreference.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.SeekBarPreference.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.SeekBarPreference.SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.preference.SeekBarPreference.SavedState[] newArray(int i) {
                return new androidx.preference.SeekBarPreference.SavedState[i];
            }
        };
        int mMax;
        int mMin;
        int mSeekBarValue;

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.mSeekBarValue = parcel.readInt();
            this.mMin = parcel.readInt();
            this.mMax = parcel.readInt();
        }

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mSeekBarValue);
            parcel.writeInt(this.mMin);
            parcel.writeInt(this.mMax);
        }
    }
}
