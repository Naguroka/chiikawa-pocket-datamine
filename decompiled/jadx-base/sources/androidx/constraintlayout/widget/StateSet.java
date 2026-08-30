package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class StateSet {
    private static final boolean DEBUG = false;
    public static final java.lang.String TAG = "ConstraintLayoutStates";
    androidx.constraintlayout.widget.ConstraintSet mDefaultConstraintSet;
    int mDefaultState = -1;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private android.util.SparseArray<androidx.constraintlayout.widget.StateSet.State> mStateList = new android.util.SparseArray<>();
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> mConstraintSetMap = new android.util.SparseArray<>();
    private androidx.constraintlayout.widget.ConstraintsChangedListener mConstraintsChangedListener = null;

    public StateSet(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
        load(context, parser);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void load(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(parser), androidx.constraintlayout.widget.R.styleable.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == androidx.constraintlayout.widget.R.styleable.StateSet_defaultState) {
                this.mDefaultState = typedArrayObtainStyledAttributes.getResourceId(index, this.mDefaultState);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = parser.getEventType();
            androidx.constraintlayout.widget.StateSet.State state = null;
            while (true) {
                byte b = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    parser.getName();
                } else if (eventType == 2) {
                    java.lang.String name = parser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 2) {
                        state = new androidx.constraintlayout.widget.StateSet.State(context, parser);
                        this.mStateList.put(state.mId, state);
                    } else if (b == 3) {
                        androidx.constraintlayout.widget.StateSet.Variant variant = new androidx.constraintlayout.widget.StateSet.Variant(context, parser);
                        if (state != null) {
                            state.add(variant);
                        }
                    }
                } else if (eventType == 3 && "StateSet".equals(parser.getName())) {
                    return;
                }
                eventType = parser.next();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public boolean needsToChange(int id, float width, float height) {
        int i = this.mCurrentStateId;
        if (i != id) {
            return true;
        }
        androidx.constraintlayout.widget.StateSet.State stateValueAt = id == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i);
        return (this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(this.mCurrentConstraintNumber).match(width, height)) && this.mCurrentConstraintNumber != stateValueAt.findMatch(width, height);
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public int stateGetConstraintID(int id, int width, int height) {
        return updateConstraints(-1, id, width, height);
    }

    public int convertToConstraintSet(int currentConstrainSettId, int stateId, float width, float height) {
        androidx.constraintlayout.widget.StateSet.State state = this.mStateList.get(stateId);
        if (state == null) {
            return stateId;
        }
        if (width == -1.0f || height == -1.0f) {
            if (state.mConstraintID == currentConstrainSettId) {
                return currentConstrainSettId;
            }
            java.util.Iterator<androidx.constraintlayout.widget.StateSet.Variant> it = state.mVariants.iterator();
            while (it.hasNext()) {
                if (currentConstrainSettId == it.next().mConstraintID) {
                    return currentConstrainSettId;
                }
            }
            return state.mConstraintID;
        }
        androidx.constraintlayout.widget.StateSet.Variant variant = null;
        for (androidx.constraintlayout.widget.StateSet.Variant variant2 : state.mVariants) {
            if (variant2.match(width, height)) {
                if (currentConstrainSettId == variant2.mConstraintID) {
                    return currentConstrainSettId;
                }
                variant = variant2;
            }
        }
        if (variant != null) {
            return variant.mConstraintID;
        }
        return state.mConstraintID;
    }

    public int updateConstraints(int currentId, int id, float width, float height) {
        androidx.constraintlayout.widget.StateSet.State stateValueAt;
        int iFindMatch;
        if (currentId != id) {
            androidx.constraintlayout.widget.StateSet.State state = this.mStateList.get(id);
            if (state == null) {
                return -1;
            }
            int iFindMatch2 = state.findMatch(width, height);
            return iFindMatch2 == -1 ? state.mConstraintID : state.mVariants.get(iFindMatch2).mConstraintID;
        }
        if (id == -1) {
            stateValueAt = this.mStateList.valueAt(0);
        } else {
            stateValueAt = this.mStateList.get(this.mCurrentStateId);
        }
        if (stateValueAt == null) {
            return -1;
        }
        if ((this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(currentId).match(width, height)) && currentId != (iFindMatch = stateValueAt.findMatch(width, height))) {
            return iFindMatch == -1 ? stateValueAt.mConstraintID : stateValueAt.mVariants.get(iFindMatch).mConstraintID;
        }
        return currentId;
    }

    static class State {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        java.util.ArrayList<androidx.constraintlayout.widget.StateSet.Variant> mVariants = new java.util.ArrayList<>();

        public State(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
            this.mConstraintID = -1;
            this.mIsLayout = false;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(parser), androidx.constraintlayout.widget.R.styleable.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.State_android_id) {
                    this.mId = typedArrayObtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == androidx.constraintlayout.widget.R.styleable.State_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void add(androidx.constraintlayout.widget.StateSet.Variant size) {
            this.mVariants.add(size);
        }

        public int findMatch(float width, float height) {
            for (int i = 0; i < this.mVariants.size(); i++) {
                if (this.mVariants.get(i).match(width, height)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class Variant {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            this.mIsLayout = false;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(parser), androidx.constraintlayout.widget.R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.Variant_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    android.util.Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean match(float widthDp, float heightDp) {
            if (!java.lang.Float.isNaN(this.mMinWidth) && widthDp < this.mMinWidth) {
                return false;
            }
            if (!java.lang.Float.isNaN(this.mMinHeight) && heightDp < this.mMinHeight) {
                return false;
            }
            if (java.lang.Float.isNaN(this.mMaxWidth) || widthDp <= this.mMaxWidth) {
                return java.lang.Float.isNaN(this.mMaxHeight) || heightDp <= this.mMaxHeight;
            }
            return false;
        }
    }
}
