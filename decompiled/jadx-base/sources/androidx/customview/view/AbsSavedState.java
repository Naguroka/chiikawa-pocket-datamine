package androidx.customview.view;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsSavedState implements android.os.Parcelable {
    private final android.os.Parcelable mSuperState;
    public static final androidx.customview.view.AbsSavedState EMPTY_STATE = new androidx.customview.view.AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final android.os.Parcelable.Creator<androidx.customview.view.AbsSavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.customview.view.AbsSavedState>() { // from class: androidx.customview.view.AbsSavedState.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public androidx.customview.view.AbsSavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) != null) {
                throw new java.lang.IllegalStateException("superState must be null");
            }
            return androidx.customview.view.AbsSavedState.EMPTY_STATE;
        }

        @Override // android.os.Parcelable.Creator
        public androidx.customview.view.AbsSavedState createFromParcel(android.os.Parcel parcel) {
            return createFromParcel(parcel, (java.lang.ClassLoader) null);
        }

        @Override // android.os.Parcelable.Creator
        public androidx.customview.view.AbsSavedState[] newArray(int i) {
            return new androidx.customview.view.AbsSavedState[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AbsSavedState() {
        this.mSuperState = null;
    }

    protected AbsSavedState(android.os.Parcelable parcelable) {
        if (parcelable == null) {
            throw new java.lang.IllegalArgumentException("superState must not be null");
        }
        this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
    }

    protected AbsSavedState(android.os.Parcel parcel) {
        this(parcel, null);
    }

    protected AbsSavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable parcelable = parcel.readParcelable(classLoader);
        this.mSuperState = parcelable == null ? EMPTY_STATE : parcelable;
    }

    public final android.os.Parcelable getSuperState() {
        return this.mSuperState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }
}
